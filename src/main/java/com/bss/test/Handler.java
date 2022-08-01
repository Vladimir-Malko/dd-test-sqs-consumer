package com.bss.test;

import com.amazonaws.services.lambda.runtime.events.SQSEvent;
import com.bss.test.handler.SqsRequestHandlerWrapper;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class Handler implements SqsRequestHandlerWrapper<Void> {

    public Void handleRequest(SQSEvent sqsEvent) {
        log.info("=== start");
        log.info("=== something!!!");
        log.info("=== end of sending");
        return null;
    }
}
