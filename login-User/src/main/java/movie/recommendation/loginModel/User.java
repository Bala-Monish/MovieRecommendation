package movie.recommendation.loginModel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {
  @Id
  @GeneratedValue
  @Column(name="user_id")
  public int userId;
  @Column(name="first_name")
  public String firstName;
  @Column(name="last_name")
  public String lastName;
  @Column(name="password")
  public String password;
  @Column(name="email")
  public String email;
  
  public int getUserId() { return userId; }
  public void setId(int userId) { this.userId = userId; }
  
  public String getFirstName() { return firstName; }
  public void setFirstName(String firstName) { this.firstName = firstName; }
  
  public String getPassword() { return password; }
  public void setPassword(String password) { this.password = password; }
  
  public String getEmail() { return email; }
  public void setEmail(String email) { this.email = email; }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }
}