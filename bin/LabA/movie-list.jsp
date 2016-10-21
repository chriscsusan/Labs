<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<%--
	On this page we list all the movies.
	
	Model:
	- List<Movie> movies
 --%>
<html>
<head>
<title>Movies</title>
<link href="<c:url value="/resources/main.css"/>" rel="stylesheet" />
</head>
<body>
	<div class="nav">
		<a href="<c:url value="/"/>">Home</a>
	</div>
	<h1>All the Movies</h1>

	<table>
		<tr>
			<th>Title</th>
			<th>Category</th>
			<th>Year</th>
			<th>Rating</th>
			<th>B&W</th>
			<th>Origin</th>
		</tr>
		<c:forEach var="movie" items="${movies}">
			<tr>
				<td><a href="<c:url value="/movies/${movie.id}"/>">${ movie.title }</a></td>
				<td>${ movie.category }</td>
				<td>${ movie.year }</td>
				<td>${ movie.rating }</td>
				<td><c:choose>
					<c:when test="${movie.blackAndWhite=='true'}">
        				&#10004;
    				</c:when>
					<c:otherwise>
					
					</c:otherwise>
					</c:choose>
				</td>
				<td>
					${movie.origin}<br/>
				</td>
			</tr>
		</c:forEach>
	</table>
	<div class="action-bar">
		<a class="add-btn" href="<c:url value="/movies/create"/>">Add a
			movie</a>
	</div>

</body>
</html>