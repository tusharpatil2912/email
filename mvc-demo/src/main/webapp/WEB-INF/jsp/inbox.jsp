<%@ include file="./header.jsp"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<h1>Inbox</h1>

<div class="container">
	<div class="row">
		<div class="col-md-3">
			<a href="./dashboard" class="btn btn-primary btn-block">Dashboard</a>
			<a href="./inbox" class="btn btn-primary btn-block">Inbox</a> <a
				href="./compose" class="btn btn-primary btn-block">Compose</a>
		</div>
		<div class="col-md-9">
			<table class="table">
				<thead>
					<tr>
						<th scope="col">From</th>
						<th scope="col">Subject</th>
						<th scope="col">Date</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${message}" var="c">
						<tr>
							<td>${c.msgFrom}</td>
							<td>${c.msgSubject}</td>
							<td>${c.sentAt}</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
</div>

<%@ include file="./footer.jsp"%>