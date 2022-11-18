package fr.eni.Filmotheque.ihm;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import fr.eni.Filmotheque.bo.Film;
import fr.eni.Filmotheque.service.FilmService;


@Controller
@SessionAttributes("films")
public class FilmController {
	FilmService service;
	
	public FilmController(FilmService service) {
		this.service=service;
	}
	@ModelAttribute("personnes")
	public List<Film> getFilm(){
		return new ArrayList<Film>();
	}
	
	
	//@RequestMapping(method = RequestMethod.GET, value="/film-detail")	
	@GetMapping("/filmdetail")
	public String afficherDetailFilm(Model modele) {
		modele.addAttribute("film", service.creerJeuTest());
		return "filmdetail";}
}
