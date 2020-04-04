package project.domain;

import javax.persistence.*;

@Entity
@Table(name = "rating")
public class Rating {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	@Column(name = "user_id")
	private Integer userId;

	@Column(name = "faculty_id")
	private Integer facultyId;

	@Column(name = "sum_marks")
	private int sumMarks;

	public Rating() {

	}

	public Rating(Integer userId, Integer facultyId, int sumMarks) {
		this.userId = userId;
		this.facultyId = facultyId;
		this.sumMarks = sumMarks;
	}

	public Integer getId() {
		return id;
	}

	public Integer getUserId() {
		return userId;
	}

	public Integer getFacultyId() {
		return facultyId;
	}

	public int getSumMarks() {
		return sumMarks;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public void setFacultyId(Integer facultyId) {
		this.facultyId = facultyId;
	}

	public void setSumMarks(int sumMarks) {
		this.sumMarks = sumMarks;
	}

}
