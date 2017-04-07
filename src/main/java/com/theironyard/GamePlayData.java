package com.theironyard;

/**
 * Created by forestnewark on 4/7/17.
 */

//This might need changed a lot..... (Not sure if this is the correct approach)
public class GamePlayData {

    //Assignment Info
    private String assignmentName;
    private int assignmentTime;

    //Question info
    private String questionText;
    private String questionAnswer;
    private String aAnswer;
    private String bAnswer;
    private String cAnswer;
    private String dAnswer;

    //Card Info





  public GamePlayData(Assignment assignment, Question question , Card card) {

        assignmentName = assignment.getAssignmentName();


    }





}
