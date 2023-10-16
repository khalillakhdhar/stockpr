package com.relations.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;
@Entity
@Data
public class Facture {
@Id
private long id;
@OneToOne(cascade =CascadeType.ALL )
@JoinColumn(name = "commande_id")
@MapsId
private Commande commande;
@Temporal(TemporalType.TIMESTAMP)
private Date dateCreation;


}
