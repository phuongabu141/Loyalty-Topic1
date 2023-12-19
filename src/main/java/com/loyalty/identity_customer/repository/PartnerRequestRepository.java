package com.loyalty.identity_customer.repository;

import com.loyalty.identity_customer.model.PartnerRequestModel;
import com.loyalty.identity_customer.response.PartnerRequestResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PartnerRequestRepository extends JpaRepository<PartnerRequestModel, Long> {
    // lấy tất cả request
//    @Query("SELECT * FROM PartnerRequestModel")
//    List<PartnerRequestResponse> getListPartnerRequest();
}
