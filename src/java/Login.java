
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Login extends HttpServlet {

   @Override
   protected void doPost(HttpServletRequest request, HttpServletResponse response)
           throws ServletException, IOException {

      String email = request.getParameter("email");
      String senha = request.getParameter("senha");
      //login adm para cadastrar produtos
      if(email.equals("adm@ifpr.edu.br") && senha.equals("admin")){
         request.getSession().setAttribute("logado", true);
         //entra pagina de produtos
         response.sendRedirect("produtos.jsp");
      }else{
         //volta para a tela de login
         response.sendRedirect("login.jsp");

      }

   }
}
