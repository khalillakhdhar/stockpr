package com.relations.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User extends Audit {
@Column(unique = true)
	private String username;
private boolean active;
private String password;
@ManyToMany(mappedBy = "users")
private Set<Role> roles=new HashSet<Role>();
@OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL,mappedBy = "user")

private Profile profile;

}
