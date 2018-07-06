$(function () {
    // 加载dialog页面
    $(".dialog").load("page/dialog.html");
    // 上一页
    $(".pagination li a[name='font']").click(function () {
       var url = location.search;
       var page = url.split("=")[1];
       if(page==1) window.location.href="/course?page=1";
       else{
           page--;
           window.location.href="/course?page="+page;
       }
    });

    // 下一页
    $(".pagination li a[name='next']").click(function () {
        var url = location.search;
        var page = url.split("=")[1];
        var number = $(this).parent("li").parent("ul").attr("name");
        number++;
        if(page==number) window.location.href="/course?page="+number;
        else{
            page++;
            window.location.href="/course?page="+page;
        }
    });

    // 点击选课
    $("input[type='button']").click(function () {
       var id = $(this).parent("td").parent("tr").children("td[name='id']").text();
       var point = $(this).parent("td").parent("tr").children("td[name='text']").children("input").val();
       alert(id+" "+point);
    });
})