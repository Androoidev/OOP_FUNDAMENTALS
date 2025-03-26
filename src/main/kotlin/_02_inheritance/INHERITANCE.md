# 🔥 Inheritance: Expanding Object-Oriented Programming in Kotlin
### 📖 What is Inheritance and Why is it Important?

- **Inheritance** is a core principle of **Object-Oriented Programming (OOP)** that allows a class (**child**) to inherit properties and behaviors from another class (**parent**).
- It promotes **code reuse, scalability, and maintainability**, making it easier to build upon existing logic.


## ✨ Key Concepts Covered in This Module

### 1️⃣ `open` Class: Allowing Inheritance
By default, Kotlin classes are **final**, meaning they **cannot** be inherited.  
To enable inheritance, we must declare a class as **`open`**: 
```kotlin
open class Product(val name: String, val price: Double)
```


### 2️⃣ Subclasses: Extending Functionality
A subclass (child class) extends a superclass (parent class) using `:`
- Example
```kotlin
class Clothing (name: String, price: Double, val size: String) : Product(name, price)
```
The `Clothing` class **inherits** `name` and `price` from `Product`.


## 🔥 Best Practices in Inheritance

- ✔️ Use ``open`` only when a class is meant to be extended.
- ✔️ Always use ``override`` for modifying parent methods.
- ✔️ Use ``super`` when you need to retain parent functionality.

## 📂 Files in This Package

- 📌 ``Product.kt``: Base class for products.
- 📌 ``Clothing.kt``: Inherits from ``Product``, adds size.
- 📌 ``Electronics.kt``: Inherits from ``Product``, adds brand.
- 📌 ``Customer.kt``: Manages a shopping cart using a list of ``Product``.

## 🚀 Conclusion
In this module, we explored inheritance in Kotlin, covering:
- ✅ ``open`` classes and subclassing.
- ✅ Method ``overriding`` and ``super``.
- ✅ Real-world implementation with a ``Customer`` shopping cart.

This knowledge prepares us for ``polymorphism``, ``abstract classes``, and ``interfaces``, which we will explore in the next modules! 🚀