package edu.ucalgary.oop;

import java.util.regex.Pattern;

public class Movement implements Cloneable, FormattedOutput{
    enum Actions {
        FORWARD, LEFT, REVERSE, RIGHT, START, STOP
    }
    enum Directions {
        E, N, NE, NW, S, SE, SW, W
    }
    private String action;
    private String direction;
    private final String REGEX = "\"([A-Z]+) - ([A-Z]{1,2})";
    private final Pattern PATTERN = Pattern.compile(REGEX);
    public Movement(String movement) throws IllegalArgumentException {
        if (PATTERN.matcher(movement).matches()) {
            throw new IllegalArgumentException("Invalid movement");
        }
        String[] split = movement.split(" ");
        this.action = split[0];
        this.direction = split[1];
    }
    public String getAction() {
        return this.action;
    }
    public String getDirection() {
        return this.direction;
    }
    @Override
    public Object clone() throws CloneNotSupportedException {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            throw new CloneNotSupportedException();
        }
    }
    @Override
    public String getFormatted() {
        return "Action: "+ this.action + ", Direction: " + this.direction;
    }
}
