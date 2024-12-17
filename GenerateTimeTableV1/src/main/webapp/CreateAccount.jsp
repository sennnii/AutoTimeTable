<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>AutoTimeTable - Sign up</title>
    <link rel="stylesheet" href="Login.css">
    <script src="https://code.jquery.com/jquery-3.7.1.js"></script>
    <script>
	    function checkDuplicate() {
	        const id =document.getElementById("studentnumber")
	        fetch("/CheckDuplicate", {
	            method: "POST",
	            headers: {
	                "Content-Type": "application/json"
	            },
	            body: encodeURIComponent(id.value)
	        }).then((response) => response.json())
			.then(data => {
			    if (data.redirect) {
			        window.location.href = data.redirect;
			    }
})
	    }
       $(document).ready(function () {
    
        $("#studentname").on("input", function () {
        const value = $(this).val();

        if (value === "") {
                $(this).css("border", ""); 
                return;
            }
        if (value.trim().length > 0) { 
            $(this).css("border", "1px solid green");
        } else {
            $(this).css("border", "1px solid red");
        }
    });

    $("#studentnumber").on("input", function () {
        const value = $(this).val();
        const isNumeric = /^\d*$/.test(value);
        const isValidLength = value.length === 10; 

        if (value === "") {
            $(this).css("border", ""); 
            $("#studentnumber-numeric-error").remove(); 
            $("#studentnumber-format-error").remove(); 
            return;
        }
       
        if (!isNumeric) {
            if ($("#studentnumber-numeric-error").length === 0) {
                $(this).after('<div id="studentnumber-numeric-error" style="color: red;">숫자만 입력할 수 있습니다.</div>');
            }
        } else {
            $("#studentnumber-numeric-error").remove();
        }

       
        if (!isValidLength) {
            if ($("#studentnumber-format-error").length === 0) {
                $(this).after('<div id="studentnumber-format-error" style="color: red;">학번 양식에 맞지 않습니다. 10글자여야 합니다.</div>');
            }
        } else {
            $("#studentnumber-format-error").remove();
        }

      
        if (isNumeric && isValidLength) {
            $(this).css("border", "1px solid green");
        } else {
            $(this).css("border", "1px solid red");
        }
    });


    $("#password").on("input", function () {
        const password = $(this).val();

        if (password === "") {
                $(this).css("border", "");
                $("#password-length-error").remove();
                return;
            }
        if (password.length < 4) {
            $(this).css("border", "1px solid red");
            if ($("#password-length-error").length === 0) {
                $(this).after('<div id="password-length-error" style="color: red;">비밀번호는 최소 4글자 이상이어야 합니다.</div>');
            }
        } else {
            $(this).css("border", "1px solid green");
            $("#password-length-error").remove();
        }
    });

    $("#passwordtest").on("input", function () {
        const password = $("#password").val();
        const confirmPassword = $(this).val();
        if (confirmPassword === "") {
                $(this).css("border", "");
                $("#password-error").remove();
                return;
            }

        if (password !== confirmPassword) {
            $(this).css("border", "1px solid red");
            if ($("#password-error").length === 0) {
                $(this).after('<div id="password-error" style="color: red;">비밀번호가 일치하지 않습니다.</div>');
            }
        } else {
            $(this).css("border", "1px solid green");
            $("#password-error").remove();
        }
    });

    $(".login-box").on("submit", function (e) {
        const studentName = $("#studentname").val().trim();
        const studentNumber = $("#studentnumber").val();
        const password = $("#password").val();
        const confirmPassword = $("#passwordtest").val();

        if (studentName === "") {
            alert("이름을 입력해주세요.");
            e.preventDefault();
        } else if (!/^\d{10}$/.test(studentNumber)) {
            alert("학번은 숫자 10자리여야 합니다.");
            e.preventDefault();
        } else if (password.length < 4) {
            alert("비밀번호는 최소 4글자 이상이어야 합니다.");
            e.preventDefault();
        } else if (password !== confirmPassword) {
            alert("비밀번호가 일치하지 않습니다.");
            e.preventDefault();
        }
    });


});
    </script>
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
        <!-- 회원가입 -->
        <form action="/Register" method="POST" class="login-box">

            <!-- 이름 -->
            <div class="input-group">
                <label for="studentname">Student Name</label>
                <input type="text" name="studentname" id="studentname" placeholder="이름을 입력하세요" required />
            </div>

            <!-- 학번 -->
            <div class="input-group">
                <label for="studentnumber">Student Number</label>
                <input type="text" name="studentnumber" id="studentnumber" placeholder="학번을 입력하세요" required />
                <button type="button" id="check-duplicate" onclick="checkDuplicate()" style="margin-left: 10px; font-size: 12px;">중복 확인</button>
                        <%
						    String duplicate = request.getParameter("duplicate");
						    if (duplicate != null) {
						%>
						    <p style="color: red;">이미 가입된 학번입니다.</p>
						<%
						    }
						%>
            </div>
    
            <!-- 비밀번호 입력 -->
            <div class="input-group">
                <label for="password">Password</label>
                <input type="password" name="password" id="password" placeholder="비밀번호를 입력하세요" required />
            </div>

            <!-- 비밀번호 확인 -->
            <div class="input-group">
                <label for="passwordtest">Re-enter password</label>
                <input type="password" name="passwordtest" id="passwordtest" placeholder="비밀번호를 입력하세요" required />
            </div>
            <%
			    if (duplicate == null) {
			%>
            	<button type="submit" class="login-button">Sign up</button>
			<%
			    }
			%>
            Already have an account? <a href="Login.jsp">Sign in</a>
        </form>
    </div>
</body>
</html>