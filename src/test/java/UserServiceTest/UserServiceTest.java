package UserServiceTest;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.pan.baseTest.SpringTestCase;
import com.pan.domain.User;
import com.pan.service.UserService;


public class UserServiceTest extends SpringTestCase {

	@Autowired
	private UserService userService;
	
	@Test
	public void selectUserByIdTest(){  
	    User user = userService.selectUserById(1);  
	    System.out.println(user.getUserName() + ":" + user.getUserPassword());
	} 
}
