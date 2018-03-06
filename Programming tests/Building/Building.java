import java.util.TreeSet;

public class Building extends Facility{

	private int minFloor;
	private int maxFloor;
	private TreeSet<Room> rooms;
	
	public Building(String n, int min, int max) {
		
		super(n);
		
		if(min>max)
			throw new IllegalArgumentException();
		
		minFloor=min;
		maxFloor=max;
		rooms = new TreeSet<Room>();
	}

	public int getMinFloor() {
		return minFloor;
	}

	public int getMaxFloor() {
		return maxFloor;
	}
	
	public String toString()
	{
		return "Building(" + name + ")";
	}
	
	public boolean addRoom(Room r)
	{
		if(rooms.add(r))
		{
			capacity+=r.getCapacity();
			return true;
		}
		
		return false;
	}
}
