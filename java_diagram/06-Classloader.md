# Question 6: What is a Classloader?

## 📌 Overview
A **Classloader** is a crucial subsystem of the **JRE (Java Runtime Environment)**. Its primary responsibility is to dynamically load Java classes and interfaces into the **JVM (Java Virtual Machine)** during runtime when they are referenced for the exact first time. 

Because of classloaders, the Java runtime system does not need to maintain hardcoded knowledge about local files or file system structures.

---

## 🌲 The Classloader Hierarchy 

Java utilizes a hierarchical delegation model to look up and load classes safely. The diagram below illustrates the built-in relationship layers:

```mermaid
graph TD
    %% Custom Styling
    classDef main fill:#1f4e5b,stroke:#11333c,stroke-width:2px,color:#fff;
    classDef step fill:#e8f4f1,stroke:#a3d2ca,stroke-width:2px,color:#1e3d37;

    Bootstrap[👑 1. Bootstrap Classloader<br>Loads core classes from rt.jar / base modules]:::main
    Extension[🔌 2. Platform/Extension Classloader<br>Loads standard extension libraries]:::step
    Application[🖥️ 3. Application/System Classloader<br>Loads classes from your local CLASSPATH]:::step
    Custom[🛠️ 4. Custom Classloader<br>User-defined network or encrypted loaders]:::step

    %% Connections showing hierarchy
    Custom -->|Delegates Upward| Application
    Application -->|Delegates Upward| Extension
    Extension -->|Delegates Upward| Bootstrap
