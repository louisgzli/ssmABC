package action;

import dao.UserMapper;
import model.Employee;
import model.User;

import javax.annotation.Resource;
import java.util.List;

import static com.opensymphony.xwork2.Action.ERROR;
import static com.opensymphony.xwork2.Action.SUCCESS;

public class UserAction {
    @Resource
    UserMapper userMapper;
    public int id;
    public String name;
    public String password;
    public List<User> users;
    public boolean success;
    public String msg;

    public boolean isSuccess() {
        return success;
    }

    public String getMsg() {
        return msg;
    }

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

    public String  login(){
        User user = userMapper.selectByName(name);
        System.out.println(password);
        System.out.println(user.getPassword().equals(password));
        System.out.println(user!=null);
        if(user!=null&&user.getPassword().equals(password)){
           success = true;
           msg = "OK";
           return SUCCESS;


        }
        else {
            msg="ERROR";
            success = false;
            return ERROR;
        }


    }




}
