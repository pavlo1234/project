package project.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import project.domain.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
