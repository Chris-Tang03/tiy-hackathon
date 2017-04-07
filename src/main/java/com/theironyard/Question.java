package com.theironyard;


public class Question {
    private Integer questionid;
    private String question;
    private String correctanswer;
    private String aanswer;
    private String banswer;
    private String canswer;
    private String danswer;

    public Question(){}

    public Question(Integer questionid, String question, String correctanswer, String aanswer, String banswer, String canswer, String danswer){
        this.questionid = questionid;
        this.question = question;
        this.correctanswer = correctanswer;
        this.aanswer = aanswer;
        this.banswer = banswer;
        this.canswer = canswer;
        this.danswer = danswer;
    }

    public Integer getQuestionid() {
        return questionid;
    }

    public void setQuestionid(Integer questionid) {
        this.questionid = questionid;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getCorrectanswer() {
        return correctanswer;
    }

    public void setCorrectanswer(String correctanswer) {
        this.correctanswer = correctanswer;
    }

    public String getAanswer() {
        return aanswer;
    }

    public void setAanswer(String aanswer) {
        this.aanswer = aanswer;
    }

    public String getBanswer() {
        return banswer;
    }

    public void setBanswer(String banswer) {
        this.banswer = banswer;
    }

    public String getCanswer() {
        return canswer;
    }

    public void setCanswer(String canswer) {
        this.canswer = canswer;
    }

    public String getDanswer() {
        return danswer;
    }

    public void setDanswer(String danswer) {
        this.danswer = danswer;
    }


    @Override
    public String toString() {
        return "Question{" +
                "questionid=" + questionid +
                ", question='" + question + '\'' +
                ", correctanswer='" + correctanswer + '\'' +
                ", aanswer='" + aanswer + '\'' +
                ", banswer='" + banswer + '\'' +
                ", canswer='" + canswer + '\'' +
                ", danswer='" + danswer + '\'' +
                '}';
    }
}
