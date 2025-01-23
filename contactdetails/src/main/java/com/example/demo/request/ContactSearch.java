package com.example.demo.request;

public class ContactSearch {
 private boolean isName;
 private boolean slno;
    private int slNo;
	private String name;
	private long number;
	public boolean isName() {
		return isName;
	}
	public void setName(boolean isName) {
		this.isName = isName;
	}
	public boolean isSlno() {
		return slno;
	}
	public void setSlno(boolean slno) {
		this.slno = slno;
	}
	public int getSlNo() {
		return slNo;
	}
	public void setSlNo(int slNo) {
		this.slNo = slNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getNumber() {
		return number;
	}
	public void setNumber(long number) {
		this.number = number;
	}

}
