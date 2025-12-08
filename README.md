# Conditional Agents Demo

This project is a Java Spring Boot application that demonstrates conditional routing of user requests to different agents based on the request content.

## Features

- Routes user requests to appropriate agents using custom logic
- Example requests include business, technical, and fallback scenarios
- Extensible architecture for agent-based request handling

## Usage

The application processes user requests and routes them to the correct agent (Business, Technical, or Fallback) based on intent classification. Responses are printed to the console.
## Workflow Page

The workflow page demonstrates how user requests are processed through a series of agents:

- **PlanningAgent**: Analyzes the request and creates a plan for execution.
- **ExecutionAgent**: Executes the plan and gathers results.
- **ResearchAgent**: Performs research tasks if required by the plan.
- **WorkflowCoordinator**: Orchestrates the workflow, ensuring each agent performs its role in sequence.

This modular workflow allows for flexible, step-by-step processing of complex tasks, making it easy to extend or customize agent behavior.
