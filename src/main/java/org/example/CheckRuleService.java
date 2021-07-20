package org.example;

import javax.inject.Inject;
import java.util.Map;
import java.util.Set;

class CheckRuleService {
    private Map<String, Rule> rules;

    @Inject
    public CheckRuleService(Map<String, Rule> rules) {
        this.rules = rules;
    }

    public void check() {
        Rule rule = rules.get(RuleType.R1.name());
        rule.check();

        rule = rules.get(RuleType.R3.name());
        rule.check();
    }
}
