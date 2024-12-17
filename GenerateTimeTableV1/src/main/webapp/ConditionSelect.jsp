<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	String userID = (String) session.getAttribute("userID");
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8" />
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <link rel="stylesheet" href="globals.css" />
    <link rel="stylesheet" href="ConditionSelect.css" />
</head>
<body>
    <div class="조건선택">
        <div class="div">
            <div class="overlap">
                <div class="navigation">
					<nav class="navbar navbar-expand-md">
				      <div class="container-fluid">
				        <span class="navbar-brand" style="color: #001F58; font-size: 36px;">AutoTimeTable</span>
				        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
				          <span class="navbar-toggler-icon"></span>
				        </button>
				        <div class="collapse navbar-collapse" id="navbarSupportedContent">
				          <ul class="navbar-nav ms-auto me-2">
				            <li class="nav-item">
				              <a class="nav-link" href="/SelectSubject">과목 선택</a>
				            </li>
				            <li class="nav-item">
				              <a class="nav-link disabled" href="/ConditionSelect">조건 선택</a>
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
            </div>
                <div class="page-heading">
                    <div class="overlap-group">
                        <h2 class="Instructions">원하는 조건을 선택해 주세요</h2>
                        <img class="divider" src="img/divider.svg" />
                    </div>
                </div>
            <table>
                <thead>
                    <tr>
                        <th class="day">시간</th>
                        <th class="day" onclick="selectAllForDay(0)">월</th>
                        <th class="day" onclick="selectAllForDay(1)">화</th>
                        <th class="day" onclick="selectAllForDay(2)">수</th>
                        <th class="day" onclick="selectAllForDay(3)">목</th>
                        <th class="day" onclick="selectAllForDay(4)">금</th>
                    </tr>
                </thead>
                <tbody>
                    <% 
                        // 동적으로 테이블 생성 (9:00~21:00, 30분 단위)
                        String[] times = { 
                            "9:00~9:30", "9:30~10:00", "10:00~10:30", "10:30~11:00",
                            "11:00~11:30", "11:30~12:00", "12:00~12:30", "12:30~13:00",
                            "13:00~13:30", "13:30~14:00", "14:00~14:30", "14:30~15:00",
                            "15:00~15:30", "15:30~16:00", "16:00~16:30", "16:30~17:00",
                            "17:00~17:30", "17:30~18:00", "18:00~18:30", "18:30~19:00",
                            "19:00~19:30", "19:30~20:00", "20:00~20:30", "20:30~21:00"
                        };

                        for (int i = 0; i < times.length; i++) {
                    %>
                    <tr>
                        <td class="time" onclick="selectAllForTime(<%=i%>)"><%= times[i] %></td>
                        <td onclick="toggleSelected(this)"></td>
                        <td onclick="toggleSelected(this)"></td>
                        <td onclick="toggleSelected(this)"></td>
                        <td onclick="toggleSelected(this)"></td>
                        <td onclick="toggleSelected(this)"></td>
                    </tr>
                    <% } %>
                </tbody>
            </table>

            <form id="timeTableForm" action="/server" method="POST">
                <input type="hidden" id="timeSlotsInput" name="timeSlots">
            </form>

            <button class="button1" onclick="handleReselect()">다시 선택</button>
            <button class="button2" onclick="handleSubjectSelect()">과목 선택</button> 
        </div>
    </div>

    <script>
        function goToSubjectPage() {
            window.location.href = "SelectSubject.jsp";
        }

        function goToConditionPage() {
            window.location.href = "ConditionSelect.jsp";
        }

        function goToTimetablePage() {
            window.location.href = "Timetable.jsp";
        }

        function toggleSelected(cell) {
            cell.classList.toggle("selected");
        }
		  function handleLogout() {	
			  window.location.href = "Logout.jsp";
		  }
        function selectAllForDay(dayIndex) {
            const timeTable = document.querySelector('table');
            const rows = timeTable.rows;

            for (let i = 1; i < rows.length; i++) { // 시간 열 제외
                const cell = rows[i].cells[dayIndex + 1]; // 1을 더하여 시간 열 제외
                toggleSelected(cell);
            }
        }

        function selectAllForTime(timeIndex) {
            const timeTable = document.querySelector('table');
            const rows = timeTable.rows;

            for (let i = 1; i < rows[timeIndex + 1].cells.length; i++) { // 요일 열 순회
                const cell = rows[timeIndex + 1].cells[i];
                toggleSelected(cell);
            }
        }

        function serializeTimeSlots() {
            const timeTable = document.querySelector('table');
            const rows = timeTable.rows;
            const columns = rows[0].cells.length - 1; // 시간 열 제외
            const timeSlots = [];

            for (let i = 1; i <= columns; i++) {
                const col = [];
                for (let j = 1; j < rows.length; j++) { // 시간 열 제외
                    const cell = rows[j].cells[i];
                    col.push(cell.classList.contains('selected') ? 1 : 0);
                }
                timeSlots.push(col);
            }

            return timeSlots;
        }

        function handleSubmit() {
            const timeSlots = serializeTimeSlots();
            document.getElementById('timeSlotsInput').value = JSON.stringify(timeSlots);
            document.getElementById('timeTableForm').submit();
        }

        function handleReselect() {
            const timeTable = document.querySelector('table');
            const cells = timeTable.querySelectorAll('td');

            cells.forEach(cell => {
                cell.classList.remove('selected');
            });
        }

        function handleSubjectSelect() {
            const timeSlots = serializeTimeSlots();

            const jsonData = JSON.stringify(timeSlots);
            console.log(jsonData);
            fetch("/Timtable", {
                method: "POST",
                headers: {
                    "Content-Type": "application/json"
                },
                body: jsonData
            }).then(() => {
                window.location.href = '/SelectSubject';
            });
        }
    </script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
</body>
</html>
