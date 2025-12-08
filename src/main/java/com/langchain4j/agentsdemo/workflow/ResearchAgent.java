package com.langchain4j.agentsdemo.workflow;

import dev.langchain4j.service.SystemMessage;
import dev.langchain4j.service.UserMessage;
import dev.langchain4j.service.spring.AiService;

@AiService
public interface ResearchAgent {
    @SystemMessage("""
            You are a research agent.
            Your job: collect factual information concisely.
            Return clean bullet points only.
            """)
    String research(@UserMessage String topic);
}
