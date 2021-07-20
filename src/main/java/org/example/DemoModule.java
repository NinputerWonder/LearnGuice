package org.example;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.multibindings.ClassMapKey;
import com.google.inject.multibindings.ProvidesIntoMap;
import com.google.inject.multibindings.ProvidesIntoSet;
import com.google.inject.multibindings.StringMapKey;

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

    @ProvidesIntoMap
    @StringMapKey("R1")
    static Rule provideRuleImpl1() {
        return new RuleImpl1();
    }

    @ProvidesIntoMap
    @StringMapKey("R2")
    static Rule provideRuleImpl2() {
        return new RuleImpl2();
    }

    @ProvidesIntoMap
    @StringMapKey("R3")
    static Rule provideRuleImpl3() {
        return new RuleImpl3();
    }
}
