package io.zipcoder.microlabs.arrays;

import org.junit.Assert;
import org.junit.Test;

public class ArrayPartyTest {

    @Test
    public void printArrayTest(){
        //: Given
        String[] breakfast = {"Sausage", "Eggs", "Beans", "Bacon", "Tomatoes", "Mushrooms"};
        ArrayParty arrayParty = new ArrayParty();
        String expected = "*** Output ***\n" +
                "Sausage\n" +
                "Eggs\n" +
                "Beans\n" +
                "Bacon\n" +
                "Tomatoes\n" +
                "Mushrooms";

        //: When
        String actual = arrayParty.printArray(breakfast);

        //: Then
        Assert.assertEquals("The two string outputs are equal", expected, actual);
    }

    @Test
    public void lastElementTest(){
        //: Given
        String[] breakfast = {"Sausage", "Eggs", "Beans", "Bacon", "Tomatoes", "Mushrooms"};
        ArrayParty arrayParty = new ArrayParty();
        String expected = "*** Output ***\nMushrooms";
        //: When
        String actual = arrayParty.lastElement(breakfast);
        //: Then
        Assert.assertEquals("The two string outputs are equal",expected,actual);
    }

    //TODO Define the method lastButOneTest
    @Test
    public void lastButOneTest(){
        //Given
        String[] breakfast = {"Sausage", "Eggs", "Beans", "Bacon", "Tomatoes", "Mushrooms"};
        ArrayParty arrayParty = new ArrayParty();
        String expected = "*** Output ***\nTomatoes";

        //When
        String actual = arrayParty.lastButOneElement(breakfast);

        //Then
        Assert.assertEquals("The two string outputs are equal",expected,actual);
    }

    //TODO Define the method reverseTest
    @Test
    public void reverseTest(){
        //Given
        String [] breakfast = {"Sausage", "Eggs", "Beans", "Bacon", "Tomatoes", "Mushrooms"};
        ArrayParty arrayParty = new ArrayParty();
        String expected = "*** Output ***\n"+"Mushrooms"+"\nTomatoes"+"\nBacon"+"\nBeans"+"\nEggs"+"\nSausage";
        //When
        String actual = arrayParty.reverse(breakfast);
        //Then
        Assert.assertEquals("The two string outputs are equal",expected,actual);
    }

    //TODO Define the method isPalindromeTest

    //TODO Define the method compressTest
    @Test
    public void compressTest(){
        //Given
        int [] nums = {1,1,3,3,3,2,2,2,1,1,1,1,4,4,4,4};
        ArrayParty arrayParty = new ArrayParty();
        String expected = "*** Output ***\n1\n3\n2\n1\n4";

        //When
        String actual = arrayParty.compress(nums);
        //Then
        Assert.assertEquals("The two string outputs are equal",expected,actual);
    }


    //TODO Define the method packTest
    @Test
    public void packTest(){
        //Given
        char [] letters = {'a' 'a' 'a' }

        //When

        //Then


    }

}
