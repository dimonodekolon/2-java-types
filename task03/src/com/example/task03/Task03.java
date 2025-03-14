package com.example.task03;

public class Task03 {

    public static int getMetreFromCentimetre(int centimetre) {
        return centimetre / 100;
    }

    public static int getRoundedMetresFromCentimetres(int centimetres) {
        return Math.round((float) centimetres / 100);
    }

    public static void main(String[] args) {
        int result = getMetreFromCentimetre(299);
        System.out.println("Без округления: " + result);

        int resultRounded = getRoundedMetresFromCentimetres(299);
        System.out.println("С округлением: " + resultRounded);
    }

}
