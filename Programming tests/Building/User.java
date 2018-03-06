
public class User {

	private String name;
	
	public User(String string) {
		name = string;
	}

	public String getName() {
		return name;
	}
	
	public boolean equals(Object u2)
	{
		return u2!=null && u2 instanceof User &&
				name.equals(((User)u2).name);
	}

}
