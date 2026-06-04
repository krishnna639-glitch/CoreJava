# Question 4: What is JIT (Just-In-Time) Compiler?

## 📌 Overview
**JIT** stands for **Just-in-Time** compiler. It is an essential component of the **JRE (Java Runtime Environment)** that runs internally inside the **JVM**. Its primary responsibility is to optimize the performance of Java applications at runtime by compiling frequently executed bytecode blocks directly into native machine code.

---

## ⚙️ How JIT Works (Execution Workflow)

Standard execution interprets bytecode line-by-line, which can be slow. The JIT compiler monitors code execution to find "hot spots" (frequently run methods or loops) and compiles them into raw machine instructions for immediate hardware execution.

The diagram below maps out this multi-step execution pipeline:

```mermaid
graph TD
    %% Custom Styling
    classDef main fill:#1f4e5b,stroke:#11333c,stroke-width:2px,color:#fff;
    classDef step fill:#e8f4f1,stroke:#a3d2ca,stroke-width:2px,color:#1e3d37;
    classDef native fill:#fcf8f2,stroke:#e6c594,stroke-width:2px,color:#4a371e;

    Src[📄 Source Code<br>*.java]:::step
    Javac[⚙️ Java Compiler<br>javac]:::step
    BC[📦 Bytecode Object<br>*.class]:::main
    
    subgraph JVM [Inside the Java Virtual Machine]
        Interp[⏳ Interpreter<br>Line-by-Line Execution]:::step
        JIT[⚡ JIT Compiler<br>Triggered on Method Invocation]:::main
    end

    Native[🚀 Native Machine Code<br>Direct CPU Execution]:::native

    %% Connections
    Src --> Javac
    Javac --> BC
    BC --> Interp
    Interp -->|Identifies Hot Spots| JIT
    JIT --> Native
    Interp -->|Fallback/Initial Run| Native