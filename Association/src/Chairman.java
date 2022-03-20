/**
 * @author Aini Nurul Azizah
 * @since 2022-03-19
 * Program Chairman
 */

import java.util.List;

public class Chairman {
	private String name;
	List<Member> members;
	
	public Chairman(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public List<Member> getMember(){
		return members;
	}
	
	public void setMember(List<Member> members) {
		this.members = members;
	}
}

