package try_everything.oa.service;


import java.util.Locale;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import try_everything.oa.entity.User;
import try_everything.oa.service.inte.UserService;

public class UserServiceTest {
	/**
	 * @author Jiangnan
	 * @date 2016-03-24
	 */

	ApplicationContext ctx = null;  
	UserService userService = null;  
  
	@Before  
	public void beforeClass() {  
	    ctx = new FileSystemXmlApplicationContext(  
	            "classpath*:beans.xml");  
	    userService = (UserService) ctx.getBean("userService");  
	}  
	  
	@Test  
	public void testSave() {  
	    User user = new User();  
	    String[] a = {"先生"};
	    String username = ctx.getMessage("jiangnan", a,Locale.getDefault());
	    user.setUsername(username);
	    user.setPassword("123");  
	    userService.addUser(user);  
	}    

}
