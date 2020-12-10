package com.company.first;

public class Beer {
//    public static void main(String[] args) {
//        int count = 9;
//        while (count > 0) {
//            System.out.println(count + " bottles of beer on the wall");
//            System.out.println(count + " bottles of beer");
//            System.out.println("Take one down, pass it around");
//            count = count - 1;
//            System.out.println(count + " bottles of beer on the wall");
//        }
//    }

    public static void main(String[] args) {
        int beerNum = 4;
        String word = "bottles";

        while (beerNum > 0) {

            if (beerNum == 1) {
                word = "bottle";
            }

            System.out.println(beerNum + " " + word + " of beer on the wall");
            System.out.println(beerNum + " " + word + " of beer");
            System.out.println("Take one down");
            System.out.println("Pass it around");
            beerNum = beerNum - 1;
            if (beerNum > 0) {
                System.out.println(beerNum + " " + word + " of beer on the wall");
            } else {
                System.out.println("Nothing on the wall");
            }

        }
    }
}