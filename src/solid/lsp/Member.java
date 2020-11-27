package solid.lsp;

import java.util.Date;

public class Member{
	protected String name;
	protected String type;
	protected Date memberShipStartDate;
	protected Date memberShipEndDate;

	public Member(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Date getMemberShipStartDate() {
		return memberShipStartDate;
	}

	public void setMemberShipStartDate(Date memberShipStartDate) {
		this.memberShipStartDate = memberShipStartDate;
	}

	public Date getMemberShipEndDate() {
		return memberShipEndDate;
	}

	public void setMemberShipEndDate(Date memberShipEndDate) {
		this.memberShipEndDate = memberShipEndDate;
	}
}
