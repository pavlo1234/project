package project.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import project.domain.Rating;

public interface RatingRepository extends JpaRepository<Rating, Integer> {

}