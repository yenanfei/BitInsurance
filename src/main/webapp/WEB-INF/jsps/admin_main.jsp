<%--
  Created by IntelliJ IDEA.
  User: ZZDELY
  Date: 2017/9/7
  Time: 19:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="Creative - Bootstrap 3 Responsive Admin Template">
    <meta name="author" content="GeeksLabs">
    <meta name="keyword" content="Creative, Dashboard, Admin, Template, Theme, Bootstrap, Responsive, Retina, Minimal">
    <link rel="shortcut icon" href="../img/favicon.png">
    <title>管理员主页</title>
    <!-- Bootstrap CSS -->
    <link href="../css/bootstrap.min.css" rel="stylesheet">
    <!-- bootstrap theme -->
    <link href="../css/bootstrap-theme.css" rel="stylesheet">
    <!--external css-->
    <!-- font icon -->
    <link href="../css/elegant-icons-style.css" rel="stylesheet" />
    <link href="../css/font-awesome.min.css" rel="stylesheet" />
    <!-- date picker -->

    <!-- color picker -->

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
        <a href="/admin/main" class="logo">全民 <span class="lite">保险</span></a>
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
                    <ul class="dropdown-menu extended tasks-bar">
                        <div class="notify-arrow notify-arrow-blue"></div>
                    </ul>
                </li>
                <!-- task notificatoin end -->
                <!-- inbox notificatoin start-->
                <li id="mail_notificatoin_bar" class="dropdown">
                    <a data-toggle="dropdown" class="dropdown-toggle" href="#">
                        <i class="icon-envelope-l"></i>
                    </a>
                </li>
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
                <li class="dropdown">
                    <a data-toggle="dropdown" class="dropdown-toggle" href="#">
                            <span class="profile-ava">
                                <img alt="" src="../img/avatar1_small.jpg">
                            </span>
                        <span class="username" name="username" type="text"></span>
                        <b class="caret"></b>
                    </a>
                    <ul class="dropdown-menu extended logout">
                        <div class="log-arrow-up"></div>
                        <li>
                            <a href="../index.jsp"><i class="icon_key_alt"></i> Log Out</a>
                        </li>
                    </ul>
                </li>
                <!-- user login dropdown end -->
            </ul>
            <!-- notificatoin dropdown end-->
        </div>
    </header>
    <!--header end-->

    <!--sidebar start-->
    <aside>
        <div id="sidebar"  class="nav-collapse ">
            <!-- sidebar menu start-->
            <ul class="sidebar-menu">
                <li class="active">
                    <a class="" href="/admin/main">
                        <i class="icon_house_alt"></i>
                        <span>主页</span>
                    </a>
                </li>
                <li class="sidebar-menu">
                    <a class="" href="/admin/levelmanage">
                        <i class="icon_document_alt"></i>
                        <span>权限管理</span>
                    </a>
                </li>
                <li class="sidebar-menu">
                    <a class="" href="/admin/banlist">
                        <i class="icon_desktop"></i>
                        <span>封号管理</span>
                    </a>
                </li>
                <li class="sidebar-menu">
                    <a class="" href="/admin/notificationmanage">
                        <i class="icon_table"></i>
                        <span>通知管理</span>
                    </a>
                </li>
            </ul>
            <!-- sidebar menu end-->
        </div>
    </aside>
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
                $("#contentTable").append(tr);
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
                    td.text(result[i][2]);//产品
                    tr.append(td);
                    var td = $("<td></td>");
                    td.text(result[i][3]);//交易时间
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
                $("#contentTable").append(tr);
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
                    td.text(result[i][2]);//产品
                    tr.append(td);
                    var td = $("<td></td>");
                    td.text(result[i][3]);//交易时间
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
