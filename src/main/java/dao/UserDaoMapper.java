package dao;

import model.Person;

import javax.resource.AdministeredObjectDefinition;
import java.util.List;

public interface UserDaoMapper {
public List<Person> findAll();
}
