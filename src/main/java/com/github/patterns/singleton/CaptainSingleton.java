package com.github.patterns.singleton;

final public class CaptainSingleton {

    private static Captain captain;

    public static Captain getCaptain() {
        if (captain == null) {
            synchronized (CaptainSingleton.class) {
                if (captain == null) {
                    captain = new Captain();
                }
            }
        }

        return captain;
    }
}
