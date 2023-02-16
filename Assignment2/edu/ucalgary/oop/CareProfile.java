package edu.ucalgary.oop;

public class CareProfile {
    private String[] medList;
    private String medInstructions;
    private String feedingInstructions;

    public CareProfile(String[] medList, String meds, String feeding) {
        this.medList = medList;
        this.medInstructions = meds;
        this.feedingInstructions = feeding;
    }
    public String summarizeCareInstructions() {
        String summary = "";
        for (int i = 0; i < this.medList.length; i++) {
            if(i == this.medList.length - 1) {
                summary += this.medList[i];
            } else
            summary += this.medList[i] + ", ";
        }
        summary += "\n" + this.medInstructions + "\n";
        summary += "" + this.feedingInstructions;
        return summary;
    }
}
