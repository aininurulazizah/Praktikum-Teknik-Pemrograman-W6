/**
 * @author Aini Nurul Azizah
 * @since 2022-03-19
 * Program Specialist
 * Sebagai Child Class dari Class Division
 * Division 'has a' Specialist
 */

public class Specialist {
	private String name;
	private String id;
	private String division;
	
	/**
	 * Constructor
	 * @param name
	 * @param id
	 * @param division
	 */
	public Specialist(String name, String id, String division) {
		this.name = name;
		this.id = id;
		this.division = division;
	}
	
	/**
	 * Getter atribut
	 */
	public String getName() {
		return this.name;
	}
	public String getId() {
		return this.id;
	}
	public String getDivision() {
		return this.division;
	}
}

