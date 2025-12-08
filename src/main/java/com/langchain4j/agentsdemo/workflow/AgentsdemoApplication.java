package com.langchain4j.agentsdemo.workflow;

//@SpringBootApplication
public class AgentsdemoApplication {

	public static void main(String[] args) {
//        SpringApplication.run(AgentsdemoApplication.class, args);
        WorkflowCoordinator coordinator = new WorkflowCoordinator();
        String task = "Plan a weekend trip to Paris for a family of four with kids aged 8 and 10. " +
                "Include kid-friendly activities, dining options, and accommodation suggestions. " +
                "Provide a detailed itinerary for Saturday and Sunday.";
        coordinator.processWorkflow(task);
	}

}
