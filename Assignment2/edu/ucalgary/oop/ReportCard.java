package edu.ucalgary.oop;

public class ReportCard {
    private Booking report;
    public ReportCard(Booking reportInfo) {
        this.report = reportInfo;
    }
    public String printReport() {
        String report = this.report.getCareGiver().getName() + "enjoyed taking care of" + this.report.getBookedPet().getName() + ". See you next time!";
        return report;
    }
}
