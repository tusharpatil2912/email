<%@ include file="./header.jsp"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<h1>Compose Mail</h1>

<div class="container">
	<div class="row">
		<div class="col-md-3">
			<a href="./dashboard" class="btn btn-primary btn-block">Dashboard</a>
			<a href="./inbox" class="btn btn-primary btn-block">Inbox</a> <a
				href="./compose" class="btn btn-primary btn-block">Compose</a>
		</div>
		<div class="col-md-9">
			<form method="post">
				<div>
				<div class="form-group row">
					<label for="msgTo" class="col-sm-2 col-form-label">To</label>
					<div class="col-sm-10">
						<input type="text" class="form-control" id="msgTo" name="msgTo">
					</div>
				</div>
				<div class="form-group row">
					<label for="msgCc" class="col-sm-2 col-form-label">CC</label>
					<div class="col-sm-10">
						<input type="text" class="form-control" id="msgCc" name="msgCc">
					</div>
				</div>
				<div class="form-group row">
					<label for="msgSubject" class="col-sm-2 col-form-label">Subject</label>
					<div class="col-sm-10">
						<input type="text" class="form-control" id="msgSubject" name="msgSubject">
					</div>
				</div>
				<div class="form-group row">
					<label for="msgBody" class="col-sm-2 col-form-label">Message</label>
					<div class="col-sm-10">
						<textarea class="form-control" rows="6" id="msgBody" name="msgBody"></textarea>
					</div>
				</div>
				</div>
				<button class="btn btn-primary">Send</button>
			</form>
			<h2 class="text-success">${msgSent}</h2>
		</div>
	</div>
	</div>

<%@ include file="./footer.jsp"%>