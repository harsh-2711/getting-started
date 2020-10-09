package daiict.slop.springboot_starterproject.service;

import daiict.slop.springboot_starterproject.entity.User;
import daiict.slop.springboot_starterproject.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * User Service - service to manipulate USER.
 * @version 1.0
 * @since Oct 8, 2020
 */

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    /**
     * service to add User to database
     *
     * @param user
     * @return USER added to DATABASE
     */
    public User addUser(User user) {
        return userRepository.save(user);
    }

    /**
     * Service to get all User saved in database
     *
     * @return List of USER saved in database
     */
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    /**
     * Service to get USER based on userId
     *
     * @param userId
     * @return USER
     */
    public User getUserById(int userId) {
        return userRepository.findById(userId).orElse(null);
    }


    /**
     * Service to get USER based on userName
     *
     * @param userName
     * @return USER
     */

    public User getUserByName(String userName) {
        return userRepository.findByName(userName);
    }

    /**
     * Service to update given USER
     *
     * @param user
     * @return updated user
     */
    public User updateUser(User user) {
        User existingUser = userRepository.findById(user.getUserId()).orElse(null);
        if (existingUser == null) {
            return null;
        }
        existingUser.setName(user.getName());
        existingUser.setEmailAddress(user.getEmailAddress());
        existingUser.setPhoneNumber(user.getPhoneNumber());
        User updatedUser = userRepository.save(existingUser);
        return updatedUser;
    }

    /**
     * Service to delete all user saved in database
     *
     * @return String with success message
     */
    public String deleteAllUsers() {
        userRepository.deleteAll();
        return "User deleted by it's id successfully";
    }

    /**
     * service to delete USER based on userID
     *
     * @param userId
     * @return String with success message
     */
    public String deleteUserById(int userId) {
        userRepository.deleteById(userId);
        return "User deleted by id successfully";
    }


    /**
     * service to delete USER based on UserName
     *
     * @param userName
     * @return String with success message
     */
    @Transactional
    public String deleteUserByName(String userName) {
        userRepository.deleteByName(userName);
        return "User deleted by name successfully";
    }
}
