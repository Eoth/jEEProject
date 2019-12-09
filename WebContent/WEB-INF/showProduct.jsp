<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="java.util.*,com.entity.Product"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Liste des logements</title>
</head>
<style type="text/css">
#customers {
	font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
	border-collapse: collapse;
	width: 100%;
}

#customers td, #customers th {
	border: 1px solid #ddd;
	padding: 8px;
}

#customers tr:hover {
	background-color: #ddd;
}

#customers th {
	padding-top: 12px;
	padding-bottom: 12px;
	text-align: left;
	background-color: #4CAF50;
	color: white;
}

#customers td a {
	text-decoration: none;
	text-align: left;
	color: black;
}

button {
	text-decoration: none;
	background-color: #4CAF50;
	color: white;
	width: 25%;
	padding: 20px;
	margin: 4px;
	border-radius: 4px;
}
</style>
<body>
	<h1>Liste des Logements</h1>
	<table id="customers">
		<tr>
			<th>Id</th>
			<th>typeDebien</th>
			<th>price</th>
			<th>adresse</th>
			<th>nombre de personne</th>
			<th>dispo à partir du</th>

		</tr>
		<%
			@SuppressWarnings("unchecked")
			List<Product> produits = (List<Product>) request.getAttribute("produits");
			if (produits != null) {
				for (Product produit : produits) {
		%>
		<tr>
			<td><%=produit.getProductId()%></td>
			<td><%=produit.getTypeProperty()%></td>
			<td><%=produit.getPrice() %> €</td>
			<td><%=produit.getAdress()%></td>
			<td><%=produit.getNbPers()%></td>
			<td><%=produit.getBeginDate()%></td>

		</tr>
		<%
			}
			}
		%>
	</table>
	<a href="/HouseRentJEE/"><button>retour</button></a>
</body>
</html>