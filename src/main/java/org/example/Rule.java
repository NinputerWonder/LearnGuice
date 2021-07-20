package org.example;

interface Rule {
    void check();
}

class RuleImpl1 implements Rule{
    @Override
    public void check() {
        System.out.println("RuleImpl1 check");
    }
}

class RuleImpl2 implements Rule{
    @Override
    public void check() {
        System.out.println("RuleImpl2 check");
    }
}

class RuleImpl3 implements Rule{
    @Override
    public void check() {
        System.out.println("RuleImpl3 check");
    }
}

enum RuleType {
    R1,
    R2,
    R3
}