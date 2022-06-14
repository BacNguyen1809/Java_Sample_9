# Java_Sample_9
Basic OOP Lab
Objectives:
Able to create Java-based applications that take advantage of Java object-oriented features, including encapsulation, inheritance, and polymorphism.
Problem Descriptions:
This exercise will be developed from JPL.S.L201 and adding an Actionable interface, an EnglishTeacher class.

Create a new package named fa.training.entities in JPL.S.L202 project that contains:

The Teacher abstract class:

Instance variables:

designation: for teacher designation

collegeName: the college name that teacher do work

Constructor:

public Teacher(): A default constructor, it should initialize the attribute to null or 0 )

public Teacher (String designation, String collegeName): A constructor with parameters, it creates the teacher object by setting the two fields to the passed values

Instance methods:

Getter/Setter methods: are used to get/set the value

public void teach(String content){}

The MathTeacher class that extends Teacher:

Instance variables:

mainSubject: the main subject

Constructor:

public MathTeacher(): A default constructor, it should initialize the attribute to null or 0 )

public MathTeacher (String designation, String collegeName, String mainSubject): A constructor with parameters, it creates the teacher object by setting the three fields to the passed values.

Instance methods:

Getter/Setter methods: are used to get/set the value

public void teach(String content){}: override the parent’s method

public String toString(): This method allows the math teacher to be easily printed out to the screen

Create a new interface named Actionable inside package fa.training.entities, this interface contains an abstract method named toSchool(), Teacher class would implement the interface and override toSchool() method.

Create EnglishTeacher class inside fa.training.entities package, this class also extend above Teacher and implement Actionable.  Add a new method teach(int duration) in Teacher class

Create package fa.training.management that contains TeacherManagement class:

Create some objects of MathTeacher and EnglishTeacher.

Call methods of the class and explains the result.

Functional Requirements:
Explain about snippet code: (MathTeacher) teachers[i], (EnglishTeacher) teachers[i] at lines of code 27, 29, 36, 38 and 42.

Create some other objects Teacher from Actionable, call method and explains the results
