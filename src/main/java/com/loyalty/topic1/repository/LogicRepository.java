package com.loyalty.topic1.repository;

import com.loyalty.topic1.model.LogicModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface LogicRepository extends JpaRepository<LogicModel, Long>{
	
	

}
