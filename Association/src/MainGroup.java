/**
 * @author Aini Nurul Azizah
 * @since 2022-03-19
 * Program Member
 */

import java.util.ArrayList;
import java.util.List;

public class MainGroup {

	public static void main(String[] args) {
		Chairman chairman = new Chairman("Aini");
		
		Member member1 = new Member("Nurul");
		Member member2 = new Member("Azizah");
		
		List<Member> memberList = new ArrayList<Member>();
		memberList.add(member1);
		memberList.add(member2);
		
		chairman.setMember(memberList);
		
		for(Member m : chairman.getMember()) {	
			System.out.println(m.getName() + " adalah anggota yang diketuai oleh " + chairman.getName());
		}
	}

}

