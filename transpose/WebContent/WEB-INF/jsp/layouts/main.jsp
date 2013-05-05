<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%-- <jsp:useBean id="main" class="com.transpose.MainController" scope="page">
	<jsp:setProperty property="homeClass" name="main" value="active"/>
	<jsp:setProperty property="aboutClass" name="main" value="active"/>
</jsp:useBean> --%>
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
	<title>Transpose</title>
    <!-- Le styles -->
    <link href="resources/css/bootstrap.css" rel="stylesheet">
    <link href="resources/css/prettify.css" rel="stylesheet">
    <link href="resources/css/utils.css" rel="stylesheet">
    <style type="text/css">
      body {
        padding-top: 60px;
        padding-bottom: 40px;
      }
      .sidebar-nav {
        padding: 9px 0;
      }
    </style>
    <link href="resources/css/bootstrap-responsive.css" rel="stylesheet">
</head>
<body>
	<div class="navbar navbar-inverse navbar-fixed-top">
      <div class="navbar-inner">
        <div class="container-fluid">
          <a class="btn btn-navbar" >
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </a>
          <a class="brand" href="./">Transpose</a>
          <div class="nav-collapse collapse">
            <ul class="nav">
    		 <li class="active"><a href="./">Home</a></li>
       <%--        <li class="<jsp:getProperty property="homeClass" name="main"/>"><a href="./">Home</a></li> --%>
             <%--  <li class="<g:pageProperty name="page.homeClass"/>"><a href=""><i class="icon icon-home icon-white"></i> Home</a></li>
              <li class="<g:pageProperty name="page.uploadClass"/>"><g:link controller="preValidation"><i class="icon icon-upload icon-white"></i> Upload</g:link></li>
              <li class="<g:pageProperty name="page.uploadStatusClass"/>"><a href="upload/execute"><i class="icon icon-star icon-white"></i> Status</a></li>
              <li class="<g:pageProperty name="page.uploadLogClass"/>"><a href="log/list"><i class="icon icon-info-sign icon-white"></i> Logs</a></li>
              <li class="<g:pageProperty name="page.recoverClass"/>"><g:link controller="recover"><i class="icon icon-upload icon-white"></i> Recover</g:link></li>
               --%>
           	 <li><a href="./about">About</a></li>
            </ul>
          </div>
        </div>
      </div>
    </div>


</body>
</html>