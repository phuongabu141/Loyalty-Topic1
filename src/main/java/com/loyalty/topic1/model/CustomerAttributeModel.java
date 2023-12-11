package com.loyalty.topic1.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "customer_attribute")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class CustomerAttributeModel {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    @ManyToOne(fetch = FetchType.EAGER)
//    @JoinColumn(name = "customer_id")
//    private CustomerModel customerModel;
//
//    @ManyToOne(fetch = FetchType.EAGER)
//    @JoinColumn(name = "attribute_id")
//    private AttributeModel attributeModel;
    @EmbeddedId
    private CustomerAttributeId id;

    @Column(name = "description")
    private String description;

    @Column(name = "created_time")
    private Date created_time;

    @Column(name = "created_by")
    private Long created_by;

    @Column(name = "is_delete")
    private boolean is_delete;

    @Column(name = "value")
    private String value;
}
