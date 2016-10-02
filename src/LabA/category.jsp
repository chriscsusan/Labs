<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%--
	On this page we list all the movies in a category.
	
	Model:
	- String category
	- List<Movie> movies
 --%>
<html>
<head>
	<title>Movies</title>
	<link href="<c:url value="/resources/main.css"/>" rel="stylesheet"/>
</head>
<body>
<div class="nav">
	<a href="<c:url value="/"/>">Home</a>
	<a href="<c:url value="/categories"/>">Back to Categories List</a>
</div>
<h1>
	Category: ${category}
</h1>

<table>
	<tr>
		<th>Title</th><th>Category</th>
	</tr>
	<c:forEach var="movie" items="${movies}" >
		<tr>
			<td><a href="<c:url value="/movies/${movie.id}"/>">${ movie.title }</a></td>
			<td>${ movie.category }</td>
		</tr>
	</c:forEach>
</table>

</body>
</html>