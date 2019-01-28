<%--@elvariable id="questionList" type="java.util.List<prog.kiev.Question>"--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Questionnaire</title>

</head>
<body>
<h1>Анкета</h1>
<a href="/questionnaire/answer">К ответам</a>
<br>
<form action = "/questionnaire/answer" method="get">
    <input type="text" name="name" placeholder="Имя"/><br>
    <input type="text" name="surname" placeholder="Фамилия"/><br>

    <c:forEach items="${questionList}" var="question">
        <p>${question.text}</p>
        <input type="text" name="question[${question.id}]" value=""/>
        <br>
    </c:forEach> <br>
    <input type="Submit" value="Answer"/>
</form>

</body>
</html>