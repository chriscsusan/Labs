<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%--
	On this page we have a form to create a movie.
	
	Model:
	- Movie movie ~ a movie with no properties set at all
 --%>
<html>
<head>
	<title>Movies</title>
	<link href="<c:url value="/resources/main.css"/>" rel="stylesheet"/>
</head>
<body>
<div class="nav">
	<a href="<c:url value="/"/>">Home</a>
	<a href="<c:url value="/movies"/>">Back to Movies List</a>
</div>
<h1>
	Add a movie
</h1>

<form method="post">
	<div>
		<label>Title</label>
		<input type="text" name="title" value="${movie.title}"/>
	</div>
	<div>
		<label>Category</label>
		<input type="text" name="category" value="${movie.category}"/>
	</div>
	<div>
			<label>Description</label>
			<textarea rows="4" cols="25" name="description">${movie.description}</textarea>
		</div>
		<div>
			<label>Release year</label> <input type="number" name="year"
				value="${movie.year}" />
		</div>
		<div>
			<label>Black and white?</label> <input type="checkbox"
				name="blackAndWhite" value="${movie.blackAndWhite}"/>
		</div>
		<div>
			<label>Rating:</label> 
			<select autofocus name="rating">
				<c:forEach begin="0" end="3" varStatus="loop">
   					 <c:choose>
					<c:when test="${movie.getRatings(loop.index)==movie.rating}">
        				<option value="${movie.getRatings(loop.index)}" selected="selected">${movie.getRatings(loop.index)}</option>
    				</c:when>
					<c:otherwise>
							<option value="${movie.getRatings(loop.index)}">${movie.getRatings(loop.index)}</option>
					</c:otherwise>
					</c:choose>
				</c:forEach>
			</select>
		</div>
		<div>
		<Label>Origin:</Label>
		<c:forEach begin="0" end="2" varStatus="loop">
   					 <c:choose>
					<c:when test="${movie.getOrigins(loop.index)==movie.origin}">
        				<input type="radio" name="origin" value="${movie.getOrigins(loop.index)}" checked>${movie.getOrigins(loop.index)}
    				</c:when>
					<c:otherwise>
							<input type="radio" name="origin" value="${movie.getOrigins(loop.index)}">${movie.getOrigins(loop.index)}
					</c:otherwise>
					</c:choose>
				</c:forEach>
		</div>
	<button type="submit">Create</button>
</form>

</body>
</html>