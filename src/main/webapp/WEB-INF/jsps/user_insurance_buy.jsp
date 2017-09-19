<%--
  Created by IntelliJ IDEA.
  User: ZZDELY
  Date: 2017/9/11
  Time: 10:15
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
    <title>投保缴费</title>
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
                        <p>投保缴费</p>
                    </ol>
                </div>
            </div>
            <div class="row">
                <div class="col-lg-12">
                    <section class="panel">
                        <header class="panel-heading">
                            投保缴费
                        </header>
                        <div class="panel-body">
                            <div class="form">
                                <div id="Resign" >
                                    <%--<p>投保缴费</p>--%>
                                    <table class="table" id="contentTable">
                                        <div class="form-group ">
                                            <label for="insurancename" class="control-label col-lg-2">保险名 <span class="required">*</span></label>
                                            <div class="col-lg-10">
                                                <input class="form-control " id="insurancename" name="insurancename" type="text" />
                                            </div>
                                        </div>
                                        <div class="form-group ">
                                            <label for="insuranceId" class="control-label col-lg-2">保险ID <span class="required">*</span></label>
                                            <div class="col-lg-10">
                                                <input class="form-control " id="insuranceId" name="insuranceId" type="text" />
                                            </div>
                                        </div>
                                        <div class="form-group ">
                                            <label for="fromrealname" class="control-label col-lg-2">投保人 <span class="required" readonly>*</span></label>
                                            <div class="col-lg-10">
                                                <input class="form-control " id="fromrealname" name="fromrealname" type="text" />
                                            </div>
                                        </div>
                                        <div class="form-group ">
                                            <label for="price" class="control-label col-lg-2">价格 <span class="required">*</span></label>
                                            <div class="col-lg-10">
                                                <input class="form-control " id="price" name="price" type="text" />
                                            </div>
                                        </div>
                                        <div class="form-group ">
                                            <label for="starttime" class="control-label col-lg-2">生效时间 <span class="required" >*</span></label>
                                            <div class="col-lg-10">
                                                <input class="form-control " id="starttime" name="starttime" type="text" readonly/>
                                            </div>
                                        </div>
                                        <div class="form-group ">
                                            <label for="endtime" class="control-label col-lg-2">结束时间 <span class="required">*</span></label>
                                            <div class="col-lg-10">
                                                <input class="form-control " id="endtime" name="endtime" type="text" />
                                            </div>
                                        </div>
                                    </table>
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-lg-12">
                                <section class="panel">
                                    <div class="panel-body">
                                        <div class="form">
                                            <div id="zhifu" >
                                                <header class="panel-heading">
                                                    选择支付方式
                                                    &nbsp;&nbsp;&nbsp;&nbsp;
                                                    <label><input name="Pay" type="radio" value="支付宝" />支付宝 </label>
                                                    <label><input name="Pay" type="radio" value="微信" />微信 </label>
                                                    <label><input name="Pay" type="radio" value="银行卡" />银行卡 </label>
                                                    <label><input name="Pay" type="radio" value="其他" />其他 </label>
                                                </header>
                                                <table>
                                                    <br><br>
                                                    <div class="form-group ">
                                                        <label for="scorepay" class="control-label col-lg-2">积分抵扣 <span class="required">*</span></label>
                                                        <div class="col-lg-10">
                                                            <input class="form-control " id="scorepay" name="scorepay" type="text" />
                                                        </div>
                                                    </div>
                                                    <div class="form-group ">
                                                        <label for="score" class="control-label col-lg-2">现有积分 <span class="required">*</span></label>
                                                        <div class="col-lg-10">
                                                            <input class="form-control " id="score" readonly name="score" type="text" />
                                                        </div>
                                                    </div>
                                                </table>
                                                <div class="form-group">
                                                    <div class="col-lg-offset-2 col-lg-10">
                                                        <button class="btn btn-primary"  onclick="pay()">确认支付</button>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </section>
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
    $(document).ready(function () {
        var username= $("111");
        var myDate=new Date();
        var mydate=myDate.toLocaleDateString();
        var param = urlGetParam('id');
        var idtime = {
            id: param,
            starttime:mydate
        }
        $.ajax({
            url: "/user/BuyInsurance",
            type: 'post',
            data: idtime,
            dataType: 'json',
            success: function (data) {
               /* var myDate=new Date();
                var mytime=myDate.toLocaleTimeString();    //获取当前时间
                var mydate=myDate.toLocaleDateString();
                mydate=mydate+mytime;*/
                document.getElementById("insurancename").value=data[0];
                document.getElementById("insuranceId").value=param;
                document.getElementById("fromrealname").value=data[3];
                document.getElementById("price").value=data[1];
                document.getElementById("starttime").value=mydate;
                document.getElementById("endtime").value=data[2];
                document.getElementById("score").value=data[4]
            }
        })
    })
    function pay()
    {
        var myDate=new Date();
        //var mytime=myDate.toLocaleTimeString();    //获取当前时间
        var mydate=myDate.toLocaleDateString();
        var fuqian = {
            fromrealname: $("#fromrealname").val(),
            insuranceId: $("#insuranceId").val(),
            scorepay: $("#scorepay").val(),
            starttime:mydate
            /*pay:$("#Pay").val(),*/
        };
        $.ajax({
            url: '/user/pay',
            type: 'post',
            data: fuqian,
            dataType: "json", //返回数据形式为json
            success:function()
            {
                alert("投保成功");
                window.location.href="insurancemanage";
                window.event.returnValue=false;
            },
            error:function( ){
                alert("投保失败");
            }
        })
    }
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
