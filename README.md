### Solid Principles


Solid Principles are the design principles that enable us manage most of the software design problems.The principles are a subset of
many principles promoted by **Robert C. Martin** . The SOLID acronym was first introduced by **Michael Feathers**. 


* **S : Single Responsibility Principle (SRP)**</br>
The principle suggests that the “class should be having one and only one responsibility”.</br>

* **O : Open/Closed Principle (OCP)**</br>
This principle suggests that “classes should be open for extension but closed for modification”.</br>

* **L : Liskov’s Substitution Principle (LSP)**</br>
This principle suggests that “parent classes should be easily substituted with their child classes without blowing up the application”.</br>

* **I : Interface Segregation Principle(ISP)**</br>
This principle suggests that “many client specific interfaces are better than one general interface”.</br>

* **D : Dependency Inversion Principle(DIP)**</br>
This principle suggests that “classes should depend on abstraction but not on concretion”.</br>

</br>


#### Why SOLID Principles ? and If we don't follow SOLID Principles we:</br>

* End up with tight or strong coupling of the code with many other modules/applications
* Tight coupling causes time to implement any new requirement, features or any bug fixes and some time it creates unknown issues
* End up with a code which is not testable
* End up with duplication of code
* End up creating new bugs by fixing another bug
* End up with many unknown issues in the application development cycle


#### Following SOLID Principles helps us to:</br>

* Achieve reduction in complexity of code
* Increase readability, extensibility and maintenance
* Reduce error and implement reusability 
* Achieve better testability
* Reduce tight coupling 


#### Single Responsibility Principle: </br>
* Every module or class should have responsibility over a single part of the functionality provided by the software , and that responsiblity should be entirely encapsulated by the class

#### Open/Closed Principle: </br>
* "Software entities should be open for extension , but closed for modification "
* The design and writing of the code should be done in a way that new functionality should be added with minimum changes in the existing code
* The design should be done in a way to allow the adding of new functionality as new classes , keeping as much as possible existing code unchanged

#### Liskov Substitution Principle: </br>
* Introduced by Barbara Liskov , State that "Objects in a program should be replaceable with instances of their subtypes without altering the correctness of that program"
* If a program module is using a Base class then the reference to the Base class can be replaced with a Derived class without affecting 
the functionality of the program module
* We can also state that Derived types must be substitutable for their Base types

#### Interface Segregation Principle: </br>
* "Many client-specific interfaces are better than the general-purpose interface"
* We should not enforce clients to implement interfaces that they don't use. Insted of creating one big interfaces we can break down it to smaller interfaces

#### Dependency Inversion Principle:
* One should "depend upon abstractions not concretions"
* Abstractions should not depend on the details whereas the details should depend on abstractions
* High level modules should not depend on low level modules


