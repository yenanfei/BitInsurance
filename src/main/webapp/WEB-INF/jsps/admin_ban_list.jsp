<%--
  Created by IntelliJ IDEA.
  User: ZZDELY
  Date: 2017/9/12
  Time: 20:55
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
    <title>封号管理</title>
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
                        <li class="eborder-top">
                            <a href="/user/infomanage"><i class="icon_profile"></i> My Profile</a>
                        </li>
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
            <div class="row">
                <div class="col-lg-12">
                    <h3 class="page-header">Main View</h3>
                    <ol class="breadcrumb">
                        <p>封号管理</p>
                    </ol>
                </div>
            </div>
            <div class="BanList">
                <div class="col-lg-12">
                    <section class="panel">
                        <header class="panel-heading">
                            封号管理
                        </header>
                        <%--<%@ include file="slidebar.html" %>--%>
                        <table class="table" id="contentTable">
                            <caption></caption>
                            <thead>
                            <tr>
                                <td>被举报者ID</td>
                                <td>被举报者姓名</td>
                                <td>封号理由</td>
                                <td>交易号</td>
                                <td></td>
                            </tr>
                            </thead>

                            <tbody id="table"></tbody>
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
<script type="text/javascript">
    function banuser() {
        $("#contentTable").find("tr").each(function () {
            this.onclick = function () {
                var ID={id:this.id};
                $.ajax({
                    url: "/admin/banuser",
                    type: 'post',
                    data: ID,
                    dateType: 'json',
                    success: function (result) {
                        alert("封号成功");
                    }
                });
            }
        })
    }
    $(document).ready(function () {
        var ID = "id";
        $.ajax({
            url: "/admin/banBack",
            type: 'post',
            data: ID,
            dateType: 'json',
            success: function (data) {
                var result = $.parseJSON(data);
                $("#table").empty();
                for (i = 0, e = result.length; i < e; i++) {
                    var str_tr = "<tr ";
                    str_tr = str_tr + "id=" + result[i][0] + "></tr>";
                    var tr = $(str_tr);
                    var td = $("<td></td>");
                    td.text(result[i][0]);//id
                    tr.append(td);
                    var td = $("<td></td>");
                    td.text(result[i][1]);//名字
                    tr.append(td);
                    var td = $("<td></td>");
                    td.text(result[i][2]);//id
                    tr.append(td);
                    var td = $("<td></td>");
                    td.text(result[i][3]);//id
                    tr.append(td);
                    var str_td = "<button onClick=\"banuser()\" class=\"btn btn-primary\">封号</button>";
                    var td = $(str_td);
                    var td2 = $("<td></td>");
                    td2.append(td);
                    tr.append(td2);
                    $("#table").append(tr);
                }
            }
        })
    })
</script>
</html>
