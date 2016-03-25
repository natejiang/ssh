package try_everything.oa.dao.inte;

import java.io.Serializable;

public interface BaseDao<T> {
	/**
	 * @author Jiangnan
	 * @date 2016-03-16
	 */
	//根据ID加载实体
	T get(Class<T> entityClazz,Serializable id);
	//保存实体
	Serializable save(T entity);
	//更新实体
	void update(T entity);
	//删除实体
	void delete(T entity);
	//根据ID删除实体
	void delete(Class<T> entityClazz,Serializable id);
	//获取实体总数
	long findCount(Class<T> entityClazz);
}
