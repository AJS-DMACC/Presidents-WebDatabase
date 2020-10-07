package controller;

import java.util.List;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Artifact;
import model.President;

/**
 * Servlet implementation class NavigationServlet
 */
@WebServlet(name = "navigationServlet", urlPatterns = { "/navigationServlet" })
public class NavigationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NavigationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PresidentHelper dao = new PresidentHelper();
		ArtifactHelper daoPres = new ArtifactHelper();
		String act = request.getParameter("doThisToItem");
		// after all changes, we should redirect to the viewAllItems servlet
		// The only time we don't is if they select to add a new item or edit
		String path = "/viewAllPresidentsServlet";
		if (act.equals("delete")) {
			try {
				Integer tempId = Integer.parseInt(request.getParameter("id"));
				President itemToDelete = dao.searchForPresidentById(tempId);
				dao.deletePresident(itemToDelete);

			} catch (NumberFormatException e) {
				System.out.println("Forgot to select an item");
			}			
		} else if (act.equals("edit")) {
			System.out.println("IN EDIT Change made");						
			try {
				Integer tempId = Integer.parseInt(request.getParameter("id"));
				President itemToEdit = dao.searchForPresidentById(tempId);
				request.setAttribute("itemToEdit", itemToEdit);
				path = "/edit-president.jsp";
			} catch (NumberFormatException e) {
				System.out.println("Forgot to select an item");
			}			
		} else if (act.equals("add artifact for this President")) {
			try {				
				Integer tempId = Integer.parseInt(request.getParameter("id"));	
				request.setAttribute("presID", tempId);
				
				path = "/add-artifact.jsp";
			} catch (NumberFormatException e) {
				System.out.println("Forgot to select an item");
			}
		} else if(act.equals("view President Artifacts")) {
			System.out.println("IN EDITED VIEW 2");
			System.out.println("IN EDITED VIEW 2");
			System.out.println("IN EDITED VIEW 2");
			try {
				Integer tempId = Integer.parseInt(request.getParameter("id"));
				ArtifactHelper helper = new ArtifactHelper();
				List<Artifact> presidentArtifacts =helper.searchForArtifactsById(tempId);  
				System.out.println("IN EDITED VIEW, count:" + presidentArtifacts.size());
				request.setAttribute("allArtifacts", presidentArtifacts);								
				path = "/artifact-list.jsp";
			} catch (NumberFormatException e) {
				System.out.println("Forgot to select an item");				
				
			}
			
			
		}
		getServletContext().getRequestDispatcher(path).forward(request,response);		
	}

}
