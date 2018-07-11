$(function () {
    // 加载dialog页面
    $(".dialog").load("page/dialog.html");

    // 点击修改按钮
    $("input[name='update']").click(function () {
       var id = $(this).parent("td").parent("tr").children("td[name='id']").text();
       var point = $(this).parent("td").parent("tr").children("td[name='point']").children("input").val();
       if(point==""){
           dialog("输入框不能为空！");
           return;
       }
       var data = {"id":id,"point":point};
       update_point(data);
    });

    // 点击退课按钮
    $("input[name='remove']").click(function () {
        var id = $(this).parent("td").parent("tr").children("td[name='id']").text();
        var data = {"id":id};
        remove_course(data);
    });
})