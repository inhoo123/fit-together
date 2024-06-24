package model.vo;

import java.sql.Date;

public class Feed {
	int no;
	String writerId;
	String title;
	String body;
	String category;
	Date writedAt;
	public Feed() {
		super();
		
	}
	public Feed(int no, String writerId, String title, String body, String category, Date writedAt) {
		this.no = no;
		this.writerId = writerId;
		this.title = title;
		this.body = body;
		this.category = category;
		this.writedAt = writedAt;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getWriterId() {
		return writerId;
	}
	public void setWriterId(String writerId) {
		this.writerId = writerId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public Date getWritedAt() {
		return writedAt;
	}
	public void setWritedAt(Date writedAt) {
		this.writedAt = writedAt;
	}
}
