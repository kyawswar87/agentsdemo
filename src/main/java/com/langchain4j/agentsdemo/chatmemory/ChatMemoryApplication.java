package com.langchain4j.agentsdemo.chatmemory;

import dev.langchain4j.memory.chat.MessageWindowChatMemory;
import dev.langchain4j.model.chat.ChatModel;
import dev.langchain4j.model.ollama.OllamaChatModel;
import dev.langchain4j.service.AiServices;

public class ChatMemoryApplication {
    public static void main(String[] args) {

        ChatModel model = OllamaChatModel.builder()
                .baseUrl("http://localhost:11434") // your ollama server url
                .modelName("gemma3:4b")  // or llama3, qwen2, phi3, etc
                .logRequests(true)
                .logResponses(true)
                .build();

        AssistanceAgent assistant = AiServices.builder(AssistanceAgent.class)
                .chatModel(model)
                .chatMemoryProvider(memoryId -> MessageWindowChatMemory.withMaxMessages(10))
                .build();

        System.out.println(assistant.chat(1, "Hello, my name is Kyaw"));

        System.out.println(assistant.chat(2, "Hello, my name is Swa"));

        System.out.println(assistant.chat(1, "What is my name?"));

        System.out.println(assistant.chat(2, "What is my name?"));
    }
}
