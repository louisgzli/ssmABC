package PersonTest;

import dao.CompanyDaoMapper;
import model.Company;
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
        Company company_1 = new Company();
        Company company_2 = new Company();
        company_1.setId(2);
        company_2.setId(3);
        company_1.setCompany("洪兴");
        company_2.setCompany("东兴");
        company_1.setStaff(1);
        company_2.setStaff(2);
        List<Company> companies = new ArrayList<Company>();
        companies.add(company_1);
        companies.add(company_2);
        companyDaoMapper.saveOrUpdate(company_1);
        companyDaoMapper.saveOrUpdate(company_2);
    }
}
