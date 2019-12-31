package com.projetEbilleterie.ebilleterie.infrastructure.rateJPA;

import com.projetEbilleterie.ebilleterie.domain.exception.ErrorCodes;
import com.projetEbilleterie.ebilleterie.domain.exception.MyAppTicketException;
import com.projetEbilleterie.ebilleterie.domain.rate.Rate;
import com.projetEbilleterie.ebilleterie.domain.rate.RateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class RateRepositoryImpl implements RateRepository {

    @Autowired
    private RateDAO rateDAO;

    @Override
    public Rate getRate(String id) {
        return rateDAO.findById(id)
                .map(RateJPA::toRate)
                .orElseThrow(()
                        -> new MyAppTicketException(ErrorCodes.PROVIDER_NOT_FOUND));
    }

}