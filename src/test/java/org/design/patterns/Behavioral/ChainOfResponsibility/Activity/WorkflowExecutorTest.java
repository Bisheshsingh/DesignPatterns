package org.design.patterns.Behavioral.ChainOfResponsibility.Activity;

import org.design.patterns.Behavioral.ChainOfResponsibility.Models.Handler;
import org.junit.jupiter.api.Test;

class WorkflowExecutorTest {
    @Test
    void executorTest() {
        final WorkflowExecutor workflowExecutor = new WorkflowExecutor();
        final Handler start = new OrderInitializeHandler();
        start.setNextHandler(new FraudCheckHandler())
                .setNextHandler(new PaymentAuthHandler())
                .setNextHandler(new PaymentHandler());

        workflowExecutor.execute(start);
    }
}