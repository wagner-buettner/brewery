package com.wagner.brewery.web.services;

import com.wagner.brewery.web.model.BeerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder().id(UUID.randomUUID())
                .beerName("Wagner's Beer")
                .beerStyle("Imperial IPA")
                .build();
    }
}
