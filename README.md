﻿
# SlowLang Project

![slowlang-logo]

***

SlowLang is a class-based, object-oriented programming language designed for modularity and ease of extensibility. 
Its primary purpose is to serve as a robust foundation for developing domain-specific languages with more complex syntax 
and features. 

It can also be used an a general-purpose language for developing applications, although there is no good reason for using it as such. SlowLang's name reflects its emphasis on ease of maintenance and extensibility over execution speed. 

Some key characteristics:
- Simplified C-like syntax
- Separate front-end compiler
- Custom Bytecode compilation
- Separate Virtual Machine with JVM-inspired architecture
- Garbage Collection
- Dynamic switching of interpretation behavior
- Native utils library
- Flexible architecture with pipelines for adding new features

***

The program's mode of operation is outlined here:
![intro-project-animation]
> **Note**
> This animated diagram serves only an introductory purpose. <br>For a static, readable version of the diagram, jump to chapter [1. Introduction](#introduction).

***

## Table of Contents
1. [Introduction](#introduction)
    * 1.1. [Document Stucture](#document-structure)
    * 1.2. [Scope](#scope)
    * 1.3. [Key Features](#key-features)
    * 1.4. [Example Program](#example-program)
    * 1.5. [Tools & Software](#tools-software)
    * 1.6. [Project Context](#project-context)
2. [Getting Started](##getting-started)
    * 2.1 [Installation](#installation)
    * 2.2 [Run Example Program](#run-example-program)
    * 2.3 [Online Compiler](#online-compiler)
    * 2.4 [Configurations](#configurations)
3. [Architecture & Design](#architecture-&-design)
    * 3.1. [System Architecture](#system-architecture)
    * 3.2. [Compiler Architecture](#compiler-architecture)
    * 3.3. [Execution Engine Architecture](#execution-engine-architecture)
    * 3.4. [Language Design](#language-design)
    * 3.5. [Design Decisions](#design-decisions)
4. [Language Specification](#language-specification)
    * 4.1. [Grammar Overview](#grammar-overview)
    * 4.2. [Lexical Grammar](#lexical-grammar)
        * 4.2.1. [Characters](#lexical-grammar)
        * 4.2.2. [Keywords](#lexical-grammar)
        * 4.2.3. [Literals](#lexical-grammar)
        * 4.2.4. [Operators](#lexical-grammar)
        * 4.2.5. [Separators](#lexical-grammar)
        * 4.2.6. [Ignored Tokens](#lexical-grammar)
    * 4.3. [Syntactic Grammar](#syntactic-grammar)
        * 4.3.1. [Statements](#syntactic-grammar)
        * 4.3.2. [Blocks](#syntactic-grammar)
        * 4.3.3. [Expressions](#syntactic-grammar)
        * 4.3.4. [The Main Execution Block](#syntactic-grammar)
        * 4.3.5. [Classes](#syntactic-grammar)
        * 4.3.6. [Interfaces](#syntactic-grammar)
        * 4.3.7. [Declarations & Identifiers](#syntactic-grammar)
        * 4.3.8. [Types, Values & Variables](#syntactic-grammar)
        * 4.3.1. [Collections](#syntactic-grammar)
5. [Features Demonstration](#features-demonstration)
6. [Documentations & References](#documentation-&-references)
7. [Licence](#licence)
8. [Dictionary](#dictionary)
    * 8.1. [Domain-Specific Terminology](#domain-specific-terminology)
    * 8.2. [Project-Specific Terminology](#project-specific-terminology)

***

## Introduction

### The Product
SlowLang is a class-based, object-oriented language that is designed as a foundation for developing domain-specific languages, and can also be used as a general-purpose programming language for developing applications, although it is not optimized for this purpose.

### The Project 
SlowLang Project is divided into three separate components:

 * **Compiler:** compiles SlowLang source code into custom byte-code.

  GitHub repository: [slow-lang-compiler](https://github.com/peterKRU/slow-lang-compiler) **[CURRENT REPOSITORY]**

* **Execution Engine:** executes programs compiled by the SlowLang Compiler. 

 GitHub repository: [slow-lang-execution-engine](https://github.com/peterKRU/slow-lang-execution-engine)

* **Runner:**
Component which uses the Compiler and Execution Engine to compile and run SlowLang programs.
<br>The Runner can also perform updates and run functional tests.
<br>GitHub repository: [slow-lang-runner](https://github.com/peterKRU/slow-lang-runner)

This document focuses on the SlowLang Compiler component, as shown in the concept diagram below:
![architecture-diagram-compiler-context]

***

Take a look at the Compiler's internal components:
![intro-class-diagram-animation]
> **Note**
> This animated diagram serves only an introductory purpose. <br>For a static, readable version of the diagram, visit chapter [3. 2. Compiler Architecture](#compiler-architecture).

##### [Back to top](#table-of-contents)
***

### Document Structure

This document is structured to provide a comprehensive understanding of the SlowLang programming language. It is organized in three major segments:

* **Getting Started** - This segment provides an introduction to the language and guides the reader through the process of installation, configuration, and trying out the program online. It also includes a demonstration of the basic features of SlowLang.

* **Architecture & Design** - This segment delves into the technical details of the project's architecture and design, including an explanation of design decisions and the underlying principles.

* **Language Specification** - This segment provides a detailed explanation of the grammars used in SlowLang, including thorough diagrams and tables.


The reader will also find documentations and references to projects related to SlowLang, as well as thorough visual demonstration of key language features. 

The document contains special domain-specific dictionary. Each chapter includes relevant references to the dictionary for easy navigation.

Example: Some example text. 

This organization aims to provide a comprehensive and easy-to-follow guide for understanding and utilizing the SlowLang programming language.

##### [Back to top](#table-of-contents)

***

### Scope

**Project scope:**

The SlowLang project has a dual scope, which is to serve as a robust foundation for developing domain-specific languages, and also to be used as a general-purpose programming language, although it is not optimized for this purpose.

* As a foundation for developing domain-specific languages, SlowLang provides a modular and easily extendable structure, with a focus on ease of maintenance over speed. Its architecture is designed to allow for easy pipelines for adding new features to the language, making it well-suited for creating specialized languages for specific domains.

* As a general-purpose programming language, SlowLang offers a C-like syntax, a front-end compiler that converts source code to custom bytecode, and an execution engine that includes a JVM-inspired virtual machine for managing class loading, memory management, and garbage collection. While it may not be optimized for this purpose, it still provides a solid foundation for developing applications, with its architecture providing easy pipelines for adding new features to the language.

**Document scope:**

* The scope of this document is to provide a comprehensive understanding of the SlowLang programming language. It includes a detailed demonstration of its features, a guide on how to use it, and thorough information about its architecture and the design decisions taken during its development. The document is organized in a way that makes it easy to understand and follow, starting with an introduction to the language and guiding the reader through installation, configuration, and basic usage. 

* It then delves into the technical details of the project's architecture and design, including an explanation of design decisions and the underlying principles. The last chapter provides a detailed explanation of the grammars used in SlowLang, including a special domain-specific dictionary. Each chapter includes relevant references to the dictionary for easy navigation. This document aims to be a thorough and easy-to-follow guide for understanding and utilizing the SlowLang programming language.

##### [Back to top](#table-of-contents)

***

### Key Features

Here is a comprehensive list of SlowLang's key features with example code (**click the arrows for example code**):

<details><summary>Standard features: SlowLang includes all the standard features of a programming language, such as arithmetic operations, logical operations, and more.</summary>
<p>

#### Here is a SlowLang block of code which is the programming equivalent of "the quick brown fox jumps over the lazy dog":

```
main {
    x = 5, y = 10;
    a = true, b = false;
    result = (x + y) * (x - y) / (x * y) % (x / y) + (++x) - (--y) + (x >> 2) + (x << 2) + (x >>> 2) & (x | y) ^ (x & y) || (a && b);
}
```

</p>
</details>

<details><summary>Implicit types: SlowLang has implicit types, meaning that the type of a variable is inferred from its value.</summary>
<p>

#### Implicit and explicit declaration of an integer, string and a user-defined class:

```
main {
    x = 1;
    y = "ololo";
    z = new ExampleClass(x, y);
}
```

</p>
</details>

<details><summary>Object-oriented: SlowLang is an object-oriented language and has classes and interfaces.</summary>
<p>

#### Example of interface and class definition:

```
interface ExampleInterface {
    
    public void exampleMethod();
}

class ExampleClass implements ExampleInterface {
    
    @Implement
    public void exampleMethod(){
        ```
    }
}   
```

</p>
</details>

<details><summary>Straightforward organizational structure: SlowLang has a straightforward organizational structure that includes a main execution block followed by class definitions. Classes can be written in separate documents, but the compiler assembles them into a single monolithic document.</summary>
<p>

#### Every program follows the following structure (main block -> classes -> intefaces):

```
main {
    ```
}

class {
    ```
}

interface {
    ```
}

```

</p>
</details>

<details><summary>No Inheritance, supports Interface Units instead: The less time you spend pondering over the ontological difference between abstract classes and interfaces the more time you spend actually writing interfaces. Hue hue.</summary>
<p>

#### If you really, really want to replicate iheritance you can use Interface Unit. An Interface Unit is a collection of interfaces which can be implemented as a single interface:

```
main {
    ```
}

class ExampleClass implements ExampleUnit {
    ```
}

interface ExampleInterface comprises ExampleUnit{
    ```
}

interface AnotherInterface comprises ExampleUnit{
    ```
}

```

</p>
</details>

<details><summary>Native Utils Library: SlowLang has a native utils library which includes implementation of all relevant data structures, such as Array, HashMap, BST, Set, etc.</summary>
<p>

#### You have all relevant data structures at your disposal:

```
main {
    dynamicArray = new DynamicArray(1, 2, 3);
    linkedList = new LinkedList(4, 5, 6);
    
    stack = new Stack(dynamicArray + linkedList);
    hashMap = new HashMap();
    
    exampleString = "ololo";
    hashMap.put(exampleString, stack.pop());
    
    binaryTree = new BinaryTree(exampleString, hashMap.get(exampleString));
}

```

</p>
</details>

<details><summary>Garbage Collection: SlowLang has a garbage collector that automatically frees up memory that is no longer being used. The GC also supports explicit memory dealocation.</summary>
<p>

#### Garbage Collection is automatic, however the user can choose to explicitly mark objects for deletion. The Garbage Collecor will sweep them during the next scheduled garbage collection:

```
main {
    exampleObject = new ExampleClass();
    print(exampleObject);
    GC.collect(exampleObject);
}
```

</p>
</details>

<details><summary>Virtual Machine interpreter: SlowLang's virtual machine interpreter can alter its behavior during runtime.</summary>
<p>

#### Here is a diagram showing high-level overview of SlowLang's Virtual Machine:

[TODO: insert diagram]

</p>
</details>

<details><summary>Chain of Opcode Executors: SlowLang's virtual machine uses a chain of opcode executors which can be easily extended, assembled and rearranged.</summary>
<p>

#### Here is a UML class diagram showing SlowLang's chain of opcode executors:

[TODO: insert diagram]

</p>
</details>

These features make SlowLang a flexible and versatile programming language that is well-suited for building upon.

##### [Back to top](#table-of-contents)

***

### Example Program

* Here is an example of the classical merge sort algorithm implemented in SlowLang:

```
main {
    array = {38, 27, 43, 3, 9, 82, 10};
    mergeSort(array);
    print(array);
}

class MergeSort implements SortingAlgorithm{
    
    @Implement
    public static sort(array: int[]) -> void {
        
        mergeSort(array);
    }
    
    public static mergeSort(array: int[]) -> void {
        
        if (array.length < 2) {
            return;
        }
        mid = arr.length / 2;
        left = Utils.copyRange(array, 0, mid);
        right = Utils.copyRange(arr, mid, array.length);
        mergeSort(left);
        mergeSort(right);
        merge(array, left, right);
    }

    public static merge(arr: int[], left: int[], right: int[]) -> void{
        
        i = 0, j = 0, k = 0;
        
        while (i < left.length && j < right.length) {
            
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }
        
        while (i < left.length) {
            arr[k++] = left[i++];
        }
        while (j < right.length) {
            arr[k++] = right[j++];
        }
    }
}

interface SortingAlgorithm {
    
    public sort(array: int) -> void;
}

```
***
* Here is an example SlowLang program that demonstrates some of the main features of object-oriented programming, including classes, interfaces, and interface units:

```

class Rectangle implements PolygonShape {
    
    private length;
    private  width;
    private  numberOfSides;
    
    public Rectangle(length: double, width: double) {
        
        this.numberOfSides = PolygonShape.Polygon.getNumberOfSides();
        this.length = length;
        this.width = width;
    }
    
    @Implement
    public getNumberOfSides(){
        
        return 4;
    }
    
    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    @Implement
    public getArea() {
        return length * width;
    }

    @Implement
    public getPerimeter() {
        return 2 * (length + width);
    }
}

class Circle implements Shape {
    
    private radius;

    public Circle(radius: double){
        this.radius = radius;
    }

    public getRadius() -> double{
        return radius;
    }

    @Implement
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Implement
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}

interface Shape comprises PolygonShape{
    
    getArea() -> double;
    getPerimeter() -> double;
}

interface Polygon comprises PolygonShape {
    
    public getNumberOfSides() -> int {
        
        return 4;
    }
}

unit PolygonShape {
    
    ```        
}
```

##### [Back to top](#table-of-contents)

***

### Tools & Software

**Pogramming languages:**
> * Java

 **CI tools:**
>* Maven
>* Jenkins
>* Docker

**Domain-specific tools**:
>* [Antlr4](https://www.antlr.org/) : A powerful parser generator for reading, processing, executing, or translating structured text or binary files. It's widely used to build languages, tools, and frameworks. From a grammar, ANTLR generates a parser that can build and walk parse trees.

##### [Back to top](#table-of-contents)

***

## Getting Started

![under-construction]

> **Warning**
> This section of the document is currently under construction and may contain placeholders and/or incomplete information. 

##### [Back to top](#table-of-contents)

***

### Installation

![under-construction]

> **Warning**
> This section of the document is currently under construction and may contain placeholders and/or incomplete information. 

##### [Back to top](#table-of-contents)

***

### Run Example Program

![under-construction]

> **Warning**
> This section of the document is currently under construction and may contain placeholders and/or incomplete information. 

##### [Back to top](#table-of-contents)

***

### Online Compiler

![under-construction]

> **Warning**
> This section of the document is currently under construction and may contain placeholders and/or incomplete information. 

##### [Back to top](#table-of-contents)

***

### Configurations

![under-construction]

> **Warning**
> This section of the document is currently under construction and may contain placeholders and/or incomplete information. 

##### [Back to top](#table-of-contents)

***

## Architecture & Design

This section contains detailed analysis of the project architecture and design. Each chapter contains class diagrams and high-level concept diagrams for better visual representation.

* Chapter 'System Architecture' contains overview of the entire SlowLang Project architecture.

* Chapter 'Compiler Architecture' contains more detailed explanation of the subject of this document - the Compiler component.

* Chapter 'Language Design' contains design overview and arguments for the language itself.

* Chapter 'Design Decisions' takes you on a "fascinating" journey where you will get familiar with topics, such as why I chose to use a parser generator instead of writing a recursive descent parser.

##### [Back to top](#table-of-contents)

***

### System Architecture

This chapter gives an overview of the architecture of the SlowLang programming language. SlowLang is composed of two main components: the compiler and the execution engine, as well as a separate program called the program Runner.

* **Compiler**
The compiler is responsible for taking the source code of a SlowLang program and converting it into custom bytecode. The process begins with the validation, tokenization, and parsing of the source code into an intermediate representation, known as a parse tree. The compiler then translates the intermediate representation into bytecode, which can be exported and run on the execution engine.

* **Execution Engine**
The execution engine is responsible for interpreting and running the bytecode generated by the compiler. The execution engine contains several key components, including the class loader, memory management module, a stack-based virtual machine, and a logger.
<br>The class loader is responsible for loading the compiled program into main memory, allowing the virtual machine to access and execute the bytecode. The memory management module is responsible for allocating and deallocating memory for the program, ensuring that resources are used efficiently.
<br>The virtual machine, or VM, is responsible for interpreting the bytecode commands and executing the program. The VM is stack-based, meaning that it uses a stack to store and manipulate the data during execution.
<br>The logger is responsible for keeping track of the program's execution and providing information about any errors or issues that may occur. The logger is a valuable tool for debugging and troubleshooting the program.


* **Runner**
In addition to the compiler and execution engine, SlowLang also includes a separate program called the program Runner. The program Runner is an entry point for the user and allows them to compile and run programs written in SlowLang by executing commands from the terminal. The program Runner also performs updates on the compiler and execution engine components, ensuring that the system is always up to date and running smoothly. This component acts as a bridge between the user and the underlying system, allowing users to easily interact with the system.

Overall, the SlowLang system architecture is designed to provide a robust and efficient platform for executing SlowLang programs. The compiler, execution engine, and program Runner all work together to ensure that programs written in SlowLang can be executed quickly and efficiently, with an easy-to-use interface for the user.

##### [Back to top](#table-of-contents)

***

### Compiler Architecture

The class diagrams for this project are designed to represent the main components and their relationships. The diagrams illustrate the classes, interfaces, and their attributes and methods. 

>* **Concept Diagram: Abstract Compiler Architecture**
>![architecture-abstract-diagram]
>This diagram represents a high-level conceptional overview of the Compiler component. 
The main components which comprise the Compiler are the Compiler Unit (the blue rectangle) and the Bytecode Generator (the red rectangle). 
The Compiler Unit contains three layers:	
	1. Compiler: manages the parsing and transformation processes.
	2. Lexer & Parser: tokenizes raw code, parses the tokens and outputs a Parse Tree.
	3. Parse Tree Transformer: transforms the Parse Tree into simpler code representation, such as Abstract Syntax Tree (AST) or array of tokens in postfix notation. The concrete output depends on the implementation. 

***

>* **UML Class Diagram: Concrete Compiler Architecture** 
>![architecture-class-diagram]
>
>This diagram represents the concrete SlowLang Compiler architecture.
The architecture of the compiler for this programming language is comprised of two distinct packages, the Compiler package and the Bytecode Generator package. The Compiler package is responsible for validating, tokenizing, and parsing raw source code, and ultimately outputs an array of labeled parsed tokens in postfix notation. The Bytecode Generator package, on the other hand, is responsible for translating the parsed code into bytecode.

The Compiler package includes several classes that work together to accomplish these tasks:

**1. The Compiler class** acts as a "facade," managing all the components within the package, including the FileReader, Lexer, Parser, ParseTreeWalker, and ShuntingYard. This class also invokes the Bytecode Generator to translate the parsed code into bytecode.

| Required Interfaces | Provider Class |
| --- | --- | 
| Importer | FileReader | 
| BytecodeCompiler | BytecodeGenerator |

---
 
**2. The FileReader class** is a standard class that reads files and stores their content as strings, and is used by the Compiler class. 

| Provided Interfaces | Client Class |
| --- | --- | 
| Importer | Compiler | 

---

**3. The Lexer class** acts as a "decorator," decorating the SlowLangV1Lexer class generated by antlr4. 

| Provided Interfaces | Client Class |
| --- | --- | 
| VocabularyConstructor | ExpressionTranslator | 

---

**4. The Parser** class also acts as a "decorator," decorating the SlowLangV1Parser class generated by antlr4.

---
 
**5. The ParseTreeWalker class** walks the ParseTree and transforms it into a 2D array of labeled tokens of type ParsedToken.

---
 
**6. The ShuntingYard class** converts each expression from the 2D array of tokens from infix to postfix notation and also flattens the 2D array and outputs an array of labeled tokens, ready to be translated to bytecode.

---

The Bytecode Generator package includes several classes that work together to translate parsed tokens into bytecode: 

**1. The BytecodeGenerator class** acts as a "facade," managing the ExpressionTranslator and the BytecodeExporter classes. 

| Required Interfaces | Client Class |
| --- | --- | 
| Exporter | BytecodeExporter | 
| TokenTranslator | ExpressionTranslator |

---

**2. The ExpressionTranslator class** translates parsed tokens into bytecode using the Vocabulary class. 

| Provided Interfaces | Client Class |
| --- | --- | 
| TokenTranslator | BytecodeGenerator | 

---

**3. The Vocabulary class** is a "data holder" class that contains dictionaries of bytecodes and token names and has helper methods to determine the type of the token in case it is not labeled. 

| Required Interfaces | Provider Class |
| --- | --- | 
| VocabularyConstructor | Lexer | 

---

**4. The BytecodeExporter class** is a "writer" class that writes the bytecode to a file.

| Provided Interfaces | Client Class |
| --- | --- | 
| Exporter | BytecodeGenerator | 

---

##### [Back to top](#table-of-contents)

***

### Language Design

**Design Goals**

The design of the language is centered around a few key goals: to create a general-purpose, class-based language with a minimum set of object-oriented programming (OOP) features, while adhering to standard and well-known syntax similar to languages such as Java, C++, and C#.

**Main Features**

One of the key design features of the language is its monolithic structure. A program in this language consists of a Main Execution block, followed by classes, followed by interfaces, and finally followed by Interface units, in that specified order. This structure is designed to make the language easy to understand and use for developers of all skill levels.

Another important design decision was to not include inheritance as a feature of the language. Instead, we chose to focus on creating a robust system of interface units. These interface units are packages of interfaces designed for constructing complex and composite interface structures. This approach allows for greater flexibility and modularity in the language, while also simplifying the language's overall design.

In summary, the language is designed to be a general-purpose, class-based language with a minimal set of OOP features and a monolithic structure. It adheres to standard and well-known syntax, while also incorporating unique features such as interface units for building complex interface structures. This design allows developers of all skill levels to easily understand and use the language, while also providing the necessary flexibility and modularity for building complex applications.

**Design Argumentation**

* **No inheritance?** 
Inheritance often may not be the best solution for modeling relationships between classes. Here are some of the most notable problems with Inheritance in the context OOP design:
	
	* Tight coupling: Inheritance can create tight coupling between classes, making it difficult to change or reuse the code in the future.
    * Fragility: Inheritance can make the code fragile, as changes to the parent class can have unintended consequences for the child classes.
   * Limited flexibility: Inheritance can limit the flexibility of a system, as classes can only inherit from one parent class, and cannot inherit from multiple classes.
    * Complexity: Inheritance can make the code more complex, as it can create a large number of classes that are difficult to understand and maintain.
    * Not always the best solution: Inheritance is not always the best solution for modeling relationships between classes. In some cases, composition or interfaces may be more appropriate.
    * Violates Liskov Substitution Principle: Child classes must be able to substitute for the parent class, but sometimes this is not possible as the methods or properties in the parent class may not be appropriate for the child class.

	The design of SlowLang tries to tackle these problems by adopting solutions from programming languages, such as Go and Rust, which support object-oriented programming but do not have inheritance at all, and instead use composition and interfaces to model relationships between objects. 

* **Why adopting a monolith file structure?** 
A monolith file structure has several benefits such as simplicity, ease of testing, reduced complexity, improved performance, easy deployment, efficient communication, and cost-effectiveness, especially for small to medium-sized applications. Here is a list of benefits:

	* Simplicity: A monolith file structure is simple and easy to understand, as all the code for the application is located in a single codebase. This makes it easy to navigate and find the code for specific features.
    * Easy to test: With a monolith file structure, all the code for the application is located in a single codebase. This makes it easy to write automated tests for the entire application and ensure that all the features are working correctly.
    * Reduced complexity: With a monolith file structure, there are fewer moving parts to worry about, which can reduce the overall complexity of the application. This makes it easier to maintain and understand the application.
    * Improved performance: Monolithic architecture allows you to use all the resources of the machine (e.g. RAM, CPU) more efficiently, as they are shared by the application. This can result in improved performance, especially for small to medium-sized applications.
    * Easy to deploy: Monolithic file structure makes it easy to deploy the application, as all the code is located in a single codebase. This eliminates the need for multiple deployments for different microservices.
    * Efficient communication: A monolith file structure makes it easy for different parts of the application to communicate with each other, as they are all located in the same codebase. This can improve the overall efficiency of the application.
    * Cost-effective: Monolith file structure can be cost-effective in small or medium-sized projects. A monolith is easier to test, deploy and maintain than a microservices architecture, which requires more resources and expertise.

	SlowLang is adopting a monolith file structure because it better fits its design goals: it allows for a simple, easy to understand codebase that is easy to test, deploy, and maintain, and is more efficient for small to medium-sized applications, especially in terms of performance, communication and cost.

##### [Back to top](#table-of-contents)

***

### Design Decisions

![under-construction]

> **Warning**
> This section of the document is currently under construction and may contain placeholders and/or incomplete information. 

##### [Back to top](#table-of-contents)

***

## Language Specification


The SlowLang programming language is a robust and expressive language that is designed for a wide range of applications. This chapter provides a detailed specification for the language, including an overview of its grammar, lexical grammar, and syntactic grammar.

The first section of this chapter, "Grammar Overview", provides a general introduction to the grammar of the SlowLang language. This section will give you a high-level understanding of the language's structure and how it is used to express different types of information.

The next section, "Lexical Grammar," delves deeper into the language's grammar and focuses on the smallest units of the language, known as lexemes. This section will provide an in-depth understanding of the rules that govern the formation of lexemes in SlowLang, including the use of keywords, operators, and identifiers.

Finally, the "Syntactic Grammar" section builds on the information presented in the previous sections and provides a detailed examination of the structure of SlowLang statements and expressions. This section will cover the rules for forming statements and expressions, as well as the use of control structures such as loops and conditionals.

This chapter provides a comprehensive guide to the SlowLang programming language, making it an essential resource for understanding the language's inner mechanics.

##### [Back to top](#table-of-contents)

***

### Grammar Overview

SlowLang is a programming language that has a standard, easy-to-read syntax, similar to languages like C++, Java, and C#. It has a standard set of statements, expressions, and operators, making it easy for developers to pick up and use.

* One of the key features of SlowLang is that it is an object-oriented programming (OOP) language. It supports classes, interfaces, and interface units, allowing for the encapsulation of data and behavior. However, unlike other OOP languages, SlowLang does not support inheritance. Instead, it uses method overriding and overloading and interface units to provide similar functionality.

* Interface units are a language construct which aims to replace abstract classes and inheritance overall.

* In SlowLang, variables do not require explicit types; their types are inferred implicitly. However, methods require explicit argument and return types. This allows for greater flexibility in the language while still maintaining strong type safety.

* The file structure of SlowLang is also unique, with a concrete monolith file structure. A main block is followed by classes, interfaces, and interface units, in that order. This allows for a clear and organized structure for the code, making it easy to navigate and understand.

Overall, SlowLang is a versatile programming language that combines the best features of other popular languages with its own unique features, such as the monolith file structure and interface units, to create a language that is easy to learn and use.

##### [Back to top](#table-of-contents)

***

### Lexical Grammar

SlowLang has six types of tokens: 
* **Keywords:** 
 Reserved words that have a special meaning and cannot be used as identifiers.
* **Literals:** Fixed values that are used to represent various data types
* **Identifiers:** Names for variables, methods, and classes. 
* **Operators:** Symbols that perform operations on one or more operands.
* **Separators:** Characters that separate elements in a program.
* **Ignored Tokens:** Comments and whitespaces that are ignored by the compiler.

#### Keywords:

| Keyword | Description |
| --- | --- | 
| main | main execution block declaration | 
| class | class declaration | 
| if | marks an 'if'statement |
| else | marks 'else' block|
| while | marks a 'while' loop |
| return | marks return statement |
| new | object instantiation |
| print | marks print statement |

#### Literals:
 
| Type | Example | Regex |
| --- | --- | --- |
| int | 11 | [0-9]+ | 
| float | 1.1 | [0-9]+ '.' [0-9]+ |    
| string | "example string" | '"' .*? '"' | 
| id | exampleVariable| [a-zA-Z][a-zA-Z0-9]* |

#### Identifiers:

| Type | Example | Rules |
| --- | --- | --- | 
| Variable Identifier | varName | Starts with lowercase letter, uses camleCase notation.
| Class Identifier | ExampleClass | Starts with uppercase letter, uses CamleCase notation.
| Interface Identifier | ExampleInterface | Starts with uppercase letter, uses CamleCase notation.
| Interface Unit Identifier | ExampleInterfaceUnit: | Starts with uppercase letter, uses CamleCase notation, ends with colon.
| Method Identifier | exampleMethod() | Starts with lowercase letter, uses camleCase notation, ends with parentheses.

#### Operators:

| Operator | Name | Type | Example |
| --- | --- | --- | --- |
| + | Addition | Arithmetic | 10 + 2
| - | Subtraction | Arithmetic | 10 - 2
| * | Multiplication | Arithmetic | 10 * 2
| / | Division | Arithmetic | 10 / 2
| % | Modulus | Arithmetic | 10 % 2
|  |  |  |
| == | Equals | Comparison | x == y
| != | Not Equal | Comparison | x != y
| > | Greater Than | Comparison | x > y
| < | Less Than | Comparison | x < y
| >= | Greater Than Equals | Comparison | x >= y
| <= | Less Than Equals | Comparison | x <= y
|  |  |  |
| ! | Not | Logical | !x
| && | And | Logical | x && y
| \|\| | Or | Logical | x \|\| y
|  |  |  |
| = | Assign | Assignment | x = 10
| += | Add And Assignn | Assignment | x += 1
| -= | Subtract And Assignn | Assignment | x -= 1
|  |  |  |
| ++_ | Prefix | Unary | ++x 
| _++ | Postfix | Unary | x++ 

#### Separators

| Token | Type | Meaning |
| --- | --- | --- |
| { } | Curly Brackets | Marks blocks or statements 
| () | Parentheses | Mark function parameters or expressions 
| [] | Square Brackets | Mark arrays
| ; | Semicolon | Marks end of statement


##### [Back to top](#table-of-contents)

***

### Syntactic Grammar

The following segment contains a thorough analysis of the grammar, ilustrated with concept diagrams and tables.
<br>
<br>Here is a combined concept diagram containing all syntactic elements:
<br>

***

![grammar-combined-diagram]

***

Here is a top-down breakdown of the diagram, starting with the most high-level syntactic components and moving down to lower levels of the grammar:

* **Program:**
<br>  The Program is the highest level element of a the grammar. 
<br>It is defined as either an empty file, or one Main Block followed by zero or more classes, followed by zero or more Interfaces, followed by zero or more Interface Units.

![grammar-program-diagram]

* **Main Block:**
<br>The keyword 'main' followed by a Block.

![grammar-main-block-diagram]

* **Class:**
<br>The keyword 'main', followed by a Block.

![grammar-class-diagram]

* **Interface:**
<br>The keyword 'interface', followed by an Interface Identifier, followed by the optional 'comprises' keyword, followed by zero or more Interface-Unit Identifiers, followed by a Block.

![grammar-interface-diagram]

* **Interface-Unit:**
<br>The keyword 'interface-unit', followed by an Interface-Unit Identifier, followed by a Block.

![grammar-interface-unit-diagram]

* **Block:**
<br>A Block is defined as zero or more statements separated by semicolons.

![grammar-block-diagram]

* **Statement:**
A Statement can be of the following types:

| Statement Type | Definition | Example |
| --- | --- | --- |
| Conditional Statement | The keyword 'if', followed by an Expression in parentheses, <br>followed by a Block. |``` if(x){...} ```|
| Loop Statement | The keyword 'while', followed by an Expression in parentheses, <br>followed by a Block. | ``` while(x){...} ```|
| Return Statement | The keyword 'return' followed by an Expression, ended with a <br>semicolon. | ``` return x; ```|
| Variable Definition <br> Statement | An Expression, followed by an Assignment Operator, <br>followed by an Expression, ended with a semicolon. | ``` x = 15; ```|
| Object Instantiation <br>Statement | An Expression, followed by an Assignment Operator, <br>followed by the keyword 'new', followed by parentheses <br>with zero or more comma-separated arguments, ended <br>with a semicolon | ``` x = new Object(y, z); ```|
| Expression Statement| An Expression, ended with a semicolon. | ``` x; ```|
| Print Statement| The keyword 'print', followed by zero or one expression <br>in parentheses. | ``` x; ```|

<br>

![grammar-statements-diagram]

* **Expression:**
An Expression can be of the following types:

| Expression Type | Definition | Example
| --- | --- | --- |
| Literal Expression | Contains a Literal Token. | ``` 15 ``` 
| Identifier Expression | Contains an Identifier Token. | ``` x ```
| Binary Expression | An expression, followed by a <br>Binary Operator, followed by an expression. | ```x = 15 ```
| Unary Expression | An Unary Operator, followed by an Expression. | ``` !x ``` 
| Prefix Increment/Decrement Expression | Incremental/Decremental Prefix Operator, <br>followed by an Expression. | ``` ++x ```
| Postfix Increment/Decrement Expression | An Expression followed by <br>Incremental/Decremental Posfix operator. | ``` x++ ```
<br>

![grammar-expressions-diagram]

##### [Back to top](#table-of-contents)

***

## Features Demonstration

![under-construction]

> **Warning**
> This section of the document is currently under construction and may contain placeholders and/or incomplete information. 

##### [Back to top](#table-of-contents)

***

## Documentations & References

![under-construction]

> **Warning**
> This section of the document is currently under construction and may contain placeholders and/or incomplete information. 

##### [Back to top](#table-of-contents)

***

## Licence

MIT License

Copyright (c) 2023 Peter Krastanov

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.

##### [Back to top](#table-of-contents)

***

## Dictionary
![alt text](https://raw.githubusercontent.com/peterKRU/slow-lang-compiler/master/docs/Under-Construction-300x222.png "Under Construction")

### Domain-Specific Terminology

This section contains definitions of domain-specific terms used within the document.
Some definitions contains a link to a resource which contains thorough information on the topic.


![under-construction]

> **Warning**
> This section of the document is currently under construction and may contain placeholders and/or incomplete information. 

##### [Back to top](#table-of-contents)

***

### Project-Specific Terminology

This section contains definitions of domain-specific terms used within the document.
Some definitions contains a link to a resource which contains thorough information on the topic.


![under-construction]

> **Warning**
> This section of the document is currently under construction and may contain placeholders and/or incomplete information. 

##### [Back to top](#table-of-contents)

***

<!-- MARKDOWN LINKS & IMAGES -->

[slowlang-logo]: https://raw.githubusercontent.com/peterKRU/slow-lang-compiler/master/docs/SlowLang_2.jpg "SlowLang Logo"

[under-construction]: https://raw.githubusercontent.com/peterKRU/slow-lang-compiler/master/docs/Under-Construction-300x222.png "Under Construction"

[architecture-diagram]: https://raw.githubusercontent.com/peterKRU/slow-lang-compiler/b89ee32aa676a197d01b2c80acb5f868df44373e/docs/architecture_overview.jpg

[architecture-diagram-compiler-context]: https://raw.githubusercontent.com/peterKRU/slow-lang-compiler/master/docs/architecture_overview_compiler_context.jpg

[grammar-program-diagram]: https://raw.githubusercontent.com/peterKRU/slow-lang-compiler/8888f3b27eb5da9e89448bdefe5071e757501490/docs/program.jpg

[grammar-main-block-diagram]: https://raw.githubusercontent.com/peterKRU/slow-lang-compiler/8888f3b27eb5da9e89448bdefe5071e757501490/docs/main_block.jpg

[grammar-block-diagram]: https://raw.githubusercontent.com/peterKRU/slow-lang-compiler/e1d4c79f805fd29fd700c70a287d8b186500d900/docs/block.jpg

[grammar-class-diagram]: https://raw.githubusercontent.com/peterKRU/slow-lang-compiler/e1d4c79f805fd29fd700c70a287d8b186500d900/docs/class.jpg

[grammar-interface-unit-diagram]: https://raw.githubusercontent.com/peterKRU/slow-lang-compiler/e1d4c79f805fd29fd700c70a287d8b186500d900/docs/interface-unit.jpg

[grammar-interface-diagram]: https://raw.githubusercontent.com/peterKRU/slow-lang-compiler/e1d4c79f805fd29fd700c70a287d8b186500d900/docs/interface.jpg

[grammar-statements-diagram]: https://raw.githubusercontent.com/peterKRU/slow-lang-compiler/c6c1011f3f5d838d5134641ec3678243cd405c58/docs/statements.jpg

[grammar-expressions-diagram]: https://raw.githubusercontent.com/peterKRU/slow-lang-compiler/306254b3e944f7ffca40707b25648922cf58e00e/docs/expressions.jpg

[grammar-combined-diagram]: https://raw.githubusercontent.com/peterKRU/slow-lang-compiler/51ff0d31615d533772b013bdaa989faa35ebb026/docs/grammar.jpg

[intro-project-animation]: https://raw.githubusercontent.com/peterKRU/slow-lang-compiler/2929209634352f4ff1d5efd0bfadeba6ea8287a1/docs/project_intro.gif

[intro-class-diagram-animation]: https://raw.githubusercontent.com/peterKRU/slow-lang-compiler/172f2ecffb2aaf401b5c43e64e0c8c3bad58d788/docs/class_diagram_animation.gif

[architecture-abstract-diagram]: https://raw.githubusercontent.com/peterKRU/slow-lang-compiler/master/docs/abstract_architecture_diagram.jpg

[architecture-class-diagram]: https://raw.githubusercontent.com/peterKRU/slow-lang-compiler/master/docs/SlowLangCompiler-ClassDiagram.jpg
