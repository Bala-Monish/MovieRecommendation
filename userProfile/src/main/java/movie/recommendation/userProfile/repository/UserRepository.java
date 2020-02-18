package movie.recommendation.userProfile.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import movie.recommendation.userProfile.model.User;


public interface UserRepository extends JpaRepository<User, String> {
	  User findByid(String id);
	 
	}

