# Lab 04: Data Types, Mutability, and Collections

## Objective
Apply concepts of mutability, interface implementations (`List`, `Map`, `Set`), and safe iterator traversal using Java Collections.

---

## Tasks Implemented

### Lab Task 1: Mutability & Performance (`StringPerformance.java`)
* Implemented `buildString(int n)` using standard String concatenation.
* Implemented `buildStringBuilder(int n)` using `StringBuilder.append()`.
* Measured execution times to demonstrate the $O(n^2)$ cost of copying immutable strings versus the efficiency of `StringBuilder`.

### Lab Task 2: Safe Collection Modification (`CourseManager.java`)
* Created a list containing `["6.045", "6.005", "8.03", "6.813", "14.03"]`.
* Demonstrated how modifying a collection within a for-each loop triggers a `ConcurrentModificationException`.
* Solved the issue safely using an `Iterator` with `iter.remove()` to filter out course codes starting with `"6."`, leaving `["8.03", "14.03"]`.

### Lab Task 3: Complex Data Types (`TreasureMap.java`)
* Stored key-value pairs representing a treasure map in a `HashMap<String, Double>`.
* Dynamically updated the value associated with `"palm"` by adding the size of the map to its current value.
* Iterated through `treasures.values()` to compute the total sum of all stored doubles.

### Lab Task 4: Unmodifiable Wrappers (`Zoo.java`)
* Created a `Zoo` class containing a list of animals (`"lion"`, `"tiger"`, `"bear"`).
* Exposed the collection securely using `Collections.unmodifiableList()`.
* Handled and printed the resulting `UnsupportedOperationException` when attempting to call `.add()` on the read-only wrapper.

---

## Homework Tasks

### Homework 1: Enhanced Map Tracking (`StudentDirectory.java`)
* Built a `StudentDirectory` class utilizing a `Map<Integer, String>` for student ID and name tracking.
* Provided a `getAllIDs()` method returning an immutable key set via `Collections.unmodifiableSet()`.
* Included test cases verifying that attempts to alter the returned set throw an `UnsupportedOperationException`.

### Homework 2: Designing Immutable Classes (`Point.java`)
* Designed a fully immutable `Point` class using `public final class` and `private final` coordinate variables `x` and `y`.
* Omitted setter methods to preserve absolute immutability after construction.

---

## Reflection on Immutability

Making the `Point` class immutable makes it safer from bugs and easier to understand because its internal state cannot be modified after instantiation. Because `x` and `y` are marked `final` and no mutator methods exist, references to `Point` objects can be shared across multiple threads or methods without risk of side effects or unexpected mutations. Developers do not need to implement defensive copying, leading to simpler reasoning about code correctness and state consistency.

---

## How to Run the Code

### Prerequisites
* Java Development Kit (JDK 21 or higher)
* Apache NetBeans IDE (or any Java IDE)

### Execution Steps
1. Clone the public repository:
   ```bash
   git clone [https://github.com/ayeshaMalik2026/ayeshamaliklabs04.git](https://github.com/ayeshaMalik2026/ayeshamaliklabs04.git)
