## Code Explanation

### CustomRunnable Class

This class implements the `Runnable` interface, allowing its instances to be executed by a thread. It is designed to perform tasks in a separate thread from the main application thread.

**Constructor**
- **CustomRunnable(String name)**: Initializes a new instance of `CustomRunnable` with the specified thread name. The name is also used for displaying output to indicate the creation of the thread.

**Methods**
- **getThreadName()**: Returns the name of the thread.
- **run()**: This is the core method where the thread's tasks are defined. It prints a starting message, simulates a task by counting down from 4 to 1, and incorporates sleep intervals of 500 milliseconds between each count to simulate time-consuming operations. It also handles interruptions, which may occur if the thread's sleep is interrupted.

### CustomThread Class

This class extends the `Thread` class directly, thereby inheriting its capabilities and allowing it to run code concurrently with other threads.

**Constructor**
- **CustomThread(String name)**: Initializes a new instance of `CustomThread` with a specified name. The thread name is printed to indicate the thread's creation.

**Methods**
- **getThreadName()**: Returns the name of the thread.
- **run()**: Defines the tasks that the thread will execute. It functions similarly to the `run()` method in `CustomRunnable`, with a message indicating the thread has started, a countdown from 4 to 1, and sleep intervals of 500 milliseconds between counts. It also includes handling for interruptions.

### ThreadDemo Class

This is the main class where instances of `CustomThread` are created and managed.

**Methods**
- **main(String[] args)**: The entry point of the program. It creates two threads using the `CustomThread` class, starts these threads, and then uses the `join()` method to ensure that the main thread (which runs the `main` method) waits for these threads to complete their tasks before it continues. This demonstrates thread synchronization and the proper handling of concurrent execution in Java.

The program prints various messages to the console to indicate the status of the threads (e.g., when a thread starts, sleeps, is interrupted, or exits) and when the main thread waits for other threads to complete.

---
