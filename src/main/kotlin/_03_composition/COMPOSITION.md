# 🏗️ Composition vs Inheritance: Building Stronger Structures in Kotlin

- **Composition** is a design principle in **Object-Oriented Programming (OOP)** where objects are composed of other objects to achieve the desired functionality.
- Unlike **inheritance**, which uses a hierarchy of classes, composition allows **flexibility** and **decoupling** of components, making it easier to change or extend features without modifying the class hierarchy.

In simpler terms, **composition** is when one class has a reference to another class and uses its functionality, rather than inheriting from it.

## ✨ Key Concepts Covered in This Module
### 1️⃣ **Composition**: Building Classes with Other Objects
- **Composition** involves creating classes that contain objects of other classes, instead of inheriting from them.
- Example:
```kotlin
class Engine {
    fun start() {
        println("Engine starting...")
    }
}
class Car {
    private val engine = Engine()

    fun startCar() {
        engine.start() // Delegation of behavior through composition
        println("Car started!")
    }
}
```
In this example, the ``Car`` class **has** an `Engine` object, instead of extending it.

## 2️⃣ When to Use Composition Over Inheritance:
- **Composition** is typically used when you want to combine different behaviors or share functionality across multiple classes.
- Use composition when your objects should **not** share the same type or **hierarchy**.

## 🧩 Composition vs Inheritance: A Comparison
| **Aspect**             | **Inheritance**                     | **Composition**                     |
|------------------------|-------------------------------------|-------------------------------------|
| **Definition**          | One class inherits from another.    | One class contains objects of other classes. |
| **Flexibility**         | Less flexible; tied to hierarchy.   | Highly flexible and decoupled. |
| **Reusability**         | Code reuse via inheritance hierarchy. | Reusability through shared behavior and delegation. |
| **Coupling**            | Strong coupling (classes are tightly connected). | Low coupling (classes interact via interfaces or methods). |
| **Extensibility**       | Inheritance can lead to complex hierarchies. | Easier to extend or modify components without breaking hierarchy. |
| **When to Use**         | Use when classes share a clear hierarchy and common behavior. | Use when classes share behavior but not a common parent. |


## 🔥 Best Practices in Composition
- ✔️ Prefer composition over inheritance for **flexibility** and **modularity**.
- ✔️ Use composition to **decouple** your code and make it easier to extend.
- ✔️ Delegate behaviors to smaller, focused classes to avoid bloated classes.

## 🚀 Conclusion
In this module, we covered:

- ✅ Composition and how it allows for more flexible designs.
- ✅ Benefits over inheritance in terms of decoupling and extensibility.