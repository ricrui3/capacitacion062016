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
	<!-- Body -->
	<h1>
		<s:text name="LBL_EDIT_NEW" />
	</h1>

	<div class="form form-horizontal form-max">
		<div class="row">
			<div class="col-md-12">
				<s:form method="POST"
					action="%{#pageContext.request.contextPath}/informacion-base/gestionar-empresa/%{model.idEmpresa}">
					<s:hidden name="_method" value="PUT" />
					<div class="form-group">
						<div class="col-md-4 label-obligatorio control-label">
							<s:text name="LBL_CORREO" />
						</div>
						<div class="col-md-8">
							<s:textfield name="model.cuenta.correo" cssClass="form-control" />
						</div>
					</div>

					<div class="form-group">
						<div class="col-md-4 label-obligatorio control-label">
							<s:text name="LBL_NOMBRE_EMPRESA" />
						</div>
						<div class="col-md-8">
							<s:textfield name="model.nombre" cssClass="form-control" />
						</div>
					</div>

					<div>
						<s:submit value="%{getText('BTN_ACEPTAR')}" />
					</div>
				</s:form>
			</div>
		</div>
	</div>
</body>
	</html>
</jsp:root>