<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<c:import url="/includes/header.html" />

<h1>Join our email list</h1>
<p>To join our email list, enter your name and email address below.</p>

<form action="emailList" method="post">
  <input type="hidden" name="action" value="add">

  <label>Email:</label>
  <input type="email" name="email"><br>

  <label>First Name:</label>
  <input type="text" name="firstName"><br>

  <label>Last Name:</label>
  <input type="text" name="lastName"><br>

  <input type="submit" value="Join Now">
</form>

<c:import url="/includes/footer.jsp" />
