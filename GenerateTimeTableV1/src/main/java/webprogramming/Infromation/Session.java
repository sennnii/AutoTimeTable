package webprogramming.Infromation;

import java.util.*;

public class Session {
	private ArrayList<TNL> time;
	private String className;
	private String professor;
	private int grade;
	
	public Session(String className, String professor,int grade){
		this.time = new ArrayList<>();
		this.professor = professor;
		this.className = className;
		this.grade = grade;
	}
	
	public Session(String className, String professor,int grade, ArrayList<TNL> time){
		this.time = time;
		this.grade = grade;
		this.professor = professor;
		this.className = className;
	}

	public int getGrade() {
		return grade;
	}

	public String getProfessor() {
		return professor;
	}

	public String getClassName()
	{
		return className;
	}
	
	public ArrayList<TNL> getTime() {
		return time;
	}

	public void addTime(TNL time) {
		this.time.add(time);
	}
	
}
