<html>
<head>
    <title>Student Form</title>
</head>
<body>

<center>
    <h2>Student Details</h2>

    <form action="saveStudent" method="post">
        ID: <input type="number" name="id" required><br><br>
        Name: <input type="text" name="name" required><br><br>
        Branch: <input type="text" name="branch" required><br><br>
        Email: <input type="email" name="email" required><br><br>

        <input type="submit" value="Save Student">
    </form>
</center>

</body>
</html>
