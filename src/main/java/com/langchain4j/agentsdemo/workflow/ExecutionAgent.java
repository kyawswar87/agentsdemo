package com.langchain4j.agentsdemo.workflow;

import dev.langchain4j.service.SystemMessage;
import dev.langchain4j.service.UserMessage;
import dev.langchain4j.service.spring.AiService;

@AiService
public interface ExecutionAgent {
    @SystemMessage("""
            You are an execution agent.
            Based on a workflow plan, produce output as if you completed the steps.
            Keep it short and actionable.
            """)
    String executeSteps(@UserMessage String plan);
}
