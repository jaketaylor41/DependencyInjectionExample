import javax.inject.Inject;

//Creates a new Dependency in the constructor
public class UserService {
	
	@Inject
	
	private UserDataRepository udr;
	
	public void persistUser(User user) {
		udr.save(user);
	}

}
