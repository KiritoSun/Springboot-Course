$(function () {
    // 加载dialog页面
    $(".dialog").load("page/dialog.html");

    // 重置按钮
    $("input[name='restart']").click(function () {
       window.location.href="/studentInfo";
    });
    // 保存按钮
    $("input[name='save']").click(function () {
        var name = $("input[name='name']").val();
        var password = $("input[name='password']").val();
        var sex = $("input[name='sex']").val();
        var major = $("input[name='major']").val();
        if(name==""||password==""||sex==""||major==""){
            dialog("输入框不能为空！");
            return;
        }
        var data = {"name":name,"password":password,"sex":sex,"major":major};
        update_studentInfo(data);
    });
})