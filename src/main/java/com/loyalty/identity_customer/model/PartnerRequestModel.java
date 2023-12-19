package com.loyalty.identity_customer.model;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "partner_request")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class PartnerRequestModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long request_id;

    @Column(name = "label_name")
    private String label_name;

    @Column(name = "created_by")
    private Long created_by;

    @Column(name = "created_time")
    private Date created_time;

    @Column(name = "status")
    private String status;

    @Column(name = "description")
    private String description;

    @Column(name = "is_delete")
    private Boolean is_delete;
}
