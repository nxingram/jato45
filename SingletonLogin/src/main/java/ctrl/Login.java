package ctrl;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dal.Database;
import model.Persona;

@WebServlet("/login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;


	public Login() {
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Database db = Database.getDatabase();
		List<Persona> listaPersone = db.getListaPersone();
		System.out.println(listaPersone);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
