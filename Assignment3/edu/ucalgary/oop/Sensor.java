package edu.ucalgary.oop;

import java.util.regex.Pattern;

public class Sensor implements Cloneable, FormattedOutput{
    private String sensor;
    private final String REGEX  = "\"([a-z]+)\\)";
    private final Pattern PATTERN = Pattern.compile(REGEX);

    public Sensor(String sensor) throws IllegalArgumentException {
        if (PATTERN.matcher(sensor).matches()) {
            throw new IllegalArgumentException("Invalid sensor");
        }
        this.sensor = sensor;
    }
    public String getSensor() {
        return this.sensor;
    }
    @Override
    public Object clone() throws CloneNotSupportedException {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            throw new InternalError(e.toString());
        }
    }
    @Override
    public String getFormatted() {
        return "Sensor: " + this.sensor;
    }
}
