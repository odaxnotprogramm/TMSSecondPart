package com.tms;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/search")
public class CoinGetServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if (req.getParameter("id") == null || req.getParameter("id").isEmpty()) {
            req.setAttribute("coins", CoinBase.getAllCoins());
            req.getRequestDispatcher("/get.jsp").forward(req,resp);
        } else {
            int id = Integer.parseInt(req.getParameter("id"));
            Coin coin = CoinBase.getCoinById(id);
            if(!CoinBase.getAllCoins().contains(coin)){
                resp.getOutputStream().println("<h1>Coin with id" + id + " is not found</h1>");
                resp.getOutputStream().println("<a href=\"coinsHome.jsp\">Home</a>");
            } else {
                List<Coin> coins = new ArrayList<>();
                coins.add(coin);
                req.setAttribute("coins",coins);
                req.getRequestDispatcher("/get.jsp").forward(req,resp);
            }
        }
    }
}
