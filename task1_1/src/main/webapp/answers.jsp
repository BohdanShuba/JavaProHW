<%--@elvariable id="questionList" type="java.util.List<prog.kiev.Question>"--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Answers</title>
</head>
<body>

<a href="/questionnaire/question">К вопросам</a>
<br>
<c:forEach items="${questionList}" var="question">
    <p>${question.text}</p>
    <c:forEach items="${question.answers}" var="answer">
        ${answer.name}  ${answer.surname} ответил: ${answer.answer}
        <br>
    </c:forEach>
    <br>
</c:forEach> <br>
</body>
</html>