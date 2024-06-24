package model.vo;

import java.sql.Date;

public class Event {
	int id;
	String title;
	String description;
	String tag;
	int gymId;
	String hostId;
	Date openAt;
	int capacity;
	int attendee;
	Date registerAt;

	public Event() {
		super();
	}

	public Event(int id, String title, String description, String tag, int gymId, String hostId, Date openAt,
			int capacity, int attendee, Date registerAt) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.tag = tag;
		this.gymId = gymId;
		this.hostId = hostId;
		this.openAt = openAt;
		this.capacity = capacity;
		this.attendee = attendee;
		this.registerAt = registerAt;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public int getGymId() {
		return gymId;
	}

	public void setGymId(int gymId) {
		this.gymId = gymId;
	}

	public String getHostId() {
		return hostId;
	}

	public void setHostId(String hostId) {
		this.hostId = hostId;
	}

	public Date getOpenAt() {
		return openAt;
	}

	public void setOpenAt(Date openAt) {
		this.openAt = openAt;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public int getAttendee() {
		return attendee;
	}

	public void setAttendee(int attendee) {
		this.attendee = attendee;
	}

	public Date getRegisterAt() {
		return registerAt;
	}

	public void setRegisterAt(Date registerAt) {
		this.registerAt = registerAt;
	}

}
