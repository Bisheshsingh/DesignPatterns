package org.design.patterns.Behavioral.ChainOfResponsibility.Activity;

import org.design.patterns.Behavioral.ChainOfResponsibility.Models.Handler;

public class WorkflowExecutor {
    public void execute(final Handler handler) {
        if(handler != null) {
            handler.handle();
            execute(handler.getNextHandler());
        }
    }
}
