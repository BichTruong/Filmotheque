package fr.eni.Filmotheque.service;

import java.util.List;

import fr.eni.Filmotheque.bo.Film;

public interface FilmService {
	
	public abstract List<Film> creerJeuTest ();
	public abstract Film afficher (long id);
}
