/**
 * Created by DongBaishun on 2017/5/31.
 */




function checkAuthorityBySession(role, roleAuthority) {

    if (roleAuthority[0] == "1") {
        $("#slideAuthority0").css("display", "inline");
    }
    if (roleAuthority[1] == "1") {
        $("#slideAuthority1").css("display", "inline");
    }
    if (roleAuthority[2] == "1") {
        $("#slideAuthority2").css("display", "inline");
    }
    if (roleAuthority[3] == "1") {
        $("#slideAuthority3").css("display", "inline");
    }
    if (roleAuthority[4] == "1") {
        $("#slideAuthority4").css("display", "inline");
    }
    if (roleAuthority[5] == "1") {
        $("#slideAuthority5").css("display", "inline");
    }
    if (roleAuthority[6] == "1") {
        $("#slideAuthority6").css("display", "inline");
    }
    if (roleAuthority[7] == "1") {
        $("#slideAuthority7").css("display", "inline");
    }
    if (roleAuthority[8] == "1") {
        $("#slideAuthority8").css("display", "inline");
    }
    if (roleAuthority[9] == "1") {
        $("#slideAuthority9").css("display", "inline");
    }
    if (roleAuthority[10] == "1") {
        $("#slideAuthority10").css("display", "inline");
        // if (role == "enter" || role == "city") { //如果是企业用户，跳转到企业界面
        if (role.indexOf("enter") != -1 || role.indexOf("city") != -1) { //如果是企业用户，跳转到企业界面
            $("#slideAuthority10Href").attr("href","/enterprise/notificationOverview");
        }
    }
    if (roleAuthority[11] == "1") {
        $("#slideAuthority11").css("display", "inline");
    }
    if (roleAuthority[12] == "1") {
        $("#slideAuthority12").css("display", "inline");
    }
}


/*function checkProvRole(role) { //防止HTTP 500
    if (role != "prov" && role != "root") {
        window.location.href = "/login/error500";
    }
}

function checkEnterRole(role) { //防止HTTP 500
    if (role != "enter" && role != "root") {
        window.location.href = "/login/error500";
    }
}

function checkCityRole(role) { //防止HTTP 500
    if (role != "city" && role != "root") {
        window.location.href = "/login/error500";
    }
}

function checkRootRole(role) { //防止HTTP 500
    if (role != "root") {
        window.location.href = "/login/error500";
    }
}*/

function checkRole0(roleAuthority) { //防止HTTP 500
    if (roleAuthority[0] == "0") {
        window.location.href = "/login/error500";
    }
}

function checkRole1(roleAuthority) { //防止HTTP 500
    if (roleAuthority[1] == "0") {
        window.location.href = "/login/error500";
    }
}

function checkRole2(roleAuthority) { //防止HTTP 500
    if (roleAuthority[2] == "0") {
        window.location.href = "/login/error500";
    }
}

function checkRole3(roleAuthority) { //防止HTTP 500
    if (roleAuthority[3] == "0") {
        window.location.href = "/login/error500";
    }
}

function checkRole4(roleAuthority) { //防止HTTP 500
    if (roleAuthority[4] == "0") {
        window.location.href = "/login/error500";
    }
}

function checkRole5(roleAuthority) { //防止HTTP 500
    if (roleAuthority[5] == "0") {
        window.location.href = "/login/error500";
    }
}

function checkRole6(roleAuthority) { //防止HTTP 500
    if (roleAuthority[6] == "0") {
        window.location.href = "/login/error500";
    }
}

function checkRole7(roleAuthority) { //防止HTTP 500
    if (roleAuthority[7] == "0") {
        window.location.href = "/login/error500";
    }
}

function checkRole8(roleAuthority) { //防止HTTP 500
    if (roleAuthority[8] == "0") {
        window.location.href = "/login/error500";
    }
}

function checkRole9(roleAuthority) { //防止HTTP 500
    if (roleAuthority[9] == "0") {
        window.location.href = "/login/error500";
    }
}

function checkRole10(roleAuthority) { //防止HTTP 500
    if (roleAuthority[10] == "0") {
        window.location.href = "/login/error500";
    }
}

function checkRole11(roleAuthority) { //防止HTTP 500
    if (roleAuthority[11] == "0") {
        window.location.href = "/login/error500";
    }
}

function checkRole12(roleAuthority) { //防止HTTP 500
    if (roleAuthority[12] == "0") {
        window.location.href = "/login/error500";
    }
}
