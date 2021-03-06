package org.example;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class GuiceDemo {

    public static void main(String[] args) {
        /*
         * Guice.createInjector() takes one or more modules, and returns a new Injector
         * instance. Most applications will call this method exactly once, in their
         * main() method.
         */
        Injector injector = Guice.createInjector(new DemoModule());

        /*
         * Now that we've got the injector, we can build objects.
         */
//        Greeter greeter = injector.getInstance(Greeter.class);
//
//        // Prints "hello world" 3 times to the console.
//        greeter.sayHello();


        CheckRuleService checkRuleService = injector.getInstance(CheckRuleService.class);
        checkRuleService.check();
    }
}

