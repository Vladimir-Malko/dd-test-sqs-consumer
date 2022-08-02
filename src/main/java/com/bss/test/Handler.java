package com.bss.test;

import com.amazonaws.services.lambda.runtime.events.SQSEvent;
import com.bss.test.handler.SqsRequestHandlerWrapper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Handler implements SqsRequestHandlerWrapper<Void> {

    private static final Logger log = LogManager.getLogger(Handler.class);

    public Void handleRequest(SQSEvent sqsEvent) {
        log.info("=== start");
        log.info("=== something!!!");
        log.info("=== end of sending");
        return null;
    }
}
