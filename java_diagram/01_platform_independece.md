# Question 1: Is Java Platform Independent?

## 📌 Overview
Yes, **Java is a Platform Independent language**. 

Unlike traditional compiled languages (like C or C++) where source code compiles directly into platform-specific machine code, Java utilizes a two-stage translation process to achieve its famous **"Write Once, Run Anywhere" (WORA)** philosophy.

---

## 🔄 Compilation vs. Execution Pipeline

The Java compiler (`javac`) does not generate machine-specific binary files. Instead, it compiles high-level code into a highly optimized intermediate format called **Bytecode** (`.class` file). 

The diagram below outlines how this intermediate bytecode bridges multiple operating systems:

```mermaid
graph TD
    %% Custom Styling
    classDef main fill:#1f4e5b,stroke:#11333c,stroke-width:2px,color:#fff;
    classDef step fill:#e8f4f1,stroke:#a3d2ca,stroke-width:2px,color:#1e3d37;
    classDef os fill:#fcf8f2,stroke:#e6c594,stroke-width:2px,color:#4a371e;

    subgraph CompileTime [Compile Time - Platform Agnostic]
        Source[📄 Source Code<br>App.java]:::step
        Compiler[⚙️ Java Compiler<br>javac]:::step
        Bytecode[📦 Intermediate Bytecode<br>App.class]:::main
    end

    subgraph RunTime [Runtime - Platform Dependent]
        JVM_Win[💻 JVM for Windows]:::step
        JVM_Mac[🍏 JVM for macOS]:::step
        JVM_Lin[🐧 JVM for Linux]:::step
        
        Win_Run[🏁 Windows Hardware]:::os
        Mac_Run[🏁 macOS Hardware]:::os
        Lin_Run[🏁 Linux Hardware]:::os
    end

    %% Connections
    Source --> Compiler
    Compiler --> Bytecode
    Bytecode --> JVM_Win
    Bytecode --> JVM_Mac
    Bytecode --> JVM_Lin
    
    JVM_Win --> Win_Run
    JVM_Mac --> Mac_Run
    JVM_Lin --> Lin_Run
