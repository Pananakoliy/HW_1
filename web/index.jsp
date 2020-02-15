<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title> ${title} </title>

</head>
<body>
<h1 style="text-align: center">
  ${hint1}
  ${hint2}
</h1>
<div style="display: flex; justify-content: center">

  <div>
    <form method="post" action="${pageContext.request.contextPath}/">
      <table>
        <tr>
          <td>
            <label for="name-input">Username (Kapacik):</label>
          </td>
          <td>
            <input type="text" name="userName" id="name-input"/>
          </td>
        </tr>
        <tr>
          <td>
            <label for="password-input">Password (Kapacik but in dots):</label>
          </td>
          <td>
            <input type="password" name="userPassword" id="password-input"/>
          </td>
        </tr>
      </table>
      <button type="submit">Don't forget about "Kapacik"</button>
    </form>
  </div>
</div>
</body>
</html>