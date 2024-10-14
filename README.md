# Complex Numbers Calculator

---

## Table of Contents

---

- [Overview](#overview)
- [Features](#features)
- [Installation](#installation)
- [Usage](#usage)
- [Code Overview](#code-overview)
- [Examples](#examples)

## Overview

---

### Why Java

Java is a versatile, high-performance programming language widely used for developing applications ranging from mobile 
apps to large-scale enterprise systems. Here's why we chose Java for this project:

- **Platform Independence**
    
  Java's "Write Once, Run Anywhere" capability allows the application to run on any system with a Java Virtual Machine
  (JVM).


- **Strong Community & Ecosystem**

  Java has a rich ecosystem of libraries and frameworks and excellent support from a large community.


- **Object-Oriented & Scalable**

  Java’s object-oriented principles ensure modular and maintainable code, while its scalability makes it suitable for 
  both small and enterprise-level applications.


- **Performance & Security**

  Modern JVMs optimize Java's performance to compete with lower-level languages, and built-in security features make 
  it a trusted choice for secure applications.


- **Multithreading**

  Java supports concurrent programming, allowing the efficient execution of multiple tasks simultaneously, making it 
  ideal for complex systems.

### Project Description

The **Complex Numbers Calculator** is an object-oriented application designed to perform various arithmetic operations
([ADDITION](#addition), [SUBSTRACTION](#substraction), [DIVISION](#division), [MULTIPLICATION](#multiplication)) 
**strictly** on complex numbers. 

The code remains modular and maintainable by adhering to OOP principles such as:

- **DRY (Don't Repeat Yourself)**
- **SRP (Single Responsibility Principle)**

Moreover, to enhance flexibility and scalability in the application's architecture, it utilizes **Software Design 
Patterns** such as:

- [**Singleton**](https://en.wikipedia.org/wiki/Singleton_pattern)
- [**Factory**](https://en.wikipedia.org/wiki/Factory_method_pattern)

## Features

---

The **Complex Numbers Calculator** includes a various range of functionalities to perform arithmetic operations and
manipulate complex numbers efficiently.

- **Arithmetic Operations**

    > Let's consider two complex numbers ***z_1*** and ***z_2*** such that:
    > 
    >> _z_1 = a_1 + b_1 * i_
    >>     
    >> _z_2 = a_2 + b_2 * i_
    >> 
    >> Where { _a_1_, _b_1_, _a_2_, _b_2_ } are considered ***Real Numbers***
    >  
    > Based on their composition, we deduce the following operations. 
  - [**Addition**](#addition)
    ```
    z_1 + z_2 = (a_1 + a_2) + (b_1 + b_2) * i
    ```
  - [**Substraction**](#substraction)
    ```
    z_1 - z_2 = (a_1 - a_2) + (b_1 - b_2) * i
    ```
  - [**Division**](#division)
    ```
    z_1 / z_2 = [(a_1 * a_2 + b_1 * b_2) + (b_1 * a_2 - a_1 * b_2) * i] / (a_2 ^ 2 + b_2 ^ 2)
    ```
  - [**Multiplication**](#multiplication)
    ```
    z_1 * z_2 = (a_1 * a_2 - b_1 * b_2) + (a_1 * b_2 + b_1 * a_2) * i
    ```
    

- **Conjugate Calculation**
  
  The conjugate of a complex number is useful in various mathematical applications.
  
  > Let's consider one complex numbers ***z*** such that:
  >
  >> _z = a + b * i_
  >>
  >> Where { _a_, _b_ } are considered ***Real Numbers***
  > 
  > Therefore, we define the conjugate as:
  >
  >>  _z = a - b * i_
  

- **Input Parsing**
  
  The calculator can accept ***(via Command Line Interface / CLI)*** complex numbers in standard form ***(eg. a + b * 
  i)***, allowing for intuitive user input.


- **Error Handling**

  Robust error handling for invalid inputs and operations, ensuring a smooth user experience.


- **Extensibility**

  The design supports easy addition of new features, such as advanced mathematical operations or graphical user 
  interfaces, thanks to the application of OOP principles and design patterns.

## Installation

---

### Prerequisites
  
Before installing and running the application, ensure that the following prerequisites are met:

#### **Java Development Kit (JDK)**
  
You need **JDK 8** or higher installed on your system. To check if it is installed, run in terminal:
  
```bash
java -version
```
  
If you don't have it installed, you can download the JDK from 
[Oracle's official website](https://www.oracle.com/java/technologies/downloads/?er=221886).


### Clone the Repository

To get started, clone the repository from GitHub to your local machine. In terminal, nagivate to the directory you
where you want to store the project, and run:
  
```bash
git clone https://github.com/Mogalina/ComplexNumbersCalculator.git
```

### Compile the Project Using JDK

Once you have cloned your project, navigate into the project directory:

```bash
cd ComplexNumbersCalculator
```

To compile the Java files, use the ```javac``` command to compile all the files in the ```src``` directory:

```bash
javac -d out -sourcepath src src/**/*.java
```

This command will do the following:

- Compile all the ```.java``` files located in the specified directories.
- Store the compiled ```.class``` files in the ```out/``` directory.

### Run the Application

After compiling, you can run the application using the ```java``` command. From your project root directory, execute the
main class that contains the ```main``` method:

```bash
java -cp out Main
```

## Usage 

--- 

After installing the application, follow the steps below to run and use the **Complex Numbers Calculator**.

### Running the Application

Once you’ve successfully built or compiled the project, you can run the application directly from the terminal or your 
IDE.

#### Running via Terminal (using JDK)

If you compiled the project using the **JDK** and the compiled files are located in the `out/` directory, you can run the application using the `java` command. Navigate to the root of your project and run:

```bash
java -cp out Main
```

#### Running via IDE

If you’re using an IDE like *IntelliJ IDEA* or *Eclipse*, follow these steps:

- Open the project in your IDE.
- Locate the class containing the ```main``` method (usually ```Main.java``` or equivalent).
- Right-Click on the file and select ```Run```.
- The application will start, and you’ll be able to interact with it via the IDE's terminal.

### Interacting with the Calculator

The *Complex Numbers Calculator* supports a various range of arithmetic operations on complex numbers. You **must**
run the expression using the ```java``` command **in terminal** as follows:

#### Complex Number Structure

Each complex number must have the following structre **with no spaces between**: ```a+b*i```.

#### Operands and Operators

Between **each** operator and operand there **must** exist **at least** one space: ```a+b*i op c+d*i```. Operators 
**must** be one of ```+ - * /```.

#### Calculating the Result

To calculate the result of an arithmetic expression containing **exclusively** complex numbers, in **terminal** run the
following using ```java``` command:

```bash
java -cp out Main complex_number operator complex_number operator complex_number ...
```

## Code Overview

---

- [**Main.java**](#main)
- [**documentation/**](#documentation)
- [**enums/**](#enums)
- [**factory/**](#factory)
- [**models/**](#models)

### Main.java

This `class` represents the **entry point** of the application. It initializes the program, handles user input, and
orchestrates the calculation operations.

#### Methods

##### `main(String[] args)`

- Starts the application and manages user interactions.
- Creates an `ExpressionParser` object to handle the parsing and evaluation of the arithmetic expression.

### documentation/

This folder stores information about the application and project structure, including the relationship between `classes`
, `packages` and `modules`.

#### UML.png

This `.png` file represents the 
[**UML (Unified Modeling Language)**](#https://en.wikipedia.org/wiki/Unified_Modeling_Language) diagram that stores
information about the relationship between `classes`, `packages` and `modules`.

### enums/

This `package` stores `enum` classes to define collections of **constants** that are grouped together under **a single
type**. The purpose of `enum` classes is to enhance **type safety** and make code more **readable** and 
**maintainable**.

#### `Operation`

```java
public enum Operation {
    ADDITION,
    SUBTRACTION,
    MULTIPLICATION,
    DIVISION
}
```

Defines the **supported operations** on arithmetic expressions.

### factory/

This `package` contains `classes` that follow the 
[**Factory Method Pattern**](#https://en.wikipedia.org/wiki/Factory_method_pattern#Java). The purpose of this *design
pattern* is to use *factory methods* to deal with the problem of **creating objects** without having to specify their
exact classes.

### `ExpressionFactory`

This `class` is responsible for creating expressions (`subclasses`) that belong to the same family (`class`), but with
different behaviors (**ADDITION**, **SUBSTRACTION**, **MULTIPLICATION**, **DIVISION**). It utilizes two key software 
design patterns: the [**Factory Pattern**](#https://en.wikipedia.org/wiki/Factory_method_pattern#Java) and the 
[**Singleton Pattern**](#https://en.wikipedia.org/wiki/Singleton_pattern).

##### Why use Factory here?

```java
public ComplexExpression createExpression(@NotNull Operation operation, ComplexNumber[] args) {
    return switch (operation) {
        case ADDITION -> new AdditionExpression(args);
        case SUBTRACTION -> new SubtractionExpression(args);
        case MULTIPLICATION -> new MultiplicationExpression(args);
        case DIVISION -> new DivisionExpression(args);
        default -> throw new IllegalArgumentException("Unknown operation");
    };
}
```

- **Encapsulation of Object Creation** : The client code doesn’t need to know which specific class to instantiate, it 
  just specifies the operation, and the factory handles the rest.


- **Flexibility and Extensibility** : If more operations are added in the future, it’s easy to extend the factory to 
  create instances of the new expression types without changing the client code.


- **Centralized Creation Logic** : All logic for creating complex expression objects is centralized within the factory, 
  promoting consistency and reducing code duplication across the application.

##### Why use Singleton here?

```java
private ExpressionFactory() {}
```

The `constructor` is private, preventing external `classes` from instantiating it dirrectly.

```java
private static ExpressionFactory instance = null;
```

The `class` has a static variable `instance` that holds the single instance of `ExpressionFactory`.

```java
public static ExpressionFactory getInstance() {
    if (instance == null) {
        instance = new ExpressionFactory();
    }
    return instance;
}
```

Checks if the `instance` exists. If so, it initializes the `instance` and returns it, otherwise it returns the already
created `instance`. This ensures that the factory is only created when **needed** (***Lazy Initialization***).

Therefore, the benefits of using **Singleton Method** here are the following:

- **Resource Efficiency** : Since this `class` is responsible for creating `ComplexExpression` `objects`, ensuring that 
  **only one** `ExpressionFactory` instance exists means **fewer resources** are used and the application avoids 
  unnecessary object creation.


- **Centralized Control** : Having a **single** `instance` of the factory centralizes the creation logic for 
  `ComplexExpression` `objects`, allowing **better control** over how these objects are instantiated and ensures 
  **consistency**.


- **Global Access** : Since the factory provides complex expressions for different parts of the application, the 
  **Singleton** pattern ensures global access to the factory from **anywhere** in the codebase.

##### Benefits of using both together?

- **Separation of Concerns (SoC)** : The `ExpressionFactory` isolates the creation of `ComplexExpression` `objects` from 
  the client code, meaning the client only cares about using the created object, **not how it’s created**.


- **Scalability** : Adding **new types** of `ComplexExpression` `objects` is easy. You only need to modify the factory 
  method to handle new types of expressions, without needing to change the code that uses the factory.


- **Controlled Instantiation** : The **Singleton Pattern** ensures that **only one** `instance` of the factory exists, 
  preventing multiple factories from being created **unnecessarily** and conserving *memory resources*.

### models/

This `package` contains `classes` that are the **core domain objects** of the application. These `classes` represent
abstract concepts specific to the application.

### `ComplexNumber`

This `class` defines a *complex number* with *real* and *imaginary* parts.

#### Fields

| Access    | Type        | Name | Description                           |
|-----------|-------------|------|---------------------------------------|
| `private` | `final int` | `re` | Real part of the complex number.      |
| `private` | `final int` | `im` | Imaginary part of the complex number. |

#### Methods

- `public ComplexNumber(int re, int im)`

  Constructs a new `ComplexNumber` with the specified *real* and *imaginary* parts.


- `public ComplexNumber add(@NotNull ComplexNumber other)`

  Adds this *complex number* to another *complex number*.


- `public ComplexNumber subtract(@NotNull ComplexNumber other)`

  Subtracts another *complex number* from this *complex number*.


- `public ComplexNumber multiply(@NotNull ComplexNumber other)`

  Multiplies this *complex number* by another *complex number*.


- `public ComplexNumber divide(@NotNull ComplexNumber other)`

  Divides this *complex number* by another *complex number*.


- `public ComplexNumber conjugate()`

  Returns the **conjugate** of this *complex number*.


- `@Override public String toString()`

  Returns a **string representation** of the *complex number*.

### `ComplexExpression`

**Abstract** `class` representing an *arithmetic expression* involving *complex numbers*.

#### Fields

| Access      | Type              | Name        | Description                                           |
|-------------|-------------------|-------------|-------------------------------------------------------|
| `protected` | `Operation`       | `operation` | The operation to be performed on the complex numbers. |
| `protected` | `ComplexNumber[]` | `args`      | Array of complex numbers involved in the expression.  |

#### Methods

- `public ComplexExpression(Operation operation, ComplexNumber[] args)`
  
  **Constructor** to initialize the *complex expression* with a specific *operation* and a list of *complex numbers* 
  as arguments.


- `public ComplexNumber execute()`

  Executes the *complex expression* by sequentially applying the specified *operation* on **all** *complex numbers*
  provided as arguments.


- `protected abstract ComplexNumber executeOneOperation(ComplexNumber c1, ComplexNumber c2);`

  **Abstract method** to perform a **single** *operation* between two *complex numbers*.

### `AdditionExpression`

Class representing a complex **addition** expression. This `class` **extends** the `ComplexExpression` `class`.

#### Methods

- `public AdditionExpression(ComplexNumber[] args)`

  **Constructor** that initializes an **addition** expression with the given *complex numbers*.


- `@Override protected ComplexNumber executeOneOperation(@NotNull ComplexNumber c1, ComplexNumber c2)`

  Performs the **addition** of two *complex numbers*.

### `SubtractionExpression`

Class representing a complex **substraction** expression. This `class` **extends** the `ComplexExpression` `class`.

#### Methods

- `public SubtractionExpression(ComplexNumber[] args)`

  **Constructor** that initializes a **substraction** expression with the given *complex numbers*.


- `@Override protected ComplexNumber executeOneOperation(@NotNull ComplexNumber c1, ComplexNumber c2)`

  Performs the **substraction** of two *complex numbers*.

### `MultiplicationExpression`

Class representing a complex **multiplication** expression. This `class` **extends** the `ComplexExpression` `class`.

#### Methods

- `public MultiplicationExpression(ComplexNumber[] args)`

  **Constructor** that initializes a **multiplication** expression with the given *complex numbers*.


- `@Override protected ComplexNumber executeOneOperation(@NotNull ComplexNumber c1, ComplexNumber c2)`

  Performs the **multiplication** of two *complex numbers*.

### `DivisionExpression`

Class representing a complex **division** expression. This `class` **extends** the `ComplexExpression` `class`.

#### Methods

- `public DivisionExpression(ComplexNumber[] args)`

  **Constructor** that initializes a **multiplication** expression with the given *complex numbers*.


- `@Override protected ComplexNumber executeOneOperation(@NotNull ComplexNumber c1, ComplexNumber c2)`

  Performs the **division** of two *complex numbers*.

### `ExpressionParser`

Class responsible for **parsing** complex number expressions from `CLI`.

#### Fields

| Access      | Type                   | Name                     | Description                              |
|-------------|------------------------|--------------------------|------------------------------------------|
| `private`   | `static final Pattern` | `COMPLEX_NUMBER_PATTERN` | Regex to validate complex number format. |

#### Methods

- `public ComplexNumber parse(String @NotNull [] args)`

  **Parses** the command line arguments representing a complex number expression.


- `private boolean isComplexNumber(String str)`

  Checks if the given `string` is a **valid** *complex number*.


- `private ComplexNumber parseComplexNumber(String str)`

  Parses a *complex number* from a `string` and returns a `ComplexNumber` `object`.


- `private boolean isOperator(@NotNull String str)`

  Checks if the given `string` is a **valid** *operator*.


- `private ComplexExpression createExpression(ComplexNumber @NotNull [] numbers, String @NotNull [] operators)`

  Creates an `instance` of `ComplexExpression` based on the parsed *complex numbers* and *operators*.

## Examples

---

Based on the application [Usage](#usage), you can run the following arithmetic expressions:

### Addition

Run the arithmetic expression:

```bash
java -cp out Main 2+3*i + 5-6*i + -2+1*i
```

The returned result will be:

```bash
Expression result = 5-2*i
```

### Substraction

Run the arithmetic expression:

```bash
java -cp out Main 5-6*i - 2+3*i
```

The returned result will be:

```bash
Expression result = 3-9*i
```

### Division

Run the arithmetic expression:

```bash
java -cp out Main 17-6*i / 2+3*i
```

The returned result will be:

```bash
Expression result = 1-4*i
```

### Multiplication

Run the arithmetic expression:

```bash
java -cp out Main 5-6*i * 2+3*i
```

The returned result will be:

```bash
Expression result = 28+3*i
```

### Summary of Supported Operations

| Operation       | Description                                         | Example Input            | Example Output |
|-----------------|-----------------------------------------------------|--------------------------|----------------|
| Addition        | Adds two complex numbers.                           | `2+3*i + 5-6*i + -2+1*i` | `5-2*i`        |
| Subtraction     | Subtracts the second complex number from the first. | `5-6*i - 2+3*i`          | `3-9*i`        |
| Multiplication  | Multiplies two complex numbers.                     | `5-6*i * 2+3*i`          | `28+3*i`       |
| Division        | Divides the first complex number by the second.     | `17-6*i / 2+3*i`         | `1-4*i`        |