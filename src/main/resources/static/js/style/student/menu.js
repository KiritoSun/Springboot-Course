$(function () {
    // 菜单栏击中效果
    var menu = get();
    console.log(menu);
    if(menu==null) $(".course-menu li[name='index']").addClass("menu-focus");
    else $(".course-menu li[name='"+menu+"']").addClass("menu-focus");
    // 菜单栏点击
    $(".course-menu li").click(function () {
        var menu = $(this).attr("name");
        switch (menu){
            case "index":{
                save("index");
                window.location.href="/studentIndex";
                break;
            }
            case "info":{
                save("info");
                window.location.href="/studentInfo";
                break;
            }
            case "course":{
                save("course");
                window.location.href="/course?page=1";
                break;
            }
            case "select":{
                save("select");
                window.location.href="/select";
                break;
            }
            case "table":{
                alert("生成课表");
                break;
            }
            case "exit":{
                clear();
                window.location.href="/exit";
                break;
            }
            default:break;
        }
    });
    
    // 存储到session缓存
    function save(data) {
        sessionStorage.setItem("menu",data);
    }
    
    // 取出session缓存
    function get() {
        return sessionStorage.getItem("menu");
    }

    // 清除class操作
    function clear() {
        sessionStorage.removeItem("menu");
    }
})