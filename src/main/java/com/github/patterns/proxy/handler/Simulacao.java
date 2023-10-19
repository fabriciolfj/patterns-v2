package com.github.patterns.proxy.handler;

import com.github.patterns.decorator.log.ConsoleLogger;
import com.github.patterns.decorator.log.Logger;
import com.sun.tools.javac.Main;

import java.lang.reflect.Proxy;

public class Simulacao {

    public static void main(String[] args) {
        var logger = new ConsoleLogger();
        var proxy = (Logger) Proxy.newProxyInstance(Main.class.getClassLoader(), new Class[] { Logger.class }, new RepeatingInvocationHandler(logger, 3));

        proxy.log("teste");
    }
}
