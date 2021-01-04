package com.github.sujankumarmitra.msscbrewery.resource.v1;

import com.github.sujankumarmitra.msscbrewery.dto.v1.CreateNewCustomerRequestV1;
import com.github.sujankumarmitra.msscbrewery.dto.v1.CreateNewCustomerResponseV1;
import com.github.sujankumarmitra.msscbrewery.dto.v1.GetCustomerResponseV1;
import com.github.sujankumarmitra.msscbrewery.dto.v1.UpdateCustomerRequestV1;
import com.github.sujankumarmitra.msscbrewery.model.v1.CustomerV1;
import com.github.sujankumarmitra.msscbrewery.service.v1.CustomerServiceV1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

import static org.springframework.http.HttpStatus.CREATED;

@RestController
@RequestMapping("/api/v1/customer")
public class CustomerResourceV1 {

    private CustomerServiceV1 customerService;

    @Autowired
    public CustomerResourceV1(CustomerServiceV1 customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/{customerId}")
    public ResponseEntity<GetCustomerResponseV1> getCustomer(@PathVariable String customerId) {
        CustomerV1 customer = customerService.getCustomer(customerId);
        return ResponseEntity.ok(new GetCustomerResponseV1(customer));
    }

    @PostMapping
    public ResponseEntity<CreateNewCustomerResponseV1> createNewCustomer(
            @RequestBody @Valid CreateNewCustomerRequestV1 createNewCustomerRequest) {
        CustomerV1 newCustomer = customerService.createNewCustomer(createNewCustomerRequest);

        return ResponseEntity
                .status(CREATED)
                .body(new CreateNewCustomerResponseV1(newCustomer));
    }

    @PutMapping("/{customerId}")
    public ResponseEntity<Void> updateCustomer(
            @PathVariable String customerId,
            @RequestBody @Valid UpdateCustomerRequestV1 customerToUpdate) {
        customerToUpdate.setId(customerId);
        customerService.updateCustomer(customerToUpdate);
        return ResponseEntity
                .noContent()
                .<Void>build();
    }

    @DeleteMapping("/{customerId}")
    public ResponseEntity<Void> deleteCustomer(@PathVariable String customerId) {
        customerService.deleteCustomer(customerId);
        return ResponseEntity
                .noContent()
                .<Void>build();
    }
}
