# Summary
In this project, we began with a class representing a rectangle, defined by its length and width, and equipped with a method, computeArea, for calculating its area. Subsequently, we introduced setter and getter methods to allow for the adjustment of its length and width.

As the program progressed, we extended its functionality to accommodate squares. However, the square, being a special case of a rectangle, didn't perfectly inherit from its parent due to differing attribute dependencies. The rectangle relied on both length and width, whereas the square was only dependent on the length. This discrepancy meant the square couldn't seamlessly substitute the rectangle, thus violating the Liskov Substitution Principle.

To resolve this issue while maintaining adherence to simplicity, we opted for a different approach. We decided to create a shared interface for both the square and rectangle classes, recognizing their commonality as shapes. By defining specific parameters for each class within this interface, we effectively addressed the problem at hand.

# FAQ
1-Sequential Testing in General Software Development vs TDD

In the general software development cycle, software testing occurs after software implementation, whereas in TDD, unit tests are written before the program code. These approaches don't necessarily contradict each other. TDD's emphasis on test-driven design aims to ensure code correctness and guide implementation, whereas traditional testing after implementation serves as a validation phase. This distinction influences the development sequence but doesn't inherently conflict.

2-Granularity of Unit Tests

Unit tests are fine-grained, focusing on testing small, isolated components or functions. For instance, a unit test might validate the specific behavior of a function, while integration tests might ensure the interaction between modules. This distinction in granularity helps in pinpointing and addressing issues at a more granular level compared to higher-level tests.

3-Origination of Software Tests

Not all types of software tests are solely created by programmers. While programmers do create unit tests, other types like system-level tests or user acceptance tests might be developed by quality assurance teams, product owners, or automation specialists. Different testing types involve various stakeholders to ensure comprehensive test coverage.

4-Application of SOLID Principles in Software Development Stages

The SOLID principles (Single Responsibility, Open-Closed, Liskov Substitution, Interface Segregation, Dependency Inversion) are primarily used in the stages of analysis, design, and implementation in software development. These principles guide the structuring and design of software components, ensuring modularity, extensibility, and maintainability.

5-Inheritance of Square from Rectangle in Unchanged Dimension Scenario

If the test case doesn't require altering the dimensions of the rectangle, inheriting a square from the rectangle might not be ideal. Inheritance assumes an "is-a" relationship, but if the square doesn't adhere to the same characteristics (i.e., both width and height being equal), it violates the Liskov Substitution Principle. In such a scenario, a different approach might be more appropriate.
