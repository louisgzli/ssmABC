package PersonTest;

import dao.CommodityMapper;
import dao.CompanyDaoMapper;
import dao.EmployeeMapper;
import dao.UserMapper;
import model.Commodity;
import model.Company;
import model.Employee;
import model.User;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
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
    @Test
    public void testSaveOrUpdate(){
        CompanyDaoMapper companyDaoMapper = (CompanyDaoMapper) applicationContext.getBean("companyDaoMapper");
        EmployeeMapper employeeMapper = (EmployeeMapper) applicationContext.getBean("employeeMapper");
        CommodityMapper commodityMapper = (CommodityMapper) applicationContext.getBean("commodityMapper");
        UserMapper userMapper = (UserMapper) applicationContext.getBean("userMapper");
        List<Company> companies = companyDaoMapper.findAll();
        List<Employee> employees = employeeMapper.findAll();
       List<Commodity> commodities = commodityMapper.findAll();
       List<User> users = userMapper.findAll();

        System.out.println(companies);
        System.out.println(employees);
        System.out.println(commodities);
        System.out.println(users);
    }
}
