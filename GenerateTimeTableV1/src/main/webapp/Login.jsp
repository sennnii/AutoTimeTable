<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>AutoTimeTable - Login</title>
    <link rel="stylesheet" href="Login.css">
</head>
<body>
    <div class="navigation">
        <div class="title">AutoTimeTable</div>
    </div>
    <div class="info">
        AutoTimeTable을 통해 여러분의 수업 계획을 쉽고 빠르게 해결하세요.<br>
        동국대학교 컴퓨터공학 전공생을 대상으로 합니다.<br>
        원하는 과목과  공강 시간, 제약 조건을 설정하면 충돌 없는 최적의 시간표가 자동으로 생성됩니다. <br>
        지금 바로 시작해보세요!<br>
    </div>
    <div class="container">
        <!-- 로그인 창 -->
        <form action="/SelectCondition" method="POST" class="login-box">
            <!-- 학번 입력 -->
            <div class="input-group">
                <label for="studentnumber">Student Number</label>
                <input type="text" name="studentnumber" id="studentnumber" placeholder="학번을 입력하세요" required />
            </div>

            <!-- 비밀번호 입력 -->
            <div class="input-group">
                <label for="password">Password</label>
                <input type="password" name="password" id="password" placeholder="비밀번호를 입력하세요" required />
            </div>

            <!-- 로그인 버튼 -->
            <button type="submit" class="login-button">Log in</button><!-- 회원 페이지로 바꿔야함 -->
            <button type="button" class="login-button" onclick="location.href='CreateAccount.jsp';">Sign up</button>
  
        </form>
        <%
		    String error = request.getParameter("error");
		    if (error != null) {
		%>
		    <p style="color: red;"><%= error %></p>
		<%
		    }
		%>
        <!-- 비회원 시작 섹션 -->
        <div class="guest-box">
            <p>계정이 없으신가요?</p>
            <button class="guest-button" onclick="location.href='/SelectCondition';">비회원으로 시작</button>
        </div>
    </div>
</body>
</html>
