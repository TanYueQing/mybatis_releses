<%--
  Created by IntelliJ IDEA.
  User: tya
  Date: 2025/9/11
  Time: 下午5:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <h2>用户注册</h2>
  <form action="/register" method="POST">
    <!---隐藏域-->
    <input type="hidden" name="id" value="0"><br>
    <table border="0" cellpadding="0" cellspacing="0" width="400px">
      <tr>
        <td align="right">用户名：</td>
        <td><input type="text" name="username" /><tr>
      </tr>
      <tr>
        <td align="right">密码：</td>
        <td><input type="password" name="pwd" /><tr>
    </tr>
      <tr>
        <td align="right">确认密码：</td>
        <td><input type="password" name="repwd" /><tr>
    </tr>
      <tr>
        <td align="right">邮箱：</td>
        <td><input type="password" name="email" /><tr>
    </tr>
      </tr>

      <tr>
        <td><input type="submit" value="提交" /><tr>
    </tr>
      </tr>

    </table>
  </form>

  <input id ="btn1" type="button" value="Ajax POST:application/x-www-form-urlencoded">
  <script>
      $("#btn1").click(function () {
          $.ajax({
              url:"/demo04",
              data:"name=谭岳清&age=11",
              method:"POST",
              contentType:"application/x-www-form-urlencoded",
              dataType:"json",
              success:function(data){
                  console.log(data)
              }

          })
          // console.log("click事件")
      })

  </script>
  </body>
</html>
