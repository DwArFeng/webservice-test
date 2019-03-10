package com.dwarfeng.test.webservice.server.struct;

public class Student {

	public static Student STUDENT_DwArFeng = new Student("丰沛", Gender.MALE, new Date(1992, 12, 18));

	private String name;
	private Gender gender;
	private Date birthDay;

	public Student() {
	}

	public Student(String name, Gender gender, Date birthDay) {
		this.name = name;
		this.gender = gender;
		this.birthDay = birthDay;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public Date getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(Date birthDay) {
		this.birthDay = birthDay;
	}

}
