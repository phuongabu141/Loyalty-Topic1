package com.loyalty.topic1.repository;

import com.loyalty.topic1.model.ConditionModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ConditionRepository extends JpaRepository<ConditionModel, Long> {

    @Query("SELECT c FROM ConditionModel c WHERE c.condition_id = :id")
    ConditionModel getConditionById(@Param("id") Long id);
}
