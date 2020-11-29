package com.portfolio.backend.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.portfolio.backend.entities.Profil;

@RestController
@RequestMapping("api")
@CrossOrigin("*")
public class ProfilController {

	@GetMapping("/getprofil")
	public ResponseEntity<Profil> getProfilInformations() {
		Profil profil = new Profil();
		profil.setId(1234567890);
		profil.setAbout_me(
				"Salut,  je suis AIT TGHRAYT Youssef, Ingénieur logiciel et Développeur full stack ,Je travaille Dans Involys (Entreprise Multinationale).\n"
						+ " j’ai appris à coder dès mon plus jeune âge dans divers langages informatiques (JAVA EE[Spring, JSTL , JSF, JPA, Hibernate..], .NET[Framework,Core], Angular…) et ai créé des projets personnels, "
						+ "et professionnels.\n Polyvalent, je maîtrise les différentes étapes"
						+ " techniques de la création d’un site ou d’une application web; de la compréhension des besoins utilisateurs(fonctionnels et techniques), au développement frontend et backend "
						+ "en passant par la maintenance.\n"
						+ "Rigoureux, Ambitieux, Bosseur et Fast learner. C'est pour cela je crois en travaillant dur. J'ai aussi la connaissance de travail avec l'Apprentissage de Machine. ");
		profil.setAdresse("N° 70 Rue El Farah El Yassmine, Casablanca, Maroc");
		profil.setSummary(
				"Hi, je suis un ingénieur logiciel, développeur full stack. Je travaille principalement avec Angular, JAVA EE[Spring, JSTL , JSF, JPA, Hibernate..], .NET Framework and .Net Core");
		profil.setFacebook("https://www.facebook.com/youssef.aittaghrayt");
		profil.setGithub("https://github.com/tghrayt");
		profil.setPhone("+212 657 18 36 45");
		profil.setPhoto_url("https://i.imgur.com/eM6OO39.jpg");
		profil.setLinkedin("https://www.linkedin.com/in/youssef-ait-tghrayt-7418b5161/");
		profil.setTwitter("https://twitter.com/tghrayt");
		profil.setMail("tghrayt.ysf@gmail.com");
		profil.setResume("https://drive.google.com/file/d/1NcvXJCUHwxme1Z9SnzUwIiJ91ZYhYxvs/view");
		profil.setDesignation("Ingénieur logiciel - Développeur Web Full Stack");
		profil.setName("AIT TGHRAYT Youssef");
		return new ResponseEntity<Profil>(profil, HttpStatus.OK);
	}

}
