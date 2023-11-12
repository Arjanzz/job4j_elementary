package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        double result2 = Point.distance(0, 0, 3, 1);
        double result3 = Point.distance(0, 0, 4, 2);
        double result4 = Point.distance(1, 2, 4, 2);

        System.out.println("result (0,0) to (2,0) " + result);
        System.out.println("result (0,0) to (3,1) " + result2);
        System.out.println("result (0,0) to (4,2) " + result3);
        System.out.println("result (1,2) to (4,2) " + result4);
    }
}


