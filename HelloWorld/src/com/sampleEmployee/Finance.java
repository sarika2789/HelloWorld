package com.sampleEmployee;

public class Finance extends Dept {
	int memberid;

	 public int getMemberid() {
		return memberid;
	}

	public void setMemberid(int memberid) {
		this.memberid = memberid;
	}

	void calculateFinance(int sal,int bon) {
		double netResult = sal + bon;
		System.out.println(netResult);
	}

	public static void main(String[] args) {
		Finance f = new Finance();
		f.setSalary(450);
		f.setBonus(56);
		f.calculateFinance(f.getBonus(),f.getSalary());
		f.msg();

	}

}