package action;

import com.opensymphony.xwork2.ActionSupport;
import dao.CompanyDaoMapper;
import model.Company;

import javax.annotation.Resource;
import java.util.List;

public class CompanyAction extends ActionSupport {
    @Resource
    CompanyDaoMapper companyDaoMapper;
    List<Company> companies;
    public void loadCompany() throws Exception{
        System.out.println("***********************************8====**************");
        companies = companyDaoMapper.findAll();
    }


}
