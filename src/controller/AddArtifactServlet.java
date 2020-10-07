package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Artifact;
import model.President;

/**
  Servlet implementation class AddArtifactServlet
 */
@WebServlet(name = "addArtifactServlet", urlPatterns = { "/addArtifactServlet" })
public class AddArtifactServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;   
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddArtifactServlet() {
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
		Integer president_id = Integer.parseInt(request.getParameter("presID"));
		String label = request.getParameter("label");
		Integer price = Integer.parseInt(request.getParameter("price"));
		PresidentHelper daoPres = new PresidentHelper();
		President president = daoPres.searchForPresidentById(president_id);
		
		Artifact artifact = new Artifact(price, label, president);
		
		ArtifactHelper dao = new ArtifactHelper();
		dao.insertArtifact(artifact);
		System.out.println("saving an artifact to the database");
		
		
		getServletContext().getRequestDispatcher("/index.html").forward(request, response);
	}

}
