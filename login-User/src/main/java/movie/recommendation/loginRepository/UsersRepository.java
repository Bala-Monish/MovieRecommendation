package movie.recommendation.loginRepository;



import org.springframework.data.jpa.repository.JpaRepository;

import movie.recommendation.loginModel.User;


public interface UsersRepository extends JpaRepository<User, String> {
  User findBy_id(String _id);
  User findByemail(String email);
}