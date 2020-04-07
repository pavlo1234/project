package project.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import project.domain.PhotoUser;

@Repository
public interface PhotoUserRepository extends JpaRepository<PhotoUser, String> {

}
