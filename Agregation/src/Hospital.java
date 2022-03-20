/**
 * @author Aini Nurul Azizah
 * @since 2022-03-19
 * Program Hospital
 * Sebagai Parent Class dari Class Division
 * Hospital 'has a' division
 */

import java.util.List;

public class Hospital {
	private String hospitalName;
	private List<Division> division;

	/**
	 * Constructor Hospital
	 * @param name
	 * @param division
	 */
	public Hospital(String name, List<Division> division) {
		this.hospitalName = name;
		this.division = division;
	}
	
	/**
	 * Method menampilkan semua layanan rumah sakit
	 */
	public void printHospitalService() {
		List<Specialist> specialist;
		System.out.println("   ==============================");
		System.out.println("           " + this.hospitalName + "");
		System.out.println("   ==============================");
		System.out.println("\n Our Services :");
		for(Division div : division) {				//Perulangan Division
			div.whatDivision();
			specialist = div.getSpecialist();
			for(Specialist sp : specialist) {		//Perulangan Specialist
				System.out.println(" Doctor Specialist   : " + sp.getName());
			}
		}
	}
}

