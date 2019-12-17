package com.projetEbilleterie.ebilleterie.infrastructure.basketJPA;


import com.projetEbilleterie.ebilleterie.domain.basket.Basket;
import com.projetEbilleterie.ebilleterie.domain.eticket.Eticket;

import com.projetEbilleterie.ebilleterie.infrastructure.eticketJPA.EticketJPA;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Entity(name = "BASKET")
public class BasketJPA {

    @Id
    //@GeneratedValue()
    @Column(name = "ID")
    private String id;

    @Column(name = "QUANTITY")
    private Integer quantity;

    @Column(name = "STATUS")
    private Boolean status;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="BASKET_ID", referencedColumnName = "ID")
    private List<EticketJPA> etickets = new ArrayList<>();

    //Constructors
    public BasketJPA(){}

    BasketJPA(Basket basket) {
        this.id = basket.getId();
        this.quantity = basket.getQuantity();
        this.status = basket.isStatus();
        this.etickets = basket.getEtickets()
                        .stream()
                        .map(EticketJPA::new)
                        .collect(Collectors.toList());
    }

    //Adapter JPA
    Basket toBasket() {

        List<Eticket> eticketList = etickets.stream()
                .map(b -> new Eticket(b.getId(),b.getReference(),b.getDescription(),b.getLaw(),
                        b.isNominatif(),b.getDateValidite(),b.getInternalPrice(),
                        b.getExternalPrice(), b.getChlidScale(),b.getAdultScale()))
                .collect(Collectors.toList());
        return new Basket(id, this.quantity, this.status,  eticketList);
    }

    // Getter
    public String getId() {return id;}
    public Integer getQuantity() {return quantity;}
    public Boolean isStatus() {return status; }
    public List<EticketJPA> getEtickets() {return etickets; }
}
