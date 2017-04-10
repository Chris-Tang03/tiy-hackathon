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

    //Card One Info
    private String cardOneName;
    private int cardOneSkill;
    private int cardOneTime;

    //Card Two Info
    private String cardTwoName;
    private int cardTwoSkill;
    private int cardTwoTime;

    //Card Three Info
    private String cardThreeName;
    private int cardThreeSkill;
    private int cardThreeTime;

    //Card Four Info
    private String cardFourName;
    private int cardFourSkill;
    private int cardFourTime;

    //Card Five Info
    private String cardFiveName;
    private int cardFiveSkill;
    private int cardFiveTime;


    public GamePlayData(){}

  public GamePlayData(Assignment assignment, Question question , Card cardOne , Card cardTwo, Card cardThree, Card cardFour,Card cardFive) {

        assignmentName = assignment.getAssignmentName();
        assignmentTime = assignment.getTime();
        assignmentPoints = assignment.getPoints();

        questionText = question.getQuestion();
        questionAnswer = question.getCorrectanswer();
        aAnswer = question.getAanswer();
        bAnswer = question.getBanswer();
        cAnswer = question.getCanswer();
        dAnswer = question.getDanswer();

        cardOneName = cardOne.getCardName();
        cardOneSkill = cardOne.getCardSkill();
        cardOneTime = cardOne.getCardTime();

        cardTwoName = cardTwo.getCardName();
        cardTwoSkill = cardTwo.getCardSkill();
        cardTwoTime = cardTwo.getCardTime();

        cardThreeName = cardThree.getCardName();
        cardThreeSkill = cardThree.getCardSkill();
        cardThreeTime = cardThree.getCardTime();

        cardFourName = cardFour.getCardName();
        cardFourSkill = cardFour.getCardSkill();
        cardFourTime = cardFour.getCardTime();

        cardFiveName = cardFive.getCardName();
        cardFiveSkill = cardFive.getCardSkill();
        cardFiveTime = cardFive.getCardTime();

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

    public String getCardOneName() {
        return cardOneName;
    }

    public void setCardOneName(String cardOneName) {
        this.cardOneName = cardOneName;
    }

    public int getCardOneSkill() {
        return cardOneSkill;
    }

    public void setCardOneSkill(int cardOneSkill) {
        this.cardOneSkill = cardOneSkill;
    }

    public int getCardOneTime() {
        return cardOneTime;
    }

    public void setCardOneTime(int cardOneTime) {
        this.cardOneTime = cardOneTime;
    }

    public String getCardTwoName() {
        return cardTwoName;
    }

    public void setCardTwoName(String cardTwoName) {
        this.cardTwoName = cardTwoName;
    }

    public int getCardTwoSkill() {
        return cardTwoSkill;
    }

    public void setCardTwoSkill(int cardTwoSkill) {
        this.cardTwoSkill = cardTwoSkill;
    }

    public int getCardTwoTime() {
        return cardTwoTime;
    }

    public void setCardTwoTime(int cardTwoTime) {
        this.cardTwoTime = cardTwoTime;
    }

    public String getCardThreeName() {
        return cardThreeName;
    }

    public void setCardThreeName(String cardThreeName) {
        this.cardThreeName = cardThreeName;
    }

    public int getCardThreeSkill() {
        return cardThreeSkill;
    }

    public void setCardThreeSkill(int cardThreeSkill) {
        this.cardThreeSkill = cardThreeSkill;
    }

    public int getCardThreeTime() {
        return cardThreeTime;
    }

    public void setCardThreeTime(int cardThreeTime) {
        this.cardThreeTime = cardThreeTime;
    }

    public String getCardFourName() {
        return cardFourName;
    }

    public void setCardFourName(String cardFourName) {
        this.cardFourName = cardFourName;
    }

    public int getCardFourSkill() {
        return cardFourSkill;
    }

    public void setCardFourSkill(int cardFourSkill) {
        this.cardFourSkill = cardFourSkill;
    }

    public int getCardFourTime() {
        return cardFourTime;
    }

    public void setCardFourTime(int cardFourTime) {
        this.cardFourTime = cardFourTime;
    }

    public String getCardFiveName() {
        return cardFiveName;
    }

    public void setCardFiveName(String cardFiveName) {
        this.cardFiveName = cardFiveName;
    }

    public int getCardFiveSkill() {
        return cardFiveSkill;
    }

    public void setCardFiveSkill(int cardFiveSkill) {
        this.cardFiveSkill = cardFiveSkill;
    }

    public int getCardFiveTime() {
        return cardFiveTime;
    }

    public void setCardFiveTime(int cardFiveTime) {
        this.cardFiveTime = cardFiveTime;
    }
}
