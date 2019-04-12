package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Comment;

public class CommentDAOImpl implements CommentDAO {
	private static Connection con;

	public int insert(Comment comment) {
		int res = -1;
		try {
			PreparedStatement pst = con.prepareStatement("insert into comment (Com_body) values (?)");
			pst.setString(1, comment.getCom_body());

			res = pst.executeUpdate();
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return res;
	}

	public int update(Comment comment) {
		int res = -1;
		try {
			PreparedStatement pst = con.prepareStatement("update comment set Com_body = ? where C_id = ?");
			pst.setString(1, comment.getCom_body());
			pst.setInt(3, comment.getC_id());
			res = pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return res;
	}

	public int delete(int id) {
		int res = -1;
		try {
			PreparedStatement pst = con.prepareStatement("delete from comment where C_id = ?");
			pst.setInt(1, id);
			res = pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return res;
	}

	public List<Comment> view() throws SQLException {

		ArrayList<Comment> list = new ArrayList<Comment>();

		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from comment");
		while (rs.next()) {
			list.add(new Comment(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4)));
		}

		return list;
	}

	public Comment view(int id) {
		Comment comment = new Comment();
		try {
			PreparedStatement pst = con.prepareStatement("select * from comment where Post_id = ?");
			pst.setInt(1, id);
			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				comment = new Comment(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return comment;

	}
}
