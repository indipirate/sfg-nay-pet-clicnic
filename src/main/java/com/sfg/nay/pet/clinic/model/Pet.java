package com.sfg.nay.pet.clinic.model;

import java.time.LocalDate;

public class Pet {
	
	private PetType petType;
	private Owner owner;
	private LocalDate bithdate;
	
	public PetType getPetType() {
		return petType;
	}
	public void setPetType(PetType petType) {
		this.petType = petType;
	}
	public Owner getOwner() {
		return owner;
	}
	public void setOwner(Owner owner) {
		this.owner = owner;
	}
	public LocalDate getBithdate() {
		return bithdate;
	}
	public void setBithdate(LocalDate bithdate) {
		this.bithdate = bithdate;
	}

	
}
