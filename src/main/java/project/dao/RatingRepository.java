package project.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import project.domain.Rating;


@Repository
public interface RatingRepository extends JpaRepository<Rating, Integer> {
	
	@Query(value="SELECT r FROM Rating r WHERE r.facultyId = ?1 AND r.sumMarks >= r.passingScore")
	List<Rating> findAllConfirmedByFacultyId(Integer facultyId);
	
}