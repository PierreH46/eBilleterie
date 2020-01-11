package com.projetEbilleterie.ebilleterie.application;

import com.projetEbilleterie.ebilleterie.domain.eticket2.TypePrice;
import com.projetEbilleterie.ebilleterie.domain.rate.Rate;
import com.projetEbilleterie.ebilleterie.domain.rate.RateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class RateService {

    @Autowired
    RateRepository rateRepository;

    public List<Rate> listAllRate() {
        return this.rateRepository.findAllRate();
    }
 //   public Long updateStockRateQuery(int newQuantity, Long eticketId, TypePrice typePrice) {
  //      return this.rateRepository.updateStockRateQuery(newQuantity, eticketId, typePrice);
 //   }
}



