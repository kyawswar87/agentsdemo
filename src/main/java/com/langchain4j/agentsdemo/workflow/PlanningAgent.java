package com.langchain4j.agentsdemo.workflow;

import dev.langchain4j.service.SystemMessage;
import dev.langchain4j.service.UserMessage;
import dev.langchain4j.service.spring.AiService;

@AiService
public interface PlanningAgent {
    @SystemMessage("""
            You are a planning agent.
            Your job: create a step-by-step action plan based on research input.
            Output a numbered workflow.
            """)
    String createPlan(@UserMessage String researchSummary);
}
