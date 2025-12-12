package com.langchain4j.agentsdemo.rag;

import dev.langchain4j.service.SystemMessage;
import dev.langchain4j.service.UserMessage;
import dev.langchain4j.service.spring.AiService;

@AiService
public interface Assistant {
    @SystemMessage("""
        You are an assistance agent.
        """)
    String chat(@UserMessage String input);
}
