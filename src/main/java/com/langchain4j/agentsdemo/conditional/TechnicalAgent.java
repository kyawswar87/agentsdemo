package com.langchain4j.agentsdemo.conditional;

import dev.langchain4j.service.SystemMessage;
import dev.langchain4j.service.UserMessage;
import dev.langchain4j.service.spring.AiService;

@AiService
public interface TechnicalAgent {
    @SystemMessage("""
        You are a senior software engineer.
        Provide accurate technical explanations, code, and architecture.
        """)
    String handle(@UserMessage String question);
}
