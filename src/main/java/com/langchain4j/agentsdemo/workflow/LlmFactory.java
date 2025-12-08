package com.langchain4j.agentsdemo.workflow;

import dev.langchain4j.model.ollama.OllamaChatModel;

public class LlmFactory {
    public static OllamaChatModel create() {
        return OllamaChatModel.builder()
                .baseUrl("http://localhost:11434") // your ollama server url
                .modelName("gemma3:4b")  // or llama3, qwen2, phi3, etc
                .temperature(0.2)
                .build();
    }
}
