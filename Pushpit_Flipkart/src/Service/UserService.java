package Service;
import Bean.user;
import Repo.UserRepository;
public class UserService {
	public user displayUserStatus(String name, UserRepository userRepository) {
		for(user user : userRepository.getUserList())
		{
			if(user.getName().equals(name))
				return user;
		}
		return null;
	
		
	}
}
