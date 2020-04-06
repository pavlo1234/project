package project.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import project.domain.Abiturient;

@Repository
public interface AbiturientRepository extends JpaRepository<Abiturient, Integer> {

}
