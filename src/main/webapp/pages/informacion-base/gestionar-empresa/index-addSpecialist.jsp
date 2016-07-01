<?xml version="1.0" encoding="UTF-8" ?>
<jsp:root xmlns:jsp="http://java.sun.com/JSP/Page" version="2.0"
	xmlns:s="/struts-tags" xmlns:sj="/struts-jquery-tags">
	<jsp:directive.page language="java"
		contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" />
	<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<![CDATA[
    <script
        src="${pageContext.request.contextPath}/pages/informacion-base/gestionar-empresa/js/index-addSpecialist.js"
        type="text/javascript"></script>
    ]]>
</head>
<body>
	<h1>Agregar Especialista</h1>
	
	<div class="form form-horizontal form-max">
		<div class="row">
			<div class="col-md-12">
				<s:form method="POST"
					action="%{#pageContext.request.contextPath}/informacion-base/gestionar-empresa/%{model.idEmpresa}/buscarEspecialista">
					
					<div class="form-group">
						<div class="col-md-4 label-obligatorio control-label">
							<s:text name="LBL_NOMBRE" />
						</div>
						<div class="col-md-8">
							<s:textfield id="nombre" cssClass="form-control" onchange="getName();"/>
						</div>
					</div>

					<div class="form-group">
						<div class="col-md-4 label-obligatorio control-label">
							<s:text name="LBL_PRIMER_APELLIDO" />
						</div>
						<div class="col-md-8">
							<s:textfield id="primerApellido" cssClass="form-control" onchange="getPrimerApellido();"/>
						</div>
					</div>

					<div class="form-group">
						<div class="col-md-4 label-obligatorio control-label">
							<s:text name="LBL_SEGUNDO_APELLIDO" />
						</div>
						<div class="col-md-8">
							<s:textfield id="segundoApellido" cssClass="form-control" onchange="getSegundoApellido();"/>
						</div>
					</div>
					
					<div>
						<s:submit value="%{getText('BTN_BUSCAR')}" />
					</div>
					
				</s:form>
			</div>
		</div>
	</div>
	
</body>
	</html>
</jsp:root>