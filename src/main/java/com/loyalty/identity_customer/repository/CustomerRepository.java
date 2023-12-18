package com.loyalty.identity_customer.repository;

import com.loyalty.identity_customer.model.CustomerModel;
import com.loyalty.identity_customer.response.CustomerResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<CustomerModel, Long> {

//    @Query(value = "CALL getallcustomer()", nativeQuery = true)
//    List<Customer> getAllCustomer();

    @Query("SELECT new com.loyalty.identity_customer.response.CustomerResponse(c.customer_id, c.name) FROM CustomerModel c")
    List<CustomerResponse> getAllCustomer();
}
