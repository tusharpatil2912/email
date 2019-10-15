<%@ include file="./header.jsp"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

 <h1> Dashboard</h1>

<div class="container">
	<div class="row">
		<div class="col-md-3">
			<a href="./dashboard" class="btn btn-primary btn-block">Dashboard</a> 
			<a href="./inbox" class="btn btn-primary btn-block">Inbox</a>
			<a href="./compose" class="btn btn-primary btn-block">Compose</a>
		</div>
		<div class="col-md-9">
			<h1>Welcome ${user.name}</h1>
			<p class="lead">Name : ${user.name}</p>
			<p class="lead">Gender : ${user.gender}</p>
			<p class="lead">Email : ${user.email}</p>
			<p class="lead">Phone : ${user.phone}</p>
		</div>
	</div>
</div>


<%@ include file="./footer.jsp"%>