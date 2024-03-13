package com.StudentPojo;

public class StudPojo {

	private int id;
	private String name;
	private int rollno;
	private String department;
	private int firstSubject;
	private int secontSubject;
	private int thirdSubject;
	private int fourthSubject;
//	private float average;
//	private char grade;
//	private Integer[] marks;

	public StudPojo() {

	}

	public StudPojo(int id, String name, int rollno, String department, int firstSubject, int secontSubject,
			int thirdSubject, int fourthSubject) {
		super();
		this.id = id;
		this.name = name;
		this.rollno = rollno;
		this.department = department;
		this.firstSubject = firstSubject;
		this.secontSubject = secontSubject;
		this.thirdSubject = thirdSubject;
		this.fourthSubject = fourthSubject;
	}

//	All Getter and Setter

	public int getFirstSubject() {
		return firstSubject;
	}

	public void setFirstSubject(int firstSubject) {
		this.firstSubject = firstSubject;
	}

	public int getSecontSubject() {
		return secontSubject;
	}

	public void setSecontSubject(int secontSubject) {
		this.secontSubject = secontSubject;
	}

	public int getThirdSubject() {
		return thirdSubject;
	}

	public void setThirdSubject(int thirdSubject) {
		this.thirdSubject = thirdSubject;
	}

	public int getFourthSubject() {
		return fourthSubject;
	}

	public void setFourthSubject(int fourthSubject) {
		this.fourthSubject = fourthSubject;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

//	public float getAverage() {
//		return average;
//	}
//
//	public void setAverage(float average) {
//		this.average = average;
//	}
//
//	public char getGrade() {
//		return grade;
//	}
//
//	public void setGrade(char grade) {
//		this.grade = grade;
//	}

//	public Integer[] getMarks() {
//		return marks;
//	}
//
//	public void setMarks(Integer[] marks) {
//		this.marks = marks;
//	}

}
