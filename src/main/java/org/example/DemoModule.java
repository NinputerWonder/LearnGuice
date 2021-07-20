package org.example;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.multibindings.ProvidesIntoMap;
import com.google.inject.multibindings.ProvidesIntoSet;

/**
 * Guice module that provides bindings for message and count used in
 * {@link Greeter}.
 */
class DemoModule extends AbstractModule {
    @Provides
    @Count
    static Integer provideCount() {
        return 3;
    }

    @Provides
    @Message
    static String provideMessage() {
        return "hello world";
    }

    @ProvidesIntoSet
    static Rule provideRuleImpl1() {
        return new RuleImpl1();
    }

    @ProvidesIntoSet
    static Rule provideRuleImpl2() {
        return new RuleImpl2();
    }

    @ProvidesIntoSet
    static Rule provideRuleImpl3() {
        return new RuleImpl3();
    }
}
