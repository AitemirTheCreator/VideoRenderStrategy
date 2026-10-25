
# Assignment 5 - Strategy Pattern

## Project: Video Render Strategy

This project demonstrates the Strategy design pattern
using a video rendering system.

## Strategies

1. FastRenderStrategy - fast rendering.
2. QualityRenderStrategy - high quality rendering.
3. BalancedRenderStrategy - balanced rendering.

## Pattern Components

- Strategy: RenderStrategy
- Concrete Strategies: FastRenderStrategy,
  QualityRenderStrategy, BalancedRenderStrategy
- Context: VideoRenderer
- Client: Main

## Clean Code Principles

1. Single Responsibility Principle
   Each class has one clear responsibility.

2. Meaningful Names
   Class and method names clearly describe their purpose.

3. Polymorphism Instead of Conditionals
   The Context does not use if or switch to select strategies.

4. Separation of Concerns
   Rendering strategies are separated from the Context.

5. Open/Closed Principle
   New strategies can be added without modifying
   the existing Context.

## How to Run

1. Open the project in IntelliJ IDEA.
2. Use JDK 21.
3. Run Main.java.
4. Observe how rendering strategies change at runtime.
