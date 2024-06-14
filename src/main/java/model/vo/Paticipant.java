package model.vo;

import java.sql.Date;

public class Paticipant {
	int id;
	String userId;
	String eventId;
	Date joinAt;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getEventId() {
		return eventId;
	}

	public void setEventId(String eventId) {
		this.eventId = eventId;
	}

	public Date getJoinAt() {
		return joinAt;
	}

	public void setJoinAt(Date joinAt) {
		this.joinAt = joinAt;
	}

	public Paticipant(int id, String userId, String eventId, Date joinAt) {
		this.id = id;
		this.userId = userId;
		this.eventId = eventId;
		this.joinAt = joinAt;
	}

	public Paticipant() {
		super();
	}

}
