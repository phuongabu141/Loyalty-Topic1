package com.loyalty.demo.repository;

import com.loyalty.demo.model.CustomerModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<CustomerModel, Long> {

//    @Query(value = "CALL getallcustomer()", nativeQuery = true)
//    List<Customer> getAllCustomer();
}
