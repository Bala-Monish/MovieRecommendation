package movie.recommendation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import movie.recommendation.model.User;


public interface UserRepository extends JpaRepository<User, String> {
	  User findByid(String id);
	 
	}

