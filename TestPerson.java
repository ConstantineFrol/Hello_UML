package Week1_Q3;

/**
 * @author 		Konstantin Frolov
 * Student ID 	R00144177
 * Email		konstantin.frolov@mycit.ie
 * GitHub		https://github.com/ConstantineFrol/repositories
 */
public class TestPerson {

	public static void main(String[] args) {
		// Creating an object of the class Person
		Person myGeneralPractitioner = new Person();
		
		// Creating an object of the class Person and passing parameters to the constructor
		Person olympicJumper = new Person("JACKIE JOYNER", " 618-274-5437", 2);
		
		// Using setters to set attributes in class Person with my values
		myGeneralPractitioner.setName("Looney Dr Seamus");
		
		myGeneralPractitioner.setPhone("(021)4362898");
		
		myGeneralPractitioner.setStars(4);
		
		// Calling method toString to see the values of attributes in class Person
		System.out.println("My GP details:\n" + myGeneralPractitioner.toString());
		
		// Calling methods From class Person
		myGeneralPractitioner.jump();
		
		System.out.println("How many times?");
		
		myGeneralPractitioner.jump(5);
		
		System.out.println("\n\nOlympic winner:");
		
		// Calling methods from class Person using Different Object to see the values that Object [olympicJumper] is holding
		olympicJumper.print();
		
		olympicJumper.jump();
		
		olympicJumper.jump(100);
		
	}

}
