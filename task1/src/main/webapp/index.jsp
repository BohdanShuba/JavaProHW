<%@page isELIgnored="false" %>
<%@page pageEncoding="UTF-8" %>

<html lang="ru">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Questionnaire</title>
    <link rel="stylesheet" href="css/main.css">
</head>

<body>
<header>
    <h1>Task-1 proff3</h1>
</header>
<p class="task">Создать проект «Анкета». Сделать возможность
    ввода пользователем его имени, фамилии,
    возраста и ответов на 2-3 вопроса. Данные
    должны отправляться на сервер, который в ответ
    должен вернуть статистику по ответам в виде
    HTML документа.</p>
<form action="/question" method="POST">
    <h2>Questionnaire</h2>
    <label>Enter your first name:
        <input type="text" name="firstName" placeholder="First name" required>
    </label>
    <label>Enter your last name:
        <input type="text" name="lastName" placeholder="Last name" required>
    </label>
    <label>Enter your age:
        <input type="number" name="age" min="14" max=120 placeholder="14-120" required>
    </label>
    <label>1. Do you like Java?</label>
    <input type="radio" name="question1" value="yes"> Yes
    <input type="radio" name="question1" value="no" checked> No
    <label>2. Do you like .NET?</label>
    <input type="radio" name="question2" value="yes"> Yes
    <input type="radio" name="question2" value="no" checked> No
    <label>3. Do you like JavaScript?</label>
    <input type="radio" name="question3" value="yes"> Yes
    <input type="radio" name="question3" value="no" checked> No
    <label>4. Do you like Kotlin?</label>
    <input type="radio" name="question4" value="yes"> Yes
    <input type="radio" name="question4" value="no" checked> No
    <hr>
    <input type="reset">
    <input type="submit">
    <a href="statistic.jsp">View the results</a>
</form>
</body>
</html>