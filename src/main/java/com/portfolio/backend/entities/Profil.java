package com.portfolio.backend.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Profil {

	private int id;
	private String name;
	private String adresse;
	private String mail;
	private String github;
	private String linkedin;
	private String facebook;
	private String twitter;
	private String aboutMe;
	private String photo_url;
	private String designation;
	private String Summary;
	private String resume;
	private String phone;

}
