package movie.recommendation.loginModel;



public class Users {
  
  public String _id;
  
  public String name;
  public String password;
  public String email;
  
  // Constructors
  public Users() {}
  
  public Users(String _id, String name, String password, String email) {
    this._id = _id;
    this.name = name;
    this.password = password;
    this.email = email;
  } 
  
  // ObjectId needs to be converted to string
  public String get_id() { return _id ;}
  public void set_id(String _id) { this._id = _id; }
  
  public String getName() { return name; }
  public void setName(String name) { this.name = name; }
  
  public String getPassword() { return password; }
  public void setpassword(String password) { this.password = password; }
  
  public String getEmail() { return email; }
  public void setemail(String email) { this.email = email; }
}