package com.langchain4j.agentsdemo.workflow;

import dev.langchain4j.service.AiServices;

public class WorkflowCoordinator {
    private final ResearchAgent researchAgent;
    private final PlanningAgent planningAgent;
    private final ExecutionAgent executionAgent;

    public WorkflowCoordinator() {
        var llm = LlmFactory.create();

        this.researchAgent = AiServices.create(ResearchAgent.class, llm);
        this.planningAgent = AiServices.create(PlanningAgent.class, llm);
        this.executionAgent = AiServices.create(ExecutionAgent.class, llm);
    }

    public void processWorkflow(String task) {
        System.out.println("=== USER REQUEST ===");
        System.out.println(task);

        System.out.println("\n=== RESEARCH AGENT ===");
        String research = researchAgent.research(task);
        System.out.println(research);

        System.out.println("\n=== PLANNING AGENT ===");
        String plan = planningAgent.createPlan(research);
        System.out.println(plan);

        System.out.println("\n=== EXECUTION AGENT ===");
        String result = executionAgent.executeSteps(plan);
        System.out.println(result);
    }
}
