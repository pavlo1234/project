package project;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import project.dao.AbiturientRepository;
import project.dao.RatingRepository;
import project.dao.UserRepository;
import project.domain.Abiturient;
import project.domain.Rating;
import project.domain.User;
import project.domain.UserRole;
import project.service.AbiturientService;
import project.service.RatingService;
import project.service.UserService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProjectApplicationTests {
	
	@Autowired
	private UserRepository userRep;
	
	@Autowired
	private UserService userServ;
	
	@Autowired
	private AbiturientRepository abiturientRep;
	
	@Autowired
	private AbiturientService abiturientServ;
	
	@Autowired
	private RatingRepository ratingRep;
	
	@Autowired
	private RatingService ratingServ;

	@Test
	public void testSaveUser() {
		User user = new User("user", "user@gmail.com", "password", UserRole.ROLE_ABITURIENT);
		int l = userRep.findAll().size();
		userServ.save(user);
		assertTrue(userRep.findAll().size() - l == 1);
	}
	
	@Test
	public void testSaveAbiturient() {
		Abiturient abiturient = new Abiturient("user", 1, 12, 12);
		abiturientServ.save(abiturient);
		List<Abiturient> abiturients = abiturientRep.findAll();
		assertTrue(abiturients.contains(abiturient));
	}
	
	@Test
	public void testAbiturientFindById() {
		Abiturient abiturient = new Abiturient("user", 1, 12, 12);
		assertTrue(abiturientServ.findById(2).equals(abiturient));
	}
	
	@Test
	public void testSaveRating() {
		Rating rating = new Rating("rating", 1, 12, 12);
		ratingServ.save(rating);
		List<Rating> ratings = ratingRep.findAll();
		assertTrue(ratings.contains(rating));
	}
	
	

}
