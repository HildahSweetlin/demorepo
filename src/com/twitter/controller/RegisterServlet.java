package com.twitter.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.twitter.entity.FacebookUser;
import com.twitter.entity.TwitterUser;

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	      String name = request.getParameter("nm");
	      String password = request.getParameter("pass");
	      String email = request.getParameter("em");
	      String address = request.getParameter("add");
	      
	      TwitterUser tu =new TwitterUser();
	      tu.setName(name);
	      tu.setPassword(password);
	      tu.setEmail(email);
	      tu.setAddress(address);
	}

}
