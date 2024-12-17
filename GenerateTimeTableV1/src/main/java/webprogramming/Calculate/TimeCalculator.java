package webprogramming.Calculate;

import java.util.ArrayList;
import java.util.Iterator;

import webprogramming.Infromation.Course;
import webprogramming.Infromation.Session;
import webprogramming.Infromation.TNL;

public class TimeCalculator {
	
	public ArrayList<ArrayList<Session>> calculateTime(String [] subjects, Integer [] condition)
	{
		ArrayList<Session> data = Course.getSql();
		ArrayList<ArrayList<Session>> timeTable = new ArrayList<ArrayList<Session>>();
		ArrayList<ArrayList<Session>> temp = new ArrayList<ArrayList<Session>>();
		data.stream().filter(t -> 
		{
			return t.getClassName().equals(subjects[0]); 
		}).forEach(t -> 
		{
			ArrayList<TNL> SubjectTime = t.getTime();
			if(SubjectTime.stream().allMatch(s -> {return (condition[s.getDay().getValue()-1] & s.getBit())==0;}))
			{
				ArrayList<Session> initial = new ArrayList<Session>();
				initial.add(t);
				temp.add(initial);
			}
		});
		timeTable = (ArrayList<ArrayList<Session>>) temp.clone();
			for(int i=1;i<subjects.length;i++)
			{
				final ArrayList<ArrayList<Session>> finalTimeTable = timeTable;
				ArrayList<ArrayList<Session>> blank = new ArrayList<ArrayList<Session>>();
				int index = i;
				data.stream().filter(t -> 
				{
					return t.getClassName().equals(subjects[index]); 
				}).forEach(t -> 
				{
					ArrayList<TNL> SubjectTime = t.getTime();
					if(SubjectTime.stream().allMatch(s -> {return (condition[s.getDay().getValue()-1] & s.getBit())==0;}))
					{
						Iterator<ArrayList<Session>> iterator = finalTimeTable.iterator();
						while (iterator.hasNext()) {
						    ArrayList<Session> k = iterator.next();
						    if (k.stream().allMatch(j -> j.getTime().stream().allMatch(v -> {return checkTime(v,t);}))) 
						    {
						        ArrayList<Session> tempSessions = (ArrayList<Session>)k.clone();
						        tempSessions.add(t);
						        blank.add(tempSessions);
						    } 
						}
					}
				});
				timeTable = blank;
			}
		return timeTable;
	}

	private boolean checkTime(TNL v, Session t) {
		
		ArrayList<TNL> sessionTime = t.getTime();
		for(TNL time : sessionTime)
		{
			if(time.getDay().getValue() == v.getDay().getValue())
			{
				if((time.getBit() & v.getBit()) != 0)
				{
					return false;
				}
			}
		}
		return true;
	}
	
}
