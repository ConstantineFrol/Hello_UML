package Week1_Q3;

/**
 * @author 		Konstantin Frolov
 * Student ID 	R00144177
 * Email		konstantin.frolov@mycit.ie
 * GitHub		https://github.com/ConstantineFrol/repositories
 */
public class Person {

	// initialize variables
	private int 	stars;
	private String 	phone;
	private String 	name;

	// constructors
	public Person(String name, String phone, int stars)
	{	
		setName(name);
		setPhone(phone);
		setStars(stars);
	}

	public Person() 
	{
		
	}

	// Methods
	public void jump()
	{
		System.out.println("I jumped");
	}

	public void jump(int numJumps)
	{
		System.out.println("I jumped " + numJumps + " times");
	}

	public String toString()
	{
		return "Person name is: " + getName() + "\nPhone number is: " + getPhone() + "\nStars value is: " + getStars();
	}

	public void print()
	{
		System.out.println(toString());
	}
	
	// Setters and Getters
	public int getStars() {
		return stars;
	}

	public void setStars(int stars) {
		this.stars = stars;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
