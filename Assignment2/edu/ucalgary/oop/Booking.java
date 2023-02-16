package edu.ucalgary.oop;

public class Booking {
    private String startDate;
    private String endDate;
    private Pet bookedPet;
    private Employee careGiver;
    public Booking(Pet pet, Employee assigned, String startDate, String endDate) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.bookedPet = pet;
        this.careGiver = assigned;
    }
    public String getStartDate() {
        return this.startDate;
    }
    public String getEndDate() {
        return this.endDate;
    }
    public Pet getBookedPet() {
        return this.bookedPet;
    }
    public Employee getCareGiver() {
        return this.careGiver;
    }
}
