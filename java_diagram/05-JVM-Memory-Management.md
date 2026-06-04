# Question 5: What are the Memory Storages Available with JVM?

## 📌 Overview
When a Java application executes, the **JVM (Java Virtual Machine)** allocates various runtime data areas to manage program execution, track metadata, and clean up dead objects. These are collectively known as the **JVM Memory Areas**.

---

## 🗺️ JVM Runtime Data Area Architecture

The memory layout inside the JVM is split into five core storage regions, coordinate directly by the Class Loader and the Execution Engine:

```mermaid
graph TD
    %% Custom Styling
    classDef main fill:#1f4e5b,stroke:#11333c,stroke-width:2px,color:#fff;
    classDef shared fill:#e8f4f1,stroke:#a3d2ca,stroke-width:2px,color:#1e3d37;
    classDef threadLocal fill:#fcf8f2,stroke:#e6c594,stroke-width:2px,color:#4a371e;

    subgraph JVM_Memory [JVM Runtime Data Area]
        subgraph Shared [Shared Across All Threads]
            Method[📂 Class/Method Area<br>Metadata, Constants, Code]:::shared
            Heap[📦 Heap Area<br>Objects & Garbage Collection]:::shared
        end
        
        subgraph ThreadLocal [Thread-Isolated / Private]
            Stack[🥞 JVM Stack<br>Local Variables & Frames]:::threadLocal
            PC[📍 PC Registers<br>Current Instruction Address]:::threadLocal
            Native[🔌 Native Method Stack<br>C/C++ Library Execution]:::threadLocal
        end
    end

    %% Layout Help
    Method --- Heap
    Stack --- PC --- Native
