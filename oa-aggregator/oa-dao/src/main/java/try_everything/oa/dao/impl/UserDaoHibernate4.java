package try_everything.oa.dao.impl;

import java.util.List;

import try_everything.oa.dao.inte.UserDao;
import try_everything.oa.entity.User;

public class UserDaoHibernate4  extends BaseDaoHibernate4<User> implements UserDao{
	/**
	 * @author Jiangnan
	 * @date 2016-03-18
	 */

	@Override
	public List<User> findAllOrderByDate(Class<User> entityClazz) {
		return find("select en from " + entityClazz.getSimpleName() + " en" + " order by en.date desc,en.time desc");
	}

	@Override
	public List<User> findByPageOrderByDate(Class<User> entityClazz,
			int pageNo, int pageSize) {
		String hql = "select en from " + entityClazz.getSimpleName() + " en" + " order by en.date desc,en.time desc";
		return findByPage(hql,pageNo,pageSize);	
	}

	@Override
	public List<User> findByUsernameAndPassord(User user) {
		String hql = "select user from User user where user.username=" 
				+ user.getUsername() + " and user.password=" + user.getPassword(); 
		return find(hql);
	}


}