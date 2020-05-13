package Util;

import java.io.InputStream;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MybaitsUtil {
	
	public SqlSession getsession(String mybaits) throws Exception {
		InputStream is = Resources.getResourceAsStream(mybaits);
		SqlSessionFactory factor = new SqlSessionFactoryBuilder().build(is);
		SqlSession session = factor.openSession();
		return session;
}
	}
