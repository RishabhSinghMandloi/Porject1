package model;

public class Post {
	private int Post_id;
	private String Title;
	private String Body;
	private int User_id;

	public Post() {

	}

	public Post(int post_id, String title, String body, int user_id) {

		Post_id = post_id;
		Title = title;
		Body = body;
		User_id = user_id;
	}

	public int getPost_id() {
		return Post_id;
	}

	public void setPost_id(int post_id) {
		Post_id = post_id;
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public String getBody() {
		return Body;
	}

	public void setBody(String body) {
		Body = body;
	}

	public int getUser_id() {
		return User_id;
	}

	public void setUser_id(int user_id) {
		User_id = user_id;
	}

	@Override
	public String toString() {
		return "Post [Post_id=" + Post_id + ", Title=" + Title + ", Body=" + Body + ", User_id=" + User_id + "]";
	}

}
