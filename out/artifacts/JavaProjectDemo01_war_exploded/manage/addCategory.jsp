<%--
  Created by IntelliJ IDEA.
  User: 83731
  Date: 2017/11/26
  Time: 16:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:include page="header.jsp"/>
<form action="/addCategory?op=addCategory" method="post">
    <table border="1" width="438">
        <tr>
            <td>分类名称:</td>
            <td>
                <input type="text" name="name">

            </td>
        </tr>
        <tr>
            <td>分类描述:</td>
            <td>
                <textarea rows="3" cols="38" name="description"></textarea>

            </td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="保存">
            </td>
        </tr>

    </table>
</form>

</body>
</html>
