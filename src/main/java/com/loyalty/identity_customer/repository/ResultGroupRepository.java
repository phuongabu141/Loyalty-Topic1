package com.loyalty.identity_customer.repository;

import com.loyalty.identity_customer.model.ResultGroupModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ResultGroupRepository extends JpaRepository<ResultGroupModel, Long> {
    // count và sum

}
