package project.domain;

import java.util.List;

public class Faculty {

	private Integer id;
	private String name;
	private int maxStudentCount;
	private List<Subject> requiredSubjects;

	public Faculty() {
		
	}

	public Faculty(String name, int maxStudentCount, List<Subject> requiredSubjects) {
		this.name = name;
		this.maxStudentCount = maxStudentCount;
		this.requiredSubjects = requiredSubjects;
	}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getMaxStudentCount() {
		return maxStudentCount;
	}

	public List<Subject> getRequiredSubjects() {
		return requiredSubjects;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setMaxStudentCount(int maxStudentCount) {
		this.maxStudentCount = maxStudentCount;
	}

	public void setRequiredSubjects(List<Subject> requiredSubjects) {
		this.requiredSubjects = requiredSubjects;
	}

}
