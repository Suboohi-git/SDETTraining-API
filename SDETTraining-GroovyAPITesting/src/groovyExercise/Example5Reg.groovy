package groovyExercise

import static org.junit.jupiter.api.Assertions.*

import org.junit.jupiter.api.Test

class Example5Reg {

	public static void main(String[] args) {
		// Defines a string with special signs
		def text = "John Jimbo jingeled happily ever after"

		// Every word must be followed by a non-word character
		// Match
		if (text==~/(\w*\W+)*/) {
			println "Match was successful"
		} else {
			println "Match was not successful"
		}

		// Every word must be followed by a non-word character
		// Find
		if (text=~/(\w*\W+)*/) {
			println "Find was successful"
		} else {
			println "Find was not successful"
		}
		
		//Find words starting with "J"
		if (text==~/^J.*/ ) {
			println "There was a match"
		} else {
			println "No match found"
		}
		
		//Replace all words with "hubba"
		def newText = text.replaceAll(/\w+/, "hubba")
		println newText
	}
}