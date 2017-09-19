<%--
  Created by IntelliJ IDEA.
  User: ZZDELY
  Date: 2017/9/11
  Time: 16:47
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
    <title>索赔查看</title>
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
        <a href="/clerk/main" class="logo">全民 <span class="lite">保险</span></a>
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
                    <a data-toggle="dropdown" class="dropdown-toggle">
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
                    <a class="" href="/clerk/main">
                        <i class="icon_house_alt"></i>
                        <span>主页</span>
                    </a>
                </li>
                <li class="sidebar-menu">
                    <a class="" href="/clerk/claim">
                        <i class="icon_document_alt"></i>
                        <span>索赔审核</span>
                    </a>
                </li>
                <li class="sidebar-menu">
                    <a class="" href="/clerk/reportList ">
                        <i class="icon_desktop"></i>
                        <span>举报信息核实</span>
                    </a>
                </li>
                <li class="sidebar-menu">
                    <a class="" href="/clerk/insurancelist">
                        <i class="icon_table"></i>
                        <span>业务发放</span>
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
                        <p>索赔查看</p>
                    </ol>
                </div>
            </div>
            <div class="BanList">
                <div class="col-lg-12">
                    <section class="panel">
                        <header class="panel-heading">
                            索赔查看
                        </header>
                        <%--<%@ include file="slidebar.html" %>--%>
                        <table class="table" id="contentTable">
                            <caption id="caption"></caption>
                            <thead>
                            <tr></tr>
                            <tr></tr>
                            <tr></tr>
                            </thead>
                            </thead>
                            <tbody id="table"></tbody>
                            <%-- <button onclick="buyInsurance()">我要投保</button>--%>

                        </table>
                        <div class="form-group" align="right">
                            <div class="col-lg-offset-2 col-lg-10">
                                <button onclick="window.history.back()"class="btn btn-primary">返回</button>
                            </div>
                        </div>
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
<script src="../js/table2Excel.js" type="text/javascript"></script>
<script src="../js/clientEventHandle.js" type="text/javascript"></script>
<script type="text/javascript" >
    function accept(){
        var param = urlGetParam('id');
        var id = {id: param};
        $.ajax({
            url: "/clerk/Claimaccept",
            type: 'post',
            data: id,
            dataType: 'json',
            success: function (data) {
                    alert("成功");
                    window.location.href="claim";
            }
        })
    }
    $(document).ready(function () {
        var str_ajax = "/clerk/ClaimViewBack?=";
        var param = urlGetParam('id');
        var id = {id: param};
        str_ajax = str_ajax + param;
        $.ajax({
            url: str_ajax,
            type: 'post',
            data: id,
            dataType: 'json',
            success: function (data) {
                $("#table").empty();
                var tr = $("<tr></tr>");
                var td = $("<td></td>");
                td.append("索赔号:");
                tr.append(td);
                var td = $("<td></td>");
                td.text(data[0]);
                tr.append(td);
                $("#table").append(tr);
                var tr = $("<tr></tr>");
                var td = $("<td></td>");
                td.text("索赔理由");
                tr.append(td);
                var td = $("<td></td>");
                var text = $("<textarea cols='50' rows='10' type='text' readonly>");
                var text2=$("</textarea>")
                text.append(data[1]);
                text.append(text2);
                td.append(text);
                tr.append(td);
                $("#table").append(tr);
                var tr = $("<tr align='right'></tr>");
                var button="<button onClick=\"accept()\" class=\"btn btn-primary\">审核通过</button>";
                var td2=$(button);
                tr.append(td2);
                $("#table").append(tr);
            }
        })
    })
    var urlGetParam = function (name) {
        var search = document.location.search;
        var pattern = new RegExp("[?&]" + name + "\=([^&]+)", "g");
        var matcher = pattern.exec(search);
        var items = null;
        if (null != matcher) {
            try {
                items = decodeURIComponent(decodeURIComponent(matcher[1]));
            } catch (e) {
                try {
                    items = decodeURIComponent(matcher[1]);
                } catch (e) {
                    items = matcher[1];
                }
            }
        }
        return items;
    };
</script>
</html>
