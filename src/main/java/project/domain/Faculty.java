package project.domain;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="faculty")
public class Faculty {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column
	private String name;
	
	@Column
	private int maxStudentCount;
	
	@Column
	private int passingScore;
	
	@ManyToMany
	@JoinColumn(name="faculty_id")
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
	
	public int getPassingScore() {
		return passingScore;
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
	
	public void setPassingScore(int passingScore) {
		this.passingScore = passingScore;
	}

	public void setMaxStudentCount(int maxStudentCount) {
		this.maxStudentCount = maxStudentCount;
	}

	public void setRequiredSubjects(List<Subject> requiredSubjects) {
		this.requiredSubjects = requiredSubjects;
	}

}
