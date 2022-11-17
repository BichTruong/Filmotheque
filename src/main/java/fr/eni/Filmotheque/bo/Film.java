package fr.eni.Filmotheque.bo;

import java.util.List;

public class Film {
	long id;
	String titre;
	int annee;
	int duree;
	String synopsis;
	Genre genre;
	Participant realisateur;
	List <Participant> ListeActeurs;
	
	public Film(long id, String titre, int annee, int duree, String synopsis, Genre genre, Participant realisateur,
			List<Participant> listeActeurs) {
		super();
		this.id = id;
		this.titre = titre;
		this.annee = annee;
		this.duree = duree;
		this.synopsis = synopsis;
		this.genre = genre;
		this.realisateur = realisateur;
		ListeActeurs = listeActeurs;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public int getAnnee() {
		return annee;
	}

	public void setAnnee(int annee) {
		this.annee = annee;
	}

	public int getDuree() {
		return duree;
	}

	public void setDuree(int duree) {
		this.duree = duree;
	}

	public String getSynopsis() {
		return synopsis;
	}

	public void setSynopsis(String synopsis) {
		this.synopsis = synopsis;
	}

	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	public Participant getRealisateur() {
		return realisateur;
	}

	public void setRealisateur(Participant realisateur) {
		this.realisateur = realisateur;
	}

	public List<Participant> getListeActeurs() {
		return ListeActeurs;
	}

	public void setListeActeurs(List<Participant> listeActeurs) {
		ListeActeurs = listeActeurs;
	}

	@Override
	public String toString() {
		return "Film [id=" + id + ", titre=" + titre + ", annee=" + annee + ", duree=" + duree + ", synopsis="
				+ synopsis + ", genre=" + genre + ", realisateur=" + realisateur + ", ListeActeurs=" + ListeActeurs
				+ "]";
	}
	
	
}
