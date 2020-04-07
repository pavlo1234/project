package project.dto;

public class RatingDto {
	private int id;
	private String username;
	private String facultyName;

	public RatingDto(String username, String facultyName) {
		this.username = username;
		this.facultyName = facultyName;
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

	public void setId(int id) {
		this.id = id;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setFacultyName(String facultyName) {
		this.facultyName = facultyName;
	}

}
