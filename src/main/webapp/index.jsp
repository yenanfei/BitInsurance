<%@ page language="java"
         contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
    session.setAttribute("username","sjkjfks");
%>
<html lang="en">
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="Creative - Bootstrap 3 Responsive Admin Template">
    <meta name="author" content="GeeksLabs">
    <meta name="keyword" content="Creative, Dashboard, Admin, Template, Theme, Bootstrap, Responsive, Retina, Minimal">
    <link rel="shortcut icon" href="../img/favicon.png">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>主页</title>
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
<section id="container" class="">
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
            <!-- task notificatoin end -->
            <!-- inbox notificatoin start-->
            <!-- alert notification end-->
            <!-- user login dropdown start-->
            <li>
                <%--<form action="/login/in" method="get">--%>
                    <button class="btn btn-info"  type="submit" value="登录" onclick="login()"/> 登录</button>
                <%--<form action="/login/resign" method="get">--%>
                    <button class="btn btn-info"  type="submit" value="注册" onclick="resign()"/>注册</button>

            </li>
            <!-- user login dropdown end -->
        </ul>
        <!-- notificatoin dropdown end-->
    </div>
  </header>
<section id="main-content">
    <section class="wrapper">
<div class="navbar-form">
    交易号：<input type="text"class="form-control" placeholder="Search" id="tradeId"></input>
    <button onblur="selecttrade()"class="btn btn-primary">查询</button>
</div>
<div calss="row">
    <div class="col-sm-6">
    <section class="panel">
        <header class="panel-heading">
            交易记录
        </header>
    <table class="table table-striped table-advance table-hover" id="contentTable">
        <thead>
        <tr>
        </tr>
        </thead>
        <tbody id="contentTable1"></tbody>
    </table>
    </section>
    </div>
</div>
<div calss="row">
    <div class="col-sm-6">
    <section class="panel">
            <header class="panel-heading">
                通知标题
            </header>
    <table class="table table-striped table-advance table-hover" id="content">
        <thead>
        <tr>
        </tr>
        </thead>
        <tbody id="content1"></tbody>
    </table>
    </section>
    </div>
</div>
    </section>
</section>
</section>
</body>

<script src="../assets/vendor/jquery/jquery.min.js"></script>
<script src="../assets/vendor/bootstrap/js/bootstrap.min.js"></script>
<script src="../assets/vendor/jquery-slimscroll/jquery.slimscroll.min.js"></script>
<script src="../assets/vendor/jquery.easy-pie-chart/jquery.easypiechart.min.js"></script>
<script src="../assets/vendor/chartist/js/chartist.min.js"></script>
<script src="../assets/scripts/klorofil-common.js"></script>
<script src="../js/checkAuthority.js" type="text/javascript"></script>
<script src="http://pv.sohu.com/cityjson?ie=utf-8"></script>
<script type="text/javascript">
    function resign() {
        var id="111";
        $.ajax({
            url: "/login/jump",
            type: 'post',
            data: id,
            dateType: 'json',
            success: function (result) {
                window.location.href="login/resign";
                window.event.returnValue=false;
            }
        })
    }

    function login(){
        var id="111";
        $.ajax({
            url: "/login/jump",
            type: 'post',
            data: id,
            dateType: 'json',
            success: function (result) {
                window.location.href="login/in";
                window.event.returnValue=false;
            }
        })
    }
    function viewData(){
        $("#content").find("tr").each(function () {
            this.onclick = function () {
                var nextPath = "tourist/notification?id=" + this.id;
                window.location.href = nextPath;
            }
        });
    }
    function selecttrade(){
        var condition= {
            tradeid:$("#tradeId").val()
        };
        $.ajax({
            url: "/tourist/selecttrade",
            type: 'post',
            data: condition,
            dateType: 'json',
            success: function (result) {
                $("#contentTable1").empty();
                var tr = $("<tr></tr>");
                var td = $("<td></td>");
                td.append("交易号");
                tr.append(td);
                var td = $("<td></td>");
                td.append("用户名");
                tr.append(td);
                var td = $("<td></td>");
                td.append("保险ID");
                tr.append(td);
                var td = $("<td></td>");
                td.append("交易时间");
                tr.append(td);
                $("#contentTable1").append(tr);
                for (i = 0, e =  (result.length-1); i < e; i++) {
                    var str_tr = "<tr ";
                    str_tr = str_tr + "id=" + result[i][0]+ "></tr>";
                    var tr = $(str_tr);
                    var td = $("<td></td>");
                    td.text(result[i][0]);//交易号
                    tr.append(td);
                    var td = $("<td></td>");
                    td.text(result[i][1]);//用户名
                    tr.append(td);
                    var td = $("<td></td>");
                    td.text(result[i][2]);//交易时间
                    tr.append(td);
                    var td = $("<td></td>");
                    td.text(result[i][3]);//产品
                    tr.append(td);
                    $("#contentTable1").append(tr);
                }

                $("#content1").empty();

                for (i = 0, e = result[result.length-1].length; i < e; i++) {
                    var str_tr = "<tr ";
                    str_tr = str_tr + "id=" + result[result.length-1][i]+ "></tr>";
                    var tr = $(str_tr);
                    var td = $("<td></td>");
                    td.text( result[result.length-1][i]);//机构代码
                    tr.append(td);
                    var str_td = "<button onClick=\"viewData()\" class=\"btn btn-primary\">查看</button>";
                    var td = $(str_td);
                    tr.append(td);
                    $("#content1").append(tr);
                }
            }
        })
    }
    $(document).ready(function () {
        var ID = "id";
        $.ajax({
            url: "/tourist/alltrade",
            type: 'post',
            data: ID,
            dateType: 'json',
            success: function (result) {
                $("#contentTable1").empty();
                var tr = $("<tr></tr>");
                var td = $("<td></td>");
                td.append("交易号");
                tr.append(td);
                var td = $("<td></td>");
                td.append("用户名");
                tr.append(td);
                var td = $("<td></td>");
                td.append("保险ID");
                tr.append(td);
                var td = $("<td></td>");
                td.append("交易时间");
                tr.append(td);
                $("#contentTable1").append(tr);
                for (i = 0, e =  (result.length-1); i < e; i++) {
                    var str_tr = "<tr ";
                    str_tr = str_tr + "id=" + result[i][0]+ "></tr>";
                    var tr = $(str_tr);
                    var td = $("<td></td>");
                    td.text(result[i][0]);//交易号
                    tr.append(td);
                    var td = $("<td></td>");
                    td.text(result[i][1]);//用户名
                    tr.append(td);
                    var td = $("<td></td>");
                    td.text(result[i][2]);//交易时间
                    tr.append(td);
                    var td = $("<td></td>");
                    td.text(result[i][3]);//产品
                    tr.append(td);
                    $("#contentTable1").append(tr);
                }

                $("#content1").empty();

                for (i = 0, e = result[result.length-1].length; i < e; i++) {
                    var str_tr = "<tr ";
                    str_tr = str_tr + "id=" + result[result.length-1][i]+ "></tr>";
                    var tr = $(str_tr);
                    var td = $("<td></td>");
                    td.text( result[result.length-1][i]);//机构代码
                    tr.append(td);
                    var str_td = "<button onClick=\"viewData()\" class=\"btn btn-primary\">查看</button>";
                    var td = $(str_td);
                    tr.append(td);
                    $("#content1").append(tr);
                }
            }
        })
    })
</script>
</html>
