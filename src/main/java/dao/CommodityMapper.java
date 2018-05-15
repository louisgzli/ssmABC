package dao;

import model.Commodity;
import model.Company;

import java.util.List;

public interface CommodityMapper {
    public List<Commodity> findAll();
    public void saveOrUpdate(Commodity commodity);
    public void deleteById(int id);
}
