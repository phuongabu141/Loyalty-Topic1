package com.loyalty.topic1.repository;

import com.loyalty.topic1.model.CustomerAttributeModel;
import com.loyalty.topic1.response.CustomerAttributeResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerAttributeRepository extends JpaRepository<CustomerAttributeModel, Long> {

    @Query("SELECT DISTINCT NEW com.loyalty.topic1.response.CustomerAttributeResponse(cam.id.customerId, cam.id.attributeId, cam.value) FROM CustomerAttributeModel cam")
    List<CustomerAttributeResponse> getListCustomerAttribute();
}
