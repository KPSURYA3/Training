package com.example.swagger.SwaggerExample.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Sports {

	@Id
	private String sportsName;
	private int teamMmbers;
	private String captainName;
	private String country;
	public String getSportsName() {
		return sportsName;
	}
	public void setSportsName(String sportsName) {
		this.sportsName = sportsName;
	}
	public int getTeamMmbers() {
		return teamMmbers;
	}
	public void setTeamMmbers(int teamMmbers) {
		this.teamMmbers = teamMmbers;
	}
	public String getCaptainName() {
		return captainName;
	}
	public void setCaptainName(String captainName) {
		this.captainName = captainName;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
}
