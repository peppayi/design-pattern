# The Factory Pattern

The Simple Factory isn't actually a Design Pattern; it's more of a programming idiom.

> The Factory Method Pattern defines an interface for creating
> an object, but let subclasses decide which class to instantiate.
> Factory Method lets a class defer instantiation to subclasses.

# Design Principle

Dependency Inversion Principle

> Depend upon abstractions. Do not depend upon concrete classes.

It suggests that our high-level components should not depends on our
low-level components; rather, they should both depend on abstractions.

## Guidelines

* No variable should hold a reference to a concrete class.
* No class should derive from a concrete class.
* No method should override an implementation method of any of its base classes.
