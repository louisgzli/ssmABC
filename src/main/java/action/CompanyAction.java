package action;

import com.opensymphony.xwork2.ActionSupport;
import dao.CompanyDaoMapper;
import model.Company;

import javax.annotation.Resource;
import java.util.List;

public class CompanyAction extends ActionSupport {
    @Resource
    CompanyDaoMapper companyDaoMapper;

    public List<Company> getCompanies() {
        return companies;
    }

    public void setCompanies(List<Company> companies) {
        this.companies = companies;
    }

    List<Company> companies;
    public String loadCompany() throws Exception{

        companies = companyDaoMapper.findAll();
        System.out.println(companies);
        return SUCCESS;
    }


}
