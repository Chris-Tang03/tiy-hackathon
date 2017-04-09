package com.theironyard;

import java.util.Random;

public class CardService {

    private Random random = new Random();

    public CardService(){}


    public Card getRandomCard(){
         return new Card(randomName(),randomSkill(),randomTime());
    }

    private int randomTime() {
        return random.nextInt(15) + 1;
    }

    private int randomSkill() {
        return random.nextInt(15) + 1;
    }

    private String randomName() {
        int i = random.nextInt(100) + 1;
        if(i <= 45){
            return "Extension";
        } else if (i <= 95) {
            return "LabTime";
        } else {
            return "Bribe";
        }
    }
}