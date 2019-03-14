<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<html>
<head>
    <title>xx</title>
    <script type="text/javascript" src="/statics/js/jquery-1.8.3.js"></script>
    <script type="text/javascript">
        $(function () {
            $.ajax({
                url: '/show',
                type: 'post',
                success: function (data) {
                    var html = '';
                    for (var i = 0; i < data.length; i++) {
                        html += '<tr><td>' + data[i].id + '</td><td>' + data[i].content + '</td></tr>';
                    }
                    $("tbody").html(html);
                }
            });
        })
    </script>
</head>
<body>
<table>
    <thead>
    <tr>
        <td>编号</td>
        <td>内容</td>
    </tr>
    </thead>
    <tbody>

    </tbody>
</table>

</body>

</html>
