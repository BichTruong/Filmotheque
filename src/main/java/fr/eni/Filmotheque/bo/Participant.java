package fr.eni.Filmotheque.bo;

import java.util.List;

public class Participant {
	long id;
	String nom;
	String prenom;
	//Associations
	List <Film> listeFilms;
	public Participant(long id, String nom, String prenom, List<Film> listeFilms) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.listeFilms = listeFilms;
	}
	
	
	public Participant(long id, String nom, String prenom) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
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
	public List<Film> getListeFilms() {
		return listeFilms;
	}
	public void setListeFilms(List<Film> listeFilms) {
		this.listeFilms = listeFilms;
	}
	@Override
	public String toString() {
		return "Participant [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", listeFilms=" + listeFilms + "]";
	}
	
}
