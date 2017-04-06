package com.theironyard;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;

/**
 * Created by forestnewark on 4/6/17.
 */
public class PlayerTest {


    private Player player;

    @Before
    public void setup(){
        player = new Player();

    }


    @Test
    public void getPlayerName() throws Exception {
        player.setPlayerName("John");

        assertThat(player.getPlayerName(),equalTo("John"));

    }



    @Test
    public void setPlayerName() throws Exception {
        player.setPlayerName("Frank");

        assertThat(player.getPlayerName(),equalTo("Frank"));

    }

    @Test
    public void getTime() throws Exception {
        player.setTime(100);

        assertThat(player.getTime(),equalTo(100));
    }

    @Test
    public void setTime() throws Exception {

        player.setTime(50);

        assertThat(player.getTime(),equalTo(50));

    }

    @Test
    public void getSkill() throws Exception {

        player.setSkill(20);
        assertThat(player.getSkill(),equalTo(20));

    }

    @Test
    public void setSkill() throws Exception {

        player.setSkill(25);
        assertThat(player.getSkill(),equalTo(25));

    }

    @Test
    public void getPoints() throws Exception {

        player.setPoints(10);
        assertThat(player.getPoints(),equalTo(10));

    }

    @Test
    public void setPoints() throws Exception {
        player.setPoints(5);
        assertThat(player.getPoints(),equalTo(5));

    }

}