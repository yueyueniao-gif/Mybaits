package test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import Util.MybaitsUtil;
import bean.Student;
import bean.Teacher;
import mapper.Studentmapper;
import mapper.Teachermapper;

public class Test001 {
	public static void main(String[] args) throws Exception {
		MybaitsUtil my=new MybaitsUtil();
		SqlSession session = my.getsession("mybaits.xml");
		Teachermapper mapper = session.getMapper(Teachermapper.class);
		List<Teacher> select02 = mapper.select02();
		for (Teacher teacher : select02) {
			System.out.println(teacher);
		}
		session.close();
		
	}
}
