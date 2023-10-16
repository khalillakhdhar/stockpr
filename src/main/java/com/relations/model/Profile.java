package com.relations.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Profile  {
	@Id
	
	private long id;
	
	
	
	@OneToOne(cascade =CascadeType.ALL )
	@JoinColumn(name = "user_id")
	@MapsId
	private User user;
	private String grade;
	private String photo;
	private String adresse;
	private int codepostale;

}
