package daiict.slop.springboot_starterproject.controller;

import daiict.slop.springboot_starterproject.entity.User;
import daiict.slop.springboot_starterproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * User Controller - contains API to manipulate USER.
 * @version 1.0
 * @since Oct 8, 2020
 */

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    /**
     * API to add User to database
     *
     * @param user
     * @return USER added to DATABASE
     */
    @PostMapping("/user/add")
    public User addUser(@RequestBody User user) {
        return userService.addUser(user);
    }

    /**
     * API to get all User saved in database
     *
     * @return List of USER saved in database
     */
    @GetMapping("/user/users")
    public List<User> getAllUser() {
        return userService.getAllUsers();
    }

    /**
     * API to get USER based on userID
     *
     * @param userId
     * @return USER
     */
    @GetMapping("user/id/{userId}")
    public User getUserById(@PathVariable int userId) {
        return userService.getUserById(userId);
    }

    /**
     * API to get USER based on userName
     *
     * @param userName
     * @return USER
     */
    @GetMapping("user/name/{userName}")
    public User getUserByName(@PathVariable String userName) {
        return userService.getUserByName(userName);
    }

    /**
     * API to update given USER
     *
     * @param user
     * @return updated user
     */
    @PutMapping("/user/update")
    public User updateUser(@RequestBody User user) {
        return userService.updateUser(user);
    }

    /**
     * API to delete all user saved in database
     *
     * @return String with success message
     */
    @DeleteMapping("/user/delete/users")
    public String deleteAllUser() {
        return userService.deleteAllUsers();
    }

    /**
     * API to delete USER based on userID
     *
     * @param userId
     * @return String with success message
     */
    @DeleteMapping("user/delete/id/{userId}")
    public String deleteUserById(@PathVariable int userId) {
        return userService.deleteUserById(userId);
    }

    /**
     * API to delete USER based on UserName
     *
     * @param userName
     * @return String with success message
     */
    @DeleteMapping("user/delete/name/{userName}")
    public String deleteUserByName(@PathVariable String userName) {
        return userService.deleteUserByName(userName);
    }
}
