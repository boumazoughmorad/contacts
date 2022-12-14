package org.sid.entites;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
public class contact implements Serializable{
@Id @GeneratedValue
private long id;
private String nom;
private String prenom;
@Temporal(TemporalType.DATE)
private Date dateNessance;
private String email;
private long tel;
private String photo;
public contact() {
	super();
	// TODO Auto-generated constructor stub
}
public contact(String nom, String prenom, Date dateNessance, String email, long tel, String photo) {

	this.nom = nom;
	this.prenom = prenom;
	this.dateNessance = dateNessance;
	this.email = email;
	this.tel = tel;
	this.photo = photo;
}
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public String getPrenom() {
	return prenom;
}
public void setPrenom(String prenom) {
	this.prenom = prenom;
}
public Date getDateNessance() {
	return dateNessance;
}
public void setDateNessance(Date dateNessance) {
	this.dateNessance = dateNessance;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public long getTel() {
	return tel;
}
public void setTel(long tel) {
	this.tel = tel;
}
public String getPhoto() {
	return photo;
}
public void setPhoto(String photo) {
	this.photo = photo;
}

}
