package com.wagner.brewery.web.mapper;

import com.wagner.brewery.domain.Beer;
import com.wagner.brewery.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper
public interface BeerMapper {

    BeerDto beerToBeerDto(Beer beer);

    Beer beerDtoToBeer(BeerDto dto);
}
