
<%@page import="modelos.Produto"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sobre Minha Loja</title>
        <link rel="stylesheet" href="css/bootstrap.min.css">
    </head>
    <body>

      <jsp:include page="menu.jsp">
          <jsp:param name="item" value="sobre" />
       </jsp:include>

        <h1>Site feito com muito amor para tirar um Azão na matéria do Augustão!</h1>

        <script src="js/bootstrap.min.js"></script>
    </body>
</html>
