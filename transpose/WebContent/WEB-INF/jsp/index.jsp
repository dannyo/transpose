<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<jsp:include page="layouts/main.jsp" />
<html>
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
</head>
<body>
<h1>This is the Home Page</h1>

<form method="POST" action="upload" enctype="multipart/form-data" >
            <span>File:</span>
            <input type="file" name="file" id="file" /> <br/>
<!--             Destination:
            <input type="text" value="/tmp" name="destination"/> -->
            </br>
            <input class ="btn" type="submit" value="Transpose" name="upload" id="transpose" />
        </form>
<!-- <button style="width:100%" class="btn" type="button">Transpose</button> -->

</body>
</html>