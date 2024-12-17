package webprogramming.Infromation;

import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.Arrays;

public class Course {
	static private ArrayList<Session> sql = new ArrayList<Session>();
	
	static {
		sql.add(new Session("기초프로그래밍", "김동우",3,
				new ArrayList<TNL>(Arrays.asList(new TNL(DayOfWeek.MONDAY,1000,1200,"P402",0b001111000000000000000000),
				new TNL(DayOfWeek.WEDNESDAY,1000,1200,"P402",0b001111000000000000000000)))));
		sql.add(new Session("기초프로그래밍", "이철",3,
				new ArrayList<TNL>(Arrays.asList(new TNL(DayOfWeek.MONDAY,1300,1500,"P402",0b000000001111000000000000),
				new TNL(DayOfWeek.WEDNESDAY,1330,1530,"P402",0b0000000001111000000000000)))));
		sql.add(new Session("기초프로그래밍", "임상수",3,
				new ArrayList<TNL>(Arrays.asList(new TNL(DayOfWeek.MONDAY,1500,1700,"P402",0b000000000000111100000000),
				new TNL(DayOfWeek.WEDNESDAY,1530,1730,"P402",0b000000000000011110000000)))));
		sql.add(new Session("기초프로그래밍", "윤성림",3,
				new ArrayList<TNL>(Arrays.asList(new TNL(DayOfWeek.TUESDAY,1000,1200,"P402",0b001111000000000000000000),
				new TNL(DayOfWeek.THURSDAY,1000,1200,"P402",0b001111000000000000000000)))));
		sql.add(new Session("기초프로그래밍", "이명숙",3,
				new ArrayList<TNL>(Arrays.asList(new TNL(DayOfWeek.TUESDAY,1500,1700,"3115",0b000000000000111100000000),
				new TNL(DayOfWeek.THURSDAY,1500,1700,"3115",0b000000000000111100000000)))));
		sql.add(new Session("심화프로그래밍", "조경은",3,
				new ArrayList<TNL>(Arrays.asList(new TNL(DayOfWeek.TUESDAY,1300,1500,"P402",0b000000001111000000000000),
				new TNL(DayOfWeek.THURSDAY,1300,1500,"P402",0b000000001111000000000000)))));
		sql.add(new Session("심화프로그래밍", "윤승현",3,
				new ArrayList<TNL>(Arrays.asList(new TNL(DayOfWeek.TUESDAY,1500,1700,"P402",0b000000000000111100000000),
				new TNL(DayOfWeek.THURSDAY,1500,1700,"P402",0b000000000000111100000000)))));
		sql.add(new Session("심화프로그래밍", "조경은",3,
				new ArrayList<TNL>(Arrays.asList(new TNL(DayOfWeek.WEDNESDAY,1330,1530,"P403",0b0000000001111000000000000),
				new TNL(DayOfWeek.FRIDAY,1330,1530,"P403",0b0000000001111000000000000)))));
		sql.add(new Session("객체지향프로그래밍", "안영아",3,
				new ArrayList<TNL>(Arrays.asList(new TNL(DayOfWeek.MONDAY,1000,1200,"4105",0b001111000000000000000000),
				new TNL(DayOfWeek.WEDNESDAY,1000,1200,"4105",0b001111000000000000000000)))));
		sql.add(new Session("객체지향프로그래밍", "박재철",3,
				new ArrayList<TNL>(Arrays.asList(new TNL(DayOfWeek.TUESDAY,1000,1200,"4105",0b001111000000000000000000),
				new TNL(DayOfWeek.THURSDAY,1000,1200,"4105",0b001111000000000000000000)))));
		sql.add(new Session("객체지향프로그래밍", "이호정",3,
				new ArrayList<TNL>(Arrays.asList(new TNL(DayOfWeek.TUESDAY,1300,1500,"P403",0b000000001111000000000000),
				new TNL(DayOfWeek.THURSDAY,1300,1500,"P403",0b000000001111000000000000)))));
		sql.add(new Session("객체지향프로그래밍", "한인",3,
				new ArrayList<TNL>(Arrays.asList(new TNL(DayOfWeek.TUESDAY,1700,1850,"4105",0b000000000000000011110000),
				new TNL(DayOfWeek.FRIDAY,1330,1530,"4105",0b0000000001111000000000000)))));
		sql.add(new Session("어드벤처디자인", "김경자",3,
				new ArrayList<TNL>(Arrays.asList(new TNL(DayOfWeek.MONDAY,1500,1700,"P401",0b000000000000111100000000),
				new TNL(DayOfWeek.WEDNESDAY,1530,1730,"P401",0b000000000000011110000000)))));
		sql.add(new Session("어드벤처디자인", "장혜령",3,
				new ArrayList<TNL>(Arrays.asList(new TNL(DayOfWeek.TUESDAY,1000,1200,"E326",0b001111000000000000000000),
				new TNL(DayOfWeek.THURSDAY,1000,1200,"E326",0b001111000000000000000000)))));
		sql.add(new Session("어드벤처디자인", "임상수",3,
				new ArrayList<TNL>(Arrays.asList(new TNL(DayOfWeek.WEDNESDAY,1330,1530,"P401",0b0000000001111000000000000),
				new TNL(DayOfWeek.FRIDAY,1300,1500,"P401",0b000000001111000000000000)))));
		sql.add(new Session("어드벤처디자인", "임상수",3,
				new ArrayList<TNL>(Arrays.asList(new TNL(DayOfWeek.WEDNESDAY,1330,1530,"P401",0b0000000001111000000000000),
				new TNL(DayOfWeek.FRIDAY,1300,1500,"P401",0b000000001111000000000000)))));
		sql.add(new Session("어드벤처디자인", "선석규",3,
				new ArrayList<TNL>(Arrays.asList(new TNL(DayOfWeek.MONDAY,1000,1200,"E326",0b001111000000000000000000),
				new TNL(DayOfWeek.FRIDAY,900,1100,"E326",0b011110000000000000000000)))));
		sql.add(new Session("어드벤처디자인", "강영태",3,
				new ArrayList<TNL>(Arrays.asList(new TNL(DayOfWeek.MONDAY,1300,1500,"P401",0b000000001111000000000000),
				new TNL(DayOfWeek.THURSDAY,1300,1500,"P401",0b000000001111000000000000)))));
		sql.add(new Session("시스템소프트웨어", "정준호",3,
				new ArrayList<TNL>(Arrays.asList(new TNL(DayOfWeek.MONDAY,1300,1500,"6119",0b000000001111000000000000),
				new TNL(DayOfWeek.WEDNESDAY,1330,1530,"6119",0b0000000001111000000000000)))));
		sql.add(new Session("시스템소프트웨어", "엄진영",3,
				new ArrayList<TNL>(Arrays.asList(new TNL(DayOfWeek.TUESDAY,1500,1700,"6119",0b000000000000111100000000),
				new TNL(DayOfWeek.THURSDAY,1500,1700,"4105",0b000000000000111100000000)))));
		sql.add(new Session("시스템소프트웨어", "석문기",3,
				new ArrayList<TNL>(Arrays.asList(new TNL(DayOfWeek.WEDNESDAY,1000,1200,"P403",0b001111000000000000000000),
				new TNL(DayOfWeek.FRIDAY,1000,1200,"P403",0b001111000000000000000000)))));
		sql.add(new Session("시스템소프트웨어", "엄진영",3,
				new ArrayList<TNL>(Arrays.asList(new TNL(DayOfWeek.MONDAY,1000,1200,"P403",0b001111000000000000000000),
				new TNL(DayOfWeek.THURSDAY,1000,1200,"P403",0b001111000000000000000000)))));
		sql.add(new Session("프로그래밍언어론", "송수환",3,
		        new ArrayList<>(Arrays.asList(
		                new TNL(DayOfWeek.MONDAY, 1500, 1630, "4147",0b000000000000111000000000),
		                new TNL(DayOfWeek.WEDNESDAY, 1530, 1700, "4147",0b000000000000011100000000)))));

		sql.add(new Session("프로그래밍언어론", "송수환",3,
		        new ArrayList<>(Arrays.asList(
		                new TNL(DayOfWeek.MONDAY, 1700, 1825, "4147",0b000000000000000011100000),
		                new TNL(DayOfWeek.WEDNESDAY, 1730, 1850, "4147",0b000000000000000001110000)))));

		sql.add(new Session("프로그래밍언어론", "류준수",3,
		        new ArrayList<>(Arrays.asList(
		                new TNL(DayOfWeek.MONDAY, 1300, 1430, "3182",0b000000001110000000000000),
		                new TNL(DayOfWeek.WEDNESDAY, 1330, 1500, "3182",0b000000000111000000000000)))));

		sql.add(new Session("자료구조", "선석규",3,
		        new ArrayList<>(Arrays.asList(
		                new TNL(DayOfWeek.MONDAY, 1500, 1700, "6119",0b000000000000111100000000),
		                new TNL(DayOfWeek.WEDNESDAY, 1530, 1730, "6119",0b000000000000011110000000)))));

		sql.add(new Session("자료구조", "선석규",3,
		        new ArrayList<>(Arrays.asList(
		                new TNL(DayOfWeek.TUESDAY, 1500, 1700, "P403",0b000000000000111100000000),
		                new TNL(DayOfWeek.THURSDAY, 1500, 1700, "P403",0b000000000000111100000000)))));

		sql.add(new Session("알고리즘", "주종화",3,
		        new ArrayList<>(Arrays.asList(
		                new TNL(DayOfWeek.MONDAY, 1000, 1200, "6119",0b001111000000000000000000),
		                new TNL(DayOfWeek.WEDNESDAY, 1000, 1200, "6119",0b001111000000000000000000)))));

		sql.add(new Session("알고리즘", "박재철",3,
		        new ArrayList<>(Arrays.asList(
		                new TNL(DayOfWeek.MONDAY, 1500, 1700, "P403",0b000000000000111100000000),
		                new TNL(DayOfWeek.WEDNESDAY, 1530, 1730, "P403",0b000000000000011110000000)))));

		sql.add(new Session("알고리즘", "정진우",3,
		        new ArrayList<>(Arrays.asList(
		                new TNL(DayOfWeek.TUESDAY, 1300, 1500, "6119",0b000000001111000000000000),
		                new TNL(DayOfWeek.THURSDAY, 1300, 1500, "6119",0b000000001111000000000000)))));

		sql.add(new Session("알고리즘", "윤인식",3,
		        new ArrayList<>(Arrays.asList(
		                new TNL(DayOfWeek.TUESDAY, 1000, 1200, "6119",0b001111000000000000000000),
		                new TNL(DayOfWeek.THURSDAY, 1000, 1200, "6119",0b001111000000000000000000)))));

		sql.add(new Session("알고리즘", "주종화",3,
		        new ArrayList<>(Arrays.asList(
		                new TNL(DayOfWeek.MONDAY, 1300, 1500, "4105",0b000000001111000000000000),
		                new TNL(DayOfWeek.WEDNESDAY, 1330, 1530, "4105",0b0000000001111000000000000)))));

		sql.add(new Session("인공지능수학", "윤승현",3,
		        new ArrayList<>(Arrays.asList(
		                new TNL(DayOfWeek.MONDAY, 1300, 1430, "6144",0b000000001110000000000000),
		                new TNL(DayOfWeek.WEDNESDAY, 1330, 1500, "6144",0b000000000111000000000000)))));

		sql.add(new Session("게임프로그래밍", "조경은",3,
		        new ArrayList<>(Arrays.asList(
		                new TNL(DayOfWeek.MONDAY, 1500, 1630, "4105",0b000000000000111000000000),
		                new TNL(DayOfWeek.WEDNESDAY, 1530, 1700, "4105",0b000000000000011100000000)))));

		sql.add(new Session("디지털영상처리", "이철",3,
		        new ArrayList<>(Arrays.asList(
		                new TNL(DayOfWeek.MONDAY, 1030, 1200, "4147",0b000111000000000000000000),
		                new TNL(DayOfWeek.WEDNESDAY, 1030, 1200, "4147",0b000111000000000000000000)))));

		sql.add(new Session("공개SW프로젝트", "이우진",3,
		        new ArrayList<>(Arrays.asList(
		                new TNL(DayOfWeek.FRIDAY, 900, 1300, "P402",0b111111110000000000000000)))));

		sql.add(new Session("공개SW프로젝트", "장혜령",3,
		        new ArrayList<>(Arrays.asList(
		                new TNL(DayOfWeek.FRIDAY, 900, 1300, "3115",0b111111110000000000000000)))));

		sql.add(new Session("공개SW프로젝트", "송수환",3,
		        new ArrayList<>(Arrays.asList(
		                new TNL(DayOfWeek.FRIDAY, 900, 1300, "4105",0b111111110000000000000000)))));

		sql.add(new Session("임베디드시스템", "이강우",3,
		        new ArrayList<>(Arrays.asList(
		                new TNL(DayOfWeek.MONDAY, 1500, 1700, "B161",0b000000000000111100000000),
		                new TNL(DayOfWeek.WEDNESDAY, 1530, 1730, "B161",0b000000000000011110000000)))));

		sql.add(new Session("임베디드시스템", "석문기",3,
		        new ArrayList<>(Arrays.asList(
		                new TNL(DayOfWeek.TUESDAY, 1300, 1500, "4105",0b000000001111000000000000),
		                new TNL(DayOfWeek.THURSDAY, 1300, 1500, "4105",0b000000001111000000000000)))));

		sql.add(new Session("소프트웨어공학", "성연식",3,
		        new ArrayList<>(Arrays.asList(
		                new TNL(DayOfWeek.TUESDAY, 1030, 1200, "4147",0b000111000000000000000000),
		                new TNL(DayOfWeek.THURSDAY, 1030, 1200, "4147",0b000111000000000000000000)))));

		sql.add(new Session("소프트웨어공학", "최은만",3,
		        new ArrayList<>(Arrays.asList(
		                new TNL(DayOfWeek.TUESDAY, 1300, 1430, "5145",0b000000001110000000000000),
		                new TNL(DayOfWeek.THURSDAY, 1300, 1430, "5145",0b000000001110000000000000)))));

		sql.add(new Session("소프트웨어공학", "이호정",3,
		        new ArrayList<>(Arrays.asList(
		                new TNL(DayOfWeek.TUESDAY, 1500, 1630, "P401",0b000000000000111000000000),
		                new TNL(DayOfWeek.THURSDAY, 1500, 1630, "P401",0b000000000000111000000000)))));

		sql.add(new Session("소프트웨어공학", "이현주",3,
		        new ArrayList<>(Arrays.asList(
		                new TNL(DayOfWeek.MONDAY, 1700, 1825, "6144",0b000000000000000011100000),
		                new TNL(DayOfWeek.WEDNESDAY, 1730, 1850, "6144",0b000000000000000001110000)))));

		sql.add(new Session("인공지능", "조성인",3,
		        new ArrayList<>(Arrays.asList(
		                new TNL(DayOfWeek.TUESDAY, 1500, 1630, "6144",0b000000000000111000000000),
		                new TNL(DayOfWeek.THURSDAY, 1700, 1825, "6144",0b000000000000000011100000)))));

		sql.add(new Session("인공지능", "조성인",3,
		        new ArrayList<>(Arrays.asList(
		                new TNL(DayOfWeek.TUESDAY, 1700, 1825, "6144",0b000000000000000011100000),
		                new TNL(DayOfWeek.THURSDAY, 1500, 1630, "6144",0b000000000000111000000000)))));

		sql.add(new Session("인공지능", "이우진",3,
		        new ArrayList<>(Arrays.asList(
		                new TNL(DayOfWeek.MONDAY, 1300, 1430, "5145",0b000000001110000000000000),
		                new TNL(DayOfWeek.WEDNESDAY, 1330, 1500, "5145",0b000000000111000000000000)))));

		sql.add(new Session("인공지능", "김지명",3,
		        new ArrayList<>(Arrays.asList(
		                new TNL(DayOfWeek.MONDAY, 1030, 1200, "5145",0b000111000000000000000000),
		                new TNL(DayOfWeek.WEDNESDAY, 1030, 1200, "5145",0b000111000000000000000000)))));

		sql.add(new Session("컴퓨터구조", "장태무",3,
		        new ArrayList<>(Arrays.asList(
		                new TNL(DayOfWeek.MONDAY, 1500, 1630, "5145",0b000000000000111000000000),
		                new TNL(DayOfWeek.WEDNESDAY, 1530, 1700, "5145",0b000000000000011100000000)))));

		sql.add(new Session("컴퓨터구조", "장태무",3,
		        new ArrayList<>(Arrays.asList(
		                new TNL(DayOfWeek.TUESDAY, 1700, 1825, "4147",0b000000000000000011100000),
		                new TNL(DayOfWeek.THURSDAY, 1700, 1825, "4147",0b000000000000000011100000)))));

		sql.add(new Session("컴파일러", "송수환",3,
		        new ArrayList<>(Arrays.asList(
		                new TNL(DayOfWeek.WEDNESDAY, 1030, 1200, "P401",0b000111000000000000000000),
		                new TNL(DayOfWeek.FRIDAY, 1300, 1430, "6144",0b000000001110000000000000)))));

		sql.add(new Session("종합설계1", "성연식",3,
		        new ArrayList<>(Arrays.asList(
		                new TNL(DayOfWeek.FRIDAY, 1530, 1915, "6144",0b000000000000011111111000)))));

		sql.add(new Session("종합설계1", "김동우",3,
		        new ArrayList<>(Arrays.asList(
		                new TNL(DayOfWeek.FRIDAY, 1530, 1915, "4147",0b000000000000011111111000)))));

		sql.add(new Session("종합설계2", "정준호",3,
		        new ArrayList<>(Arrays.asList(
		                new TNL(DayOfWeek.FRIDAY, 1730, 1915, "4142",0b000000000000000001111000),
		                new TNL(DayOfWeek.FRIDAY, 1530, 1730, "P405",0b000000000000011110000000)))));

		sql.add(new Session("종합설계2", "정진우",3,
		        new ArrayList<>(Arrays.asList(
		                new TNL(DayOfWeek.FRIDAY, 1530, 1915, "3115",0b000000000000011111111000)))));

		sql.add(new Session("종합설계2", "주종화",3,
		        new ArrayList<>(Arrays.asList(
		                new TNL(DayOfWeek.FRIDAY, 1530, 1915, "3182",0b000000000000011111111000)))));

		sql.add(new Session("종합설계2", "임상수",3,
		        new ArrayList<>(Arrays.asList(
		                new TNL(DayOfWeek.FRIDAY, 1530, 1915, "3183",0b000000000000011111111000)))));

		sql.add(new Session("종합설계2", "신연순",3,
		        new ArrayList<>(Arrays.asList(
		                new TNL(DayOfWeek.FRIDAY, 1530, 1915, "6119",0b000000000000011111111000)))));

		sql.add(new Session("데이터베이스설계", "이강만",3,
		        new ArrayList<>(Arrays.asList(
		                new TNL(DayOfWeek.MONDAY, 1300, 1500, "3115",0b000000001111000000000000),
		                new TNL(DayOfWeek.WEDNESDAY, 1330, 1530, "4147",0b0000000001111000000000000)))));

		sql.add(new Session("데이터베이스설계", "이우진",3,
		        new ArrayList<>(Arrays.asList(
		                new TNL(DayOfWeek.MONDAY, 1000, 1200, "3115",0b001111000000000000000000),
		                new TNL(DayOfWeek.WEDNESDAY, 1000, 1200, "3115",0b001111000000000000000000)))));

		sql.add(new Session("데이터베이스설계", "이우진",3,
		        new ArrayList<>(Arrays.asList(
		                new TNL(DayOfWeek.TUESDAY, 1500, 1700, "4147",0b000000000000111100000000),
		                new TNL(DayOfWeek.THURSDAY, 1500, 1700, "6119",0b000000000000111100000000)))));

		sql.add(new Session("데이터베이스설계", "이강만",3,
		        new ArrayList<>(Arrays.asList(
		                new TNL(DayOfWeek.TUESDAY, 1000, 1200, "4137",0b001111000000000000000000),
		                new TNL(DayOfWeek.THURSDAY, 1000, 1200, "4137",0b001111000000000000000000)))));

		sql.add(new Session("데이터통신입문", "안종석",3,
		        new ArrayList<>(Arrays.asList(
		                new TNL(DayOfWeek.TUESDAY, 1330, 1500, "6144",0b000000000111000000000000),
		                new TNL(DayOfWeek.THURSDAY, 1530, 1700, "5145",0b000000000000011100000000)))));

		sql.add(new Session("데이터통신입문", "안종석",3,
		        new ArrayList<>(Arrays.asList(
		                new TNL(DayOfWeek.TUESDAY, 1530, 1700, "5145",0b000000000000011100000000),
		                new TNL(DayOfWeek.THURSDAY, 1330, 1500, "6144",0b000000000111000000000000)))));

		sql.add(new Session("데이터통신입문", "장혜령",3,
		        new ArrayList<>(Arrays.asList(
		                new TNL(DayOfWeek.MONDAY, 1030, 1200, "6144",0b000111000000000000000000),
		                new TNL(DayOfWeek.WEDNESDAY, 1030, 1200, "6144",0b000111000000000000000000)))));

		sql.add(new Session("딥러닝입문", "김지희",3,
		        new ArrayList<>(Arrays.asList(
		                new TNL(DayOfWeek.MONDAY, 1300, 1430, "2166",0b000000001110000000000000),
		                new TNL(DayOfWeek.WEDNESDAY, 1330, 1500, "2166",0b000000000111000000000000)))));

		sql.add(new Session("딥러닝입문", "장혜령",3,
		        new ArrayList<>(Arrays.asList(
		                new TNL(DayOfWeek.MONDAY, 1500, 1630, "2166",0b000000000000111000000000),
		                new TNL(DayOfWeek.WEDNESDAY, 1530, 1700, "2166",0b000000000000011100000000)))));

		sql.add(new Session("딥러닝입문", "성연식",3,
		        new ArrayList<>(Arrays.asList(
		                new TNL(DayOfWeek.TUESDAY, 1300, 1430, "2166",0b000000001110000000000000),
		                new TNL(DayOfWeek.THURSDAY, 1300, 1430, "2166",0b000000001110000000000000)))));

		sql.add(new Session("딥러닝입문", "조성인",3,
		        new ArrayList<>(Arrays.asList(
		                new TNL(DayOfWeek.TUESDAY, 1030, 1200, "6144",0b000111000000000000000000),
		                new TNL(DayOfWeek.THURSDAY, 1030, 1200, "6144",0b000111000000000000000000)))));

		sql.add(new Session("컴퓨터비전입문", "조성인",3,
		        new ArrayList<>(Arrays.asList(
		                new TNL(DayOfWeek.MONDAY, 1500, 1630, "6144",0b000000000000111000000000),
		                new TNL(DayOfWeek.WEDNESDAY, 1530, 1700, "6144",0b000000000000011100000000)))));

		sql.add(new Session("웹서비스보안", "김효석",3,
		        new ArrayList<>(Arrays.asList(
		                new TNL(DayOfWeek.MONDAY, 1300, 1430, "4147",0b000000001110000000000000),
		                new TNL(DayOfWeek.THURSDAY, 1500, 1630, "4147",0b000000000000111000000000)))));

		sql.add(new Session("암호학과네트워크보안", "김동우",3,
		        new ArrayList<>(Arrays.asList(
		                new TNL(DayOfWeek.TUESDAY, 1030, 1200, "P401",0b000111000000000000000000),
		                new TNL(DayOfWeek.THURSDAY, 1030, 1200, "P401",0b000111000000000000000000)))));

		sql.add(new Session("웹프로그래밍", "송양의",3,
		        new ArrayList<>(Arrays.asList(
		                new TNL(DayOfWeek.TUESDAY, 1000, 1200, "3115",0b001111000000000000000000),
		                new TNL(DayOfWeek.THURSDAY, 1000, 1200, "3115",0b001111000000000000000000)))));

		sql.add(new Session("웹프로그래밍", "송양의",3,
		        new ArrayList<>(Arrays.asList(
		                new TNL(DayOfWeek.TUESDAY, 1300, 1500, "3115",0b000000001111000000000000),
		                new TNL(DayOfWeek.THURSDAY, 1300, 1500, "3115",0b000000001111000000000000)))));

		sql.add(new Session("웹프로그래밍", "김신우",3,
		        new ArrayList<>(Arrays.asList(
		                new TNL(DayOfWeek.TUESDAY, 1600, 1800, "4137",0b000000000000001111000000),
		                new TNL(DayOfWeek.THURSDAY, 1600, 1800, "4137",0b000000000000001111000000)))));

		sql.add(new Session("SW비즈니스와창업", "이현주",3,
		        new ArrayList<>(Arrays.asList(
		                new TNL(DayOfWeek.THURSDAY, 1825, 2100, "6144",0b000000000000000000111111)))));
		
		sql.add(new Session("커리어디자인", "임윤서",1,
		        new ArrayList<>(Arrays.asList(
		                new TNL(DayOfWeek.WEDNESDAY, 900, 1100, "M117",0b111100000000000000000000)))));
		sql.add(new Session("커리어디자인", "임윤서",1,
		        new ArrayList<>(Arrays.asList(
		                new TNL(DayOfWeek.THURSDAY, 1030, 1130, "M117",0b00011110000000000000000)))));
		sql.add(new Session("커리어디자인", "임윤서",1,
		        new ArrayList<>(Arrays.asList(
		                new TNL(DayOfWeek.THURSDAY, 1330, 1430, "L501",0b000000000111100000000000)))));
		
		sql.add(new Session("커리어디자인", "이준일",1,
		        new ArrayList<>(Arrays.asList(
		                new TNL(DayOfWeek.TUESDAY, 1400, 1500, "L302",0b000000000011000000000000)))));
		sql.add(new Session("커리어디자인", "이준일",1,
		        new ArrayList<>(Arrays.asList(
		                new TNL(DayOfWeek.WEDNESDAY, 900, 1100, "L305",0b111100000000000000000000)))));
		sql.add(new Session("커리어디자인", "이준일",1,
		        new ArrayList<>(Arrays.asList(
		                new TNL(DayOfWeek.THURSDAY, 1000, 1200, "J212",0b001111000000000000000000)))));
		sql.add(new Session("커리어디자인", "이준일",1,
		        new ArrayList<>(Arrays.asList(
		                new TNL(DayOfWeek.FRIDAY, 1030, 1230, "P207",0b000111100000000000000000)))));
		
		sql.add(new Session("커리어디자인", "이소은", 1,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.FRIDAY, 1500, 1600, "M117", 0b000000000000110000000000))))); 
		sql.add(new Session("커리어디자인", "이소은", 1,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.FRIDAY, 1400, 1500, "M117", 0b000000000011000000000000))))); 
		sql.add(new Session("커리어디자인", "이소은", 1,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.FRIDAY, 1200, 1400, "M117", 0b000000111100000000000000))))); 
		sql.add(new Session("커리어디자인", "이소은", 1,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.FRIDAY, 900, 1100, "J314", 0b111100000000000000000000))))); 
		
		sql.add(new Session("커리어디자인", "우혜인", 1,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.TUESDAY, 1300, 1400, "M111", 0b000000001100000000000000))))); 
		sql.add(new Session("커리어디자인", "우혜인", 1,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.TUESDAY, 1030, 1130, "M111", 0b00011110000000000000000))))); 
		
		sql.add(new Session("커리어디자인", "오준일", 1,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.FRIDAY , 1030, 1230, "M114", 0b00011110000000000000000))))); 
		sql.add(new Session("커리어디자인", "오준일", 1,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.FRIDAY , 900, 1000, "M111", 0b110000000000000000000000))))); 
		
		sql.add(new Session("커리어디자인", "송혜령", 1,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.TUESDAY  , 1330, 1530, "K344", 0b000000000111100000000000))))); 
		sql.add(new Session("커리어디자인", "송혜령", 1,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.TUESDAY  , 1030, 1230, "K460", 0b00011110000000000000000))))); 
		sql.add(new Session("커리어디자인", "송혜령", 1,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.THURSDAY  , 1330, 1530, "L305", 0b000000000111100000000000))))); 
		sql.add(new Session("커리어디자인", "송혜령", 1,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.THURSDAY  , 900, 1100, "201", 0b111100000000000000000000)))));
		
		sql.add(new Session("커리어디자인", "문재영", 1,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.TUESDAY   , 1330, 1530, "M117", 0b000000000111100000000000))))); 
		sql.add(new Session("커리어디자인", "문재영", 1,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.TUESDAY   , 1130, 1230, "K311", 0b00000110000000000000000))))); 
		
		sql.add(new Session("BasicEAS", "김민서", 0,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.MONDAY , 1330, 1530, "K458", 0b00000000011110000000000)))));
		sql.add(new Session("BasicEAS", "손윤희", 0,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.WEDNESDAY , 1200, 1400, "K456", 0b00000011110000000000000)))));
		sql.add(new Session("BasicEAS", "황선희", 0,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.FRIDAY   , 900, 1100, "K462", 0b11110000000000000000000)))));
		sql.add(new Session("BasicEAS", "정선혜", 0,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.THURSDAY   , 900, 1100, "K362", 0b11110000000000000000000)))));
		
		sql.add(new Session("기술창조와특허", "오승택", 3,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.TUESDAY    , 900, 1200, "P202", 0b11111100000000000000000)))));
		sql.add(new Session("기술창조와특허", "오승택", 3,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.TUESDAY    , 1600, 1850, "J414", 0b000000000000001111110000)))));
		sql.add(new Session("기술창조와특허", "공희정", 3,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.THURSDAY     , 1430, 1730, "J211", 0b000000000011111100000000)))));
		sql.add(new Session("기술창조와특허", "공희정", 3,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.WEDNESDAY  , 1430, 1730, "P205", 0b000000000011111100000000)))));
		sql.add(new Session("기술창조와특허", "임중연", 3,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.FRIDAY      , 1800, 2030, "Q301", 0b000000000000000000111110)))));
		sql.add(new Session("기술창조와특허", "임중연", 3,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.MONDAY   , 1800, 2030, "Q301", 0b000000000000000000111110)))));
		
		sql.add(new Session("공학윤리", "문재태", 3,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.FRIDAY      , 1800, 2030, "P202", 0b000000000000000000111110)))));
		sql.add(new Session("공학윤리", "김종우", 3,
			    new ArrayList<>(Arrays.asList(
			    		new TNL(DayOfWeek.TUESDAY    , 1200, 1330, "J314", 0b000000111000000000000000),
			        new TNL(DayOfWeek.THURSDAY     , 1200, 1330, "J314", 0b000000111000000000000000)))));
		
		sql.add(new Session("공학경제", "백정우", 3,
			    new ArrayList<>(Arrays.asList(
			    		new TNL(DayOfWeek.WEDNESDAY     , 1600, 1730, "J315", 0b000000000000001110000000),
			        new TNL(DayOfWeek.FRIDAY  , 1600, 1730, "J315", 0b000000000000001110000000)))));
		sql.add(new Session("공학윤리", "김소정", 3,
			    new ArrayList<>(Arrays.asList(
			    		new TNL(DayOfWeek.MONDAY     , 1200, 1330, "J315", 0b000000111000000000000000),
			        new TNL(DayOfWeek.WEDNESDAY      , 1100, 1230, "J315", 0b000011100000000000000000)))));
		sql.add(new Session("공학윤리", "서용윤", 3,
			    new ArrayList<>(Arrays.asList(
			    		new TNL(DayOfWeek.MONDAY     , 1630, 1800, "J315", 0b000000000000000111000000),
			        new TNL(DayOfWeek.WEDNESDAY      , 1400, 1530, "J315", 0b000000000111000000000000)))));
		sql.add(new Session("공학윤리", "김상직", 3,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.THURSDAY       , 1800, 2030, "Q302", 0b000000000000000000111110)))));
		sql.add(new Session("공학윤리", "홍성조", 3,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.TUESDAY       , 1800, 2030, "P202", 0b000000000000000000111110)))));
		
		sql.add(new Session("이산수학", "장은실", 3,
			    new ArrayList<>(Arrays.asList(
			    		new TNL(DayOfWeek.TUESDAY      , 1600, 1730, "Q302", 0b000000000000001110000000),
			        new TNL(DayOfWeek.THURSDAY       , 1630, 1800, "Q302", 0b000000000000000111000000)))));
		sql.add(new Session("이산수학", "윤인식", 3,
			    new ArrayList<>(Arrays.asList(
			    		new TNL(DayOfWeek.TUESDAY      , 1200, 1330, "6144", 0b000000111000000000000000),
			        new TNL(DayOfWeek.THURSDAY       , 1200, 1330, "6144", 0b000000111000000000000000)))));
		
		sql.add(new Session("미적분학및연습1", "엄건애", 3,
			    new ArrayList<>(Arrays.asList(
			    		new TNL(DayOfWeek.TUESDAY      , 1030, 1200, "P207", 0b00011100000000000000000),
			        new TNL(DayOfWeek.THURSDAY       , 1030, 1200, "P207", 0b00011100000000000000000)))));
		sql.add(new Session("미적분학및연습1", "박정준", 3,
			    new ArrayList<>(Arrays.asList(
			    		new TNL(DayOfWeek.TUESDAY      , 1330, 1500, "K462", 0b00000000011100000000000),
			        new TNL(DayOfWeek.THURSDAY       , 1330, 1500, "K462", 0b00000000011100000000000)))));
		sql.add(new Session("미적분학및연습1", "박장희", 3,
			    new ArrayList<>(Arrays.asList(
			    		new TNL(DayOfWeek.MONDAY       , 1630, 1800, "P201", 0b000000000000000111000000),
			        new TNL(DayOfWeek.WEDNESDAY        , 1400, 1530, "P201", 0b000000000111000000000000)))));
		
		sql.add(new Session("일반생물학및실험2", "조선희", 3,
			    new ArrayList<>(Arrays.asList(
			    		new TNL(DayOfWeek.TUESDAY        , 1600, 1800, "2158", 0b000000000000001111000000),
			        new TNL(DayOfWeek.FRIDAY         , 1400, 1600, "2158", 0b000000000111100000000000)))));
		
		sql.add(new Session("물리학개론", "오형택", 3,
			    new ArrayList<>(Arrays.asList(
			    		new TNL(DayOfWeek.TUESDAY        , 1400, 1530, "J413", 0b000000000111000000000000),
			        new TNL(DayOfWeek.FRIDAY         , 1400, 1530, "J413", 0b000000000111000000000000)))));
		sql.add(new Session("물리학개론", "김선배", 3,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.TUESDAY  , 1800, 2030, "D305", 0b000000000000000000111110)))));
		
		sql.add(new Session("지구환경과학", "조봉연", 3,
			    new ArrayList<>(Arrays.asList(
			    		new TNL(DayOfWeek.MONDAY         , 1200, 1330, "Q301", 0b000000111000000000000000),
			        new TNL(DayOfWeek.WEDNESDAY          , 1100, 1230, "Q301", 0b000011100000000000000000)))));
		sql.add(new Session("지구환경과학", "조봉연", 3,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.WEDNESDAY   , 1800, 2030, "Q301", 0b000000000000000000111110)))));
		
		sql.add(new Session("공학수학1", "심호진", 3,
			    new ArrayList<>(Arrays.asList(
			    		new TNL(DayOfWeek.MONDAY         , 1500, 1630, "A321", 0b000000000000111000000000),
			        new TNL(DayOfWeek.WEDNESDAY          , 1530, 1700, "A321", 0b000000000000011100000000)))));
		sql.add(new Session("공학수학1", "심호진", 3,
			    new ArrayList<>(Arrays.asList(
			    		new TNL(DayOfWeek.MONDAY         , 1630, 1800, "Q302", 0b000000000000000111000000),
			        new TNL(DayOfWeek.WEDNESDAY          , 1400, 1530, "Q302", 0b000000000111000000000000)))));
		sql.add(new Session("공학수학1", "박호", 3,
			    new ArrayList<>(Arrays.asList(
			    		new TNL(DayOfWeek.TUESDAY          , 1600, 1730, "Q301", 0b000000000000001110000000),
			        new TNL(DayOfWeek.THURSDAY           , 1600, 1730, "Q301", 0b000000000000001110000000)))));
		sql.add(new Session("공학수학1", "연미정", 3,
			    new ArrayList<>(Arrays.asList(
			    		new TNL(DayOfWeek.WEDNESDAY          , 1600, 1730, "Q301", 0b000000000000001110000000),
			        new TNL(DayOfWeek.FRIDAY           , 1600, 1730, "Q301", 0b000000000000001110000000)))));
		
		sql.add(new Session("생물학개론", "이재영", 3,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.WEDNESDAY   , 1800, 2030, "Q302", 0b000000000000000000111110)))));
		sql.add(new Session("생물학개론", "이보영", 3,
			    new ArrayList<>(Arrays.asList(
			    		new TNL(DayOfWeek.WEDNESDAY           , 1230, 1400, "Q302", 0b000000011100000000000000),
			        new TNL(DayOfWeek.FRIDAY            , 1200, 1330, "Q302", 0b000000111000000000000000)))));
		sql.add(new Session("생물학개론", "이보영", 3,
			    new ArrayList<>(Arrays.asList(
			    		new TNL(DayOfWeek.MONDAY           , 1630, 1800, "J212", 0b000000000000000111000000),
			        new TNL(DayOfWeek.WEDNESDAY            , 1400, 1530, "J212", 0b000000000111000000000000)))));
		sql.add(new Session("생물학개론", "한미희", 3,
			    new ArrayList<>(Arrays.asList(
			    		new TNL(DayOfWeek.TUESDAY          , 1200, 1330, "J212", 0b000000111000000000000000),
			        new TNL(DayOfWeek.THURSDAY           , 1200, 1330, "J212", 0b000000111000000000000000)))));
		sql.add(new Session("생물학개론", "한미희", 3,
			    new ArrayList<>(Arrays.asList(
			    		new TNL(DayOfWeek.TUESDAY           , 1600, 1730, "J212", 0b000000000000001110000000),
			        new TNL(DayOfWeek.THURSDAY            , 1630, 1800, "J212", 0b000000000000000111000000)))));
		
		sql.add(new Session("화학개론", "윤성욱", 3,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.WEDNESDAY   , 1800, 2030, "J111", 0b000000000000000000111110)))));
		sql.add(new Session("화학개론", "임재희", 3,
			    new ArrayList<>(Arrays.asList(
			    		new TNL(DayOfWeek.MONDAY           , 1400, 1530, "342", 0b000000000111000000000000),
			        new TNL(DayOfWeek.WEDNESDAY            , 1400, 1530, "342", 0b000000000111000000000000)))));
		sql.add(new Session("화학개론", "문혜영", 3,
			    new ArrayList<>(Arrays.asList(
			    		new TNL(DayOfWeek.MONDAY           , 1200, 1330, "K344", 0b000000111000000000000000),
			        new TNL(DayOfWeek.WEDNESDAY           , 1200, 1330, "K344", 0b000000111000000000000000)))));
		sql.add(new Session("화학개론", "유미경", 3,
			    new ArrayList<>(Arrays.asList(
			    		new TNL(DayOfWeek.TUESDAY           , 1600, 1730, "J111", 0b000000000000001110000000),
			        new TNL(DayOfWeek.THURSDAY            , 1700, 1825, "J111", 0b000000000000000011100000)))));
		
		sql.add(new Session("공학선형대수학", "송윤애", 3,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.TUESDAY   , 1800, 2030, "A336", 0b000000000000000000111110)))));
		sql.add(new Session("공학선형대수학", "최광호", 3,
			    new ArrayList<>(Arrays.asList(
			    		new TNL(DayOfWeek.WEDNESDAY           , 1000, 1130, "P201", 0b00111000000000000000000),
			        new TNL(DayOfWeek.FRIDAY            , 1000, 1130, "P201", 0b00111000000000000000000)))));
		sql.add(new Session("공학선형대수학", "연미정", 3,
			    new ArrayList<>(Arrays.asList(
			    		new TNL(DayOfWeek.TUESDAY           , 1400, 1530, "A333", 0b000000000111000000000000),
			        new TNL(DayOfWeek.FRIDAY            , 1400, 1530, "A333", 0b000000000111000000000000)))));
		sql.add(new Session("공학선형대수학", "오승익", 3,
			    new ArrayList<>(Arrays.asList(
			    		new TNL(DayOfWeek.WEDNESDAY          , 1600, 1730, "Q302", 0b000000000000001110000000),
			        new TNL(DayOfWeek.FRIDAY           , 1600, 1730, "Q302", 0b000000000000001110000000)))));
		sql.add(new Session("공학선형대수학", "박호", 3,
			    new ArrayList<>(Arrays.asList(
			    		new TNL(DayOfWeek.TUESDAY           , 1200, 1330, "Q302", 0b000000111000000000000000),
			        new TNL(DayOfWeek.THURSDAY            , 1200, 1330, "Q302", 0b000000111000000000000000)))));
		
		sql.add(new Session("확률및통계학", "곽화륜", 3,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.MONDAY, 1800, 2030, "A321", 0b000000000000000000111110)))));
		sql.add(new Session("확률및통계학", "곽화륜", 3,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.WEDNESDAY, 1800, 2030, "A321", 0b000000000000000000111110)))));
		sql.add(new Session("확률및통계학", "김희경", 3,
			    new ArrayList<>(Arrays.asList(
			    		new TNL(DayOfWeek.MONDAY         , 1100, 1230, "K356", 0b000011100000000000000000),
			        new TNL(DayOfWeek.WEDNESDAY          , 1100, 1230, "K356", 0b000011100000000000000000)))));
		sql.add(new Session("확률및통계학", "최은희", 3,
			    new ArrayList<>(Arrays.asList(
			    		new TNL(DayOfWeek.MONDAY           , 1200, 1330, "K342", 0b000000111000000000000000),
			        new TNL(DayOfWeek.WEDNESDAY           , 1100, 1230, "K342", 0b000001110000000000000000)))));
		
		sql.add(new Session("기술보고서작성및발표", "오명원", 3,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.MONDAY, 900, 1200, "K462", 0b111111000000000000000000)))));
		sql.add(new Session("기술보고서작성및발표", "최성연", 3,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.MONDAY, 900, 1200, "E550", 0b111111000000000000000000)))));
		sql.add(new Session("기술보고서작성및발표", "최수진", 3,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.TUESDAY , 900, 1200, "K221", 0b111111000000000000000000)))));
		sql.add(new Session("기술보고서작성및발표", "최현경", 3,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.TUESDAY , 900, 1200, "K361", 0b111111000000000000000000)))));
		sql.add(new Session("기술보고서작성및발표", "조미라", 3,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.TUESDAY , 900, 1200, "K356", 0b111111000000000000000000)))));
		sql.add(new Session("기술보고서작성및발표", "오명원", 3,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.THURSDAY , 900, 1200, "K356", 0b111111000000000000000000)))));
		sql.add(new Session("기술보고서작성및발표", "최수진", 3,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.TUESDAY  , 1330, 1630, "K362", 0b000000001111110000000000)))));
		sql.add(new Session("기술보고서작성및발표", "조미라", 3,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.MONDAY  , 1330, 1630, "K356", 0b000000001111110000000000)))));
		sql.add(new Session("기술보고서작성및발표", "이재섭", 3,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.THURSDAY , 1330, 1630, "K356", 0b000000001111110000000000)))));
		sql.add(new Session("기술보고서작성및발표", "전용덕", 3,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.THURSDAY , 1300, 1600, "J211", 0b000000011111100000000000)))));
		
		sql.add(new Session("미적분학및연습2", "조영덕", 3,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.TUESDAY , 1800, 2030, "A333", 0b000000000000000000111110)))));
		sql.add(new Session("미적분학및연습2", "박장희", 3,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.MONDAY , 1800, 2030, "P202", 0b000000000000000000111110)))));
		sql.add(new Session("미적분학및연습2", "박상웅", 3,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.WEDNESDAY , 1800, 2030, "A333", 0b000000000000000000111110)))));
		sql.add(new Session("미적분학및연습2", "오승익", 3,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.WEDNESDAY , 1800, 2030, "P304", 0b000000000000000000111110)))));
		sql.add(new Session("미적분학및연습2", "임영빈", 3,
			    new ArrayList<>(Arrays.asList(
			    		new TNL(DayOfWeek.MONDAY           , 1200, 1330, "P304", 0b000000111000000000000000),
			        new TNL(DayOfWeek.WEDNESDAY           , 1100, 1230, "P304", 0b000001110000000000000000)))));
		sql.add(new Session("미적분학및연습2", "조영덕", 3,
			    new ArrayList<>(Arrays.asList(
			    		new TNL(DayOfWeek.MONDAY           , 1200, 1330, "P202", 0b000000111000000000000000),
			        new TNL(DayOfWeek.WEDNESDAY           , 1100, 1230, "P202", 0b000001110000000000000000)))));
		sql.add(new Session("미적분학및연습2", "송윤애", 3,
			    new ArrayList<>(Arrays.asList(
			    		new TNL(DayOfWeek.WEDNESDAY            , 1200, 1330, "A350", 0b000000111000000000000000),
			        new TNL(DayOfWeek.FRIDAY            , 1200, 1330, "A350", 0b000000111000000000000000)))));
		sql.add(new Session("미적분학및연습2", "조영덕", 3,
			    new ArrayList<>(Arrays.asList(
			    		new TNL(DayOfWeek.WEDNESDAY            , 1230, 1400, "P303", 0b000000011100000000000000),
			        new TNL(DayOfWeek.FRIDAY            , 1200, 1330, "P303", 0b000000111000000000000000)))));
		sql.add(new Session("미적분학및연습2", "연미정", 3,
			    new ArrayList<>(Arrays.asList(
			    		new TNL(DayOfWeek.MONDAY           , 1630, 1800, "514", 0b000000000000000111000000),
			        new TNL(DayOfWeek.WEDNESDAY            , 1400, 1530, "514", 0b000000000111000000000000)))));
		sql.add(new Session("미적분학및연습2", "김동호", 3,
			    new ArrayList<>(Arrays.asList(
			    		new TNL(DayOfWeek.TUESDAY           , 1600, 1730, "328", 0b000000000000001110000000),
			        new TNL(DayOfWeek.THURSDAY            , 1630, 1800, "328", 0b000000000000001110000000)))));
		sql.add(new Session("미적분학및연습2", "임영빈", 3,
			    new ArrayList<>(Arrays.asList(
			    		new TNL(DayOfWeek.TUESDAY           , 1600, 1730, "P202", 0b000000000000001110000000),
			        new TNL(DayOfWeek.THURSDAY            , 1630, 1800, "P202", 0b000000000000001110000000)))));
		sql.add(new Session("미적분학및연습2", "박정준", 3,
			    new ArrayList<>(Arrays.asList(
			    		new TNL(DayOfWeek.TUESDAY         , 1500, 1630, "K462", 0b000000000000111000000000),
			        new TNL(DayOfWeek.THURSDAY          , 1500, 1630, "K462", 0b000000000000111000000000)))));
		sql.add(new Session("미적분학및연습2", "박호", 3,
			    new ArrayList<>(Arrays.asList(
			    		new TNL(DayOfWeek.TUESDAY, 1400, 1530, "315", 0b000000000111000000000000),
			        new TNL(DayOfWeek.THURSDAY, 1430, 1600, "315", 0b000000000011100000000000)))));
		sql.add(new Session("미적분학및연습2", "김동호", 3,
			    new ArrayList<>(Arrays.asList(
			    		new TNL(DayOfWeek.TUESDAY, 1400, 1530, "315", 0b000000000111000000000000),
			        new TNL(DayOfWeek.THURSDAY, 1400, 1530, "315", 0b000000000111000000000000)))));
		sql.add(new Session("미적분학및연습2", "임영빈", 3,
			    new ArrayList<>(Arrays.asList(
			    		new TNL(DayOfWeek.TUESDAY, 1400, 1530, "P304", 0b000000000111000000000000),
			        new TNL(DayOfWeek.THURSDAY, 1400, 1530, "P304", 0b000000000111000000000000)))));
		sql.add(new Session("미적분학및연습2", "엄건애", 3,
			    new ArrayList<>(Arrays.asList(
			    		new TNL(DayOfWeek.TUESDAY, 1400, 1530, "M216", 0b000000000111000000000000),
			        new TNL(DayOfWeek.THURSDAY, 1400, 1530, "M216", 0b000000000111000000000000)))));
		sql.add(new Session("미적분학및연습2", "박상웅", 3,
			    new ArrayList<>(Arrays.asList(
			    		new TNL(DayOfWeek.TUESDAY, 1400, 1530, "207-6", 0b000000000111000000000000),
			        new TNL(DayOfWeek.THURSDAY, 1400, 1530, "207-6", 0b000000000111000000000000)))));
		sql.add(new Session("미적분학및연습2", "조영덕", 3,
			    new ArrayList<>(Arrays.asList(
			    		new TNL(DayOfWeek.TUESDAY, 1200, 1330, "P201", 0b000000111000000000000000),
			        new TNL(DayOfWeek.THURSDAY, 1200, 1330, "P201", 0b000000111000000000000000)))));
		sql.add(new Session("미적분학및연습2", "엄건애", 3,
			    new ArrayList<>(Arrays.asList(
			    		new TNL(DayOfWeek.TUESDAY, 1200, 1330, "P304", 0b000000111000000000000000),
			        new TNL(DayOfWeek.THURSDAY, 1200, 1330, "P304", 0b000000111000000000000000)))));
		sql.add(new Session("미적분학및연습2", "임영빈", 3,
			    new ArrayList<>(Arrays.asList(
			    		new TNL(DayOfWeek.TUESDAY, 1200, 1330, "P207", 0b000000111000000000000000),
			        new TNL(DayOfWeek.THURSDAY, 1200, 1330, "P207", 0b000000111000000000000000)))));
		
		sql.add(new Session("자아와명상1", "김동하", 1,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.MONDAY  , 900, 1000, "B262", 0b110000000000000000000000)))));
		sql.add(new Session("자아와명상1", "하영수", 1,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.TUESDAY  , 900, 1000, "B262", 0b110000000000000000000000)))));
		sql.add(new Session("자아와명상1", "정주영", 1,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.WEDNESDAY  , 900, 1000, "K309", 0b110000000000000000000000)))));
		sql.add(new Session("자아와명상1", "정주영", 1,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.THURSDAY  , 900, 1000, "B262", 0b110000000000000000000000)))));
		sql.add(new Session("자아와명상1", "김종욱", 1,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.FRIDAY  , 900, 1000, "B262", 0b110000000000000000000000)))));
		sql.add(new Session("자아와명상1", "이동하", 1,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.MONDAY   , 1330, 1430, "B262", 0b000000001100000000000000)))));
		sql.add(new Session("자아와명상1", "전윤성", 1,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.THURSDAY   , 1330, 1430, "B262", 0b000000001100000000000000)))));
		sql.add(new Session("자아와명상1", "공태휴", 1,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.TUESDAY    , 1300, 1400, "202", 0b000000011000000000000000)))));
		sql.add(new Session("자아와명상1", "공태휴", 1,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.TUESDAY    , 1100, 1200, "202", 0b000110000000000000000000)))));
		sql.add(new Session("자아와명상1", "김창하", 1,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.MONDAY     , 1800, 1850, "202", 0b000000000000000000110000)))));
		sql.add(new Session("자아와명상1", "김창하", 1,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.MONDAY     , 1850, 1940, "202", 0b000000000000000000011100)))));
		
		sql.add(new Session("EAS1", "션커맨", 2,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.WEDNESDAY   , 900, 1100, "M136", 0b111100000000000000000000)))));
		sql.add(new Session("EAS1", "데미안", 2,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.WEDNESDAY   , 900, 1100, "M129", 0b111100000000000000000000)))));
		sql.add(new Session("EAS1", "데미안", 2,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.TUESDAY     , 1825, 2005, "M129", 0b000000000000000000111110)))));
		sql.add(new Session("EAS1", "제프벨리", 2,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.MONDAY      , 1825, 2005, "M129", 0b000000000000000000111110)))));
		sql.add(new Session("EAS1", "데런크레인", 2,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.MONDAY       , 1630, 1825, "M134", 0b000000000000000111100000)))));
		sql.add(new Session("EAS1", "데미안", 2,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.MONDAY       , 1630, 1825, "M136", 0b000000000000000111100000)))));
		sql.add(new Session("EAS1", "데이린프롤리", 2,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.THURSDAY       , 1630, 1825, "M134", 0b000000000000000111100000)))));
		sql.add(new Session("EAS1", "캐서린무어", 2,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.THURSDAY       , 1630, 1825, "M136", 0b000000000000000111100000)))));
		sql.add(new Session("EAS1", "션커맨", 2,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.TUESDAY        , 1400, 1600, "M134", 0b000000000111100000000000)))));
		sql.add(new Session("EAS1", "데런크레인", 2, 
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.TUESDAY        , 1400, 1600, "M136", 0b000000000111100000000000)))));
		sql.add(new Session("EAS1", "데런크레인", 2,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.WEDNESDAY        , 1400, 1600, "M136", 0b000000000111100000000000)))));
		sql.add(new Session("EAS1", "캐서린무어", 2,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.WEDNESDAY        , 1400, 1600, "M129", 0b000000000111100000000000)))));
		sql.add(new Session("EAS1", "데미안", 2,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.FRIDAY        , 1400, 1600, "M136", 0b000000000111100000000000)))));
		sql.add(new Session("EAS1", "캐서린무어", 2, 
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.FRIDAY        , 1400, 1600, "M129", 0b000000000111100000000000)))));
		sql.add(new Session("EAS1", "데런크레인", 2,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.TUESDAY        , 1600, 1800, "M134", 0b000000000000001111000000)))));
		sql.add(new Session("EAS1", "제프벨리", 2,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.TUESDAY        , 1600, 1800, "113", 0b000000000000001111000000)))));
		sql.add(new Session("EAS1", "데런크레인", 2,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.WEDNESDAY        , 1600, 1800, "M134", 0b000000000000001111000000)))));
		sql.add(new Session("EAS1", "제프벨리", 2,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.WEDNESDAY        , 1600, 1800, "K458", 0b000000000000001111000000)))));
		sql.add(new Session("EAS1", "데미안", 2,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.FRIDAY        , 1600, 1800, "M136", 0b000000000000001111000000)))));
		
		sql.add(new Session("불교와인간", "김보과", 2, 
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.MONDAY     , 1850, 2030, "K315", 0b000000000000000000011110)))));
		sql.add(new Session("불교와인간", "오진영", 2,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.MONDAY    , 900, 1100, "K439", 0b111100000000000000000000)))));
		sql.add(new Session("불교와인간", "고영섭", 2,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.MONDAY    , 900, 1100, "K432", 0b111100000000000000000000)))));
		sql.add(new Session("불교와인간", "김두진", 2,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.MONDAY    , 900, 1100, "K352", 0b111100000000000000000000)))));
		sql.add(new Session("불교와인간", "성청환", 2,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.TUESDAY    , 900, 1100, "K357", 0b111100000000000000000000)))));
		sql.add(new Session("불교와인간", "홍나연", 2,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.TUESDAY    , 900, 1100, "K352", 0b111100000000000000000000)))));
		sql.add(new Session("불교와인간", "오명지", 2,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.TUESDAY    , 900, 1100, "J212", 0b111100000000000000000000)))));
		sql.add(new Session("불교와인간", "김보과", 2,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.TUESDAY    , 900, 1100, "J413", 0b111100000000000000000000)))));
		sql.add(new Session("불교와인간", "이석환", 2,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.WEDNESDAY    , 900, 1100, "K219", 0b111100000000000000000000)))));
		sql.add(new Session("불교와인간", "김은영", 2,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.WEDNESDAY    , 900, 1100, "J212", 0b111100000000000000000000)))));
		sql.add(new Session("불교와인간", "김지연", 2,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.WEDNESDAY    , 900, 1100, "J413", 0b111100000000000000000000)))));
		sql.add(new Session("불교와인간", "권순범", 2,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.WEDNESDAY    , 900, 1100, "K413", 0b111100000000000000000000)))));
		sql.add(new Session("불교와인간", "양현희", 2,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.WEDNESDAY    , 900, 1100, "J104", 0b111100000000000000000000)))));
		sql.add(new Session("불교와인간", "문진영", 2,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.THURSDAY    , 900, 1100, "K344", 0b111100000000000000000000)))));
		sql.add(new Session("불교와인간", "명계환", 2,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.THURSDAY    , 900, 1100, "K311", 0b111100000000000000000000)))));
		sql.add(new Session("불교와인간", "조종복", 2,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.THURSDAY    , 900, 1100, "K357", 0b111100000000000000000000)))));
		sql.add(new Session("불교와인간", "전효진", 2,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.FRIDAY    , 900, 1100, "J211", 0b111100000000000000000000)))));
		sql.add(new Session("불교와인간", "이동형", 2,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.FRIDAY    , 900, 1100, "K357", 0b111100000000000000000000)))));
		sql.add(new Session("불교와인간", "이민성", 2,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.FRIDAY    , 900, 1100, "K311", 0b111100000000000000000000)))));
		sql.add(new Session("불교와인간", "문유정", 2,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.FRIDAY    , 900, 1100, "J212", 0b111100000000000000000000)))));
		sql.add(new Session("불교와인간", "명계환", 2,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.FRIDAY    , 1330, 1530, "K342", 0b000000001111000000000000)))));
		sql.add(new Session("불교와인간", "김수진", 2,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.TUESDAY     , 1330, 1530, "J212", 0b000000001111000000000000)))));
		sql.add(new Session("불교와인간", "이형열", 2,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.TUESDAY    , 1330, 1530, "P201", 0b000000001111000000000000)))));
		sql.add(new Session("불교와인간", "고영섭", 2,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.MONDAY     , 1330, 1530, "K32", 0b000000001111000000000000)))));
		sql.add(new Session("불교와인간", "김두진", 2,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.MONDAY     , 1330, 1530, "K352", 0b000000001111000000000000)))));
		sql.add(new Session("불교와인간", "서정원", 2,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.MONDAY     , 1330, 1530, "J314", 0b000000001111000000000000)))));
		sql.add(new Session("불교와인간", "박대용", 2,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.MONDAY     , 1330, 1530, "J212", 0b000000001111000000000000)))));
		sql.add(new Session("불교와인간", "권정현", 2,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.MONDAY     , 1330, 1530, "L305", 0b000000001111000000000000)))));
		sql.add(new Session("불교와인간", "권택규", 2,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.WEDNESDAY     , 1330, 1530, "K441", 0b000000001111000000000000)))));
		sql.add(new Session("불교와인간", "이원선", 2,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.THURSDAY     , 1330, 1530, "K344", 0b000000001111000000000000)))));
		sql.add(new Session("불교와인간", "전민지", 2,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.THURSDAY     , 1330, 1530, "K342", 0b000000001111000000000000)))));
		sql.add(new Session("불교와인간", "이태영", 2,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.THURSDAY     , 1330, 1530, "J212", 0b000000001111000000000000)))));
		sql.add(new Session("불교와인간", "강형철", 2,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.THURSDAY        , 1600, 1800, "K217", 0b000000000000001111000000)))));
		
		sql.add(new Session("자아와명상2", "조서호", 1,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.MONDAY   , 900, 1000, "202", 0b110000000000000000000000)))));
		sql.add(new Session("자아와명상2", "김수덕", 1,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.MONDAY   , 900, 1000, "K309", 0b110000000000000000000000)))));
		sql.add(new Session("자아와명상2", "공태휴", 1,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.TUESDAY   , 900, 1000, "K309", 0b110000000000000000000000)))));
		sql.add(new Session("자아와명상2", "김근행", 1,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.TUESDAY   , 900, 1000, "K309", 0b110000000000000000000000)))));
		sql.add(new Session("자아와명상2", "하영수", 1,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.WEDNESDAY   , 900, 1000, "B262", 0b110000000000000000000000)))));
		sql.add(new Session("자아와명상2", "홍영길", 1,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.THURSDAY   , 900, 1000, "202", 0b110000000000000000000000)))));
		sql.add(new Session("자아와명상2", "정주영", 1,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.FRIDAY   , 900, 1000, "202", 0b110000000000000000000000)))));
		sql.add(new Session("자아와명상2", "김흥빈", 1,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.MONDAY   , 1000, 1100, "B262", 0b001100000000000000000000)))));
		sql.add(new Session("자아와명상2", "조서호", 1,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.MONDAY   , 1000, 1100, "202", 0b001100000000000000000000)))));
		sql.add(new Session("자아와명상2", "김수덕", 1,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.MONDAY   , 1000, 1100, "K309", 0b001100000000000000000000)))));
		sql.add(new Session("자아와명상2", "하영수", 1,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.TUESDAY   , 1000, 1100, "B262", 0b001100000000000000000000)))));
		sql.add(new Session("자아와명상2", "김근행", 1,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.TUESDAY   , 1000, 1100, "K309", 0b001100000000000000000000)))));
		sql.add(new Session("자아와명상2", "공태휴", 1,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.TUESDAY   , 1000, 1100, "202", 0b001100000000000000000000)))));
		sql.add(new Session("자아와명상2", "공태휴", 1,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.WEDNESDAY   , 1000, 1100, "202", 0b001100000000000000000000)))));
		sql.add(new Session("자아와명상2", "하영수", 1,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.WEDNESDAY   , 1000, 1100, "B262", 0b001100000000000000000000)))));
		sql.add(new Session("자아와명상2", "정주영", 1,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.THURSDAY   , 1000, 1100, "B262", 0b001100000000000000000000)))));
		sql.add(new Session("자아와명상2", "홍영길", 1,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.THURSDAY   , 1000, 1100, "202", 0b001100000000000000000000)))));
		sql.add(new Session("자아와명상2", "신둘연", 1,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.THURSDAY   , 1000, 1100, "K309", 0b001100000000000000000000)))));
		sql.add(new Session("자아와명상2", "김종욱", 1,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.FRIDAY   , 1000, 1100, "B262", 0b001100000000000000000000)))));
		sql.add(new Session("자아와명상2", "정주영", 1,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.FRIDAY   , 1000, 1100, "202", 0b001100000000000000000000)))));
		sql.add(new Session("자아와명상2", "김흥빈", 1,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.MONDAY     , 1100, 1200, "B262", 0b000110000000000000000000)))));
		sql.add(new Session("자아와명상2", "조서호", 1,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.MONDAY     , 1100, 1200, "202", 0b000110000000000000000000)))));
		sql.add(new Session("자아와명상2", "김수덕", 1,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.MONDAY     , 1100, 1200, "K309", 0b000110000000000000000000)))));
		sql.add(new Session("자아와명상2", "하영수", 1,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.TUESDAY    , 1100, 1200, "B262", 0b000110000000000000000000)))));
		sql.add(new Session("자아와명상2", "김근행", 1,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.TUESDAY    , 1100, 1200, "K309", 0b000110000000000000000000)))));
		sql.add(new Session("자아와명상2", "공태휴", 1,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.TUESDAY    , 1100, 1200, "202", 0b000110000000000000000000)))));
		sql.add(new Session("자아와명상2", "정주영", 1,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.THURSDAY     , 1100, 1200, "B262", 0b000110000000000000000000)))));
		sql.add(new Session("자아와명상2", "홍영길", 1,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.THURSDAY     , 1100, 1200, "202", 0b000110000000000000000000)))));
		sql.add(new Session("자아와명상2", "신둘연", 1,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.THURSDAY     , 1100, 1200, "k309", 0b000110000000000000000000)))));
		sql.add(new Session("자아와명상2", "김종욱", 1,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.FRIDAY     , 1100, 1200, "B262", 0b000110000000000000000000)))));
		sql.add(new Session("자아와명상2", "정주영", 1,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.FRIDAY     , 1100, 1200, "202", 0b000110000000000000000000)))));
		sql.add(new Session("자아와명상2", "조서호", 1,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.MONDAY    , 1330, 1430, "B262", 0b000000001100000000000000)))));
		sql.add(new Session("자아와명상2", "홍영길", 1,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.THURSDAY   , 1330, 1430, "B262", 0b000000001100000000000000)))));
		sql.add(new Session("자아와명상2", "김수덕", 1,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.MONDAY     , 1300, 1400, "K309", 0b000000011000000000000000)))));
		sql.add(new Session("자아와명상2", "김흥빈", 1,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.WEDNESDAY     , 1300, 1400, "202", 0b000000011000000000000000)))));
		sql.add(new Session("자아와명상2", "신둘연", 1,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.THURSDAY     , 1300, 1400, "K309", 0b000000011000000000000000)))));
		sql.add(new Session("자아와명상2", "이동하", 1,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.MONDAY    , 1430, 1530, "B262", 0b000000000011000000000000)))));
		sql.add(new Session("자아와명상2", "조서호", 1,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.MONDAY    , 1430, 1530, "202", 0b000000000011000000000000)))));
		sql.add(new Session("자아와명상2", "홍영길", 1,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.THURSDAY   , 1430, 1530, "202", 0b000000000011000000000000)))));
		sql.add(new Session("자아와명상2", "천윤성", 1,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.THURSDAY   , 1430, 1530, "B262", 0b000000000011000000000000)))));
		sql.add(new Session("자아와명상2", "이동하", 1,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.MONDAY    , 1530, 1630, "B262", 0b000000000000110000000000)))));
		sql.add(new Session("자아와명상2", "조서호", 1,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.MONDAY    , 1530, 1630, "202", 0b000000000000110000000000)))));
		sql.add(new Session("자아와명상2", "천윤성", 1,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.THURSDAY   , 1530, 1630, "B262", 0b000000000000110000000000)))));
		sql.add(new Session("자아와명상2", "신둘연", 1,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.THURSDAY   , 1530, 1630, "202", 0b000000000000110000000000)))));
		sql.add(new Session("자아와명상2", "김흥빈", 1,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.WEDNESDAY    , 1400, 1500, "202", 0b000000000110000000000000)))));
		sql.add(new Session("자아와명상2", "김수덕", 1,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.MONDAY    , 1400, 1500, "K309", 0b000000000110000000000000)))));
		sql.add(new Session("자아와명상2", "김근행", 1,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.TUESDAY      , 1800, 1850, "202", 0b000000000000000000110000)))));
		sql.add(new Session("자아와명상2", "김창하", 1,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.THURSDAY      , 1800, 1850, "B262", 0b000000000000000000110000)))));
		sql.add(new Session("자아와명상2", "김근행", 1,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.TUESDAY      , 1850, 1940, "202", 0b000000000000000000011100)))));
		sql.add(new Session("자아와명상2", "김창하", 1,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.THURSDAY      , 1850, 1940, "B262", 0b000000000000000000011100)))));
		sql.add(new Session("자아와명상2", "김근행", 1,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.THURSDAY      , 1940, 2030, "202", 0b000000000000000000000110)))));
		
		sql.add(new Session("EAS2", "바트서플", 2,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.MONDAY        , 1630, 1825, "104", 0b000000000000000111100000)))));
		sql.add(new Session("EAS2", "크레이그블리스", 2,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.MONDAY        , 1630, 1825, "105", 0b000000000000000111100000)))));
		sql.add(new Session("EAS2", "김명숙", 2,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.MONDAY        , 1630, 1825, "K338", 0b000000000000000111100000)))));
		sql.add(new Session("EAS2", "에이미우", 2,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.MONDAY        , 1630, 1825, "112", 0b000000000000000111100000)))));
		sql.add(new Session("EAS2", "바트서플", 2,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.MONDAY      , 1825, 2005, "113", 0b000000000000000000111110)))));
		sql.add(new Session("EAS2", "캐서린무어", 2,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.TUESDAY        , 1400, 1600, "104", 0b000000000111100000000000)))));
		sql.add(new Session("EAS2", "바트서플", 2,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.TUESDAY        , 1400, 1600, "105", 0b000000000111100000000000)))));
		sql.add(new Session("EAS2", "김명숙", 2,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.TUESDAY        , 1400, 1600, "K241", 0b000000000111100000000000)))));
		sql.add(new Session("EAS2", "정효진", 2,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.TUESDAY        , 1400, 1600, "107", 0b000000000111100000000000)))));
		sql.add(new Session("EAS2", "에이미우", 2,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.TUESDAY        , 1400, 1600, "112", 0b000000000111100000000000)))));
		sql.add(new Session("EAS2", "패트릭", 2,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.TUESDAY        , 1400, 1600, "113", 0b000000000111100000000000)))));
		sql.add(new Session("EAS2", "바트서플", 2,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.TUESDAY        , 1600, 1800, "104", 0b000000000000001111000000)))));
		sql.add(new Session("EAS2", "캐서린무어", 2,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.TUESDAY        , 1600, 1800, "105", 0b000000000000001111000000)))));
		sql.add(new Session("EAS2", "크레이그블리스", 2, 
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.TUESDAY        , 1600, 1800, "114", 0b000000000000001111000000)))));
		sql.add(new Session("EAS2", "데미안", 2,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.TUESDAY        , 1600, 1800, "107", 0b000000000000001111000000)))));
		sql.add(new Session("EAS2", "패트릭", 2,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.TUESDAY        , 1600, 1800, "112", 0b000000000000001111000000)))));
		sql.add(new Session("EAS2", "제프벨리", 2,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.TUESDAY      , 1825, 2005, "113", 0b000000000000000000111110)))));
		sql.add(new Session("EAS2", "캐서린무어", 2,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.WEDNESDAY   , 900, 1100, "104", 0b111100000000000000000000)))));
		sql.add(new Session("EAS2", "브라이언오라스", 2, 
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.WEDNESDAY   , 900, 1100, "114", 0b111100000000000000000000)))));
		sql.add(new Session("EAS2", "제이미커크", 2,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.WEDNESDAY   , 900, 1100, "107", 0b111100000000000000000000)))));
		sql.add(new Session("EAS2", "정효진", 2,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.WEDNESDAY   , 900, 1100, "106", 0b111100000000000000000000)))));
		sql.add(new Session("EAS2", "브라이언킨", 2, 
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.WEDNESDAY   , 900, 1100, "113", 0b111100000000000000000000)))));
		sql.add(new Session("EAS2", "에이미우", 2,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.WEDNESDAY        , 1400, 1600, "104", 0b000000000111100000000000)))));
		sql.add(new Session("EAS2", "크레이그블리스", 2, 
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.WEDNESDAY        , 1400, 1600, "105", 0b000000000111100000000000)))));
		sql.add(new Session("EAS2", "브라이언오라스", 2,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.WEDNESDAY        , 1400, 1600, "114", 0b000000000111100000000000)))));
		sql.add(new Session("EAS2", "에린오카모토", 2,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.WEDNESDAY        , 1400, 1600, "107", 0b000000000111100000000000)))));
		sql.add(new Session("EAS2", "게럿파월", 2,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.WEDNESDAY        , 1400, 1600, "112", 0b000000000111100000000000)))));
		sql.add(new Session("EAS2", "베리웰시", 2,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.WEDNESDAY        , 1400, 1600, "K221", 0b000000000111100000000000)))));
		sql.add(new Session("EAS2", "게럿파월", 2,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.WEDNESDAY      , 1825, 2005, "113", 0b000000000000000000111110)))));
		sql.add(new Session("EAS2", "사무엘오스틴", 2, 
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.WEDNESDAY        , 1600, 1800, "104", 0b000000000000001111000000)))));
		sql.add(new Session("EAS2", "브라이언오라스", 2,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.WEDNESDAY        , 1600, 1800, "105", 0b000000000000001111000000)))));
		sql.add(new Session("EAS2", "에린오카모토", 2,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.WEDNESDAY        , 1600, 1800, "114", 0b000000000000001111000000)))));
		sql.add(new Session("EAS2", "패트릭", 2,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.WEDNESDAY        , 1600, 1800, "107", 0b000000000000001111000000)))));
		sql.add(new Session("EAS2", "바트서플", 2,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.WEDNESDAY        , 1600, 1800, "112", 0b000000000000001111000000)))));
		sql.add(new Session("EAS2", "게럿파월", 2,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.WEDNESDAY        , 1600, 1800, "113", 0b000000000000001111000000)))));
		sql.add(new Session("EAS2", "크레이그블리스", 2, 
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.WEDNESDAY       , 1630, 1825, "M129", 0b000000000000000111100000)))));
		sql.add(new Session("EAS2", "크레이그블리스", 2,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.THURSDAY        , 1630, 1825, "114", 0b000000000000000111100000)))));
		sql.add(new Session("EAS2", "정효진", 2,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.THURSDAY        , 1630, 1825, "104", 0b000000000000000111100000)))));
		sql.add(new Session("EAS2", "김명숙", 2,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.THURSDAY        , 1630, 1825, "K338", 0b000000000000000111100000)))));
		sql.add(new Session("EAS2", "에린오카모토", 2, 
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.THURSDAY      , 1825, 2005, "113", 0b000000000000000000111110)))));
		sql.add(new Session("EAS2", "패트릭", 2,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.FRIDAY         , 1400, 1600, "104", 0b000000000111100000000000)))));
		sql.add(new Session("EAS2", "사무엘오스틴", 2, 
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.FRIDAY         , 1400, 1600, "K356", 0b000000000111100000000000)))));
		sql.add(new Session("EAS2", "베리웰시", 2,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.FRIDAY         , 1400, 1600, "114", 0b000000000111100000000000)))));
		sql.add(new Session("EAS2", "김명숙", 2,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.FRIDAY         , 1400, 1600, "K362", 0b000000000111100000000000)))));
		sql.add(new Session("EAS2", "사무엘오스틴", 2, 
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.FRIDAY        , 1600, 1800, "K356", 0b000000000000001111000000)))));
		sql.add(new Session("EAS2", "베리웰시", 2,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.FRIDAY        , 1600, 1800, "104", 0b000000000000001111000000)))));
		sql.add(new Session("EAS2", "바트서플", 2,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.FRIDAY        , 1600, 1800, "114", 0b000000000000001111000000)))));
		sql.add(new Session("EAS2", "패트릭", 2,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.FRIDAY        , 1600, 1800, "113", 0b000000000000001111000000)))));
		sql.add(new Session("EAS2", "패트릭", 2,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.FRIDAY      , 1825, 2005, "112", 0b000000000000000000111110)))));
		
		sql.add(new Session("일반화학및실험2", "김갑수", 3,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.MONDAY       , 1200, 1530, "308-407", 0b000000111111100000000000),
			        new TNL(DayOfWeek.TUESDAY        , 1030, 1200, "308-407", 0b000111000000000000000000)))));
		sql.add(new Session("일반화학및실험2", "윤성욱", 3,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.MONDAY       , 1030, 1330, "308-407", 0b000111111000000000000000),
			        new TNL(DayOfWeek.WEDNESDAY         , 1100, 1230, "308-407", 0b000011100000000000000000)))));
		sql.add(new Session("일반화학및실험2", "김갑수", 3,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.TUESDAY       , 1200, 1530, "308-407", 0b000000111111100000000000),
			        new TNL(DayOfWeek.THURSDAY         , 1200, 1330, "308-407", 0b000000111000000000000000)))));
		sql.add(new Session("일반화학및실험2", "김갑수", 3,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.MONDAY        , 1600, 2030, "308-407", 0b000000000000001111111110)))));
		sql.add(new Session("일반화학및실험2", "유미경", 3,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.TUESDAY       , 1330, 1500, "337", 0b000000001110000000000000),
			        new TNL(DayOfWeek.THURSDAY         , 1330, 1700, "337", 0b000000001111111000000000)))));
		sql.add(new Session("일반화학및실험2", "조대행", 3,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.WEDNESDAY        , 1600, 1730, "P201", 0b000000000000001110000000),
			        new TNL(DayOfWeek.FRIDAY          , 1000, 1330, "P201", 0b001111111000000000000000)))));
		
		
		sql.add(new Session("일반물리학및실험2", "양우철", 3,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.MONDAY       , 1200, 1330, "D303", 0b000000111000000000000000),
			        new TNL(DayOfWeek.TUESDAY        , 900, 1230, "D303", 0b111111100000000000000000)))));
		sql.add(new Session("일반물리학및실험2", "곽동우", 3,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.MONDAY        , 1800, 2220, "D303", 0b000000000000000000111111)))));
		sql.add(new Session("일반물리학및실험2", "권상우", 3,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.TUESDAY        , 1800, 2220, "207-625", 0b000000000000000000111111)))));
		sql.add(new Session("일반물리학및실험2", "이동화", 3,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.TUESDAY       , 1600, 1730, "P205", 0b000000000000001110000000),
			        new TNL(DayOfWeek.THURSDAY         , 1630, 1800, "P205", 0b000000000000000111000000),
			        new TNL(DayOfWeek.FRIDAY         , 900, 1100, "P205", 0b111100000000000000000000)))));
		sql.add(new Session("일반물리학및실험2", "김선배", 3,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.TUESDAY       , 1200, 1330, "207-625", 0b000000111000000000000000),
			        new TNL(DayOfWeek.THURSDAY        , 900, 1100, "207-625", 0b111100000000000000000000),
			        new TNL(DayOfWeek.THURSDAY        , 1200, 1330, "207-625", 0b000000111000000000000000)))));
		sql.add(new Session("일반물리학및실험2", "김언정", 3,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.TUESDAY       , 1200, 1330, "207-623", 0b000000111000000000000000),
			        new TNL(DayOfWeek.WEDNESDAY          , 1400, 1600, "207-623", 0b000000000111100000000000),
			        new TNL(DayOfWeek.THURSDAY         , 1200, 1330, "207-623", 0b000000111000000000000000)))));
		sql.add(new Session("일반물리학및실험2", "김순구", 3,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.TUESDAY       , 1600, 1730, "337", 0b000000000000001110000000),
			        new TNL(DayOfWeek.TUESDAY        , 900, 1100, "337", 0b111100000000000000000000),
			        new TNL(DayOfWeek.THURSDAY        , 1630, 1800, "337", 0b000000000000000111000000)))));
		sql.add(new Session("일반물리학및실험2", "이원철", 3,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.TUESDAY       , 1200, 1730, "207-625", 0b000000111111100000000000),
			        new TNL(DayOfWeek.FRIDAY         , 1400, 1530, "207-625", 0b000000000111000000000000)))));
		sql.add(new Session("일반물리학및실험2", "오형택", 3,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.WEDNESDAY       , 1600, 1800, "308-325", 0b000000000000001111000000),
			        new TNL(DayOfWeek.WEDNESDAY        , 1230, 1400, "308-325", 0b000000011100000000000000),
			        new TNL(DayOfWeek.FRIDAY        , 1200, 1330, "308-325", 0b000000111000000000000000)))));
		sql.add(new Session("일반물리학및실험2", "류영선", 3,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.WEDNESDAY        , 1800, 2220, "D303", 0b000000000000000000111111)))));
		sql.add(new Session("일반물리학및실험2", "오형택", 3,
			    new ArrayList<>(Arrays.asList(
			        new TNL(DayOfWeek.THURSDAY        , 1430, 1630, "342", 0b000000000011110000000000),
			        new TNL(DayOfWeek.THURSDAY         , 1200, 1330, "342", 0b000000111000000000000000),
			        new TNL(DayOfWeek.FRIDAY        , 1200, 1330, "342", 0b000000111000000000000000)))));
		
	}

	public static ArrayList<Session> getSql() {
		return sql;
	}
	
}