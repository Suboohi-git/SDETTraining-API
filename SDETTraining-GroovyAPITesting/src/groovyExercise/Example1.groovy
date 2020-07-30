package groovyExercise

import static org.junit.jupiter.api.Assertions.*

import org.junit.jupiter.api.Test


class Example1 {
	static void main(String[] args) {
		Student st = new Student();
		st.StudentID = 1;

		st.Marks1 = 10;
		st.name = "Joe";

		println(st.name);
		
		def a = 2
		
				//Check for the boolean condition
				if (a<100) {
					println("The value is less than 100");
				}
	
				
				//Check for the boolean condition
				if (a<100) {
					println("The value is less than 100");
				} else {
					println("The value is greater than 100");
				}
				
			
				//Evaluating the expression value
				switch(a) {
					case 1:
					println("The value of a is One");
					break;
					case 2:
					println("The value of a is Two");
					break;
					case 3:
					println("The value of a is Three");
					break;
					default:
					println("The value is unknown");
					break;
				}
		
				
		
				def birdArr = ["Parrot", "Cockatiel", "Pigeon"]
				println birdArr
	}
}

class Person {
	public String name;
	public Person() {}
}

class Student extends Person {
	int StudentID
	int Marks1;

	public Student() {
		super();
	}
}
