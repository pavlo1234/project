package project.domain;

import javax.persistence.*;

@Entity
@Table(name = "rating")
public class Rating {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	@Column(name = "username")
	private String username;

	@Column(name = "faculty_id")
	private Integer facultyId;

	@Column(name = "sum_marks")
	private int sumMarks;
	
	@Column(name = "passing_score")
	private int passingScore;

	public Rating() {

	}

	public Rating(String username, Integer facultyId, int sumMarks, int passingScore) {
		this.username = username;
		this.facultyId = facultyId;
		this.sumMarks = sumMarks;
		this.passingScore = passingScore;
	}

	public Integer getId() {
		return id;
	}

	public String getUsername() {
		return username;
	}

	public Integer getFacultyId() {
		return facultyId;
	}

	public int getSumMarks() {
		return sumMarks;
	}

	public int getPassingScore() {
		return passingScore;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setFacultyId(Integer facultyId) {
		this.facultyId = facultyId;
	}

	public void setSumMarks(int sumMarks) {
		this.sumMarks = sumMarks;
	}
	
	public void setPassingScore(int passingScore) {
		this.passingScore = passingScore;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((facultyId == null) ? 0 : facultyId.hashCode());
		result = prime * result + passingScore;
		result = prime * result + sumMarks;
		result = prime * result + ((username == null) ? 0 : username.hashCode());
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
		Rating other = (Rating) obj;
		if (facultyId == null) {
			if (other.facultyId != null)
				return false;
		} else if (!facultyId.equals(other.facultyId))
			return false;
		if (passingScore != other.passingScore)
			return false;
		if (sumMarks != other.sumMarks)
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}

	
	

}
