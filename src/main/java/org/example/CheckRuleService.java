package org.example;

import javax.inject.Inject;
import java.util.Set;

class CheckRuleService {
    private Set<Rule> rules;

    @Inject
    public CheckRuleService(Set<Rule> rules) {
        this.rules = rules;
    }

    public void check() {
        for (Rule r : rules) {
            r.check();
        }
    }
}
