import java.util.ArrayList;

public class Facility {

	protected String name;
	protected int capacity;
	protected ArrayList<User> authorizedUsers;

	public Facility(String name)
	{
		this.name = name;
		authorizedUsers = new ArrayList<User>();

	}

	public Facility(String name, int capacity)
	{
		this.name = name;
		this.capacity = capacity;
		authorizedUsers = new ArrayList<User>();

	}

	public String getName() {
		return name;
	}

	public int getCapacity() {
		return capacity;
	}

	public void authorize(User u1) {
		authorizedUsers.add(u1);
	}

	public boolean canEnter(User u1) {
		return authorizedUsers.contains(u1);
	}

	
	

}
