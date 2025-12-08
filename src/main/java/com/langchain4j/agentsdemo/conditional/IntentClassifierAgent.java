package com.langchain4j.agentsdemo.conditional;

import dev.langchain4j.service.SystemMessage;
import dev.langchain4j.service.UserMessage;
import dev.langchain4j.service.spring.AiService;

@AiService
public interface IntentClassifierAgent {
    @SystemMessage("""
        You are an intent classifier.
        Classify the user's request into exactly one category:
        - BUSINESS
        - TECH
        - UNKNOWN
        
        Respond ONLY with the category name.
        """)
    String classify(@UserMessage String input);
}
