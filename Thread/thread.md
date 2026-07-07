# Java Threads Notes

# 1. Introduction to Threads

A **Thread** is the smallest unit of execution within a process. It allows a program to perform multiple tasks simultaneously.

## Real-Life Example
Imagine a student:
- Listening to a lecture
- Taking notes
- Downloading study material

These activities can happen at the same time. Similarly, threads allow multiple tasks to run concurrently within a Java program.

## Benefits of Threads
- Better CPU utilization
- Faster execution of tasks
- Improved application responsiveness
- Enables multitasking

---
--  Program Files  --

#Topic                       #Coverage
#Program	                    Concepts Covered
ThreadDemo.java	            Define, Instantiate, Start Thread
RunnableDemo.java	        Runnable Interface
StartVsRunDemo.java	        start() vs run()
MultipleThreadsDemo.java	Concurrent Execution
ThreadStateDemo.java	    NEW, RUNNABLE, TIMED_WAITING, TERMINATED

---
# 2. Defining, Instantiating, and Starting Threads

Creating a thread in Java involves three main steps:

1. Define the thread
2. Instantiate (create) the thread object
3. Start the thread

---

# 3. Defining a Thread

A thread can be defined in two ways:

## Method 1: Extending the Thread Class

Create a class that extends the `Thread` class and override the `run()` method.

### Example

```java
class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println("Thread is running...");
    }
}
```

### Explanation

- `MyThread` inherits from `Thread`.
- `run()` contains the code that will execute when the thread starts.
- The JVM executes the `run()` method automatically after calling `start()`.

---

## Method 2: Implementing Runnable Interface

Create a class that implements the `Runnable` interface.

### Example

```java
class MyTask implements Runnable {

    @Override
    public void run() {
        System.out.println("Runnable thread is running...");
    }
}
```

### Explanation

- `Runnable` contains only one method: `run()`.
- Preferred approach because Java supports single inheritance.
- The class remains free to extend another class.

---

# Comparison: Thread vs Runnable

| Thread Class | Runnable Interface |
|-------------|--------------------|
| Extends Thread class | Implements Runnable interface |
| Cannot extend another class | Can extend another class |
| Less flexible | More flexible |
| Used for simple programs | Recommended for real-world applications |

---