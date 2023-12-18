package com.loyalty.identity_customer.repository;

import com.loyalty.identity_customer.model.AttributeModel;
import com.loyalty.identity_customer.response.AttributeDetailResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AttributeRepository extends JpaRepository<AttributeModel, Long> {

    @Query("SELECT NEW com.loyalty.identity_customer.response.AttributeDetailResponse(am.attribute_id, am.name, am.start_date, am.end_date) FROM AttributeModel am")
    List<AttributeDetailResponse> getAllAttribute();
}
