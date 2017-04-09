package com.theironyard;


public class Card {

    //Card Properties
    private String cardName;
    private int cardSkill;
    private int cardTime;


    /**
     * Card Constructor with arguments
     * @param name of the card
     * @param skill level of the card
     * @param time of the card
     */
    public Card(String name, int skill, int time) {
        cardName = name;
        cardSkill = skill;
        cardTime = time;
    }


    /**
     * Get name of the card
     * @return card name
     */
    public String getCardName() {
        return cardName;
    }

    /**
     * Set name of the card
     * @param cardName to be set
     */
    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    /**
     * Get skill level of the card
     * @return skill level of card
     */
    public int getCardSkill() {
        return cardSkill;
    }

    /**
     * Set skill level of the card
     * @param cardSkill
     */
    public void setCardSkill(int cardSkill) {
        this.cardSkill = cardSkill;
    }

    /**
     * Get time amount for card
     * @return time for card
     */
    public int getCardTime() {
        return cardTime;
    }

    /**
     * Set time amount for card
     * @param cardTime
     */
    public void setCardTime(int cardTime) {
        this.cardTime = cardTime;
    }



}
