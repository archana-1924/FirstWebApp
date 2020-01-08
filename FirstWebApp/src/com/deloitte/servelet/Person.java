package com.deloitte.servelet;

import java.util.Arrays;
import java.util.List;

public class Person {

	private String name;
	private String gender;
	private List<String> langs = Arrays.asList();
	private String country;
	
	public Person()
	{
		
	}
	public Person(String name, String gender, List<String> lang, String country) {
		super();
		this.name = name;
		this.gender = gender;
		this.langs = lang;
		this.country = country;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public List<String> getLang() {
		return langs;
	}
	public void setLang(List<String> lang) {
		this.langs = lang;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", gender=" + gender + ", lang=" + langs + ", country=" + country + "]";
	}
	
	
	
}
