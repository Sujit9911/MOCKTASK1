<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Login - APP</title>
</head>
<body>

<h1>Welcome to APP</h1>

<form action="/users/login" method="post">

    <label>Username</label>
    <input type="text" name="username" required>

    <br><br>

    <label>Email</label>
    <input type="email" name="email" required>

    <br><br>

    <label>Password</label>
    <input type="password" name="password" required>

    <br><br>

    <button type="submit">Login</button>

</form>

<p>
    Don't have an account?
    <a href="/register">Register</a>
</p>

</body>
</html>