package service;

import Util.MybaitsUtil;
import javabean.User;
import mapper.com_mapper;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class userserviceimpl implements userservice{

	@Override
	public List<User> show() throws Exception{
		MybaitsUtil my=new MybaitsUtil();
		SqlSession session = my.getSqlsession();
		com_mapper mapper = session.getMapper(com_mapper.class);
		List<User> list = mapper.select01();
		session.close();
		return list;
	}

}
