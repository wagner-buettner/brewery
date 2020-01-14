package com.wagner.brewery.web.mapper;

import com.wagner.brewery.domain.Customer;
import com.wagner.brewery.web.model.CustomerDto;
import org.mapstruct.Mapper;

@Mapper
public interface CustomerMapper {

    CustomerDto customerToCustomerDto(Customer customer);

    Customer customerDtoToCustomer(CustomerDto dto);

}
