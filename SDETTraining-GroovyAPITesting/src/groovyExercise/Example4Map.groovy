package groovyExercise

import static org.junit.jupiter.api.Assertions.*

import org.junit.jupiter.api.Test

class Example4Map {

	static void main(String[] args) {
		def mp = [
		  "TopicName" : "Maps",
		  "TopicDescription" : "Methods in Maps"
		]

		//get()
		println(mp.get("TopicName"))
		println(mp.get("Topic"))

		//put()
		mp.put("TopicID","1");
		println(mp);

		//values()
		println(mp.values());

		//keySet()
		println(mp.keySet())

		//size()
		println(mp.size())
	}
}