<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--
  Practical 9 - Marks entry and grading in ONE JSP file.
  Combines the former index.html (marks form) and result.jsp.
  Shows the form when no marks are supplied, otherwise prints the grade.
--%>
<html>
<head>
  <title>Enter Marks</title>
</head>
<body>
<%
  String first = request.getParameter("t1");
  if (first == null) {
%>
  <h1>Enter Marks of 5 Subjects</h1>
  <form action="jsp.jsp" method="get">
    Enter MARKS of JAVA: <input type="number" name="t1" required><br><br>
    Enter MARKS of OS: <input type="number" name="t2" required><br><br>
    Enter MARKS of TOC: <input type="number" name="t3" required><br><br>
    Enter MARKS of PYTHON: <input type="number" name="t4" required><br><br>
    Enter MARKS of IOT: <input type="number" name="t5" required><br><br>
    <input type="submit" value="Submit">
  </form>
<%
  } else {
    try {
      int s1 = Integer.parseInt(request.getParameter("t1"));
      int s2 = Integer.parseInt(request.getParameter("t2"));
      int s3 = Integer.parseInt(request.getParameter("t3"));
      int s4 = Integer.parseInt(request.getParameter("t4"));
      int s5 = Integer.parseInt(request.getParameter("t5"));

      int avg = (s1 + s2 + s3 + s4 + s5) / 5;
      out.print("<h2>Your Grade is: ");
      if (avg > 90) {
        out.print("A+");
      } else if (avg >= 80) {
        out.print("A");
      } else if (avg >= 70) {
        out.print("B+");
      } else if (avg >= 60) {
        out.print("B");
      } else {
        out.print("C");
      }
      out.print("</h2>");
    } catch (Exception e) {
      out.print("<h3 style='color:red;'>Error: Please enter valid numeric marks in all fields.</h3>");
    }
  }
%>
</body>
</html>
