package com.tms;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/delete")
public class CoinDeleteServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if(req.getParameter("id") != null && !req.getParameter("id").isEmpty()){
            int id = Integer.parseInt(req.getParameter("id"));
            CoinBase.deleteCoinById(id);
        }
        req.setAttribute("coins", CoinBase.getAllCoins());
        req.getRequestDispatcher("/coinsHome.jsp").forward(req,resp);
    }
}
