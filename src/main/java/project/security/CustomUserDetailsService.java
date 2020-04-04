package project.security;

import java.util.Collections;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import project.dao.UserRepository;
import project.domain.User;

@Service("customUserDetailsService")
public class CustomUserDetailsService implements UserDetailsService {
	private final UserRepository userRepository;

	@Autowired
	public CustomUserDetailsService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		Optional<User> o = userRepository.findByEmail(email);

		if (o.isPresent()) {
			User user = o.get();
			return new CustomUserDetails(user, Collections.singletonList(user.getRole().toString()));
		}

		throw new UsernameNotFoundException("No user present with email:" + email);
	}
}