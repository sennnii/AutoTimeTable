<%@page import="webprogramming.Infromation.TNL"%>
<%@page import="webprogramming.Infromation.Session"%>
<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String userID = (String) session.getAttribute("userID");
	int i=0;
%>
<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>autoTimeTable</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <link rel="stylesheet" href="tableGenerator.css">
  </head>
  <script type="text/javascript">
	  function handleSubjectSelect(i) {	
	      const jsonData = JSON.stringify(i);
	      console.log(jsonData);
	      fetch("/Timtable", {
	          method: "POST",
	          headers: {
	              "Content-Type": "application/json"
	          },
	          body: jsonData
	      })
	      const modalElement = document.getElementById('exampleModal');
	      const modalInstance = new bootstrap.Modal(modalElement); 
	      modalInstance.show();
	  }
		  function handleLogout() {	
			  window.location.href = "Logout.jsp";
		  }
  </script>
  <body>
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
              <a class="nav-link" href="/SelectCondition">조건 선택</a>
            </li>
            <li class="nav-item">
              <a class="nav-link disabled" aria-current="page" href="#">시간표</a>
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
    <div class="d-flex justify-content-center my-2 mb-5">
      <div>
        <p>시간표 생성 결과</p>
        <hr>
      </div>
    </div>
    <div class="d-flex justify-content-evenly flex-wrap">
       <% 
    	  ArrayList<ArrayList<Session>> timetable = (ArrayList<ArrayList<Session>>)request.getAttribute("timeTable");
       	  int zIndex =10;
    	  for(ArrayList<Session> t : timetable)
    	  {   i=i+1;
    	  	  int j = 0;
    		  zIndex=10;
    		  out.println(" <div class=\"tableWrapper my-2\">\r\n"
  					+ "        <table>\r\n"
  					+ "          <thead>\r\n"
  					+ "              <tr>\r\n"
  					+ "                  <th class=\"th\"></th>\r\n"
  					+ "                  <th class=\"th\">월</th>\r\n"
  					+ "                  <th class=\"th\">화</th>\r\n"
  					+ "                  <th class=\"th\">수</th>\r\n"
  					+ "                  <th class=\"th\">목</th>\r\n"
  					+ "                  <th class=\"th\">금</th>\r\n"
  					+ "              </tr>\r\n"
  					+ "          </thead>\r\n"
  					+ "          <tbody>\r\n"
  					+ "              <tr>\r\n"
  					+ "                  <td class=\"td\">9:00~10:00</td>\r\n"
  					+ "                  <td class=\"td\"></td>\r\n"
  					+ "                  <td class=\"td\"></td>\r\n"
  					+ "                  <td class=\"td\"></td>\r\n"
  					+ "                  <td class=\"td\"></td>\r\n"
  					+ "                  <td class=\"td\"></td>\r\n"
  					+ "              </tr>\r\n"
  					+ "              <tr>\r\n"
  					+ "                  <td class=\"td\">10:00~11:00</td>\r\n"
  					+ "                  <td class=\"td\"></td>\r\n"
  					+ "                  <td class=\"td\"></td>\r\n"
  					+ "                  <td class=\"td\"></td>\r\n"
  					+ "                  <td class=\"td\"></td>\r\n"
  					+ "                  <td class=\"td\"></td>\r\n"
  					+ "              </tr>\r\n"
  					+ "              <tr>\r\n"
  					+ "                  <td class=\"td\">11:00~12:00</td>\r\n"
  					+ "                  <td class=\"td\"></td>\r\n"
  					+ "                  <td class=\"td\"></td>\r\n"
  					+ "                  <td class=\"td\"></td>\r\n"
  					+ "                  <td class=\"td\"></td>\r\n"
  					+ "                  <td class=\"td\"></td>\r\n"
  					+ "              </tr>\r\n"
  					+ "              <tr>\r\n"
  					+ "                  <td class=\"td\">12:00~13:00</td>\r\n"
  					+ "                  <td class=\"td\"></td>\r\n"
  					+ "                  <td class=\"td\"></td>\r\n"
  					+ "                  <td class=\"td\"></td>\r\n"
  					+ "                  <td class=\"td\"></td>\r\n"
  					+ "                  <td class=\"td\"></td>\r\n"
  					+ "              </tr>\r\n"
  					+ "              <tr>\r\n"
  					+ "                  <td class=\"td\">13:00~14:00</td>\r\n"
  					+ "                  <td class=\"td\"></td>\r\n"
  					+ "                  <td class=\"td\"></td>\r\n"
  					+ "                  <td class=\"td\"></td>\r\n"
  					+ "                  <td class=\"td\"></td>\r\n"
  					+ "                  <td class=\"td\"></td>\r\n"
  					+ "              </tr>\r\n"
  					+ "              <tr>\r\n"
  					+ "                  <td class=\"td\">14:00~15:00</td>\r\n"
  					+ "                  <td class=\"td\"></td>\r\n"
  					+ "                  <td class=\"td\"></td>\r\n"
  					+ "                  <td class=\"td\"></td>\r\n"
  					+ "                  <td class=\"td\"></td>\r\n"
  					+ "                  <td class=\"td\"></td>\r\n"
  					+ "              </tr>\r\n"
  					+ "              <tr>\r\n"
  					+ "                  <td class=\"td\">15:00~16:00</td>\r\n"
  					+ "                  <td class=\"td\"></td>\r\n"
  					+ "                  <td class=\"td\"></td>\r\n"
  					+ "                  <td class=\"td\"></td>\r\n"
  					+ "                  <td class=\"td\"></td>\r\n"
  					+ "                  <td class=\"td\"></td>\r\n"
  					+ "              </tr>\r\n"
  					+ "              <tr>\r\n"
  					+ "                  <td class=\"td\">16:00~17:00</td>\r\n"
  					+ "                  <td class=\"td\"></td>\r\n"
  					+ "                  <td class=\"td\"></td>\r\n"
  					+ "                  <td class=\"td\"></td>\r\n"
  					+ "                  <td class=\"td\"></td>\r\n"
  					+ "                  <td class=\"td\"></td>\r\n"
  					+ "              </tr>\r\n"
  					+ "              <tr>\r\n"
  					+ "                  <td class=\"td\">17:00~18:00</td>\r\n"
  					+ "                  <td class=\"td\"></td>\r\n"
  					+ "                  <td class=\"td\"></td>\r\n"
  					+ "                  <td class=\"td\"></td>\r\n"
  					+ "                  <td class=\"td\"></td>\r\n"
  					+ "                  <td class=\"td\"></td>\r\n"
  					+ "              </tr>\r\n"
  					+ "              <tr>\r\n"
  					+ "                  <td class=\"td\">18:00~19:00</td>\r\n"
  					+ "                  <td class=\"td\"></td>\r\n"
  					+ "                  <td class=\"td\"></td>\r\n"
  					+ "                  <td class=\"td\"></td>\r\n"
  					+ "                  <td class=\"td\"></td>\r\n"
  					+ "                  <td class=\"td\"></td>\r\n"
  					+ "              </tr>\r\n"
  					+ "              <tr>\r\n"
  					+ "                  <td class=\"td\">19:00~20:00</td>\r\n"
  					+ "                  <td class=\"td\"></td>\r\n"
  					+ "                  <td class=\"td\"></td>\r\n"
  					+ "                  <td class=\"td\"></td>\r\n"
  					+ "                  <td class=\"td\"></td>\r\n"
  					+ "                  <td class=\"td\"></td>\r\n"
  					+ "              </tr>\r\n"
  					+ "              <tr>\r\n"
  					+ "                  <td class=\"td\">20:00~21:00</td>\r\n"
  					+ "                  <td class=\"td\"></td>\r\n"
  					+ "                  <td class=\"td\"></td>\r\n"
  					+ "                  <td class=\"td\"></td>\r\n"
  					+ "                  <td class=\"td\"></td>\r\n"
  					+ "                  <td class=\"td\"></td>\r\n"
  					+ "              </tr>\r\n"
  					+ "          </tbody>\r\n"
  					+ "        </table>\r\n"); 
  		  	for (Session v : t)
  		  	{
  		  		j= j+1;
  		  		ArrayList<TNL> time = v.getTime();
  		  		for(TNL tnl : time)
  		  		{
  		  			int start = tnl.getStart()/100;
		  			int end = tnl.getEnd()/100;
		  			double startMinute = tnl.getStart()/100.0 - start;
		  			double endMinute = tnl.getEnd()/100.0 - end;
	  		  		out.println("<div class=\"class"+j+"\"" 
		  						+"style=\"position: absolute; top:" 
		  						+ ((start+startMinute*5/3 - 8)*30+1)
		  						+ "px; left:" 
		  						+ (((tnl.getDay().getValue())*95.85)+1)
		  						+ "px; height:"
		  						+ ((end-start+(endMinute - startMinute)*5/3)*30-1)
		  						+ "px; z-index:"
		  						+ zIndex+";"
		  						+"width: 94.85px;\">"
		  						+ v.getClassName()
		  						+"<br>"
		  						+ v.getProfessor()
		  						+"<br>"
		  						+ tnl.getLocation()
		  						+"<br>"
		  						+"</div>\r\n");
	  		  		++zIndex;
  		  		}
  		  	}
 
  			    if (userID != null) 
  			    {
  		  		  	out.println("<div class=\"bg-transparent\">");
  	            	out.println("<button type=\"button\" class=\"btn btn-primary\" onclick=\"handleSubjectSelect("+i+")\" >저장하기</button>");
  	    		  	out.println("      </div> ");

  			    }

  		  	out.println("      </div> ");
  		  }%>
			<div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
			  <div class="modal-dialog modal-dialog-centered">
			    <div class="modal-content">
			      <div class="modal-header">
			        <h5 class="modal-title">저장 완료</h5>
			        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
			      </div>
			      <div class="modal-body">
			        <p>저장이 완료되었습니다.</p>
			      </div>
			      <div class="modal-footer">
			        <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
			      </div>
			    </div>
			  </div>
			</div>
    </div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
  </body>
</html>
