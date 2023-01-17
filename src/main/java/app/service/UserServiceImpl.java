package app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import app.dao.UserDao;
import app.model.User;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private UserDao userDaoImpl;

    public UserServiceImpl() {
    }

    @Autowired
    public UserServiceImpl(UserDao userDaoImpl) {
        this.userDaoImpl = userDaoImpl;
    }

    public UserDao getUserDaoImpl() {
        return userDaoImpl;
    }

    public void setUserDaoImpl(UserDao userDaoImpl) {
        this.userDaoImpl = userDaoImpl;
    }

    @Override
    public void addUser(User user) {
        userDaoImpl.addUser(user);
    }

    @Override
    public void updateUser(User user) {
        userDaoImpl.updateUser(user);
    }

    @Override
    public void deleteUser(int id) {
        userDaoImpl.deleteUser(id);
    }

    @Override
    public List<User> getAllUsers() {
        return userDaoImpl.getAllUsers();
    }

    @Override
    public User getUser(int id) {
        return userDaoImpl.getUser(id);
    }
}
