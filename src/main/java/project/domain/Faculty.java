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

	public Faculty(String name, int maxStudentCount, int passingScore, List<Subject> requiredSubjects) {
		this.name = name;
		this.maxStudentCount = maxStudentCount;
		this.requiredSubjects = requiredSubjects;
		this.passingScore = passingScore;
	}
	
	

	public Faculty(String name, int maxStudentCount, int passingScore) {
		super();
		this.name = name;
		this.maxStudentCount = maxStudentCount;
		this.passingScore = passingScore;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + maxStudentCount;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + passingScore;
		result = prime * result + ((requiredSubjects == null) ? 0 : requiredSubjects.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Faculty other = (Faculty) obj;
		if (maxStudentCount != other.maxStudentCount)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (passingScore != other.passingScore)
			return false;
		if (requiredSubjects == null) {
			if (other.requiredSubjects != null)
				return false;
		} else if (!requiredSubjects.equals(other.requiredSubjects))
			return false;
		return true;
	}
	
	

}
