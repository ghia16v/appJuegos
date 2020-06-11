package servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.Juego;
import modelo.JuegoDAOImpl;

/**
 * Servlet implementation class ExclusivosController
 */
@WebServlet("/exclusivos")
public class ExclusivosController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ExclusivosController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		doPost(request, response);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//doGet(request, response);
		//llamar a la base datos para conseguir los productos
		JuegoDAOImpl dao = JuegoDAOImpl.getInstance();
		ArrayList<Juego> exclusivos = dao.getAll();
		
		
		// datos para enviar a la vista
		request.setAttribute("exclusivos", exclusivos);
		
		
		// ir a la nueva vista o jsp
		request.getRequestDispatcher("exclusivos.jsp").forward(request, response);
		
	}

}
