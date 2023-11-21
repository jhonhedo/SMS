<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
</head>
<body>
  <table border="1">
    <thead>
      <tr>
        <th>Rollno</th>
        <th>Name</th>
        <th>Email</th>
        <th>City</th>
        <th>Action</th>
      </tr>
    </thead>
    <tbody>
      <c:forEach items="${students}" var="s">
        <tr>
          <td>${s.rollno}</td>
          <td>${s.name}</td>
          <td>${s.email}</td>
          <td>${s.city}</td>
          <td>
          <a href="edit-std?rollno=${s.rollno}">edit</a>|<a href="delete-std?rollno=${s.rollno}">delete</a>
          </td>
        </tr>
      </c:forEach>
    </tbody>
  </table>
  <a href="index.jsp">Home</a>
</body>
</html>