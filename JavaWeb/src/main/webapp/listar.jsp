<%@page import="java.util.Set"%>
<%@page import="java.util.Properties"%>
<%@page import="java.io.InputStream"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!-- Quando esse arquivo jsp for compilado será transformado em servlet -->
<!--  http://localhost:8080/ServletJava/listar.jsp -->
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Listagem do arquivo props.txt</title>
</head>
<body>
	<%!// declaration: declara atributos para a classe que será gerada no servlet
	// tb comporta codigo java, pode-se aqui apenas criar variaveis
	Properties props = new Properties(); // importa dados com chave e valor
	// criando essa variavel aqui, deixa de ser apenas uma variavel local e passa a ser
	// um atributo de classe%>
	<%
	// criando um scriptlers - permite colocar código java dentro do jsp
	InputStream is = application.getResourceAsStream("/WEB-INF/props.txt");
	props.load(is); // carregando o conteudo is
	is.close();
	
	Set <Object> keys = props.keySet();
	%>

	<table border="1" widht="100%">
		<tr>
			<td> <strong> Nome </strong></td>
			<td> <strong> Valor </strong></td>
		</tr>
		<% for (Object k: keys) {%>
		<tr>
			<td> <%= // uma declaration que retorna string no browser - nao precisa de ;
			k %>  </td>
			<td> <%= props.getProperty((String) k)  %>   </td>
		</tr>
		<% } %>
			</table>
</body>
</html>