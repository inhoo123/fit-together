package model.vo;

public class Gym {
	public Gym(int gymId, String type, String location, String name, String owner, String management) {
		this.gymId = gymId;
		this.type = type;
		this.location = location;
		this.name = name;
		this.owner = owner;
		this.management = management;
	}

	public Gym() {
		super();
	}

	public int getGymId() {
		return gymId;
	}

	public void setGymId(int gymId) {
		this.gymId = gymId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getManagement() {
		return management;
	}

	public void setManagement(String management) {
		this.management = management;
	}

	int gymId;
	String type;
	String location;
	String name;
	String owner;
	String management;
}
