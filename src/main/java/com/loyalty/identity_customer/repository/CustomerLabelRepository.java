package com.loyalty.identity_customer.repository;

import com.loyalty.identity_customer.model.CustomerLabelModel;
import com.loyalty.identity_customer.response.CustomerResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerLabelRepository extends JpaRepository<CustomerLabelModel, Long> {

    @Query("SELECT new com.loyalty.identity_customer.response.CustomerResponse(cl.customerModel.customer_id, cl.customerModel.name) FROM CustomerLabelModel cl WHERE cl.labelModel.label_id = :labelId")
    List<CustomerResponse> getListCustomerByLabelId(@Param("labelId") Long labelId);
}
