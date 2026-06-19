# Java Collection 

---

## Java Collection Framwork (JCF)

**Java Collection Framework (JCF)** is a set of classes and interfaces that provide ready-made data structures to store and manipulate groups of objects efficiently.


1. Classes
2. Interfaces 

Classes  **List, Set, Map, and Queue**
Interfaces **ArrayList, HashSet, HashMap, and PriorityQueue**

1. Increase Productivity
2. Resuability
3. Maintainability
4. Faster

**Features**
1. Provides ready-to-use data structures (e.g., ArrayList, HashSet, HashMap).
2. Offers interfaces (Collection, List, Set, Map, Queue) to define standard behaviors.
3. Supports dynamic resizing, unlike arrays with a fixed size.
4. Includes algorithms (sorting, searching, iteration) via the Collections utility class.
5. Improves code reusability and performance by reducing boilerplate code.

---

## 1. Architecture Hierarchy Diagram

Below is the structural relationship between the core interfaces and their popular implementations in Java:

```mermaid
graph TD
    %% Interfaces
    Collection[<< interface >> <br> Collection] --> List[<< interface >> <br> List]
    Collection --> Set[<< interface >> <br> Set]
    Collection --> Queue[<< interface >> <br> Queue]
    
    Set --> SortedSet[<< interface >> <br> SortedSet]
    Queue --> Deque[<< interface >> <br> Deque]

    %% Map Hierarchy (Separate Root)
    Map[<< interface >> <br> Map] --> SortedMap[<< interface >> <br> SortedMap]

    %% Implementations
    List -.-> ArrayList[ArrayList]
    List -.-> LinkedList[LinkedList]
    List -.-> Vector[Vector]
    
    Set -.-> HashSet[HashSet]
    Set -.-> LinkedHashSet[LinkedHashSet]
    SortedSet -.-> TreeSet[TreeSet]
    
    Queue -.-> PriorityQueue[PriorityQueue]
    Deque -.-> ArrayDeque[ArrayDeque]
    Deque -.-> LinkedList

    Map -.-> HashMap[HashMap]
    Map -.-> LinkedHashMap[LinkedHashMap]
    SortedMap -.-> TreeMap[TreeMap]

    style Collection fill:#f9f,stroke:#333,stroke-width:2px
    style List fill:#bbf,stroke:#333,stroke-width:1px
    style Set fill:#bbf,stroke:#333,stroke-width:1px
    style Queue fill:#bbf,stroke:#333,stroke-width:1px
    style Map fill:#f96,stroke:#333,stroke-width:2px
```

---

## topics included 
1. Core Interfaces
    - Collection Interface
        * Declaration
        * Sub - Interfaces
        * Operation
    - List Interface
        * Syntax
        * Declaration
        * Operation
        * Methods
        * Final Implementation
    - Queue Interface
    - Dequeue Interface
    - Set Interface
    - Map Interface 

2. List Implemetation

3. Set Implementation 

4. Queue and Dqueue Implementation

5. Map Implementation 

6. Utility and Supporting Classes 

7. Concerrency Collections 




