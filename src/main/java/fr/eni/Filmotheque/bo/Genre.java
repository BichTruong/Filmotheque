package fr.eni.Filmotheque.bo;

import java.util.List;

public class Genre {
	long id;
	String libelle;
	List<Film> listeFilms;
	public Genre(long id, String libelle, List<Film> listeFilms) {
		super();
		this.id = id;
		this.libelle = libelle;
		this.listeFilms = listeFilms;
	}
	
	public Genre(long id, String libelle) {
		super();
		this.id = id;
		this.libelle = libelle;
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public List<Film> getListeFilms() {
		return listeFilms;
	}
	public void setListeFilms(List<Film> listeFilms) {
		this.listeFilms = listeFilms;
	}
	@Override
	public String toString() {
		return "Genre [id=" + id + ", libelle=" + libelle + ", listeFilms=" + listeFilms + "]";
	}

}
