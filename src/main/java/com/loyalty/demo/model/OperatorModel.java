package com.loyalty.demo.model;

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
@Table(name = "operator")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OperatorModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long operator_id;

	@Column(name = "operator_name")
	private String operator_name;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "notation")
	private String notation;
	
	@Column(name = "created_date")
	private Date created_date;
	
	@Column(name = "created_by")
	private Long created_by;
	
	@Column(name = "is_delete")
	private boolean is_delete;
}