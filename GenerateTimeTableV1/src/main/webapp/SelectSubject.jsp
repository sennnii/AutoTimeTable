<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String userID = (String) session.getAttribute("userID");
%>
<!DOCTYPE html>
<html lang="ko">

<head>
<meta charset="UTF-8">
<script src="https://code.jquery.com/jquery-3.7.1.js"></script>
<script>
function handleLogout() {	
	  window.location.href = "Logout.jsp";
}
	$(document).ready(
			function() {
				$(".box").on('change', function() {
					if ($(this).is(":checked")) {
						$(this).closest(".num1").css("background", "#B9CAF6");
					} else {
						$(this).closest(".num1").css("background", "#ffffff");
					}
				});
				$(".num1").on(
						"click",
						function(event) {
							if (!$(event.target).is(".box")) {
								const checkbox = $(this).find(".box");
								checkbox.prop("checked",
										!checkbox.prop("checked")).trigger(
										"change");
							}
						})
				$(".reselect").on("click", function() {
					$(".num1").css("background", "#ffffff");
				});
				$(".search").on("input", function() {
					const searchText = $(this).val().trim();

					if (searchText === "") {
						$(".num1").show();
					} else {
						$(".num1").each(function() {
							const text = $(this).find(".div1").text();
							if (text.includes(searchText)) {
								$(this).show();
							} else {
								$(this).hide();
							}
						});
					}
				});

			});
</script>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
<style>
* {
	margin: 0;
	padding: 0;
	box-sizing: border-box;
}

.navigation, .navigation * {
	box-sizing: border-box;
}

.navigation {
	height: 112px;
	position: relative;
	overflow: hidden;
}

.nav1 {
	color: #000000;
	text-align: center;
	font-family: "IbmPlexSansKr-Regular", sans-serif;
	font-size: 20px;
	line-height: 130%;
	font-weight: 400;
	position: absolute;
	right: 558px;
	top: 42px;
	display: flex;
	align-items: center;
	justify-content: center;
}

.nav2 {
	color: #000000;
	text-align: center;
	font-family: "IbmPlexSansKr-Regular", sans-serif;
	font-size: 20px;
	line-height: 130%;
	font-weight: 400;
	position: absolute;
	right: 404px;
	top: 42px;
	display: flex;
	align-items: center;
	justify-content: center;
}

nav > div > span{
    font-weight: 700;
}

.nav3 {
	color: #000000;
	text-align: center;
	font-family: "IbmPlexSansKr-Regular", sans-serif;
	font-size: 20px;
	line-height: 130%;
	font-weight: 400;
	position: absolute;
	right: 273px;
	top: 42px;
	display: flex;
	align-items: center;
	justify-content: center;
}

.nav4 {
	color: #000000;
	text-align: center;
	font-family: "IbmPlexSansKr-Regular", sans-serif;
	font-size: 20px;
	line-height: 130%;
	font-weight: 400;
	position: absolute;
	right: 121px;
	top: 42px;
	display: flex;
	align-items: center;
	justify-content: center;
}

.nav5 {
	color: #000000;
	text-align: center;
	font-family: "IbmPlexSansKr-Regular", sans-serif;
	font-size: 20px;
	line-height: 130%;
	font-weight: 400;
	position: absolute;
	right: 10px;
	top: 42px;
	display: flex;
	align-items: center;
	justify-content: center;
}

.title {
	color: #001f58;
	text-align: center;
	font-family: "Roboto-Bold", sans-serif;
	font-size: 36px;
	line-height: 120%;
	letter-spacing: -0.03em;
	font-weight: var(--var-sds-typography-title-hero-font-weight, 700);
	position: absolute;
	left: 25px;
	top: 36px;
	width: 251px;
	height: 40px;
}

header button {
	background: transparent;
	border: 0;
	cursor: pointer;
}

.page-heading, .page-heading * {
	box-sizing: border-box;
}

.page-heading {
	background: rgba(255, 255, 255, 0);
	height: 75px;
	position: relative;
	overflow: hidden;
}

.container {
	display: grid;
	grid-template-columns: repeat(auto-fill, minmax(423.35px, 1fr));
	gap: 10px;
	justify-content: start;
	align-items: start;
	margin-left: 20px;
	margin-top: 53.94px;
}

.text {
	color: #000000;
	text-align: center;
	font-family: "IbmPlexSansKr-Regular", sans-serif;
	font-size: 24px;
	font-weight: 400;
	position: absolute;
	left: 36px;
	top: 29px;
	width: 451px;
	height: 46px;
}

.divider {
	margin-top: -2px;
	border-style: solid;
	border-color: #b9caf6;
	border-width: 2px 0 0 0;
	height: 0px;
	position: absolute;
	right: 96px;
	left: 96px;
	bottom: 0px;
	box-shadow: 0px 4px 4px 0px rgba(0, 0, 0, 0.25);
	transform-origin: 0 0;
	transform: rotate(0deg) scale(1, 1);
}

.select, .select * {
	box-sizing: border-box;
}

.select {
	position: relative;
}

.ckbt {
	position: relative;
}

.search {
	background: #ffffff;
	border-style: solid;
	border-color: #000000;
	border-width: 1px;
	width: 360px;
	height: 46px;
	min-width: 360px;
	max-width: 720px;
	position: absolute;
	right: 0px;
    top: calc(50% - 23.5px);
	font-family: "IbmPlexSansKr-SemiBold", sans-serif;
	font-size: 20px
}

input.search::-webkit-input-placeholder {
	background-image:
		url(https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQujvGvIxeVPUNWJWCxEA94dTFFxjjPK1khMQ&s);
	background-size: 32px;
	background-position: 0px center;
	background-repeat: no-repeat;
	text-indent: 32px;
	color: #aaa;
}

.maketable {
	background: #1f3c6b;
	border-radius: 4px;
	padding: 14px 23px 14px 23px;
	height: 46px;
	position: absolute;
	right: 77px;
	top: 115px;
	color: #ffffff;
	text-align: center;
	font-family: "IbmPlexSansKr-SemiBold", sans-serif;
	font-size: 20px;
	line-height: 130%;
	font-weight: 600;
	cursor: pointer;
}

.reselect {
	background: #4b6ca0;
	border-radius: 4px;
	padding: 14px 23px 14px 23px;
	height: 46px;
	position: absolute;
	right: 251px;
	top: 115px;
	color: #ffffff;
	text-align: center;
	font-family: "IbmPlexSansKr-SemiBold", sans-serif;
	font-size: 20px;
	line-height: 130%;
	font-weight: 600;
	position: absolute;
	cursor: pointer;
}

.num1 {
	background: #ffffff;
	border-radius: 24.42px;
	border-style: solid;
	border-color: rgba(230, 230, 230, 0);
	border-width: 2.04px;
	width: 423.35px;
	height: 88.54px;
	position: relative;
	cursor: pointer;
}

.box {
	appearance: none;
	-webkit-appearance: none;
	border-radius: 4px;
	border-style: solid;
	border-color: #dedede;
	border-width: 3.05px;
	width: 36.64px;
	height: 36.64px;
	position: absolute;
	left: 358.22px;
	top: calc(50% - 19.6px);
	cursor: pointer;
}

.box:checked {
	background-image: url('./box.svg');
	background-size: contain;
	background-position: center;
	background-repeat: no-repeat;
	border: none;
	background-color: transparent;
}

.div0 {
	width: 320.57px;
	height: 67.17px;
	position: absolute;
	left: 24.42px;
	top: 10.18px;
}

.div1 {
	color: #000000;
	text-align: left;
	font-family: "IbmPlexSansKr-SemiBold", sans-serif;
	font-size: 24.424030303955078px;
	line-height: 130%;
	font-weight: 600;
}

.div2 {
	position: absolute;
	left: 0x;
	top: 40px;
	width: 82px;
}

.div3 {
	position: absolute;
	left: 114px;
	top: 40px;
	width: 82px;
}

.div4 {
	position: absolute;
	left: 243px;
	top: 40px;
	width: 52px;
}

.divfont {
	color: #3a4c84;
	text-align: left;
	font-family: "Inter-Medium", sans-serif;
	font-size: 18px;
	line-height: 130%;
	font-weight: 500;
}
</style>
</head>

<body style="background-color: #F4F7FF">
	<header>
	<nav class="navbar navbar-expand-md">
		<div class="container-fluid">
			<span class="navbar-brand" style="color: #001F58; font-size: 36px;">AutoTimeTable</span>
	       <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
	         <span class="navbar-toggler-icon"></span>
	       </button>
	       <div class="collapse navbar-collapse" id="navbarSupportedContent">
	         <ul class="navbar-nav ms-auto me-2">
	           <li class="nav-item">
	             <a class="nav-link disabled" href="/SelectSubject">과목 선택</a>
	           </li>
	           <li class="nav-item">
	             <a class="nav-link" href="/SelectCondition">조건 선택</a>
	           </li>
	           <li class="nav-item">
	             <a class="nav-link" aria-current="page" href="/Timtable">시간표</a>
	           </li>
	    <%
		    if (userID != null) {
		%>
	           <li class="nav-item">
	             <a class="nav-link" href="/Mypage">마이 페이지</a>
	           </li>         
	           <li class="nav-item">
	             <a class="nav-link" onclick="handleLogout()" href="#">로그아웃</a>
	           </li>
		<%
		    }
		%>
		<%
		    if (userID == null) {
		%>
	           <li class="nav-item">
	             <a class="nav-link" href="Login.jsp">로그인</a>
	           </li>		<%
		    }
		%>
	         </ul>
	       </div>
	     </div>
	   </nav>
	</header>
	<div class="page-heading">
		<input class="search" type="text" placeholder="과목명 입력"> 
		<div class="text">수강해야 할 과목을 선택해주세요</div>
		<div class="divider"></div>
	</div>
	<main class="select d-flex justify-content-center w-100">
		<form method="get" action="/Timtable">
			<div class="container">
				<div class="num1">
					<div class="div0">
						<div class="div1">기초프로그래밍</div>
						<div class="divfont">
							<div class="div2">전공</div>
							<div class="div3">CSC2001</div>
							<div class="div4">3학점</div>
						</div>
					</div>
					<input class="box" type="checkbox" name="cse" value="기초프로그래밍">
				</div>
				<div class="num1">
					<div class="div0">
						<div class="div1">심화프로그래밍</div>
						<div class="divfont">
							<div class="div2">전공</div>
							<div class="div3">CSC2002</div>
							<div class="div4">3학점</div>
						</div>
					</div>
					<input class="box" type="checkbox" name="cse" value="심화프로그래밍">
				</div>
				<div class="num1">
					<div class="div0">
						<div class="div1">객체지향프로그래밍</div>
						<div class="divfont">
							<div class="div2">전공</div>
							<div class="div3">CSC2003</div>
							<div class="div4">3학점</div>
						</div>
					</div>
					<input class="box" type="checkbox" name="cse" value="객체지향프로그래밍">
				</div>
				<div class="num1">
					<div class="div0">
						<div class="div1">어드벤처디자인</div>
						<div class="divfont">
							<div class="div2">전공</div>
							<div class="div3">CSC2004</div>
							<div class="div4">3학점</div>
						</div>
					</div>
					<input class="box" type="checkbox" name="cse" value="어드벤처디자인">
				</div>
				<div class="num1">
					<div class="div0">
						<div class="div1">시스템소프트웨어</div>
						<div class="divfont">
							<div class="div2">전공</div>
							<div class="div3">CSC2005</div>
							<div class="div4">3학점</div>
						</div>
					</div>
					<input class="box" type="checkbox" name="cse" value="시스템소프트웨어">
				</div>
				<div class="num1">
					<div class="div0">
						<div class="div1">프로그래밍언어론</div>
						<div class="divfont">
							<div class="div2">전공</div>
							<div class="div3">CSC2006</div>
							<div class="div4">3학점</div>
						</div>
					</div>
					<input class="box" type="checkbox" name="cse" value="프로그래밍언어론">
				</div>
				<div class="num1">
					<div class="div0">
						<div class="div1">자료구조</div>
						<div class="divfont">
							<div class="div2">전공</div>
							<div class="div3">CSC2007</div>
							<div class="div4">3학점</div>
						</div>
					</div>
					<input class="box" type="checkbox" name="cse" value="자료구조">
				</div>
				<div class="num1">
					<div class="div0">
						<div class="div1">알고리즘</div>
						<div class="divfont">
							<div class="div2">전공</div>
							<div class="div3">CSC2008</div>
							<div class="div4">3학점</div>
						</div>
					</div>
					<input class="box" type="checkbox" name="cse" value="알고리즘">
				</div>
				<div class="num1">
					<div class="div0">
						<div class="div1">웹프로그래밍</div>
						<div class="divfont">
							<div class="div2">전공</div>
							<div class="div3">CSE2015</div>
							<div class="div4">3학점</div>
						</div>
					</div>
					<input class="box" type="checkbox" name="cse" value="웹프로그래밍">
				</div>
				<div class="num1">
					<div class="div0">
						<div class="div1">공개SW프로젝트</div>
						<div class="divfont">
							<div class="div2">전공</div>
							<div class="div3">CSC4004</div>
							<div class="div4">3학점</div>
						</div>
					</div>
					<input class="box" type="checkbox" name="cse" value="공개SW프로젝트">
				</div>
				<div class="num1">
					<div class="div0">
						<div class="div1">임베디드시스템</div>
						<div class="divfont">
							<div class="div2">전공</div>
							<div class="div3">CSC4005</div>
							<div class="div4">3학점</div>
						</div>
					</div>
					<input class="box" type="checkbox" name="cse" value="임베디드시스템">
				</div>
				<div class="num1">
					<div class="div0">
						<div class="div1">소프트웨어공학</div>
						<div class="divfont">
							<div class="div2">전공</div>
							<div class="div3">CSC4010</div>
							<div class="div4">3학점</div>
						</div>
					</div>
					<input class="box" type="checkbox" name="cse" value="소프트웨어공학">
				</div>
				<div class="num1">
					<div class="div0">
						<div class="div1">인공지능</div>
						<div class="divfont">
							<div class="div2">전공</div>
							<div class="div3">CSC4012</div>
							<div class="div4">3학점</div>
						</div>
					</div>
					<input class="box" type="checkbox" name="cse" value="인공지능">
				</div>
				<div class="num1">
					<div class="div0">
						<div class="div1">컴퓨터구조</div>
						<div class="divfont">
							<div class="div2">전공</div>
							<div class="div3">CSC4013</div>
							<div class="div4">3학점</div>
						</div>
					</div>
					<input class="box" type="checkbox" name="cse" value="컴퓨터구조">
				</div>
				<div class="num1">
					<div class="div0">
						<div class="div1">컴파일러</div>
						<div class="divfont">
							<div class="div2">전공</div>
							<div class="div3">CSC4015</div>
							<div class="div4">3학점</div>
						</div>
					</div>
					<input class="box" type="checkbox" name="cse" value="컴파일러">
				</div>
				<div class="num1">
					<div class="div0">
						<div class="div1">종합설계1</div>
						<div class="divfont">
							<div class="div2">전공</div>
							<div class="div3">CSC4018</div>
							<div class="div4">3학점</div>
						</div>
					</div>
					<input class="box" type="checkbox" name="cse" value="종합설계1">
				</div>
				<div class="num1">
					<div class="div0">
						<div class="div1">종합설계2</div>
						<div class="divfont">
							<div class="div2">전공</div>
							<div class="div3">CSC4019</div>
							<div class="div4">3학점</div>
						</div>
					</div>
					<input class="box" type="checkbox" name="cse" value="종합설계2">
				</div>
				<div class="num1">
					<div class="div0">
						<div class="div1">데이터베이스설계</div>
						<div class="divfont">
							<div class="div2">전공</div>
							<div class="div3">CSC4020</div>
							<div class="div4">3학점</div>
						</div>
					</div>
					<input class="box" type="checkbox" name="cse" value="데이터베이스설계">
				</div>
				<div class="num1">
					<div class="div0">
						<div class="div1">데이터통신입문</div>
						<div class="divfont">
							<div class="div2">전공</div>
							<div class="div3">CSC4021</div>
							<div class="div4">3학점</div>
						</div>
					</div>
					<input class="box" type="checkbox" name="cse" value="데이터통신입문">
				</div>
				<div class="num1">
					<div class="div0">
						<div class="div1">딥러닝입문</div>
						<div class="divfont">
							<div class="div2">전공</div>
							<div class="div3">CSC4023</div>
							<div class="div4">3학점</div>
						</div>
					</div>
					<input class="box" type="checkbox" name="cse" value="딥러닝입문">
				</div>
				<div class="num1">
					<div class="div0">
						<div class="div1">웹서비스보안</div>
						<div class="divfont">
							<div class="div2">전공</div>
							<div class="div3">CSC4029</div>
							<div class="div4">3학점</div>
						</div>
					</div>
					<input class="box" type="checkbox" name="cse" value="웹서비스보안">
				</div>
				<div class="num1">
					<div class="div0">
						<div class="div1">암호학과네트워크보안</div>
						<div class="divfont">
							<div class="div2">전공</div>
							<div class="div3">CSC4030</div>
							<div class="div4">3학점</div>
						</div>
					</div>
					<input class="box" type="checkbox" name="cse" value="암호학과네트워크보안">
				</div>
				<div class="num1">
					<div class="div0">
						<div class="div1">SW비즈니스와창업</div>
						<div class="divfont">
							<div class="div2">전공</div>
							<div class="div3">CSE4075</div>
							<div class="div4">3학점</div>
						</div>
					</div>
					<input class="box" type="checkbox" name="cse" value="SW비즈니스와창업">
				</div>
				<div class="num1">
					<div class="div0">
						<div class="div1">커리어디자인</div>
						<div class="divfont">
							<div class="div2">공교</div>
							<div class="div3">RGC1074</div>
							<div class="div4">1학점</div>
						</div>
					</div>
					<input class="box" type="checkbox" name="cse" value="커리어디자인">
				</div>
				<div class="num1">
					<div class="div0">
						<div class="div1">자아와명상1</div>
						<div class="divfont">
							<div class="div2">공교</div>
							<div class="div3">RGC0017</div>
							<div class="div4">1학점</div>
						</div>
					</div>
					<input class="box" type="checkbox" name="cse" value="자아와명상1">
				</div>
				<div class="num1">
					<div class="div0">
						<div class="div1">자아와명상2</div>
						<div class="divfont">
							<div class="div2">공교</div>
							<div class="div3">RGC0018</div>
							<div class="div4">1학점</div>
						</div>
					</div>
					<input class="box" type="checkbox" name="cse" value="자아와명상2">
				</div>
				<div class="num1">
					<div class="div0">
						<div class="div1">불교와인간</div>
						<div class="divfont">
							<div class="div2">공교</div>
							<div class="div3">RGC0003</div>
							<div class="div4">2학점</div>
						</div>
					</div>
					<input class="box" type="checkbox" name="cse" value="불교와인간">
				</div>
				<div class="num1">
					<div class="div0">
						<div class="div1">기술보고서작성및발표</div>
						<div class="divfont">
							<div class="div2">공교</div>
							<div class="div3">RGC0005</div>
							<div class="div4">3학점</div>
						</div>
					</div>
					<input class="box" type="checkbox" name="cse" value="기술보고서작성및발표">
				</div>
				<div class="num1">
					<div class="div0">
						<div class="div1">기업가정신과리더십</div>
						<div class="divfont">
							<div class="div2">공교</div>
							<div class="div3">RGC1053</div>
							<div class="div4">2학점</div>
						</div>
					</div>
					<input class="box" type="checkbox" name="cse" value="기업가정신과리더십">
				</div>
				<div class="num1">
					<div class="div0">
						<div class="div1">BasicEAS</div>
						<div class="divfont">
							<div class="div2">공교</div>
							<div class="div3">RGC1030</div>
							<div class="div4">0학점</div>
						</div>
					</div>
					<input class="box" type="checkbox" name="cse" value="BasicEAS">
				</div>
				<div class="num1">
					<div class="div0">
						<div class="div1">EAS1</div>
						<div class="divfont">
							<div class="div2">공교</div>
							<div class="div3">RGC1080</div>
							<div class="div4">2학점</div>
						</div>
					</div>
					<input class="box" type="checkbox" name="cse" value="EAS1">
				</div>
				<div class="num1">
					<div class="div0">
						<div class="div1">EAS2</div>
						<div class="divfont">
							<div class="div2">공교</div>
							<div class="div3">RGC1081</div>
							<div class="div4">2학점</div>
						</div>
					</div>
					<input class="box" type="checkbox" name="cse" value="EAS2">
				</div>
				<div class="num1">
					<div class="div0">
						<div class="div1">기술창조와특허</div>
						<div class="divfont">
							<div class="div2">일교</div>
							<div class="div3">EGC7026</div>
							<div class="div4">3학점</div>
						</div>
					</div>
					<input class="box" type="checkbox" name="cse" value="기술창조와특허">
				</div>
				<div class="num1">
					<div class="div0">
						<div class="div1">공학경제</div>
						<div class="divfont">
							<div class="div2">일교</div>
							<div class="div3">PRI4041</div>
							<div class="div4">3학점</div>
						</div>
					</div>
					<input class="box" type="checkbox" name="cse" value="공학경제">
				</div>
				<div class="num1">
					<div class="div0">
						<div class="div1">공학윤리</div>
						<div class="divfont">
							<div class="div2">일교</div>
							<div class="div3">EGC4039</div>
							<div class="div4">3학점</div>
						</div>
					</div>
					<input class="box" type="checkbox" name="cse" value="공학윤리">
				</div>
				<div class="num1">
					<div class="div0">
						<div class="div1">미적분학및연습1</div>
						<div class="divfont">
							<div class="div2">학문기초</div>
							<div class="div3">PRI4001</div>
							<div class="div4">3학점</div>
						</div>
					</div>
					<input class="box" type="checkbox" name="cse" value="미적분학및연습1">
				</div>
				<div class="num1">
					<div class="div0">
						<div class="div1">미적분학및연습2</div>
						<div class="divfont">
							<div class="div2">학문기초</div>
							<div class="div3">PRI4012</div>
							<div class="div4">3학점</div>
						</div>
					</div>
					<input class="box" type="checkbox" name="cse" value="미적분학및연습2">
				</div>
				<div class="num1">
					<div class="div0">
						<div class="div1">확률및통계학</div>
						<div class="divfont">
							<div class="div2">학문기초</div>
							<div class="div3">PRI4023</div>
							<div class="div4">3학점</div>
						</div>
					</div>
					<input class="box" type="checkbox" name="cse" value="확률및통계학">
				</div>
				<div class="num1">
					<div class="div0">
						<div class="div1">공학선형대수학</div>
						<div class="divfont">
							<div class="div2">학문기초</div>
							<div class="div3">PRI4024</div>
							<div class="div4">3학점</div>
						</div>
					</div>
					<input class="box" type="checkbox" name="cse" value="공학선형대수학">
				</div>
				<div class="num1">
					<div class="div0">
						<div class="div1">공학수학1</div>
						<div class="divfont">
							<div class="div2">학문기초</div>
							<div class="div3">PRI4025</div>
							<div class="div4">3학점</div>
						</div>
					</div>
					<input class="box" type="checkbox" name="cse" value="공학수학1">
				</div>
				<div class="num1">
					<div class="div0">
						<div class="div1">이산수학</div>
						<div class="divfont">
							<div class="div2">학문기초</div>
							<div class="div3">PRI4027</div>
							<div class="div4">3학점</div>
						</div>
					</div>
					<input class="box" type="checkbox" name="cse" value="이산수학">
				</div>
				<div class="num1">
					<div class="div0">
						<div class="div1">일반물리학및실험2</div>
						<div class="divfont">
							<div class="div2">학문기초</div>
							<div class="div3">PRI4013</div>
							<div class="div4">4학점</div>
						</div>
					</div>
					<input class="box" type="checkbox" name="cse" value="일반물리학및실험2">
				</div>
				<div class="num1">
					<div class="div0">
						<div class="div1">일반화학및실험2</div>
						<div class="divfont">
							<div class="div2">학문기초</div>
							<div class="div3">PRI4014</div>
							<div class="div4">4학점</div>
						</div>
					</div>
					<input class="box" type="checkbox" name="cse" value="일반화학및실험2">
				</div>
				<div class="num1">
					<div class="div0">
						<div class="div1">일반생물학및실험2</div>
						<div class="divfont">
							<div class="div2">학문기초</div>
							<div class="div3">PRI4015</div>
							<div class="div4">4학점</div>
						</div>
					</div>
					<input class="box" type="checkbox" name="cse" value="일반생물학및실험2">
				</div>
				<div class="num1">
					<div class="div0">
						<div class="div1">물리학개론</div>
						<div class="divfont">
							<div class="div2">학문기초</div>
							<div class="div3">PRI4029</div>
							<div class="div4">3학점</div>
						</div>
					</div>
					<input class="box" type="checkbox" name="cse" value="물리학개론">
				</div>
				<div class="num1">
					<div class="div0">
						<div class="div1">화학개론</div>
						<div class="divfont">
							<div class="div2">학문기초</div>
							<div class="div3">PRI4030</div>
							<div class="div4">3학점</div>
						</div>
					</div>
					<input class="box" type="checkbox" name="cse" value="화학개론">
				</div>
				<div class="num1">
					<div class="div0">
						<div class="div1">생물학개론</div>
						<div class="divfont">
							<div class="div2">학문기초</div>
							<div class="div3">PRI4028</div>
							<div class="div4">3학점</div>
						</div>
					</div>
					<input class="box" type="checkbox" name="cse" value="생물학개론">
				</div>
				<div class="num1">
					<div class="div0">
						<div class="div1">지구환경과학</div>
						<div class="divfont">
							<div class="div2">학문기초</div>
							<div class="div3">PRI4033</div>
							<div class="div4">3학점</div>
						</div>
					</div>
					<input class="box" type="checkbox" name="cse" value="지구환경과학">
				</div>
			</div>
			<div class="ckbt">
				<input class="maketable" type="submit" value="시간표 제작"> 
				<input class="reselect" type="reset" value="다시 선택">
			</div>
		</form>
	</main>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
</body>

</html>