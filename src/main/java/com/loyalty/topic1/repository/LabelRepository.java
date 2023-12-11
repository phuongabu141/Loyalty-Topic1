package com.loyalty.topic1.repository;

import com.loyalty.topic1.model.LabelModel;
import com.loyalty.topic1.response.LabelResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LabelRepository extends JpaRepository<LabelModel, Long> {

    @Query("SELECT DISTINCT NEW com.loyalty.topic1.response.LabelResponse(g.labelModel.id, l.label_name) FROM LabelModel l JOIN GroupModel g ON g.labelModel.id = l.id")
    List<LabelResponse> getLabel();
}
