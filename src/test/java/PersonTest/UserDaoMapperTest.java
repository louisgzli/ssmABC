package PersonTest;

import dao.UserDaoMapper;
import model.Person;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class UserDaoMapperTest {
    ApplicationContext applicationContext;

    @Before
    public void test() {
        String springXML = "applicationContext.xml";
        applicationContext = new ClassPathXmlApplicationContext(springXML);

    }
//    @Test
//    public void testSingleMapper(){
//
//        UserDaoMapper userMapper = (UserDaoMapper) applicationContext.getBean("singleMapper");  //单mapper要引用id
//        List<Person> user = userMapper.findAll();
////        System.out.println(user);
//
//    }
    @Test
    public void testMultiMapper(){


        UserDaoMapper userMapper = (UserDaoMapper) applicationContext.getBean("userDaoMapper"); //批量mapper要引用“mapper接口名”，且首字母小写
        List<Person> user = userMapper.findAll();
        System.out.println("------==============------------");
        System.out.println(user);
    }
}
