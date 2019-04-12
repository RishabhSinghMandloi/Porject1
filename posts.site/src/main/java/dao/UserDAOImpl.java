package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import model.User;

public class UserDAOImpl implements UserDAO {

	Connection con;

	public boolean signIn(User user) {

		try {

			PreparedStatement pst = con.prepareStatement("select * from user where User_name = ? and Password = ?");
			pst.setString(1, user.getUser_name());
			pst.setString(2, user.getPassword());
			ResultSet rs = pst.executeQuery();

			if (rs.next()) {
				return true;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	public boolean signUp(User user) {
		boolean res = false;
		try {
			PreparedStatement pst = con.prepareStatement("insert into user (User_name,Password) values (?,?)");
			pst.setString(1, user.getUser_name());
			pst.setString(2, user.getPassword());

			res = (pst.executeUpdate() == 1) ? true : false;

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return res;
	}

}