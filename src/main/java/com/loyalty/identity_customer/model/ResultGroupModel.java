package com.loyalty.identity_customer.model;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Entity
@Table(name = "result_group")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResultGroupModel {

    @EmbeddedId
    private ResultGroupId resultGroupId;

    @Column(name = "is_true")
    private boolean is_true;

}
