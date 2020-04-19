# The Observer Pattern

* Newspaper or Magazine subscription

Publishers + Subscribers = Observer Pattern

> The Observer Pattern defines a one-to-many dependency between objects so that 
> when one object changes state, all of its dependents are notified and updated
> automatically.

## Advantage

* The only thing the subject knows about an observer it that it implements a certian interface.
* We can add new observers at any time.
* We never need to modify the subject to add new types of observers.
* We can reuse subjects or observers independently of each other.
* Changes to either the subject or an observer will not affect the other.

## Design Principle

> Strive for loosely coupled designs between objects that interact.

