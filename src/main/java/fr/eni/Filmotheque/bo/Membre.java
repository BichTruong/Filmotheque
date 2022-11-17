package fr.eni.Filmotheque.bo;

import java.util.List;

public class Membre {
	long id;
	String nom;
	String prenom;
	String login;
	String motDePasse;
	boolean isAdmin;
	//Asscoiations
	List<Avis> listeAvis;
	public Membre(long id, String nom, String prenom, String login, String motDePasse, boolean isAdmin,
			List<Avis> listeAvis) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.login = login;
		this.motDePasse = motDePasse;
		this.isAdmin = isAdmin;
		this.listeAvis = listeAvis;
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
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getMotDePasse() {
		return motDePasse;
	}
	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}
	public boolean isAdmin() {
		return isAdmin;
	}
	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}
	public List<Avis> getListeAvis() {
		return listeAvis;
	}
	public void setListeAvis(List<Avis> listeAvis) {
		this.listeAvis = listeAvis;
	}
	@Override
	public String toString() {
		return "Membre [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", login=" + login + ", motDePasse="
				+ motDePasse + ", isAdmin=" + isAdmin + ", listeAvis=" + listeAvis + "]";
	}
	
}
