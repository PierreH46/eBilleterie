package com.projetEbilleterie.ebilleterie.exposition.basket;

import com.projetEbilleterie.ebilleterie.domain.basket.Basket;
import com.projetEbilleterie.ebilleterie.exposition.eticket.EticketAdapter;

import java.util.UUID;

public class BasketAdapter {

    public BasketAdapter() {}

    static BasketDTO adaptToBasketDTO(Basket basket) {
        return new BasketDTO(
                basket.getId(),
                basket.getQuantity(),
                basket.isStatus(),
                EticketAdapter.adaptToEticketListDTO(basket.getEtickets())
        );
    }

    static Basket transformToBasket(BasketDTO basketDTO) {

        String id = (basketDTO.id == null || basketDTO.id.trim().equals(""))? UUID.randomUUID().toString() : basketDTO.id;
        return new Basket(id,basketDTO.quantity, basketDTO.status,EticketAdapter.transformToEticketList(basketDTO.etickets));
    }

}
