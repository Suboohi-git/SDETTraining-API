package groovyExercise

import static org.junit.jupiter.api.Assertions.*

import org.junit.jupiter.api.Test

class Example2 {
	
	static void main(String[] args) {
		
		def birds = ["Parrot", "Cockatiel", "Pigeon"]
		
			println birds[0] // Parrot
			println birds[2] // Pigeon
			println birds.getAt(1) // Cockatiel
		
			println birds[-1] // Pigeon
			println birds[-3] // Parrot
			
			def numbers = [32, 44, 12, 9, 100, 180]
			
			println numbers.max() // 180
			println numbers.min() // 9
			
			//def birds = ["Parrot", "Cockatiel", "Pigeon"]
			
			println birds.max { it.size() } // Cockatiel
			println birds.min { it.size() } // Parrot
			
			//prints 0 to 4
			5.times {println "Times + $it "}
			//prints 1 to 3
			1.upto(3) {println "Up + $it "}
			//prints 4 to 1
			4.downto(1) {println "Down + $it "}
			
			//Sum of 100 numbers
			def sum = 0
			1.upto(100) {sum += it}
			println "Sum = " + sum
			
			def rint = 1..10
			
					//contains()
					println(rint.contains(2)) //true
					println(rint.contains(11)) //false
			
					//get()
					println(rint.get(4)) //5
					println(rint.get(9)) //10
			
					//getFrom and getTo()
					println(rint.getFrom()) //1
					println(rint.getTo()) //10
			
					//size()
					println(rint.size()) //10
		
	}


}
