# midterm2--cs2334
cheat sheet

https://github.com/OU-CS2334

https://docs.oracle.com/javase/7/docs/api/java/util/Collections.html
shuffle(List<?> list) - Randomly permutes the specified list using a default source of randomness.
shuffle(List<?> list, Random rnd) - Randomly permute the specified list using the specified source of randomness.
- The Random constructor parameter is the seed or starting point for the internal pseudo-random number generator. If you construct two Random objects with the same seed, they will generate the same sequence of pseudo-random numbers. (Use 52? or might not work idk)

Access to elements:
It traverses the list backwards, from the last element up to the second, repeatedly swapping a randomly selected element to its “current position”.
Thereafter elements are randomly selected from the portion of the list that runs from the first element to the current position, inclusive.

https://docs.oracle.com/javase/8/docs/api/java/util/Random.html
https://www.geeksforgeeks.org/collections-shuffle-method-in-java-with-examples/

https://docs.oracle.com/javase/8/docs/api/java/util/Collection.html

**exceptions**
Techniques for Highlighting Errors
•System.out.println()
•Create a log file that keeps track of every important event/operation inside your code (including errors).
•Return a value that indicates an error
•System.exit(): halt execution of your program
None of these techniques allows a program to robustly take corrective action

•Only create a new exception if there isn’t already one that does the job
•Extend an existing class
•Often Exception or RuntimeException
•Implement the constructors


**abstraction**
In the abstract superclass:
•Provide as many method implementations as possible
•These implementations may call abstract methods
•The methods will ultimately be implemented by the child classes (or grandchildren, etc).
•It is these concrete classes that ensure all methods are implemented
•An interface defines no implementation – only a set of abstract methods
https://www.javatpoint.com/difference-between-abstract-class-and-interface
Abstract Classes and Interfaces
 Similarities:
•Have missing methods that must be implemented by the child/implementing 
classes
•Cannot be instantiated
•Can be used as reference types
Differences:
•Interfaces have no constructors
•Interfaces can only define public static and final variables
•A class can implement multiple interfaces
•Abstract classes can implement some methods 

Best practices:
•Use interfaces when you can 
•Use inheritance when you are adding new functionality to a class that already implements some functionality
•Inheritance: “is-a” relationship
•Interface: can be “is-a” or “does-a”

**generics**
•T is the variable type that is assigned when we use the class
•Within the class definition, we can “pretend” that it is a real type (parameters,variable declarations and return types)

Generic type symbols are arbitrary, but we tend to use a few:
•E - Element (used extensively by the Java Collections Framework)
•K - Key
•N - Number
•T - Type
•V – Value

•Primitive types cannot be used as generic types
•Must use the wrapper classes

•instanceof() cannot distinguish same class with different generic type, because it is done at run time
•ArrayList<Integer> and ArrayList<String> are the same type according to instanceof
•Exception classes cannot be generic
•Static data cannot be of a generic type
  
**Collections**
Collection Interface
What is a collection?
•“Bag” (or “pile”) of objects (no ordering)
What does the Collection interface provide?
•add()
•remove()
•contains()
•Iterator: a means of iterating over all objects in the collection
  
use LinkedList when random access not needed and insertion/deletion at the head and tail more common than search or specific index
  https://docs.oracle.com/javase/7/docs/api/java/util/LinkedList.html
  
Iterator<E>
•hasNext(): is there another item in the collection that hasn’t been “touched”
•next(): return the next item
  https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Iterator.html
  
Queue: “First-In-First-Out”
•add()
•remove()
•isEmpty()
  https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Queue.html
  
•Standard Queue: order by insertion order
•Priority Queue: order by some ordering 
•Natural order or defined by a Comparator
  
Stack
•Last in First out (LIFO)
•Add (push) and remove (pop) items to/from the top of the stack
  https://docs.oracle.com/javase/10/docs/api/java/util/Stack.html
 
Sets
•Sets are used when order isn’t important
  https://docs.oracle.com/javase/8/docs/api/java/util/Set.html
  
•TreeSet uses a natural ordering (Comparable)
https://docs.oracle.com/javase/7/docs/api/java/util/TreeSet.html
  
Map
  https://docs.oracle.com/javase/8/docs/api/java/util/Map.html
  Stores <key, value> pairs
•Key used to organize data (no duplicates)
•Keys form a proper Set
•Value is the data itself (duplicates allowed)
