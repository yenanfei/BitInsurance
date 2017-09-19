<%--
  Created by IntelliJ IDEA.
  User: ZZDELY
  Date: 2017/9/5
  Time: 20:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="Creative - Bootstrap 3 Responsive Admin Template">
    <meta name="author" content="GeeksLabs">
    <meta name="keyword" content="Creative, Dashboard, Admin, Template, Theme, Bootstrap, Responsive, Retina, Minimal">
    <link rel="shortcut icon" href="../img/favicon.png">
    <title>注册</title>
    <!-- Bootstrap CSS -->
    <link href="../css/bootstrap.min.css" rel="stylesheet">
    <!-- bootstrap theme -->
    <link href="../css/bootstrap-theme.css" rel="stylesheet">
    <!--external css-->
    <!-- font icon -->
    <link href="../css/elegant-icons-style.css" rel="stylesheet" />
    <link href="../css/font-awesome.min.css" rel="stylesheet" />
    <!-- Custom styles -->
    <link href="../css/style.css" rel="stylesheet">
    <link href="../css/style-responsive.css" rel="stylesheet" />
</head>
<body>
<section id="Resign" >
    <header class="header dark-bg">
        <div class="toggle-nav">
            <div class="icon-reorder tooltips" data-original-title="Toggle Navigation" data-placement="bottom"></div>
        </div>

        <!--logo start-->
        <a href="../index.jsp" class="logo">全民 <span class="lite">保险</span></a>
        <!--logo end-->

        <div class="nav search-row" id="top_menu">
            <!--  search form start -->
            <ul class="nav top-menu">
                <li>
                    <form class="navbar-form">
                        <input class="form-control" placeholder="Search" type="text">
                    </form>
                </li>
            </ul>
            <!--  search form end -->
        </div>

        <div class="top-nav notification-row">
            <!-- notificatoin dropdown start-->
            <ul class="nav pull-right top-menu">

                <!-- task notificatoin start -->
                <li id="task_notificatoin_bar" class="dropdown">
                    <a data-toggle="dropdown" class="dropdown-toggle" href="#">
                        <span class="icon-task-l"></span>
                    </a>
                </li>
                <!-- task notificatoin end -->
                <!-- inbox notificatoin start-->
                <li id="mail_notificatoin_bar" class="dropdown">
                    <a data-toggle="dropdown" class="dropdown-toggle" href="#">
                        <i class="icon-envelope-l"></i>
                    </a>
                </li>
                <!-- inbox notificatoin end -->
                <!-- alert notification start-->
                <li id="alert_notificatoin_bar" class="dropdown">
                    <a data-toggle="dropdown" class="dropdown-toggle" href="#">
                        <i class="icon-bell-l"></i>
                    </a>
                    <ul class="dropdown-menu extended notification">
                        <div class="notify-arrow notify-arrow-blue"></div>
                    </ul>
                </li>
                <!-- alert notification end-->
                <!-- user login dropdown start-->
                <!-- user login dropdown end -->
            </ul>
            <!-- notificatoin dropdown end-->
        </div>
    </header>
    <!--header end-->
    <section id="main-content">
        <section class="wrapper">
            <div class="row">
                <div class="col-lg-12">
                    <h3 class="page-header">Sign Up</h3>
                    <ol class="breadcrumb">
                        <p>注册</p>
                    </ol>
                </div>
            </div>
            <div class="row">
                <div class="col-lg-12">
                    <section class="panel">
                        <header class="panel-heading">
                            基本信息填写
                        </header>
                        <div class="panel-body">
                            <div class="form">
                                    <div class="form-group ">
            <label for="username" class="control-label col-lg-2">User Name <span class="required">*</span></label>
            <div class="col-lg-10">
                <input class="form-control" id="username" name="username" type="text" required/>
            </div>
                                    </div>
        <div class="form-group ">
            <label for="password" class="control-label col-lg-2">Password <span class="required">*</span></label>
            <div class="col-lg-10">
                <input class="form-control " id="password" name="password" type="text" />
            </div>
        </div>
        <div class="form-group ">
            <label for="borth" class="control-label col-lg-2">Birth <span class="required">*</span></label>
            <div class="col-lg-10">
                <input class="form-control " id="borth" name="borth" type="text" />
            </div>
        </div>
        <div class="form-group ">
            <label for="age" class="control-label col-lg-2">Age<span class="required">*</span></label>
            <div class="col-lg-10">
                <input class="form-control " id="age" name="age" type="text" />
            </div>
        </div>
        <div class="form-group ">
            <label for="E-mail" class="control-label col-lg-2">E-mail<span class="required">*</span></label>
            <div class="col-lg-10">
                <input class="form-control " id="E-mail" name="E-mail" type="text" />
            </div>
        </div>
        <div class="form-group ">
            <label for="sex" class="control-label col-lg-2">Sex<span class="required">*</span></label>
            <div class="col-lg-10">
                <input class="form-control " id="sex" name="sex" type="text" />
            </div>
        </div>
        <div class="form-group ">
            <label for="phone" class="control-label col-lg-2">Phone <span class="required">*</span></label>
            <div class="col-lg-10">
                <input class="form-control " id="phone" name="phone" type="text" />
            </div>
        </div>
        <div class="form-group ">
            <label for="IDcard" class="control-label col-lg-2">IDcard <span class="required">*</span></label>
            <div class="col-lg-10">
                <input class="form-control " id="IDcard" name="IDcard" type="text" />
            </div>
        </div>
        <div class="form-group ">
            <label for="marry" class="control-label col-lg-2">Marry<span class="required">*</span></label>
            <div class="col-lg-10">
                <input class="form-control " id="marry" name="marry" type="text" />
            </div>
        </div>
        <div class="form-group ">
            <label for="illness" class="control-label col-lg-2">Illness <span class="required">*</span></label>
            <div class="col-lg-10">
                <input class="form-control " id="illness" name="illness" type="text"/>
            </div>
        </div>
        <div class="form-group ">
            <label for="job" class="control-label col-lg-2">Job <span class="required">*</span></label>
            <div class="col-lg-10">
                <input class="form-control " id="job" name="job" type="text" />
            </div>
        </div>
        <div class="form-group ">
            <label for="address" class="control-label col-lg-2">Address <span class="required">*</span></label>
            <div class="col-lg-10">
                <input class="form-control " id="address" name="address" type="text" />
            </div>
        </div>
        <div class="form-group ">
            <label for="realname" class="control-label col-lg-2">Realname <span class="required">*</span></label>
            <div class="col-lg-10">
                <input class="form-control " id="realname" name="realname" type="text" />
            </div>
        </div>
                                    <br>
        <div class="form-group">
            <div class="col-lg-offset-2 col-lg-10">
                <button class="btn btn-primary"  onclick="resign()">注册</button>
            </div>
        </div>
                            </div>
                        </div>
                    </section>
                </div>
            </div>
        </section>
    </section>
</section>
<script src="../assets/vendor/jquery/jquery.min.js"></script>
<script src="../assets/vendor/bootstrap/js/bootstrap.min.js"></script>
<script src="../assets/vendor/jquery-slimscroll/jquery.slimscroll.min.js"></script>
<script src="../assets/vendor/jquery.easy-pie-chart/jquery.easypiechart.min.js"></script>
<script src="../assets/vendor/chartist/js/chartist.min.js"></script>
<script src="../assets/scripts/klorofil-common.js"></script>
<script src="../js/checkAuthority.js" type="text/javascript"></script>
<script src="../js/jquery.js"></script>
<script src="../js/bootstrap.min.js"></script>
<!-- nice scroll -->
<script src="../js/jquery.scrollTo.min.js"></script>
<script src="../js/jquery.nicescroll.js" type="text/javascript"></script>
<!-- jquery validate js -->
<script type="text/javascript" src="../js/jquery.validate.min.js"></script>

<!-- custom form validation script for this page-->
<script src="../js/form-validation-script.js"></script>
<!--custome script for all page-->
<script src="../js/scripts.js"></script>
<script type="text/javascript">
function resign()
    {
        var myDate=new Date();
        var mytime=myDate.toLocaleTimeString();    //获取当前时间
        var mydate=myDate.toLocaleDateString();
        mydate=mydate+mytime;
        var zhuce = {
            username: $("#username").val(),
            password: $("#password").val(),
            borth:$("#borth").val(),
            age: $("#age").val(),
            mail: $("#E-mail").val(),
            sex: $("#sex").val(),
            phone:$("#phone").val(),
            IDcard: $("#IDcard").val(),
            marry: $("#marry").val(),
            illness: $("#illness").val(),
            job:$("#job").val(),
            address:$("#address").val(),
            realname:$("#realname").val(),
            time:mydate
        };
        if ( zhuce.username == "" )
        {
            alert("用户名不能为空！");
            return;
        }
        if (zhuce.password=="")
        {
            alert("密码不能为空！");
            return;
        }
        if (zhuce.IDcard=="")
        {
            alert("身份证号不能为空！");
            return;
        }
        if (zhuce.phone=="")
        {
            alert("手机号不能为空！");
            return;
        }


        $.ajax({
            url: '/login/resignFill',
            type: 'post',
            data: zhuce,
            dataType: "json", //返回数据形式为json
            success:function()
            {
                alert("注册成功");
                window.location.href="in";
                window.event.returnValue=false;
            }

        })
    }
</script>
</body>
</html>
