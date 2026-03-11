# Architecture Overview

## 3-Tier MVC Architecture
The 3-tier MVC (Model-View-Controller) architecture is a software design pattern, which organizes the application into three interconnected components:

1. **Model**: Represents the data and business logic of the application.
2. **View**: Represents the UI and its elements, providing a means for the user to interact with the application.
3. **Controller**: Acts as an interface between Model and View, processing user inputs and updating Model and View correspondingly.

### Example
- **Model**: User class, Product class
- **View**: HTML/CSS pages
- **Controller**: UserController, ProductController

## Design Patterns
There are 9 design patterns crucial for software design:
1. **Singleton**: Ensures a class has only one instance and provides a global access point.
   - *Example*: `DatabaseConnection` class controlling access to a database.

2. **Observer**: Define a one-to-many relationship, so when one object changes state, all dependents are notified.
   - *Example*: Event system in an application.

3. **Factory**: Creates objects without specifying the exact class of object that will be created.
   - *Example*: `ShapeFactory` producing different shapes like Circle, Square.

4. **Strategy**: Enables selecting an algorithm's behavior at runtime.
   - *Example*: Sorting algorithms like QuickSort or BubbleSort.

5. **Decorator**: Adds new functionality to an existing class without altering its structure.
   - *Example*: Adding features to graphical elements like drawing shapes in different colors.

6. **Adapter**: Allows classes with incompatible interfaces to work together.
   - *Example*: A class that adapts a legacy system to a new application.

7. **Facade**: Provides a simplified interface to a complex system.
   - *Example*: A class offering a unified interface to a set of interfaces in a subsystem.

8. **Command**: Encapsulates a request as an object, thus allowing for parameterization of clients with queues, requests, and operations.
   - *Example*: Implementing undo functionality in applications.

9. **Prototype**: Used to create a duplicate object while keeping performance in mind.
   - *Example*: Creating a clone of an object from a predefined template.

## SOLID Principles
The SOLID principles are guidelines to design software that is easy to manage:
1. **S - Single Responsibility Principle**: A class should have one and only one reason to change.
2. **O - Open/Closed Principle**: Software entities should be open for extension, but closed for modification.
3. **L - Liskov Substitution Principle**: Objects of a superclass should be replaceable with objects of a subclass without affecting the correctness of the program.
4. **I - Interface Segregation Principle**: Clients should not be forced to depend on interfaces they do not use.
5. **D - Dependency Inversion Principle**: Depend on abstractions, not on concretions.

## Technical Stack
- **Frontend**: ReactJS, HTML5, CSS3
- **Backend**: Node.js, Express.js
- **Database**: MongoDB
- **Other Tools**: Docker, Kubernetes

## Module Structure
- **Modules**: Each feature of the application is developed in modules, e.g., Account, Product, Order.
- Each module has its own Models, Views, Controllers, and routes for handling requests.

## Database Design
- A normalized database structure where each entity has its dedicated table.
- Relations defined by foreign keys to maintain data integrity.

## Authentication Flow
- User login -> Validation of credentials -> Token generation -> Protected routes using middleware for verification.

## Best Practices
- Follow coding standards and naming conventions.
- Regular code reviews and pair programming.
- Write unit and integration tests.
- Maintain documentation for third-party libraries and tools used in the project.

---