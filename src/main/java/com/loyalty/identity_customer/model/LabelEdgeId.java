package com.loyalty.identity_customer.model;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class LabelEdgeId implements Serializable {

    private Long label_id;

    private Long head_id;

}
