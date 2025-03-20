# 📌 Fundamentals: Introduction to Object-Oriented Programming in Kotlin
### 📖 What is OOP and Why is it Important?

- **Object-Oriented Programming (OOP)** is a programming paradigm that structures code into **classes and objects**. Its main goal is to improve **modularity, reusability, and maintainability**.
- In Kotlin, OOP allows us to model real-world entities using **classes** that contain **properties (attributes) and methods (behavior)**.

## ✨ Key Concepts Covered in This Module

### 1️⃣ Classes and Objects

- **Class**: A blueprint that defines the characteristics and behavior of an object.
- **Object**: An instance of a class in memory.

### 2️⃣ Properties and Methods

- **Properties**: Variables inside a class that store data.
- **Methods**: Functions inside a class that define its behavior.

### 3️⃣ Constructors and `init` Block
In Kotlin, a class can have:

- **Primary constructor**: Defined in the class declaration.
- **Secondary constructor**: Defined inside the class using `constructor`.
- **`init`block**: Code that executes automatically when an object is created.

### 4️⃣ Encapsulation: Getters and Setters

**Encapsulation** protects a class’s data and restricts access to its properties. 
It is achieved using `private`, `protected`, `internal`, and `public`.

### 🔥 Best Practices in OOP (Fundamentals)
- ✔️ Use PascalCase for class names (Person, BankAccount).
- ✔️ Use camelCase for properties (balance, name).
- ✔️ Avoid unnecessary public variables.
- ✔️ Use private whenever possible for security.
- ✔️ Provide methods to modify data instead of direct variable access

### 📂 Files in This Package
- 📌 Person.kt: Example of classes, constructors, and methods.
- 📌 BankAccount.kt: Encapsulation with private, getters, and setters.

### 🚀 Conclusion
In this module, we covered the fundamentals of OOP in Kotlin, including:

- ✅ Classes and objects.
- ✅ Properties and methods.
- ✅ Constructors and init.
- ✅ Encapsulation with getters and setters.

These concepts form the foundation for more advanced topics like **inheritance**, **polymorphism**, and **interfaces**, which we will explore in the next modules.