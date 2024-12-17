package webprogramming.Calculate;

import java.util.ArrayList;

import webprogramming.Infromation.Session;

public class Test {	
	
	public static void main(String[] args) {
		TimeCalculator test = new TimeCalculator();
		String [] string = {"프로그래밍언어론", "어드벤처디자인","기초프로그래밍"};
		Integer [] integer = {0,0,0,0,0};
		ArrayList<ArrayList<Session>> answer = test.calculateTime(string, integer);
		for (ArrayList<Session> Sessions : answer)
		{
			for(Session session : Sessions)
			{
				System.out.println(session.getClassName() + " " + session.getProfessor());
			}
			System.out.println();
		}
	}

}
