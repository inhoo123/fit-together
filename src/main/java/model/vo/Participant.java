package model.vo;

import java.sql.Date;

public class Participant {
	int id;
	String userId;
	int eventId;
	Date joinAt;

	public Participant() {
		super();
	}

	public Participant(int id, String userId, int eventId, Date joinAt) {
		super();
		this.id = id;
		this.userId = userId;
		this.eventId = eventId;
		this.joinAt = joinAt;
	}

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

	public int getEventId() {
		return eventId;
	}

	public void setEventId(int eventId) {
		this.eventId = eventId;
	}

	public Date getJoinAt() {
		return joinAt;
	}

	public void setJoinAt(Date joinAt) {
		this.joinAt = joinAt;
	}

}
