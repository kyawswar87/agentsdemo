package com.langchain4j.agentsdemo.conditional;

import dev.langchain4j.model.ollama.OllamaChatModel;
import dev.langchain4j.service.AiServices;

public class ConditionalCoordinator {
    private final IntentClassifierAgent classifier;
    private final BusinessAgent businessAgent;
    private final TechnicalAgent technicalAgent;
    private final FallbackAgent fallbackAgent;

    public ConditionalCoordinator() {

        OllamaChatModel llm = OllamaChatModel.builder()
                .baseUrl("http://localhost:11434") // your ollama server url
                .modelName("gemma3:4b")  // or llama3, qwen2, phi3, etc
                .temperature(0.1)
                .build();

        classifier = AiServices.create(IntentClassifierAgent.class, llm);
        businessAgent = AiServices.create(BusinessAgent.class, llm);
        technicalAgent = AiServices.create(TechnicalAgent.class, llm);
        fallbackAgent = AiServices.create(FallbackAgent.class, llm);
    }

    public String route(String userRequest) {

        String intent = classifier.classify(userRequest).trim().toUpperCase();

        System.out.println("Detected intent = " + intent);

        return switch (intent) {
            case "BUSINESS" -> businessAgent.handle(userRequest);
            case "TECH"     -> technicalAgent.handle(userRequest);
            default         -> fallbackAgent.handle(userRequest);
        };
    }
}
