package try_everything.oa.service.impl;

import java.util.List;

import try_everything.oa.dao.inte.UserDao;
import try_everything.oa.entity.User;
import try_everything.oa.service.inte.UserService;

public class UserServiceImpl implements UserService {
	private UserDao userDao;
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	@Override
	public int addUser(User user) {
		try
		{
			return (Integer) userDao.save(user);
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			return 0;
		}		
		finally{}
	}

	@Override
	public List<User> findAllOrderByDate(Class<User> userClazz) {
		try
		{
			return (List<User>)userDao.findAllOrderByDate(userClazz);
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			return null;
		}
		finally{}
	}

	@Override
	public List<User> findByPageOrderByDate(Class<User> userClazz, int pageNo,
			int pageSize) {
		try
		{
			return (List<User>)userDao.findByPageOrderByDate(userClazz,pageNo,pageSize);
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			return null;
		}
		finally{}	
	}

	@Override
	public boolean deleteById(Integer id) throws Exception {
		try
		{
			userDao.delete(User.class,id);
			return true;
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			return false;
		}	
		finally{}
	}

	@Override
	public int validLogin(User user) {
		return 0;
	}

}