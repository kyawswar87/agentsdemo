package com.langchain4j.agentsdemo.chatmemory;

import dev.langchain4j.service.MemoryId;
import dev.langchain4j.service.SystemMessage;
import dev.langchain4j.service.UserMessage;
import dev.langchain4j.service.spring.AiService;

@AiService
public interface AssistanceAgent {

    @SystemMessage("""
        You are an assistance agent.
        Greet the user by their name when they introduce themselves.
        If the user asks for their name later, remind them of it.
        """)
    String chat(@MemoryId int memoryId, @UserMessage String input);
}
