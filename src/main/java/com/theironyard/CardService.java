package com.theironyard;

import java.util.Random;

public class CardService {

    private Random random = new Random();


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
        if(i <= 97){
            return "Extension";
        } else if (i <= 99) {
            return "LabTime";
        } else {
            return "Bribe";
        }
    }
}