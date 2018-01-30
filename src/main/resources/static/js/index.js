var tab;
var navs=[{"spread":true,"href":"","title":"系统管理","pid":"","icon":"fa-cubes","children":[{"spread":false,"href":"sys/MenuInfo/MenuInfoList.jsp","title":"菜单管理","pid":"1","icon":"fa-cubes","children":null,"id":"2"},{"spread":false,"href":"sys/RoleInf/RoleInfList.jsp","title":"角色管理","pid":"1","icon":"fa-cubes","children":null,"id":"3"},{"spread":false,"href":"sys/SysFn/SysFunctionInfList.jsp","title":"系统功能","pid":"1","icon":"fa-cubes","children":null,"id":"4"},{"spread":false,"href":"sys/DictTp/DictTpList.jsp","title":"字典类型","pid":"1","icon":"fa-cubes","children":null,"id":"5"},{"spread":false,"href":"sys/DictCd/DictCdList.jsp","title":"数据字典","pid":"1","icon":"fa-cubes","children":null,"id":"6"},{"spread":false,"href":"sys/InsInf/InsInfList.jsp","title":"机构信息","pid":"1","icon":"fa-cubes","children":null,"id":"7"},{"spread":false,"href":"sys/NoInterceptor/NoInterceptorList.jsp","title":"URL拦截","pid":"1","icon":"fa-cubes","children":null,"id":"8"},{"spread":false,"href":"sys/user","title":"用户管理","pid":"1","icon":"fa-cubes","children":null,"id":"9"},{"spread":false,"href":"sys/SysLog/SysLogList.jsp","title":"日志管理","pid":"1","icon":"fa-cubes","children":null,"id":"10"},{"spread":false,"href":"sys/CodeGenerator/CodeGenerator.jsp","title":"代码构建","pid":"1","icon":"fa-cubes","children":null,"id":"11"},{"spread":false,"href":"sys/Quarz/QuarzList.jsp","title":"定时任务","pid":"1","icon":"fa-cubes","children":null,"id":"12"}],"id":"1"},{"spread":true,"href":"","title":"业务管理","pid":"","icon":"fa-cubes","children":[{"spread":false,"href":"app/Student/StudentList.jsp","title":"合同管理","pid":"13","icon":"fa-cubes","children":null,"id":"14"}],"id":"13"}];
layui.config({
    base: 'js/',
    version: new Date().getTime()
}).use(['element', 'layer', 'navbar', 'tab'],function () {
    var element = layui.element,
        $ = layui.jquery,
        layer = layui.layer,
        navbar = layui.navbar();
    tab = layui.tab({
        elem: '.admin-nav-card', //设置选项卡容器
        contextMenu:true
    });
    $(window).on('resize', function() {
        var $content = $('.admin-nav-card .layui-tab-content');
        $content.height($(this).height() - 147);
        $content.find('iframe').each(function() {
            $(this).height($content.height());
        });
    }).resize();

    navbar.set({
        spreadOne: true,
        elem: '#admin-navbar-side',
        cached: true,
        data: navs
        /*cached:true,
         url: 'datas/nav.json'*/
    });
    //渲染navbar
    navbar.render();
    //监听点击事件
    navbar.on('click(side)', function(data) {
        tab.tabAdd(data.field);
    });
})