
import java.io.IOException; 
import java.io.PrintWriter; 
  
import javax.servlet.ServletException; 
import javax.servlet.http.HttpServlet; 
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest; 
import javax.servlet.http.HttpServletResponse; 

/**
 * Servlet implementation class course
 */
@WebServlet("/Course")
public class Course extends HttpServlet {
	private static final long serialVersionUID = 1L;
    /**
     * Default constructor. 
     */
    public Course() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 PrintWriter out = response.getWriter();
		    String a = request.getParameter("regno");
		    String b = request.getParameter("fname");
		    String c = request.getParameter("lname");
		    String d = request.getParameter("address");
		    String e = request.getParameter("year");
		    String f = request.getParameter("gender");
		    String g = request.getParameter("city");

		    response.setContentType("text/html");
		    out.println("<html><head><title>Form Submitted</title></head>");
		    out.println("<body><h1>Form Details</h1>");
		    out.println("<p>Regno is: " + a + "</p>");
		    out.println("<p>First name is: " + b + "</p>");
		    out.println("<p>Last name is: " + c + "</p>");
		    out.println("<p>Address is: " + d + "</p>");
		    out.println("<p>Year is: " + e + "</p>");
		    out.println("<p>Gender is: " + f + "</p>");
		    out.println("<p>City is: " + g + "</p>");
		    out.println("</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
