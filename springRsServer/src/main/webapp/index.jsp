<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
    <script src="js/jquery-3.4.1.min.js"></script>
</head>
<body>
<input type="text" id="name" name="name" value=""/>
<input type="button" id="send" value="send" onclick="invoke();"/>
</body>
<script type="text/javascript">

    var xhr;

    function invoke() {
        if (window.ActiveXObject) {
            xhr = new ActiveXObject("Microsoft.XMLHTTP");
        } else {
            xhr = new XMLHttpRequest();
        }
        //指定请求地址
        var url = "http://localhost:8080/userServer/userService/user/1";
        //定义请求类型和地址和异步
        xhr.open("POST", url, true);
        //设置Content-Type
        xhr.setRequestHeader("Content-Type", "text/xml;charset=UTF-8");
        //指定回调方法
        xhr.onreadystatechange = back;

        var textVal = document.getElementById("name");
        //组装消息体的数据
        var data =
            '<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:q0="http://server.hm.com/" xmlns:xsd="http://www.w3.org/2001/XMLSchema" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance">' +
            '<soapenv:Body>' +
            '<q0:sayHello>' +
            '<arg0>' + textVal + '</arg0>' +
            '</q0:sayHello>' +
            '</soapenv:Body>' +
            '</soapenv:Envelope>';
        xhr.send(data);

    }

    function back() {
        if (xhr.readyState == 4) {
            if (xhr.status == 200) {
                var doc = xhr.responseXML;
                alert(doc);
                alert(xhr.responseText);
                var tag = doc.getElementsByTagName("return")[0];
                alert(tag)

            }
        }
    }

</script>
</html>
