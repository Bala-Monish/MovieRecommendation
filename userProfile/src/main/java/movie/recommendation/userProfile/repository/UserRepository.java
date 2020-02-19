package movie.recommendation.userProfile.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import movie.recommendation.userProfile.model.UserDetails;


public interface UserRepository extends JpaRepository<UserDetails, String> {
	UserDetails findByid(int id);
	 
	}

