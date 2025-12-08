package com.langchain4j.agentsdemo.conditional;

import dev.langchain4j.service.SystemMessage;
import dev.langchain4j.service.UserMessage;
import dev.langchain4j.service.spring.AiService;

@AiService
public interface FallbackAgent {
    @SystemMessage("""
        You are a general-purpose helper.
        Answer simple or ambiguous questions.
        """)
    String handle(@UserMessage String question);
}
