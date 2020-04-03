package project.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import project.domain.Subject;

public interface SubjectRepository extends JpaRepository<Subject, Integer> {

}