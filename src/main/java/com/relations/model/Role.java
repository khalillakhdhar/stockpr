package com.relations.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Role {
@Id
private String role_name;
@ManyToMany(fetch = FetchType.LAZY,
cascade = {
		CascadeType.PERSIST,
		CascadeType.MERGE
})
private Set<User> users=new HashSet<User>();
}
