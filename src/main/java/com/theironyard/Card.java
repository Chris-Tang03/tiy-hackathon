package com.theironyard;


public class Card {
    private String cardName;
    private int cardSkill;
    private int cardTime;


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

    public Card(String name, int skill, int time) {
        cardName = name;
        cardSkill = skill;
        cardTime = time;
    }







    @Override
    public String toString() {
        return "Card{" +
                "cardName=" + cardName +
                ", cardSkill=" + cardSkill +
                ", cardTime=" + cardTime +
                '}';
    }
}
