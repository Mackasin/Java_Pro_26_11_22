package com.hillel.dzhurynskyi.homework.hm24.chain.of.responsibility;

public abstract class AbstractProcessor {
    private AbstractProcessor nextProcessor;

    protected AbstractProcessor(AbstractProcessor nextProcessor) {
        this.nextProcessor = nextProcessor;
    }

    public void process(int request) {
        if (nextProcessor != null) {
            nextProcessor.process(request);
        } else {
            System.out.println("Chain of responsibilities was ended without actions");
        }
    }
}