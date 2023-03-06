package edu.ucalgary.oop;

import java.time.LocalDate;
import java.util.regex.Pattern;

public class RobotDataLine implements Cloneable {
    private String dateLine;
    private String robotID;
    private Sensor sensor;
    private Movement movement;
    private LocalDate date;
    private final String DATE_REGEX = "\\[([0-9]{1,2})/([0-9]{1,2})/([0-9]{4})\\]";
    private final Pattern DATE_PATTERN = Pattern.compile(DATE_REGEX);
    private final String ROBOT_REGEX = "\\s([0-9]{3}[A-Z]{1}\\s)";
    private final Pattern ROBOT_PATTERN = Pattern.compile(ROBOT_REGEX);

    public RobotDataLine(String line) throws IllegalArgumentException {
        String[] parts = line.split(" ");
        String robotID = parts[0] + " " + parts[1];
        String[] dateParts = parts[4].split("[\\[\\]]");
        String dateLine = dateParts[1];
        String[] actionParts = parts[5].split("\"");
        String movement = actionParts[1] + " " + parts[7];
        String[] sensorParts = parts[8].split("[()\"\"]");
        String sensor = sensorParts[1];

        if (DATE_PATTERN.matcher(dateLine).matches() || ROBOT_PATTERN.matcher(robotID).matches()) {
            throw new IllegalArgumentException("Invalid date or robot ID");
        }
        this.robotID = robotID;
        this.dateLine = dateLine;
        this.sensor = new Sensor(sensor);
        this.movement = new Movement(movement);
        this.date = LocalDate.parse(dateLine, java.time.format.DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }
    public String getRobotID() {
        return this.robotID;
    }
    public String getDataLine() {
        return this.robotID + " - - " + this.dateLine + " \""  + this.movement.getAction() + " - " + this.movement.getDirection() + " " + "(" + this.sensor.getSensor() + ")" + " \"";
    }
    public Sensor getSensor() {
        return this.sensor;
    }
    public Movement getMovement() {
        return this.movement;
    }
    public LocalDate getDate() {
        return this.date;
    }
    @Override
    public Object clone() throws CloneNotSupportedException {
        try {
            RobotDataLine clone = (RobotDataLine) super.clone();
            clone.sensor = (Sensor) this.sensor.clone();
            clone.movement = (Movement) this.movement.clone();
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new CloneNotSupportedException();
        }
    }
}
