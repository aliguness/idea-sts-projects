package com.aligunes.personelTakipSistemi;

import java.util.ArrayList;
import java.util.List;

public class Departman {
	
	private String depatmanAdi2;
	private EDepartman departmanAdi;
	private List<Personel> personelList;
	
	
	
	public Departman(String depatmanAdi2) {
		super();
		this.depatmanAdi2 = depatmanAdi2;
		personelList = new ArrayList<>();
	}


	public Departman(EDepartman departmanAdi) {
		super();
		this.departmanAdi = departmanAdi;
		personelList = new ArrayList<>();
	}


	
	
	public String getDepatmanAdi2() {
		return depatmanAdi2;
	}


	public void setDepatmanAdi2(String depatmanAdi2) {
		this.depatmanAdi2 = depatmanAdi2;
	}


	public EDepartman getDepartmanAdi() {
		return departmanAdi;
	}


	public void setDepartmanAdi(EDepartman departmanAdi) {
		this.departmanAdi = departmanAdi;
	}


	public List<Personel> getPersonelList() {
		return personelList;
	}


	public void setPersonelList(List<Personel> personelList) {
		this.personelList = personelList;
	}


	@Override
	public String toString() {
		return "Departman (departmanAdi=" + departmanAdi + ")";
	}
	
	
	

}
