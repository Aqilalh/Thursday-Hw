knowYourVariables {
Theres two types of Variables Primitive and reference.
Theres mutiple ways you can use variables by object state (instance variables)
local variables(variables delcared within a method and variables as arguments,
Java cares about the type so theres certain things that you can and can not do.
Primitives hold fundamental values including integers and floating point numbers.
Theres certain things a variable need it nust have a type and a name.
A variable is container that hold something.
Primative comes in different sizes long>int>short>byte
An object reference variables holds bits that represent a way to acc an object
an object refrence variable is full of bits representing a way to get to the object
example- myDog.bark();
An object refrence is just another variable value.
An array are also an objects no matter if its declared to hold primitives or 
object refrerences.
}
howObjectsBehave {
A class is a blueprint for an object it describes what an object knows and what an object does.
You can pass arguments inside your methods.
An argument lands face down into a parameter which is a local variable.
If a method takes a parmeter you must pass it something.
A method cann also return values.
Every method is declared with a return type except methods with a void return type.
If you declare a method to return a value you must return a value of the delcared type.
Methods can have mutiple parameters but you must pass arguments of the right tpe and order
You can pass variables into a method as long as the variable type matches the parameter type
Encapsulation
1st rule if you make your instance variable private than your setters and getter need to be public for access control
Instance variables are delcared inside a class but not within a method
Local variable are declared within a method and they must be initialized before use.
To compare two primitives and to see if two references are the same use the == operator

}
seriousPolymorphism 
An abstract class means that nobody can ever make a new instance of that class.
In an abstract class the guys doing the work at runtime are instances of a subclass of your abstarct class
A class thats not an abstarct is called a concrete class.
An abstarct class means the class must be extended
while an abstarct method means the method must be overridden
An abstarct method has nobody
If you declare an abstarct method, you must mark the class abstarct as well.
The first concrete class in the inheritance tree must implement all abstarct methods.
Any class that doesn't explicitly extened another class, implicitly extends objects.
An object contains everything it inherits from eaach of its superclassess.
Polymorphism means many forms
you can use an instanceof operator to check if your wrong when you do a cast
You can class a method on an object only if the class of the refrence variable has that method
To expose a method means you make a method accesible, usually by marking it public
The compiler checks the class of the refrence variable, not the class of the actual object at the other end of the reference.
AN interface solves your mutiple inheritance problem by giving you much of the polymorphic benifts of mutiple inheritance.
Classes from different inheritance trees can implement the same interface.
when you use a class as a polymorphic type the objects you can stick in that type must be from the same inheritance tree
when you use an interface as a polymorphic type the objects can be from anywhere in the inheritance tree

}
lifeAndDeathOfAnObject {
    
The stack is where the method invocations and local variables live
The Heap is where all objects live.
when you call a method the methods lands on top tof the call stack
A method stays on the stack until the method hits its closing curly brace.
If the local variable is a refrence to an object only the variable goes on the stack
A constructor is the code that runs when you instantiate an object
The only way to invoke a contructor is with the keyword new
The key feauture of a contructor is that it runs before the object can be assigned to a refrence.
The best place to put initialzation code is in the constructor
If you have more than one constructor in a class, the construcor must have different agrument lists
An overloaded constructors means you have more than one constructor in your class.
A constructor is the code that runs when somebody says new on a class type
All the constructors in an objects inheritance tree must run when you make a new object
Saying new starts a whole constructor chain rwaction.
An abstract class also have constructors
All instance variables from every class in the inheritance tree have to be declared and initialized
A call to super() in your constructor puts the superclass constroctor on the top of the stack.
this() is a refrence to the current object
every constructor can have a class to super() or this() but never both
An object life depends entirely on the life of references referring to it.
life - a local variable is alive as long as its stack frame is on the stack.
Scope - a local variable is in scope only within the method in which the variable was declared.
An object is alive as long as there are live references to it.
If a reference variable goes out of scope but is still alive, the object it refers to is still alive on the heap
An object life has no value,no meaning, no point, unless somebody has a reference to it.
