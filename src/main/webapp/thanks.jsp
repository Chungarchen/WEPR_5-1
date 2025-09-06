<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ include file="/includes/header.html" %>

<h1>Thanks for joining our email list</h1>
<p>Here is the information that you entered:</p>

<label>Email:</label>
<span>${user.email}</span><br>

<label>First Name:</label>
<span>${user.firstName}</span><br>

<label>Last Name:</label>
<span>${user.lastName}</span><br>

 <form action="index.jsp" method="get">
    <input type="submit" value="Return">
  </form>

<%@ include file="/includes/footer.jsp" %>
