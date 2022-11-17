package fr.eni.Filmotheque.bo;

public class Avis {
	long id;
	int note;
	String commentaire;
	//Association
	Film film;
	Membre membre;
	public Avis(long id, int note, String commentaire, Film film, Membre membre) {
		super();
		this.id = id;
		this.note = note;
		this.commentaire = commentaire;
		this.film = film;
		this.membre = membre;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getNote() {
		return note;
	}
	public void setNote(int note) {
		this.note = note;
	}
	public String getCommentaire() {
		return commentaire;
	}
	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}
	public Film getFilm() {
		return film;
	}
	public void setFilm(Film film) {
		this.film = film;
	}
	public Membre getMembre() {
		return membre;
	}
	public void setMembre(Membre membre) {
		this.membre = membre;
	}
	@Override
	public String toString() {
		return "Avis [id=" + id + ", note=" + note + ", commentaire=" + commentaire + ", film=" + film + ", membre="
				+ membre + "]";
	}
	
	

}
