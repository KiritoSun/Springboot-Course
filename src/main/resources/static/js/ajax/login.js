// 登录验证
function login(data) {
    $.ajax({
       method:"POST",
       type:"POST",
       url:"/login.action",
       data:data,
       success:function (msg) {
           switch (msg){
               case "s_success":{
                   window.location.href="/student";
                   break;
               }
               case "t_success":{
                   window.location.href="/teacher";
                   break;
               }
               case "a_success":{
                   window.location.href="/admin";
                   break;
               }
               case "ino":{
                   dialog("账户id不存在！");
                   break;
               }
               case "pno":{
                   dialog("密码不正确！");
                   break;
               }
               case "error":{
                   dialog("后台出错！");
                   break;
               }
               default:break;
           }
       }
       ,error:function () {
            dialog("ajax出错！");
        }
    });
}