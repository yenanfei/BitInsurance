<%--
  Created by IntelliJ IDEA.
  User: ZZDELY
  Date: 2017/9/7
  Time: 23:08
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
    <title>用户举报</title>
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
        <a href="/user/main" class="logo">全民 <span class="lite">保险</span></a>
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
                    <a class="" href="/user/main">
                        <i class="icon_house_alt"></i>
                        <span>主页</span>
                    </a>
                </li>
                <li class="sidebar-menu">
                    <a class="" href="/user/infomanage">
                        <i class="icon_document_alt"></i>
                        <span>个人信息管理</span>
                    </a>
                </li>
                <li class="sidebar-menu">
                    <a class="" href="/user/report">
                        <i class="icon_desktop"></i>
                        <span>实名举报</span>
                    </a>
                </li>
                <li class="sidebar-menu">
                    <a class="" href="/user/insuranceList">
                        <i class="icon_table"></i>
                        <span>业务浏览</span>
                    </a>
                </li>
                <li class="sidebar-menu">
                    <a class="" href="/user/insurancemanage">
                        <i class="icon_documents_alt"></i>
                        <span>保单管理</span>
                    </a>
                </li>
            </ul>
            <!-- sidebar menu end-->
        </div>
    </aside>
    <!--sidebar end-->
    <section id="main-content">
        <section class="wrapper">
            <div class="row">
                <div class="col-lg-12">
                    <h3 class="page-header">Main View</h3>
                    <ol class="breadcrumb">
                        <p>实名举报系统</p>
                    </ol>
                </div>
            </div>
            <div class="row">
                <div class="col-lg-12">
                    <section class="panel">
                        <header class="panel-heading">
                            实名举报
                        </header>
                        <div class="panel-body">
                            <div class="form">
                                <div id="Resign" >

                                    <table>
                                        <div class="form-group ">
                                            <label for="tradeID" class="control-label col-lg-2">交易号 <span class="required">*</span></label>
                                            <div class="col-lg-10">
                                                <input class="form-control " id="tradeID" name="tradeID" type="text" />
                                            </div>
                                        </div>
                                        <div class="form-group ">
                                            <label for="name" class="control-label col-lg-2">真实姓名 <span class="required">*</span></label>
                                            <div class="col-lg-10">
                                                <input class="form-control " id="name" name="name" type="text" />
                                            </div>
                                        </div>
                                        <div class="form-group ">
                                            <label for="username" class="control-label col-lg-2">用户ID <span class="required">*</span></label>
                                            <div class="col-lg-10">
                                                <input class="form-control " id="username" name="username" type="text" />
                                            </div>
                                        </div>
                                        <div class="form-group ">
                                            <label for="reason" class="control-label col-lg-2">举报理由 <span class="required">*</span></label>
                                            <div class="col-lg-10">
                                                <textarea class="form-control " id="reason" type="text" cols=50 rows=10> </textarea>
                                            </div>
                                        </div>
                                    </table>
                                    <div class="form-group" align="right">
                                        <div class="col-lg-offset-2 col-lg-10">
                                            <button class="btn btn-primary"  onclick="report()">确认上报</button>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </section>
                </div>
            </div>
            <div class="BanList">
                <div class="col-lg-12">
                    <section class="panel">
                        <header class="panel-heading">
                            举报列表
                        </header>
                        <%--<%@ include file="slidebar.html" %>--%>
                        <table class="table" id="contentTable">
                            <caption></caption>
                            <thead>
                            <tr>
                                <th>举报号</th>
                                <th>状态</th>
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
    function viewData() {
        $("#contentTable").find("tr").each(function () {
            this.onclick = function () {
                var nextPath = "ReportView?id=" + this.id;
                window.location.href = nextPath;
            }
        });
    }

    function one() {
        var ID = "id";
        $.ajax({
            url: "/user/reportSelect",
            type: 'post',
            data: ID,
            dateType: 'json',
            success: function (data) {
                var result = $.parseJSON(data);
                $("#table").empty();
                for (i = 0, e = result.length; i < e; i++) {
                    var str_tr = "<tr ";
                    str_tr = str_tr + "id=" + result[i][0]+ "></tr>";
                    var tr = $(str_tr);
                    var td = $("<td></td>");
                    td.text(result[i][0]);//机构代码
                    tr.append(td);
                    var td = $("<td></td>");
                    td.text(result[i][1]);//机构代码
                    tr.append(td);
                    var str_td = "<button onClick=\"viewData()\" class=\"btn btn-primary\">查看</button>";
                    var td = $(str_td);
                    tr.append(td);
                    $("#table").append(tr);
                }
            }
        })
    }
        $(document).ready(function () {
            var ID = "id";
            $.ajax({
                url: "/user/reportSelect",
                type: 'post',
                data: ID,
                dateType: 'json',
                success: function (data) {
                    var result = $.parseJSON(data);
                    $("#table").empty();
                    for (i = 0, e = result.length; i < e; i++) {
                        var str_tr = "<tr ";
                        str_tr = str_tr + "id=" + result[i][0]+ "></tr>";
                        var tr = $(str_tr);
                        var td = $("<td></td>");
                        td.text(result[i][0]);//机构代码
                        tr.append(td);
                        var td = $("<td></td>");
                        td.text(result[i][1]);//机构代码
                        tr.append(td);
                        var str_td = "<button onClick=\"viewData()\" class=\"btn btn-primary\">查看</button>";
                        var td = $(str_td);
                        tr.append(td);
                        $("#table").append(tr);
                    }
                }
            })
        })

        function report() {
            var report = {
                tradeID: $("#tradeID").val(),
                name: $("#name").val(),
                username: $("#username").val(),
                reason: $("#reason").val()
            };
            $.ajax({
                url: "/user/reportContent",
                type: 'post',
                data: report,
                dateType: 'json',
                success: function (data) {
                    $("#tradeID").val("");
                    $("#name").val("");
                    $("#username").val("");
                    $("#reason").val(" ");
                    alert("举报成功");
                    one();
                }
            })
        }

</script>
</html>
