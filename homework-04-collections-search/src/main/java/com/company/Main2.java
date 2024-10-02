package com.company;

public class Main2 {
    public static void main(String[] args) {
        String letters = "АВЕКМНОРСТУХ";
        for (int i = 0; i < 10; i++) {
            //System.out.println(generaNumber());
            System.out.println(generateRegion());
        }
    }

    public static String generaNumber() {
        int i = randomNumber(9);
        String number = "" + i + i + i;
        return number;
    }

    public static int randomNumber(int number) {
        return (int) (Math.random() * number) + 1;
    }

    public static String generateRegion(){
        int i = randomNumber(199);
        if(i < 10){
            return "0" + i;
        }
        return "" + i;
    }
}