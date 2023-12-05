package com.github.patterns.flyweight;

import java.util.Random;

public class Main {

    public static void main(String[] args) throws Exception {
        RobotFactory factory = new RobotFactory();
        Robot robot;

        for (int i = 0; i < 3; i++) {
            robot = RobotFactory.getRobotFromFactory("small");

            Thread.sleep(1000);

            robot.showMe(getRandomColor());
        }

        System.out.println("total " + factory.totalObjectsCreated());

        for (int i = 0; i < 5; i++) {
            robot = RobotFactory.getRobotFromFactory("large");

            Thread.sleep(1000);

            robot.showMe(getRandomColor());
        }

        System.out.println("total " + factory.totalObjectsCreated());

        for (int i = 0; i < 10; i++) {
            robot = RobotFactory.getRobotFromFactory("fixed");

            Thread.sleep(1000);

            robot.showMe(getRandomColor());
        }

        System.out.println("total " + factory.totalObjectsCreated());
    }

    static String getRandomColor() {
        Random r = new Random();
        if (r.nextInt() % 2 == 0) {
            return "red";
        } else {
            return "green";
        }
    }
}
