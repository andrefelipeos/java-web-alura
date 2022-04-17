package alura.servlets.gerenciador.acao;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import alura.servlets.gerenciador.modelo.Banco;
import alura.servlets.gerenciador.modelo.Empresa;

public class ListaEmpresas {
	
	public void executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Banco banco = new Banco();
		List<Empresa> empresas = banco.getEmpresas();
		
		request.setAttribute("listaEmpresas", empresas);
		RequestDispatcher despachador = request.getRequestDispatcher("lista_de_empresas.jsp");
		despachador.forward(request, response);
	}

}
