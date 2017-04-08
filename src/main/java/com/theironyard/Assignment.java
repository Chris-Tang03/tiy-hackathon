package com.theironyard;


public class Assignment {

    //Assignment properties
    private String assignmentName;
    private int time;
    private int points;

    //Assignment Constructor
    public Assignment(){}

    //Assignment Constructor with arguments
    public Assignment(String assignmentName, int time, int points) {
        this.assignmentName = assignmentName;
        this.time = time;
        this.points = points;
    }


    /**
     * Get assignment name
     * @return assignment name as String
     */
    public String getAssignmentName() {
        return assignmentName;
    }


    /**
     * Set assignment name
     * @param assignmentName is the name of the assignment
     */
    public void setAssignmentName(String assignmentName) {
        this.assignmentName = assignmentName;
    }


    /**
     * Get the time required to complete the assignment
     * @return the time to complete assignment
     */
    public int getTime() {
        return time;
    }


    /**
     * Set the time required to complete the assignment
     * @param time to complete the assignment
     */
    public void setTime(int time) {
        this.time = time;
    }


    /**
     * Get the number of points for completing the assignment
     * @return the points for the assignment
     */
    public int getPoints() {
        return points;
    }


    /**
     * Set the number of points for completing the assignment
     * @param points earned after completing the assignment
     */
    public void setPoints(int points) {
        this.points = points;
    }
}
