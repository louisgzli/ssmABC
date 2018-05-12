package PersonTest;

import dao.CompanyDaoMapper;
import dao.UserDaoMapper;
import model.Company;
import model.Person;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class CompanyTest {
    ApplicationContext applicationContext;

    @Before
    public void test() {
        String springXML = "applicationContext.xml";
        applicationContext = new ClassPathXmlApplicationContext(springXML);

    }
    @Test
    public void testMultiMapper(){


        CompanyDaoMapper companyDaoMapper = (CompanyDaoMapper) applicationContext.getBean("companyDaoMapper"); //批量mapper要引用“mapper接口名”，且首字母小写
        List<Company> user = companyDaoMapper.findAll();
        System.out.println("------------");

        System.out.println(user);
    }
}
