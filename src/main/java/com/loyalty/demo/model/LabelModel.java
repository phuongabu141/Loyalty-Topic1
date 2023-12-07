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
@Table(name = "label")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class LabelModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long label_id;
	
	@Column(name = "label_name")
	private String label_name;
	
	@Column(name = "status")
	private String status;
	
	@Column(name = "created_date")
	private Date created_date;
	
	@Column(name = "created_by")
	private Long created_by;
	
	@Column(name = "description")
	private String description;

}
