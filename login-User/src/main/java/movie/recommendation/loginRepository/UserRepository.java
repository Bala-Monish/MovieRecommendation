package movie.recommendation.loginRepository;



import org.springframework.data.jpa.repository.JpaRepository;

import movie.recommendation.loginModel.User;


public interface UserRepository extends JpaRepository<User, String> {
  User findByUserId(String _id);
  User findByEmail(String email);
}