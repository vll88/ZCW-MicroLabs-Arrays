package io.zipcoder.microlabs.arrays;


public class ArrayParty {

    public String printArray(String[] inputArray) {

        //String outputArray[] = new String [inputArray.length];
        String output = "*** Output ***";
        //return a string of elements in an array
        for (int i = 0; i < inputArray.length; i++) {
            output += "\n" + inputArray[i];
        }
        return output;
    }


    public String lastElement(String[] inputArray) {

        String output = "*** Output ***";
        int last_element = (inputArray.length - 1);   //index only
        output += "\n" + inputArray[last_element];

        return output;
    }

    //TODO Define the method lastButOne
    public String lastButOneElement(String[] inputArray) {

        String output = "*** Output ***";
        int penult = (inputArray.length - 2);
        output += "\n" + inputArray[penult];

        return output;
    }

    //TODO Define the method reverse
    public String reverse(String[] inputArray) {    //need to return String not String []!!!!!

        String output = "*** Output ***";

        for (int i = (inputArray.length - 1); i >= 0; i--) {
            output += "\n" + inputArray[i];
        }
        return output;
    }

    //TODO Define the method isPalindrome

    //TODO Define the method compress
    public String compress(int[] inputArray) {      //make sure int input here!!

        String output = "*** Output ***" + "\n" + inputArray[0];

        for (int i = 0; i < inputArray.length - 1; i++) {

                /*
                if (inputArray[i] == inputArray[i + 1]) {
                        inputArray[i] = inputArray[i+1];
                        output += "\n" + inputArray[i];
                }
                */

            if (inputArray[i] != inputArray[i + 1]) {
                // inputArray[i] = inputArray[i + 1];
                output += "\n" + inputArray[i + 1];

            }
        }
        return output;
    }

    //TODO Define the method pack



}