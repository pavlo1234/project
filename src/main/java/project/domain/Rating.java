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

}
