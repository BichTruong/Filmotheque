package fr.eni.Filmotheque.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import fr.eni.Filmotheque.bo.Film;
import fr.eni.Filmotheque.bo.Genre;
import fr.eni.Filmotheque.bo.Participant;
@Service
public class FilmServiceImpl implements FilmService{

	@Override
	public Film afficher(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Film> creerJeuTest() {
		Participant realisateur = new Participant(1,"Tim", "Burton");
		Participant acteur = new Participant(2,"Johnny", "Depp");
		Participant actrice = new Participant(3,"LN", "Bobonne");
		List<Participant> listeActeurs = new ArrayList<Participant>();
		listeActeurs.add(actrice);
		listeActeurs.add(acteur);
		Genre genre = new Genre(1,"Amour");
		List<Film> listeFilms= new ArrayList<Film>();
		Film film1 = new Film(1, "Blanche Neige et 7 nases",1937,60,".....",genre,realisateur,listeActeurs);
		Film film2 = new Film(2, "Alex Andrillon ",2000,50,".....",genre,realisateur,listeActeurs);
		listeFilms.add(film1);
		listeFilms.add(film2);
		return null;
	}



	

}
