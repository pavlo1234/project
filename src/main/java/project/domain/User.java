package project.domain;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	@Column
	private String username;

	@Column
	private String email;

	@Column
	private String password;

	@Enumerated(EnumType.STRING)
	private UserRole role;

	@OneToOne(cascade = CascadeType.ALL)
	private PhotoUser photoUser;

	public User() {

	}

	public User(User user) {
		this.username = user.username;
		this.email = user.email;
		this.password = user.password;
		this.role = user.role;
	}

	public User(String username, String email, String password, UserRole role) {
		this.username = username;
		this.email = email;
		this.password = password;
		this.role = role;
	}

	public Integer getId() {
		return id;
	}

	public String getUsername() {
		return username;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public UserRole getRole() {
		return role;
	}

	public PhotoUser getPhotoUser() {
		return photoUser;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setRole(UserRole role) {
		this.role = role;
	}

	public void setPhotoUser(PhotoUser photoUser) {
		this.photoUser = photoUser;
	}

}
