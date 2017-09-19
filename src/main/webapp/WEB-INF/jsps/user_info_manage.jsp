<%--
  Created by IntelliJ IDEA.
  User: ZZDELY
  Date: 2017/9/7
  Time: 22:19
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
    <title>用户信息管理</title>
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
                        <p>个人基本信息</p>
                    </ol>
                </div>
            </div>
            <div class="row">
                <div class="col-lg-12">
                    <section class="panel">
                        <header class="panel-heading">
                            基本信息修改
                        </header>
                        <div class="panel-body">
                            <div class="form">
                                <div id="Resign" >
                                    <%--<p>用户信息管理</p>--%>
                                     <table>
                                        <div class="form-group ">
                                            <label for="username" class="control-label col-lg-2">UserName <span class="required">*</span></label>
                                                <div class="col-lg-10">
                                                    <input class="form-control " id="username" name="username" type="text" readonly/>
                                                </div>
                                        </div>
                                        <div class="form-group ">
                                            <label for="realname" class="control-label col-lg-2">RealName <span class="required">*</span></label>
                                            <div class="col-lg-10">
                                                <input class="form-control " id="realname" name="realname" type="text" />
                                            </div>
                                        </div>
                                        <div class="form-group ">
                                            <label for="illness" class="control-label col-lg-2">illness <span class="required">*</span></label>
                                            <div class="col-lg-10">
                                                <input class="form-control " id="illness" name="illness" type="text" />
                                            </div>
                                        </div>
                                        <div class="form-group ">
                                            <label for="age" class="control-label col-lg-2">Age <span class="required">*</span></label>
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
                                            <label for="phone" class="control-label col-lg-2">Phone<span class="required">*</span></label>
                                            <div class="col-lg-10">
                                                <input class="form-control " id="phone" name="phone" type="text" />
                                            </div>
                                        </div>
                                        <div class="form-group ">
                                            <label for="IDcard" class="control-label col-lg-2">IDcard<span class="required">*</span></label>
                                            <div class="col-lg-10">
                                                <input class="form-control " id="IDcard" name="IDcard" type="text" />
                                            </div>
                                        </div>
                                        <div class="form-group ">
                                            <label for="address" class="control-label col-lg-2">Address<span class="required">*</span></label>
                                            <div class="col-lg-10">
                                                <input class="form-control " id="address" name="address" type="text" />
                                            </div>
                                        </div>
                                    </table>
                                    <div class="form-group" align="right">
                                        <div class="col-lg-offset-2 col-lg-10">
                                            <button class="btn btn-primary"  onclick="update()">确认修改</button>
                                        </div>
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
<script src="http://pv.sohu.com/cityjson?ie=utf-8"></script>
<script type="text/javascript">

    function update()
    {
        var update = {
            username: $("#username").val(),
            age: $("#age").val(),
            mail: $("#E-mail").val(),
            sex: $("#sex").val(),
            phone:$("#phone").val(),
            IDcard: $("#IDcard").val(),
            illness: $("#illness").val(),
            address:$("#address").val(),
            realname:$("#realname").val()
        };
        if ( update.username == "" )
        {
            alert("用户名不能为空！");
            return;
        }
        if (update.IDcard=="")
        {
            alert("身份证号不能为空！");
            return;
        }
        if (update.phone=="")
        {
            alert("手机号不能为空！");
            return;
        }


        $.ajax({
            url: '/user/infoUpdate',
            type: 'post',
            data: update,
            dataType: "json", //返回数据形式为json
            success:function()
            {
                alert("修改成功");
            }

        })
    }

    $(document).ready(function () {
        //从session里取
        var id={id:"111"};
        $.ajax({
            url: '/user/SelectInfo',
            type: 'post',
            data: id,
            dataType: "json", //返回数据形式为json
            success:function(data) {
                document.getElementById("username").value=data[0][0];
                document.getElementById("age").value = data[0][1];
                document.getElementById("E-mail").value = data[0][2];
                document.getElementById("sex").value = data[0][3];
                document.getElementById("phone").value = data[0][4];
                document.getElementById("IDcard").value = data[0][5];
                document.getElementById("illness").value = data[0][6];
                document.getElementById("address").value = data[0][7];
                document.getElementById("realname").value=data[0][8]
            }

        })
    })
</script>
<%
    out.println(session.getAttribute("user"));
%>
</body>
</html>
