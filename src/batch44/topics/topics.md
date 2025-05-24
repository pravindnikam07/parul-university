
# DSA impact training Parul 2025

## Java Fundamentals
	- Java History => in 1995, James Gosling and initial named is Oak.
	- Java Feature => Portable/platform independent, OOP supported, Robust, Simple, Secure.
	- Java Editions => JSE/J2SE, JEE/J2EE, JME/J2ME
	- JDK archetecture => 
		- JDK => JRE + Developer tools
		- JRE => JVM + System library
		- JVM => JIT compiler, Java Interpreter
	- Execution flow of Java program => source file (.java extension) =(compile)=> Byte code (.class) =(m/c code by JIT compiler)=> JVM
	- IDENTIFIERS
		- Literals 
		- variables
		- Naming convention
				- PascalCase => Class, Interface, Abstract class, etc.
				- camelCase => Variable, methods/functions
				- ENUM
	- Operators
		- Mathematical => + - * / % ++ --
		- Assignment => = += -+ *= /+ %=
		- Relational => > < >= <= !=
		- Logical => && || !
		- Bitwise => & | << >> ~ ^
		- Conditional statements
			- if
			- if else
			- else if
			- ternary ?
			- switch
		- instanceof
	- Loops
		- for => syntax - for(initialization; condition; increment/decrement){body}
		- while => syntax - initialization; while(condition) {body; increment/decrement}
		- do while syntax - initialization; do{body; increment/decrement} while(condition);
		- for each/ for of syntax - for(data_type variable : source_data) {body}
	- Transfer statements
		- break
		- continue
		- return

## Pattern printing
	- Solid square pattern
	- L pattern
	- Reverse L pattern
	- Hollow square pattern
	- Triangle pattern

## Arrays
	- 1D arrays
		- syntax => data_type[] variable_name = new data_type[size];
		- syntax => data_type variable_name[] = new data_type[size];
		- Creating the collection of homogeneous elements 
		- creating the collection of heterogeneous element => using Object class
		- Accessing the elements in array bracket notation
		- Updating the element in array
		- Iterating over the array
			- for 
			- while
			- for each/for of
		- Problem
			- Finding the sum of all elements
			- Finding the product of all elements
			- printing the odd/even index elements
			- Two sum problem
	- 2D array
		- syntax => data_type[][] variable_name = new data_type[row_size][col_size];
		- syntax => data_type variable_name[][] = new data_type[row_size][col_size];
		- Creating the collection of homogeneous elements 
		- creating the collection of heterogeneous element => using Object class
		- Accessing the elements in array bracket notation
		- Updating the element in array
		- Iterating over the array
			- for 
			- while
			- for each/for of
		- Problem statement
			- Finding the sum of all elements
			- Finding the product of all elements
			- printing the element column wise

## String
	- Creation of string
		- syntax 
			- using String literal => String variable_name = "";
			- Using new keyword => String variable_name = new String("");
	- String immutability
	- Comparisn of two string using  == operator and equals method
	- SCP area
	- Accessing the character in string using charAt() method
	- Iterating over the String
			- for 
			- while
			- for each/for of
	- Method
		- charAt() => to access the character at particular index
		- length() => to get the length of your string
		- toCharArray() => to convert string into char array
		- equals() => to check equality
		- toString()
		- toUpperCase()
		- toLowerCase()
		- compareTo
	- Problems
		- check Palindrom
		- Anagram
		- generating all substring of a string
		- finding longest palindromic substring
		
## StringBuffer and StringBuilder
	- Comparison of String, StringBuffer and StringBuilder
	- Creating a mutable string using StringBuffer and operation on the created object
		- syntax => StringBuffer variable = new StringBuffer();
	- Methods
		- append()
		- replace()
		- insert()
		- delete()
		- length()
		- indexOf()
		- hashCode()
	- Creating a mutable string using StringBuilder and operation on the created object
		- syntax => StringBuilder variable = new StringBuilder();
	- Methods
		- append()
		- replace()
		- insert()
		- delete()
		- length()
		- indexOf()
		- hashCode()

## Functions and Recursion
	- Factorial
	- Fibunacchi 

## Complexity analysis
	- O(1)
	- O(lon(n))
	- O(n)
	- O(n * log(n))
	- O(n^2)
	- O(n^3)
	- O(a^n)
	- O(n!)


## Exception handling
	- Runtime exception (unchecked exception) => the class which are child of RuntimeException class or RuntimeException class itself.
	- Compile time exception (check exception) => the class which are direct child of Exception class or Exception class itself except RuntimeException class.
	- try{}
	- try{} catch(){}
	- try{} catch(){} finally{}
	- try(){} catch(){}
	- throw, throws


## LinkedList
	- Node
	- Creating our own LinkedList
		- print()
		- insert()
		- deleteFirst()
		- deleteLast()
		- reverse()
	- Problem
		- Traverse LinkedList
		- Deleting the node (last, first, middle)
		- insert a node
		- printing LinkedList
		- Reverse LinkedList
		
		
## Stack
	- It is linear data structure which follow LIFO (Last In First Out) principle
	- Creating our own stack
	- Operation
		- push operation => adding the element at the top of the stack
		- pop operation => removing and returning the element from the top
		- peek operation => returning the element from the top
	- Methods
		- push()
		- pop()
		- peek()
		- size()
		- isEmpty()
		- isFull()
	- Stack class of collection
		- syntax => Stack<T> variable_name = new Stack<>();
		- Method
			- add()
			- push()
			- pop()
			- remove()
			- peek()
			- size()
	- We can also implement stack using dequeue interface implement classes => ArraysDeque, LinkedList
	- ArraysDeque, LinkedList
		- syntax => LinkedList<T> variable_name = new LinkedList<>();
				=> ArrayDeque<T> variable_name = new ArrayDeque<>();
		- Methods
			- addLast()
			- removeLast()
			- pollLast()
			- peekLast()
			- size()
	- Problem
		- Valid parentheses

## Queue
	- It is linear data structure which follows FIFO (First In First Out) principle
	- Creating our own queue
	- Operation
		- enqueue => at last
		- dequeue => remove element from the front of the queue
		- peek => from front
	- We can also implement stack using dequeue interface implement classes => ArraysDeque, LinkedList
	- ArraysDeque, LinkedList
		- syntax => LinkedList<T> variable_name = new LinkedList<>();
				=> ArrayDeque<T> variable_name = new ArrayDeque<>();
		- Methods
			- addLast()
			- removeFirst()
			- pollFirst()
			- peekFirst()
			- size()
		
		
## Tree and Graph
	- BFS
		- Level order traversal
	- DFS 
		- Pre-order traversal
		- In-order traversal
		- Post-order traversal
		
		
		
		
		
		