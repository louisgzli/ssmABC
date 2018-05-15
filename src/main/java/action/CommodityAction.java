package action;

import dao.CommodityMapper;
import model.Commodity;

import javax.annotation.Resource;
import java.util.List;

public class CommodityAction {
    @Resource
    CommodityMapper commodityMapper;
    public int id;
    public String name;
    public String pType;
    public String aType;
    public List<Commodity> commodity;

    public List<Commodity> getCommodity() {
        return commodity;
    }

    public void setCommodity(List<Commodity> commodity) {
        this.commodity = commodity;
    }

    public CommodityMapper getCommodityMapper() {
        return commodityMapper;
    }

    public void setCommodityMapper(CommodityMapper commodityMapper) {
        this.commodityMapper = commodityMapper;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getpType() {
        return pType;
    }

    public void setpType(String pType) {
        this.pType = pType;
    }

    public String getaType() {
        return aType;
    }

    public void setaType(String aType) {
        this.aType = aType;
    }

    public void commodityCreate(){
        Commodity temp = new Commodity();
        temp.setId(id);
        temp.setName(name);
        temp.setpType(pType);
        temp.setaType(aType);
        commodityMapper.saveOrUpdate(temp);
    }
    public void commodityUpdate(){
        Commodity temp = new Commodity();
        temp.setId(id);
        temp.setName(name);
        temp.setpType(pType);
        temp.setaType(aType);
        commodityMapper.saveOrUpdate(temp);
    }

    public void dele(){
        commodityMapper.deleteById(id);
    }
    public String loadCommodity() throws Exception{

        commodity = commodityMapper.findAll();
        return "success";
    }

}
