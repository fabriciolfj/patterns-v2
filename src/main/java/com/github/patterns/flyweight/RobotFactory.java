package com.github.patterns.flyweight;

import java.util.HashMap;
import java.util.Map;

public class RobotFactory {

    static Map<String, Robot> robotFactory = new HashMap<>();

    public int totalObjectsCreated() {
        return robotFactory.size();
    }

    public static synchronized Robot getRobotFromFactory(final String robotType) throws Exception {
        Robot robotCategory = robotFactory.get(robotType);

        if (robotCategory == null) {
            robotCategory = switch (robotType) {
                case "small" -> {
                    System.out.println("We do not have small robot at present. So we are creating a small robot now.");
                    yield new SmallRobot();
                }
                case "large" -> {
                    System.out.println("We do not have large robot at present. So we are creating a large robot now.");
                    yield new LargeRobot();
                }
                case "fixed" -> {
                    System.out.println("We do not have fixed robot at present. So we are creating a fixed robot now.");
                    yield new FixedSizeRobot();
                }
                default -> throw new Exception("robot factory can create only small, large or fixed size robots");
            };
            robotFactory.put(robotType, robotCategory);
        } else {
            System.out.println("using existing " + robotType + " robot and coloring it");
        }

        return robotCategory;
    }
}
