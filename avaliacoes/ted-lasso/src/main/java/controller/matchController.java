package controller;

import model.Match;
import model.Team;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpServletRequest;

import java.io.IOException;

@WebServlet("/matchController")

/**
 * A classe matchController define uma controladora de partidas de futebol no universo da série "Ted lasso"
 * que extende a classe HttpServlet para a criação de uma página na web que conterá informações destas partidas
 * 
 */
public class matchController extends HttpServlet {
    
    /**
     * O método doGet trata requisições HTTP do tipo GET e as redireciona para o método doPost.
     *
     * @param request informações da requisição
     * @param response resposta da requisição
     * @throws IOException caso ocorra um erro de entrada ou saída ao decorrer do processamento do método
     */
    @Override protected void doGet (HttpServletRequest request, HttpServletResponse response) throws IOException {
        this.doPost(request, response);
    }

    /**
     * O método doPost trata requisições HTTP do tipo POST para registrar uma partida com seus times e seu resultado.
     * 
     * @param request  informações da requisição
     * @param response resposta da requisição
     * @throws IOException caso ocorra um erro de entrada ou saída ao decorrer do processamento do método
     * @see Match
     * @see Team
     */
    @Override protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
        Match m1 = new Match();
        Team h1 = new Team();
        Team v1 = new Team();
        
        String home = request.getParameter("home");
        h1.setName(home);
        m1.setHome(h1);

        String x = request.getParameter("homeScore");
        int homeScore = Integer.parseInt(x);
        m1.setHomeScore(homeScore);

        String y = request.getParameter("visitorScore");
        int visitorScore = Integer.parseInt(y);
        m1.setVisitorScore(visitorScore);

        String visitor = request.getParameter("visitor");
        v1.setName(visitor);
        m1.setVisitor(v1);

        System.out.println(m1.getResult().getName());
        System.out.println(m1.getResult(m1.getVisitor())); 
    }
}