package com.loyalty.identity_customer.model;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class ResultGroupId {
    private Long customer_id;

    private Long label_id;

    private Long group_id;
}
