package project.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import project.domain.Abiturient;

public interface AbiturientRepository extends JpaRepository<Abiturient, Integer> {

}
