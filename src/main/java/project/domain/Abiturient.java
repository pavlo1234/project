package project.domain;

public class Abiturient {
	private Integer id;
	private Integer userId;
	private Integer facultyId;
	private int sumMarks;

	public Abiturient() {

	}

	public Abiturient(Integer userId, Integer facultyId, int sumMarks) {
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
