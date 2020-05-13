package Util;

import java.io.IOException;
import java.io.InputStream;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MybaitsUtil {
    private static SqlSessionFactory factory = null;
    static {
        try {
            factory =new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("mybatis.xml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static SqlSession getSqlsession() {
        SqlSession session = null;
        if(factory!=null) {
            session = factory.openSession();
        }
        return session;
    }}
