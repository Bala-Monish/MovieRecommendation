package movie.recommendation.loginRepository;



import org.springframework.data.jpa.repository.JpaRepository;

import movie.recommendation.loginModel.Users;


public interface UsersRepository extends JpaRepository<Users, String> {
  Users findBy_id(String _id);
  Users findByemail(String email);
}