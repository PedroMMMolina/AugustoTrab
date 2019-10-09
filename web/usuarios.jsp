
<%@page import="modelos.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
   <head>
      <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
      <title>JSP Page</title>
              <link rel="stylesheet" href="css/bootstrap.min.css">
   </head>
   <body>
        <jsp:include page="menu.jsp">
          <jsp:param name="item" value="usuarios" />
       </jsp:include>
         <div class="container">
         <h1>Usuarios!</h1>
         <%
         boolean logado = false;

         if(session != null && session.getAttribute("logado") != null){
            logado = (boolean) session.getAttribute("logado");
         }

         if(!logado){ %>
         <jsp:forward page="login.jsp"/>

         <%
             }
         %>
         <h3> <table class="table table-striped" >
           <thead>
              <tr>
                 <th>#</th>
                 <th>Nome</th>
                 <th>Email</th>
                 <th>Senha</th>

              </tr>
           </thead>
           <tbody>
        <%
            for(int i=0; i<Usuario.getLista().size(); i++){

                Usuario p = Usuario.getLista().get(i);

                out.println("<tr>");
                out.println("<td> "+ (i+1) +" </td>");
                out.println("<td> "+ p.getNome() +" </td>");
                out.println("<td> "+ p.getEmail() +" </td>");
                out.println("<td> "+ p.getSenha() +" </td>");
                out.println("</tr>");
            }

        %>
            </tbody>
        </table>
</h3>
       <script src="js/bootstrap.min.js"></script>
   </body>
</html>
