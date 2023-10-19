package com.github.patterns.proxy.handler;

import com.github.patterns.decorator.log.Logger;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class RepeatingInvocationHandler implements InvocationHandler {

    private final Logger logger;
    private final int times;

    public RepeatingInvocationHandler(final Logger logger, final int times) {
        this.logger = logger;
        this.times = times;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (method.getName().equalsIgnoreCase("log") && args.length == 1 && args[0] instanceof String) {
            for (int i = 0; i < times; i++) {
                method.invoke(logger, args[0]);
            }
        }

        return null;
    }
}
