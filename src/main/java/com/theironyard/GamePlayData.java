package com.theironyard;



//This might need changed a lot..... (Not sure if this is the correct approach)
public class GamePlayData {

    //Assignment Info
    private String assignmentName;
    private int assignmentTime;
    private int assignmentPoints;

    //Question info
    private String questionText;
    private String questionAnswer;
    private String aAnswer;
    private String bAnswer;
    private String cAnswer;
    private String dAnswer;

    //Card Info
    private String cardName;
    private int cardSkill;
    private int cardTime;


    public GamePlayData(){}

  public GamePlayData(Assignment assignment, Question question , Card card) {

        assignmentName = assignment.getAssignmentName();
        assignmentTime = assignment.getTime();
        assignmentPoints = assignment.getPoints();

        questionText = question.getQuestion();
        questionAnswer = question.getCorrectanswer();
        aAnswer = question.getAanswer();
        bAnswer = question.getBanswer();
        cAnswer = question.getCanswer();
        dAnswer = question.getDanswer();

        cardName = card.getCardName();
        cardSkill = card.getCardSkill();
        cardTime = card.getCardTime();

    }

    public String getAssignmentName() {
        return assignmentName;
    }

    public void setAssignmentName(String assignmentName) {
        this.assignmentName = assignmentName;
    }

    public int getAssignmentTime() {
        return assignmentTime;
    }

    public void setAssignmentTime(int assignmentTime) {
        this.assignmentTime = assignmentTime;
    }

    public int getAssignmentPoints() {
        return assignmentPoints;
    }

    public void setAssignmentPoints(int assignmentPoints) {
        this.assignmentPoints = assignmentPoints;
    }

    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public String getQuestionAnswer() {
        return questionAnswer;
    }

    public void setQuestionAnswer(String questionAnswer) {
        this.questionAnswer = questionAnswer;
    }

    public String getaAnswer() {
        return aAnswer;
    }

    public void setaAnswer(String aAnswer) {
        this.aAnswer = aAnswer;
    }

    public String getbAnswer() {
        return bAnswer;
    }

    public void setbAnswer(String bAnswer) {
        this.bAnswer = bAnswer;
    }

    public String getcAnswer() {
        return cAnswer;
    }

    public void setcAnswer(String cAnswer) {
        this.cAnswer = cAnswer;
    }

    public String getdAnswer() {
        return dAnswer;
    }

    public void setdAnswer(String dAnswer) {
        this.dAnswer = dAnswer;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public int getCardSkill() {
        return cardSkill;
    }

    public void setCardSkill(int cardSkill) {
        this.cardSkill = cardSkill;
    }

    public int getCardTime() {
        return cardTime;
    }

    public void setCardTime(int cardTime) {
        this.cardTime = cardTime;
    }
}
