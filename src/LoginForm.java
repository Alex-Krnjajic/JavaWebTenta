

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginForm
 */
@WebServlet("/LoginForm")
public class LoginForm extends HttpServlet {
	private static final long serialVersionUID = 1L;
       


	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		String username = request.getParameter("username");
        String password = request.getParameter("password");
        
        ArrayList<Character> list = new ArrayList<Character>();
        for(char c : password.toCharArray()) {
            list.add(c);
        }
        Collections.shuffle(list);
        StringBuilder builder = new StringBuilder();
        for(char c : list) {
            builder.append(c);
        }
        String passwordshuffled = builder.toString();

        response.setContentType("text/html");
        PrintWriter printWriter = response.getWriter();
        printWriter.print("<html>");
        printWriter.print("<body>");
        printWriter.print("<h1>login data</h1>");
        printWriter.print("<p> user = :: " + username + "</p>");
        printWriter.print("<p> pass = :: " + passwordshuffled + "</p>");
        printWriter.print("<p> very secure </p>");
        
      
        printWriter.print("</body>");
        printWriter.print("</html>");
        printWriter.close();
	}

}
