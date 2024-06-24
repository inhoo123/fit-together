package model.vo.complex;

import model.vo.Event;
import model.vo.Gym;

public class EventWithDetail {
	Event event;
	Gym gym;
	boolean Joined;

	public Event getEvent() {
		return event;
	}

	public void setEvent(Event event) {
		this.event = event;
	}

	public Gym getGym() {
		return gym;
	}

	public void setGym(Gym gym) {
		this.gym = gym;
	}

	public boolean isJoined() {
		return Joined;
	}

	public void setJoined(boolean isJoined) {
		this.Joined = isJoined;
	}

}
