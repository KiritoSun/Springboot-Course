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

// 学生选课操作
function select_studentCourse(data) {
    $.ajax({
       method:"POST",
       type:"POST",
       url:"/selectCourse",
       data:data,
        success:function (msg) {
            switch (msg){
                case "success":{
                    dialog("选课成功！");
                    break;
                }
                case "npoint":{
                    dialog("积分不够！");
                    break;
                }
                case "no":{
                    dialog("该课程已选！");
                    break;
                }
                case "error":{
                    dialog("选课失败！");
                    break;
                }
                default:break;
            }
        },error:function () {
            dialog("ajax出错！");
        }
    });
}

// 修改选课积分
function update_point(data) {
    $.ajax({
        method:"POST",
        type:"POST",
        url:"/updatePoint",
        data:data,
        success:function (msg) {
            if(msg=="success"){
                dialog("修改积分成功！");
            }else{
                dialog("修改积分失败！");
            }
        },error:function () {
            dialog("ajax出错！");
        }
    });
}

// 退课
function remove_course(data) {

}