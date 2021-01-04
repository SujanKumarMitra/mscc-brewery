package com.github.sujankumarmitra.msccbrewery.controller.v1;

import com.github.sujankumarmitra.msccbrewery.dto.v1.GetCustomerResponseV1;
import com.github.sujankumarmitra.msccbrewery.model.v1.CustomerV1;
import com.github.sujankumarmitra.msccbrewery.service.v1.CustomerServiceV1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/customer")
public class CustomerControllerV1 {

    private CustomerServiceV1 customerService;

    @Autowired
    public CustomerControllerV1(CustomerServiceV1 customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/{customerId}")
    public ResponseEntity<GetCustomerResponseV1> getCustomer(@PathVariable String customerId) {
        CustomerV1 customer = customerService.getCustomer(customerId);
        return ResponseEntity.ok(new GetCustomerResponseV1(customer));
    }
}
