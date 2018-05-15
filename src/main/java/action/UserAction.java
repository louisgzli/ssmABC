package action;

import dao.UserMapper;
import model.Employee;
import model.User;

import javax.annotation.Resource;
import java.util.List;

public class UserAction {
    @Resource
    UserMapper userMapper;
    public int id;
    public String name;
    public String password;
    public List<User> users;

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public UserMapper getUserMapper() {
        return userMapper;
    }

    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public String loadUser(){
        users = userMapper.findAll();
        return "success";
    }

    public void userCreate(){
        User temp = new User();
        temp.setId(id);
        temp.setName(name);
        temp.setPassword(password);
        userMapper.saveOrUpdate(temp);
    }
    public void userUpdate(){
        User temp = new User();
        temp.setId(id);
        temp.setName(name);
        temp.setPassword(password);
        userMapper.saveOrUpdate(temp);
    }

    public void dele(){
        userMapper.deleteById(id);
    }



}
