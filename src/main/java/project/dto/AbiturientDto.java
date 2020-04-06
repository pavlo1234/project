package project.dto;

public class AbiturientDto {
	private int id;
	private String username;
	private String facultyName;
	private int sumMarks;

	public AbiturientDto(int id, String username, String facultyName, int sumMarks) {
		this.id = id;
		this.username = username;
		this.facultyName = facultyName;
		this.sumMarks = sumMarks;
	}

	public int getId() {
		return id;
	}

	public String getUsername() {
		return username;
	}

	public String getFacultyName() {
		return facultyName;
	}

	public int getSumMarks() {
		return sumMarks;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setFacultyName(String facultyName) {
		this.facultyName = facultyName;
	}

	public void setSumMarks(int sumMarks) {
		this.sumMarks = sumMarks;
	}

}
