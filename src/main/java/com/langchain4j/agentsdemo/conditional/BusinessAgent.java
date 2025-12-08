package com.langchain4j.agentsdemo.conditional;

import dev.langchain4j.service.SystemMessage;
import dev.langchain4j.service.UserMessage;
import dev.langchain4j.service.spring.AiService;

@AiService
public interface BusinessAgent {
    @SystemMessage("""
        You are a business and strategy agent.
        Explain ideas clearly and concisely.
        """)
    String handle(@UserMessage String question);
}
