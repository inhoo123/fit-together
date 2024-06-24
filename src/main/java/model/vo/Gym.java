package model.vo;

public class Gym {
	int id;
	String name;
	String type;
	String location;
	String owner;
	String manager;

	public Gym() {
		super();
	}

	public Gym(int id, String name, String type, String location, String owner, String manager) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.location = location;
		this.owner = owner;
		this.manager = manager;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getManager() {
		return manager;
	}

	public void setManager(String manager) {
		this.manager = manager;
	}

}
