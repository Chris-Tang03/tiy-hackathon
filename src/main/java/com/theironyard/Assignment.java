package com.theironyard;


public class Assignment {

    private String assignmentName;
    private int time;
    private int points;

    public Assignment(){}


    public Assignment(String assignmentName, int time, int points) {
        this.assignmentName = assignmentName;
        this.time = time;
        this.points = points;
    }

    public String getAssignmentName() {
        return assignmentName;
    }

    public void setAssignmentName(String assignmentName) {
        this.assignmentName = assignmentName;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
}
