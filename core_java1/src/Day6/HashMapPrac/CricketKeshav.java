package Day6.HashMapPrac;

public class CricketKeshav {

	private int jerseyno ;
	private String name;
	
	public CricketKeshav()
	{
		
	}

	@Override
	public String toString() {
		return "Cricketer [jerseyno=" + jerseyno + ", name=" + name + "]";
	}

	public CricketKeshav(int jerseyno, String name) {
		super();
		this.jerseyno = jerseyno;
		this.name = name;
	}

	public int getJerseyno() {
		return jerseyno;
	}

	public void setJerseyno(int jerseyno) {
		this.jerseyno = jerseyno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
