package com.loyalty.topic1.repository;

import com.loyalty.topic1.model.GroupModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface GroupRepository extends JpaRepository<GroupModel, Long>{
	
	@Query("SELECT g FROM GroupModel g WHERE g.labelModel.label_id = :idLabel")
    List<GroupModel> getListGroupByIdLabel(@Param("idLabel") Long idLabel);

    @Query("SELECT g FROM GroupModel g WHERE g.conditionModel IS NOT NULL")
    List<GroupModel> getListGroupWithConditionNotNull();

}
