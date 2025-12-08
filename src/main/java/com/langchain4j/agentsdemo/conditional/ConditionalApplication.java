package com.langchain4j.agentsdemo.conditional;

public class ConditionalApplication {
    public static void main(String[] args) {
        ConditionalCoordinator coordinator = new ConditionalCoordinator();

        String[] userRequests = {
                "Create a marketing plan for our new product launch.",
                "Fix the bug in the payment processing module.",
                "What is the weather like today?"
        };

        for (String request : userRequests) {
            System.out.println("=== USER REQUEST ===");
            System.out.println(request);

            String response = coordinator.route(request);

            System.out.println("\n=== AGENT RESPONSE ===");
            System.out.println(response);
            System.out.println("\n-----------------------\n");
        }
    }
}
