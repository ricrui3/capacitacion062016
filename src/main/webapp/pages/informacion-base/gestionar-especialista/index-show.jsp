<?xml version="1.0" encoding="UTF-8" ?>
<jsp:root xmlns:jsp="http://java.sun.com/JSP/Page" version="2.0"
	xmlns:s="/struts-tags" xmlns:sj="/struts-jquery-tags">
	<jsp:directive.page language="java"
		contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" />
	<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<!-- Head -->
</head>
<body>
	<div class="form form-horizontal form-max">
		<div class="row">
			<div class="col-md-12">
				<h1>
					<s:text name="LBL_EMPRESA_SHOW"></s:text>
				</h1>

				<div>
					<s:property value="model.nombre" />
				</div>

				<div>
					<s:property value="model.primerApellido" />
				</div>
				
				<div>
					<s:property value="model.segundoApellido" />
				</div>
				<div>
					<a
						href="${pageContext.request.contextPath}/informacion-base/gestionar-especialista/">
						index</a>
				</div>
			</div>
		</div>
	</div>
</body>
	</html>
</jsp:root>