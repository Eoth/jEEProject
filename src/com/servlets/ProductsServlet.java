package com.servlets;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.EJB.ProductDao;
import com.entity.Product;

@WebServlet("/showProduct")
public class ProductsServlet extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@EJB ProductDao productDao;
	
	@Override
	public void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException{
		
		 Product One = new Product(1, "MAISON", 650, "15 rue de java EE", 4, true);
		 Product two = new Product(2, "STUDIO", 310, "19 rue de java EE", 1, true);
		 productDao.persist(One);
		 productDao.persist(two);
		
		request.setAttribute("produits", productDao.getAllProducts());
				
		this.getServletContext().getRequestDispatcher( "/WEB-INF/showProduct.jsp" ).forward( request, response );
	}
}
