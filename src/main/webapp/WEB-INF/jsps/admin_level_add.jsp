<%--
  Created by IntelliJ IDEA.
  User: ZZDELY
  Date: 2017/9/12
  Time: 22:44
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
    <title>新增业务员</title>
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
            <div class="row">
                <div class="col-lg-12">
                    <h3 class="page-header">Main View</h3>
                    <ol class="breadcrumb">
                        <p>新增业务员</p>
                    </ol>
                </div>
            </div>
            <div class="row">
                <div class="col-lg-12">
                    <section class="panel">
                        <header class="panel-heading">
                            新增业务员
                        </header>
                        <div class="panel-body">
                            <div class="form">
                                <div id="Resign" >
                                    <%--<p>用户信息管理</p>--%>
                                    <table>
                                        <div class="form-group ">
                                            <label for="clerknanme" class="control-label col-lg-2">clerknanme <span class="required">*</span></label>
                                            <div class="col-lg-10">
                                                <input class="form-control " id="clerknanme" name="clerknanme" type="text" />
                                            </div>
                                        </div>
                                        <div class="form-group ">
                                            <label for="realnanme" class="control-label col-lg-2">realnanme <span class="required">*</span></label>
                                            <div class="col-lg-10">
                                                <input class="form-control " id="realnanme" name="realnanme" type="text" />
                                            </div>
                                        </div>
                                        <div class="form-group ">
                                            <label for="idcard" class="control-label col-lg-2">idcard <span class="required">*</span></label>
                                            <div class="col-lg-10">
                                                <input class="form-control " id="idcard" name="idcard" type="text" />
                                            </div>
                                        </div>
                                        <div class="form-group ">
                                            <label for="phone" class="control-label col-lg-2">phone <span class="required">*</span></label>
                                            <div class="col-lg-10">
                                                <input class="form-control " id="phone" name="phone" type="text" />
                                            </div>
                                        </div>
                                        <div class="form-group ">
                                            <label for="age" class="control-label col-lg-2">age <span class="required">*</span></label>
                                            <div class="col-lg-10">
                                                <input class="form-control " id="age" name="age" type="text" />
                                            </div>
                                        </div>
                                        <div class="form-group ">
                                            <label for="gender" class="control-label col-lg-2">gender<span class="required">*</span></label>
                                            <div class="col-lg-10">
                                                <input class="form-control " id="gender" name="gender" type="text" />
                                            </div>
                                        </div>
                                        <div class="form-group ">
                                            <label for="password" class="control-label col-lg-2">password<span class="required">*</span></label>
                                            <div class="col-lg-10">
                                                <input class="form-control " id="password" name="password" type="text" />
                                            </div>
                                        </div>
                                    </table>
                                    <div class="form-group" align="right">
                                        <div class="col-lg-offset-2 col-lg-10">
                                            <button class="btn btn-primary"  onclick="newclerk()">新增</button>
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
<script src="../js/jquery.js"></script>
<script src="../js/bootstrap.min.js"></script>
<script src="../js/jquery.scrollTo.min.js"></script>
<script src="../js/jquery.nicescroll.js" type="text/javascript"></script>
<script type="text/javascript" src="../js/jquery.validate.min.js"></script>
<script src="../js/form-validation-script.js"></script>
<script src="../js/scripts.js"></script>
<script type="text/javascript">
    function newclerk()
    {
        var addclerk = {
            clerknanme: $("#clerknanme").val(),
            realnanme: $("#realnanme").val(),
            idcard:$("#idcard").val(),
            phone: $("#phone").val(),
            age: $("#age").val(),
            gender: $("#gender").val(),
            password:$("#password").val()
        };
        if ( addclerk.username == "" )
        {
            alert("用户名不能为空！");
            return;
        }
        if (addclerk.password=="")
        {
            alert("密码不能为空！");
            return;
        }
        if (addclerk.idcard=="")
        {
            alert("身份证号不能为空！");
            return;
        }
        if (addclerk.phone=="")
        {
            alert("手机号不能为空！");
            return;
        }


        $.ajax({
            url: '/admin/newclerk',
            type: 'post',
            data: addclerk,
            dataType: "json", //返回数据形式为json
            success:function()
            {
                alert("新增成功");
                window.location.href="levelmanage";
                window.event.returnValue=false;
            }

        })
    }
</script>
</body>
</html>
