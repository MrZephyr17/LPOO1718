public class Room extends Facility implements Comparable<Room>{

	private Building building;
	private String number;
	private int floor;

	public Room(Building b, String number, int floor) throws DuplicateRoomException {
		super(b.name + number);
		
		if(floor> b.getMaxFloor() || floor< b.getMinFloor())
			throw new IllegalArgumentException();
		
		this.number = number;
		building = b;
		this.floor=floor;
		
		
		if(!b.addRoom(this))
			throw new DuplicateRoomException();
	}

	public Room(Building b, String number, int floor, int capacity) throws DuplicateRoomException {
		super(b.name + number);
		
		if(floor> b.getMaxFloor() || floor< b.getMinFloor())
			throw new IllegalArgumentException();
		
		this.number = number;
		building = b;
		this.floor=floor;
		this.capacity = capacity;
		
		if(!b.addRoom(this))
			throw new DuplicateRoomException();
	}

	public Building getBuilding() {
		return building;
	}

	public String getNumber() {
		return number;
	}

	public int getFloor() {
		return floor;
	}
	
	public String toString()
	{
		return "Room(" + building.getName() + "," + number + ")";
	}

	@Override
	public int compareTo(Room o) {
		return number.compareTo(o.number);
	}
	
	public void authorize(User u1) {
		authorizedUsers.add(u1);
		building.authorize(u1);
	}
}
