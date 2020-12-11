<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags/form"%>
<section class="content">

<div class="row">
		<div class="col-md-2"></div>
		<div class="col-md-8">
			<div class="box box-primary">
				<div class="box-header with-border">
					<h3 class="box-title">Category Manager</h3>
				</div>
				<s:form method="post" modelAttribute="category"
					action="${pageContext.request.contextPath }/dashboard/savecategory"
					enctype="multipart/form-data">
					<div class="box-body">
					<s:hidden path="id" />
					<div class="form-group">
						<label for="exampleInputEmail1">Name</label>
						<s:input path="name" type="text" class="form-control"
							placeholder="Enter name" />
					</div>
					
						</div>
						<div class="box-footer">
					<button type="submit" class="btn btn-primary">Save</button>
				</div>
				</s:form>
			</div>
		</div>
	</div>



	
	
	</section>