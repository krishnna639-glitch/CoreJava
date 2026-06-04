# Question 7: Difference Between JVM, JRE, and JDK

## 📌 Overview
Understanding the distinction between **JVM**, **JRE**, and **JDK** is fundamental to Java programming. They form the core execution and development platform, where each component acts as a container wrapper for the next.

---

## 📦 Component Scope Hierarchy

The easiest way to understand the relationship is through scope: **JDK** contains **JRE**, and **JRE** contains **JVM** along with execution environment tools.

```mermaid
graph TD
    %% Custom Styling
    classDef jdk fill:#1f4e5b,stroke:#11333c,stroke-width:2px,color:#fff;
    classDef jre fill:#e8f4f1,stroke:#a3d2ca,stroke-width:2px,color:#1e3d37;
    classDef jvm fill:#fcf8f2,stroke:#e6c594,stroke-width:2px,color:#4a371e;

    subgraph JDK [Java Development Kit - JDK]
        direction TB
        DevTools[🛠️ Development Tools<br>javac, jdb, javadoc, jar]:::jdk
        
        subgraph JRE [Java Runtime Environment - JRE]
            EnvLibs[📚 Libraries & UI Toolkits<br>rt.jar, util, math, lang]:::jre
            
            subgraph JVM [Java Virtual Machine - JVM]
                Exec[⚙️ Execution Engine & Interpreter<br>Loads, verifies, and runs bytecode]:::jvm
            end
        end
    end
