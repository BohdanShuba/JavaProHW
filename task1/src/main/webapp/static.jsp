<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored ="false" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="css/statistic.css">
    <title>Statistic</title>
</head>
<body>
<header>
    <h2>Statistic</h2>
</header>

<a href="index.jsp">Back to questionnaire</a>
<p>1. Do you like Java? - Yes:${rez[0]}  ,No: ${rez[1]} </p>
<p>2. Do you like .NET? - Yes:${rez[2]} ,No:${rez[3]} </p>
<p>3. Do you like JavaScript? - Yes:${rez[4]} ,No:${rez[5]} </p>
<p>4. Do you like Kotlin? - Yes:${rez[6]} ,No:${rez[7]} </p>
<p>Total profiles: ${total}</p>
<table>
    <caption>The form was filled:</caption>
    <tr>
        <th>Name</th>
        <th>Last name</th>
        <th>Age</th>
    </tr>
    <c:forEach var="person" items="${pers}">
        <tr>
            <td>${person.name}</td>
            <td>${person.lastName}</td>
            <td>${person.age}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>