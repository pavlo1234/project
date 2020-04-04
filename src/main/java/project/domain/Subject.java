package project.domain;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="subject")
public class Subject {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column
	private String name;
	
	@ManyToMany
	@JoinColumn(name="subject_id")
	private List<Faculty> faculties;

	public Subject() {

	}

	public Subject(String name, List<Faculty> faculties) {
		this.name = name;
		this.faculties = faculties;
	}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	public List<Faculty> getFaculties() {
		return faculties;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void setFaculties(List<Faculty> faculties) {
		this.faculties = faculties;
	}

}
