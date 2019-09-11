;!function (window) {
    //设置ajax当前状态(是否可以发送);
    var ajaxStatus = true;
    window.aj = {};

    aj.async = function (url, data, success) {
        ajax(true, url, data, success);
    };

    aj.sync = function (url, data, success) {
        ajax(false, url, data, success);
    };


    function ajax(as, url, data, success) {

        /*判断是否可以发送请求*/
        if (!ajaxStatus) {
            return false;
        }
        ajaxStatus = true;//禁用ajax请求
        /*正常情况下1秒后可以再次多个异步请求，为true时只可以有一次有效请求（例如添加数据）*/

        setTimeout(function () {
            ajaxStatus = true;
        }, 1000);

        var index;
        $.ajax({
            'type': "post",
            'url': url,
            'data': JSON.stringify(data),
            'dataType': "json",
            'cache': false,
            'async': as,
            'success': success,
            'contentType': 'application/json',
            'beforeSend': function () {
                index = layer.msg('加载中', {
                    icon: 16,
                    shade: 0.01
                });
            },
            'complete': function () {
                layer.close(index);
            }
        });
    }
}(window);