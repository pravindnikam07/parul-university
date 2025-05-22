

### Impact training Parul May 2025


## Java Fundamentals
	- History of Java - 1995, Initial name is Oak, James Gosling
	- Java Edition - JSE/J2SE, JEE/J2EE, JME/J2ME
	- Flow of execution of Java program -> Source code (.java) -> Byte code (.class) -> byte code is getting executed by JVM
	- JDK architechture -> JRE + Dev tool
		- JRE -> JVM + Standard library
		- JVM -> JIT compiler, Java Interpreter.
	- Data type 
		- A. Primitive type
			- 1. Numeric type
				- Integer type
					- byte
					- short
					- int
					- long
				- floating type
					- float
					- double
			- 2. Non numeric type
				- boolean
				- char
		
		- B. Non primitive type or reference type
			- String, classes, Object, Array, Stack, Queue, LinkedList, etc	
	- Wrapper classes (java.lang.classname)
		- Byte -> byte => java.lang.Byte
		- Short -> short
		- Integer -> int
		- Long -> long
		- Float -> float
		- Double -> double
		- Boolean -> boolean
		- Character -> char
	- Operators
		- Mathematical Operators => + - / * % ++ --
		- Assignment operators => = += -+ /+ *= %=
		- Relational Operators => > < >= <= !=
		- Logical Operators =>  && (And)  || (Or)  ! (Not)
		- Bitwise Operators => & | << >> ~
		- Conditional statements
			- if
			- else
			- else if
			- ternary operator ?
		- instanceof
	- Naming convention in Java
		- PascalCase => Class, Interface, Abstract class
		- camelCase => variable, method name
		- ENUM
	- Variable
		- syntax => data_type variable_name = value; declaration and initialization
			data_type variable_name; // declaration
			variable_name = value; // initialization
		- Rule for variable name
			- shouldn't start with number or any special character except _ and $
			- shouldn't contain spaces in variable name
	- Iterative statements
		- for
		- while
		- do while
			- printing numbers from 1 to 100
			- printing odd/even numbers form 1 to 100
			- printing even number which are not divisible by 3
			- printing all prime numbers from 1 to 1000
			- printing all character a to z
	- Transfer statements
		- break
		- continue
		- return

## Pattern priniting
		- Solid square pattern
		- L pattern
		- reverse L pattern
		- Hollow square patter
		- Triangle pattern

## Arrays
	- Syntax => data_type varaible_name = new data_type[size];
	- creating different data type array and solving problem on Arrays
	- Accessing the element in array
	- Updating the elements in array
	- Iterating over the arrays
		- using for loop
		- using while loop
		- using for each loop
	- printing odd or even elements
	- printing odd or even index elements
	- finding the sum of all elements
	- finding the product of all elements
	- finding the sum of odd/even index elements
	- finding the sum of odd/even elements

## String
	- Syntax => 
		1. Using string literal
			String variable_name = "";
		2. Using new keyword
			String variable_name = new String(");
	- String comparisn using == and equals methods
	- String methods
		- length() => to get the length of string
		- charAt(index) => to get the character at specific index.
		- concat() => to cancatinate another string
		- equals() => to check the equality
		- contains() => to check if the character is present in the string or not
	- Iterating over the string
		- using for loop
		- using while loop
		- using for each loop
	- Printing the characters on odd or even index
	- Palindromic string
	- SubString
	- generating all substrings
	- longest palindromic substring


## Classes and Object
	- Class
	- object
		- syntax => class_name object_name = new class_name(); => Student students = new Student();
	- constructor
		- default constructor
		- parameterize constructor
	- methods/function/behavior
	- parameters/data members
	- toString => to change the default behavior of toString (in default behavior toString print the address but by overriding toString we can give our own implementation)
	- User defined class arrays. for ex) Student class array, Employee class Array, Bank class array.
	- Console based Bank application
	- POJO class 
	- private data members, private methods
	- public getter and setter methods
	- new keyword and memory representation

## Stack
	- Stack is a linear data structure which follows LIFO (Last In First Out) principal.
	- Operation in stack
		- push => adding the element into the stack at top.
		- pop => removing the element from the stack from top.
		- peek => returning the top element in the stack.
	- Methods in stack
		- push(data) => it will add the element at the top.
		- pop() => remove the element from the stack and return that element
		- peek() => return the top element.
		- isEmpty() => if your stack empty then it will return true otherwise false.
		- size() => return you the size of your stack
	- Stack underflow => when you are trying to pop the element when your stack is empty
	- Stack overflow => when you are trying to push the element when your stack is already full.


## Queue
	- Queue is a linear data structure which follows FIFO (First In First Out) principal
	- Operation 
		- enqueue => adding the element in the queue at last
		- dequeue => removing the element from the queue from front
		- peek => getting the element from the queue from the front




























	