package edu.ucalgary.oop;

public class Pet {
    String name;
    String species;
    String breed;
    String colour;
    Boolean vaccineStatus = false;
    Client owner;
    EmergVet vet;
    CareProfile care;
    public Pet(String name, String species, String breed, String colour, Client owner) {
        this.name = name;
        this.species = species;
        this.breed = breed;
        this.colour = colour;
        this.owner = owner;
    }
    public void setVet(EmergVet vet) {
        this.vet = vet;
    }
    public EmergVet getVet() {
        return this.vet;
    }
    public void updateVaccineStatus(Boolean change) {
        this.vaccineStatus = change;
    }

    public Boolean getVaccineStatus() {
        return this.vaccineStatus;
    }
    public void setCare(String[] meds, String medInstr, String feedingInstr) {
        this.care = new CareProfile(meds, medInstr, feedingInstr);
    }
    public String getCareSummary() {
        return this.care.summarizeCareInstructions();
    }
    public Client getOwner() {
        return this.owner;
    }
    public void setOwner(Client updateOwner) {
        this.owner = updateOwner;
    }
    public String getName() {
        return this.name;
    }
    public String getSpecies() {
        return this.species;
    }
    public String getBreed() {
        return this.breed;
    }
    public String getColour() {
        return this.colour;
    }
}
