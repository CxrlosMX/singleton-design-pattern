# Singleton Design Pattern in Java

The **Singleton** design pattern ensures that a class has only **one instance** and provides a global point of access to that instance. This pattern is often used for objects that need to be centralized, like logging, database connections, or configuration settings.

## Key Characteristics of Singleton
1. **Private Constructor**: To prevent the creation of more than one instance of the class.
2. **Static Instance**: A static variable that holds the single instance of the class.
3. **Global Access**: A public static method to provide access to the instance.

## Implementation of Singleton in Java

```java
public class Singleton {
    // Static variable to hold the single instance
    private static Singleton instance;

    // Private constructor to prevent instantiation
    private Singleton() {
    }

    // Public method to provide global access to the instance
    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    // Example method in the singleton class
    public void showMessage() {
        System.out.println("Singleton instance: " + this);
    }
}
