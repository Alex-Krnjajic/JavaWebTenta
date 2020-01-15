

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AnAnimalForm
 */
@WebServlet("/AnAnimalForm")
public class AnAnimalForm extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AnAnimalForm() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		

        String animal = request.getParameter("animal");

        response.setContentType("text/html");
        PrintWriter printWriter = response.getWriter();
        printWriter.print("<html>");
        printWriter.print("<body>");
        printWriter.print("<h1>animal</h1>");
        printWriter.print("<p> </p>");
        printWriter.print("<img src="+"'"+animal+".jpg'"+" alt='moo' />");
        printWriter.print("</body>");
        printWriter.print("</html>");
        printWriter.close();
	}

}
