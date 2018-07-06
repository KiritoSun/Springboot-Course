// 修改学生信息
function update_studentInfo(data) {
    $.ajax({
       method:"POST",
       type:"POST",
       url:"/updateStudentInfo",
       data:data,
       success:function (msg) {
           if(msg=="success"){
               dialog("修改信息成功！");
           }else{
               dialog("修改信息失败！");
           }
       },error:function () {
            dialog("ajax出错！");
        }
    });
}