package dao;

import java.sql.SQLException;
import java.util.List;

import model.Comment;
import model.User;

public interface UserDAO {

	boolean signIn(User user);

	boolean signUp(User user);

}