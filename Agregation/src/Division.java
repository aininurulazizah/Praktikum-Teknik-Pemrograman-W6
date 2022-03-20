/**
 * @author Aini Nurul Azizah
 * @since 2022-03-19
 * Program Divison
 * Sebagai Child Class dari Class Hospital
 * dan Parent Class dari Class Specialist
 * Hospital 'has a' division
 * Division 'has a' Specialist
 */

import java.util.List;

public class Division {
	private String divName;
	private String code_div;
	private List<Specialist> specialist;
	
	/**
	 * Constructor
	 * @param name
	 * @param code_div
	 * @param specialist
	 */
	public Division(String name, String code_div, List<Specialist> specialist) {
		this.divName = name;
		this.code_div = code_div;
		this.specialist = specialist;
	}
	
	/**
	 * Getter for Specialist
	 */
	public List<Specialist> getSpecialist(){
		return specialist;
	}
	
	/**
	 * Public method that shows what division is the object
	 */
	public void whatDivision() {
		System.out.println("\n*** " + this.divName + " Division ***");
	}
}

