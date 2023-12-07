package com.loyalty.demo.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "result_condition")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResultConditionModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "customer_id")
	private CustomerModel customerModel;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "label_id")
	private LabelModel labelModel;
	
	@Column(name = "created_time")
	private Date created_date;
	
	@Column(name = "created_by")
	private Long created_by;
	
	@Column(name = "result")
	private boolean result;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "is_delete")
	private boolean is_delete;
}
