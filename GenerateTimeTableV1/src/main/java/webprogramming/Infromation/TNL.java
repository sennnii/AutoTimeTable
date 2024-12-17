package webprogramming.Infromation;

import java.time.DayOfWeek;

public class TNL {
	private DayOfWeek day;
	private int start;
	private int end;
	private String location;
	private int bit;
	
	public TNL(DayOfWeek day, int start, int end, String location) {
		this.day = day;
		this.start = start;
		this.end = end;
		this.location = location;
	}
	
	public TNL(DayOfWeek day, int start, int end, String location, int bit) {
		this.day = day;
		this.start = start;
		this.end = end;
		this.location = location;
		this.bit = bit;
	}
	
	public String getLocation()
	{
		return location;
	}
	
	public DayOfWeek getDay() {
		return day;
	}
	
	public int getStart() {
		return start;
	}

	public int getEnd() {
		return end;
	}
	
	public int getBit() 
	{
		return bit;
	}
	
}
