package ru.job4j.calculator;

public class Fit {

    public static double manWeight(short height) {
        double rsl = (height - 100) * 1.15;
        return rsl;
    }

    public static double womanWeight(short height) {
        double rsl = (height - 110) * 1.15;
        return rsl;
    }

    public static void main(String[] args) {
        short manHeight = 180;
        short womanHeight = 170;

        double man = Fit.manWeight(manHeight);
        double girl = Fit.womanWeight(womanHeight);

        System.out.println("Man 180 is " + man);
        System.out.println("Girl 170 is " + girl) ;
    }
}