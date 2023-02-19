package com.tms;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Objects;

public class CoinsServlet extends HttpServlet {

    CoinBase coinList = new CoinBase();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if (req.getParameter("id") == null) {
            throw new ServletException("Enter coin ID");
        }
        int id = Integer.parseInt(req.getParameter("id"));
        String name = req.getParameter("name");
        double price = Double.parseDouble(req.getParameter("price"));

        coinList.addCoin(new Coin(id,name,price));
        ServletOutputStream outputStream = resp.getOutputStream();
        outputStream.println(Objects.requireNonNull(CoinBase.getCoinById(id)).toString());
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if (req.getParameter("id") == null) {
            ServletOutputStream outputStream = resp.getOutputStream();
            outputStream.println(Arrays.toString(coinList.getAllCoins().toArray()));
        } else {
            int id = Integer.parseInt(req.getParameter("id"));
            ServletOutputStream outputStream = resp.getOutputStream();
            Coin coin = CoinBase.getCoinById(id);
            if(coin != null){
                outputStream.println(coin.toString());
            } else {
                outputStream.println("No coin with " + id + " id");
            }
        }

    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if (req.getParameter("id") == null) {
            throw new ServletException("Enter coin ID");
        }
        int id = Integer.parseInt(req.getParameter("id"));
        String name = req.getParameter("name");
        double price = Double.parseDouble(req.getParameter("price"));
        coinList.changeCoinParameteres(id,name,price);
        ServletOutputStream outputStream = resp.getOutputStream();
        outputStream.println(Arrays.toString(coinList.getAllCoins().toArray()));
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        CoinBase.deleteCoinById(id);
        String res = String.valueOf(id);
        ServletOutputStream outputStream = resp.getOutputStream();
        outputStream.println(id);
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.addCookie(new Cookie("time", LocalDateTime.now().toString()));
        super.service(req, resp);
    }
}
