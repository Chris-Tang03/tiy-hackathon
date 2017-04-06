package com.theironyard;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;

/**
 * Created by forestnewark on 4/6/17.
 */
public class AssignmentTest {

    private Assignment assignment;

    @Before
    public void setup(){
        assignment = new Assignment();
    }


    @Test
    public void getAssignmentName() throws Exception {
        assignment.setAssignmentName("HashMap Challenge");
        assertThat(assignment.getAssignmentName(), equalTo("HashMap Challenge"));


    }

    @Test
    public void setAssignmentName() throws Exception {

        assignment.setAssignmentName("Binary Tree Challenge");
        assertThat(assignment.getAssignmentName(), equalTo("Binary Tree Challenge"));

    }

    @Test
    public void getTime() throws Exception {
        assignment.setTime(15);
        assertThat(assignment.getTime(),equalTo("15"));

    }

    @Test
    public void setTime() throws Exception {
        assignment.setTime(10);
        assertThat(assignment.getTime(),equalTo("10"));

    }

    @Test
    public void getPoints() throws Exception {

        assignment.setPoints(10);
        assertThat(assignment.getPoints(),equalTo(10));

    }

    @Test
    public void setPoints() throws Exception {

        assignment.setPoints(5);
        assertThat(assignment.getPoints(),equalTo(5));

    }

}