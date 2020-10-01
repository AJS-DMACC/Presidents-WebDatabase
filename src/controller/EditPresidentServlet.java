package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.President;

/**
 * Servlet implementation class EditPresidentServlet
 */
@WebServlet(name = "editPresidentServlet", urlPatterns = { "/editPresidentServlet" })
public class EditPresidentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditPresidentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PresidentHelper dao = new PresidentHelper();
		Integer presNum = Integer.parseInt(request.getParameter("num"));
		String name = request.getParameter("name");
		Integer tempId = Integer.parseInt(request.getParameter("id"));
		President itemToUpdate = dao.searchForPresidentById(tempId);
		itemToUpdate.setName(name);
		itemToUpdate.setPresidencyNumber(presNum);
		dao.updatePresident(itemToUpdate);
		getServletContext().getRequestDispatcher("/viewAllPresidentsServlet").forward(request, response);
	}

}
