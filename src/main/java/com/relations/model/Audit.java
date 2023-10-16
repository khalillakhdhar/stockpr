package com.relations.model;

import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.Data;

@MappedSuperclass
@Data

@EntityListeners(AuditingEntityListener.class) 
// jusqu'a sp 2.7
public class Audit {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;

}
