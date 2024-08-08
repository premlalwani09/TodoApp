# Getting Started


## HTML
```
<html>
	<head>
		<title> My first HTML Page</title>
	</head>
	<body>
		My first html page with body
	</body>
</html>
```




## JSP

/src/main/reources/META_INF/resources/WEB_INF/jsp/sayHello.jsp

/say-hello-jsp => SayHelloController - sayHelloJsp() method => sayHello

/WEB-INF/jsp/sayHello.jsp




## Login JSP

/login => com.springboot.TodoApplication.hello.LoginController => login.jsp

B1: Identifies correct Controller method
/login => LoginController.gotoLoginPage

B2: Executes Controller method
=> Puts data into Model
=> Return View name => login

B3: Identifies correct View
=> /WEB-INF/jsp/login.jsp => View Resolver

B4: Executes View


## Todo

id 
username
description
targetDate
done

TodoController
listTodos.jsp


## Request vs Model vs Session

/META_INF/resources/webjars/bootstrap/5.1.3/css/bootstrap.min.css
/META_INF/resources/webjars/bootstrap/5.1.3/js/bootstrap.min.js
/META_INF/resources/webjars/jquery/3.6.0/jquery.min.js


#Docker
docker run --detach 
--env MYSQL_ROOT_PASSWORD=dummypassword 
--env MYSQL_USER=todos-user 
--env MYSQL_PASSWORD=dummytodos 
--env MYSQL_DATABASE=todos 
--name mysql --publish 3306:3306 
mysql:8-oracle


