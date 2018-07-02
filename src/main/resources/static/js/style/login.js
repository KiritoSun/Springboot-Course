$(function () {
    // 加载dialog页面
    $(".dialog").load("page/dialog.html");
    // 登录按钮绑定事件
    $("input[name='submit']").click(function () {
       var id = $("input[name='id']").val();
       var password = $("input[name='password']").val();
       if(id==""||password==""){
           dialog("输入框不能为空！");
           return;
       }
       var data = {"id":id,"password":password};
       login(data);
    });
})