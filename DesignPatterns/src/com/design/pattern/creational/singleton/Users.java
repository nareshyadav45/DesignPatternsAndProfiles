package com.design.pattern.creational.singleton;

import java.util.Objects;

public class Users {
	private int sno;
	private String name;
	private String classNum;
	private int rollNum;
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getClassNum() {
		return classNum;
	}
	public void setClassNum(String classNum) {
		this.classNum = classNum;
	}
	public int getRollNum() {
		return rollNum;
	}
	public void setRollNum(int rollNum) {
		this.rollNum = rollNum;
	}
	public Users(int sno, String name, String classNum, int rollNum) {
		super();
		this.sno = sno;
		this.name = name;
		this.classNum = classNum;
		this.rollNum = rollNum;
	}
	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public int hashCode() {
		return Objects.hash(classNum, name, rollNum, sno);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Users other = (Users) obj;
		return Objects.equals(classNum, other.classNum) && Objects.equals(name, other.name) && rollNum == other.rollNum
				&& sno == other.sno;
	}
	@Override
	public String toString() {
		return "Users [sno=" + sno + ", name=" + name + ", classNum=" + classNum + ", rollNum=" + rollNum + "]";
	}
	
	//When there is a superclass and super class have multiple sub classes and want to create objects of sub classes based on input or requiremnt is called factory design patterns 
//	In factory design pattern we have one class who's responsible to create a objects of sub classes based on input
//	note: factory class had a logic to create objects of child calsses based on input but allow the client create the objects of child classees	
	

}
