package project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import project.dao.UserRepository;
import project.domain.User;
import project.domain.UserRole;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRep;
	
	@Autowired
    private PasswordEncoder bCryptPasswordEncoder;
	
	public void save(User user) {
		user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        user.setRole(UserRole.ABITURIENT);
        userRep.save(user);
	}
	
	public User getCurrentUser() {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    return userRep.findByEmail(auth.getName()).get();
	}
	
}
