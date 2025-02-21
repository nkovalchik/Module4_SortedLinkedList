# SortedLinkedList

## Overview

This Java program reads a list of space-separated integers from the user, stores them in a `LinkedList`, sorts them in ascending order, and then prints the sorted list. The program utilizes `Collections.sort()` for sorting and ensures reusability by implementing the sorting logic inside a dedicated method.

## Features

- Accepts a list of integers as user input.
- Stores integers in a `LinkedList` for efficient insertion and retrieval.
- Sorts the list using `Collections.sort()`.
- Outputs the sorted list to the console.
- Uses a modular function (`sortALinkedList`) for reusability.

## Prerequisites

- Java Development Kit (JDK) installed.
- Basic knowledge of running Java programs via the command line.

## Installation and Execution

### 1. Clone or Download the Repository

```bash
git clone https://github.com/nkovalchik/Module4_SortedLinkedList.git
cd <repository-folder>
```

### 2. Compile the Java Program

```bash
javac SortedLinkedList.java
```

### 3. Run the Program

```bash
java SortedLinkedList
```

## Usage

1. The program prompts the user to enter a space-separated list of integers.
2. After pressing **Enter**, the program sorts the integers and displays them.

### Example Input/Output

#### **Input:**

```bash
Enter integers (separated by space), then press Enter:
5 3 8 1 2
```

#### **Output:**

```bash
Sorted List:
[1, 2, 3, 5, 8]
```

## Code Explanation

The program consists of the following key components:

- ``: Reads user input, converts it into integers sorts them using `Collections.sort()` and prints the sorted list.
- ``: Calls `sortALinkedList()` to execute the program logic.

## Test Cases

| Test Case                   | Input                        | Expected Output                                                   |
| --------------------------- | ---------------------------- | ----------------------------------------------------------------- |
| Single-digit numbers        | `7 4 9 2`                    | `[2, 4, 7, 9]`                                                    |
| Already sorted list         | `1 2 3 4 5`                  | `[1, 2, 3, 4, 5]`                                                 |
| Reverse order               | `9 8 7 6`                    | `[6, 7, 8, 9]`                                                    |
| Negative numbers            | `-3 -1 -7 5`                 | `[-7, -3, -1, 5]`                                                 |
| Mixed positive and negative | `10 -5 3 -2`                 | `[-5, -2, 3, 10]`                                                 |
| Duplicate numbers           | `3 3 2 1 1`                  | `[1, 1, 2, 3, 3]`                                                 |
| Single element              | `7`                          | `[7]`                                                             |
## Generating Documentation

To generate Javadoc documentation run:

```bash
javadoc -d doc SortedLinkedList.java
```

This will create a `doc/` directory containing the HTML documentation.

## Author

- **Nick Kovalchik**

## License

This project is licensed under the MIT License.

