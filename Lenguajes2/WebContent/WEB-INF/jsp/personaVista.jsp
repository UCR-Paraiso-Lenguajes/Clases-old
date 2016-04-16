<html>
<head>
	<title>Resultado</title>
	<script src="http://ajax.aspnetcdn.com/ajax/jQuery/jquery-1.12.0.min.js"></script>
</head>
<body>
	<table>
		<thead>
			<tr>
				<th>Nombre</th>
				<th>Cedula</th>
			<tr>			
		</thead>
		<tbody id="resultados">
		</tbody>
	</table>
	
	<script>
	$(function()
	{
	    $.ajax({
	    	url: "personas",
	    	dataType: "json",
	    	success: function(result)
	    	{
	    		var data = $(result);
	    		$( data ).each(function( index, info ) {
	        		$("#resultados").append("<tr>");
	        		$("#resultados").append("	<td>");
	        		$("#resultados").append(info.nombre);
	        		$("#resultados").append("	</td>");
	        		$("#resultados").append("	<td>");
	        		$("#resultados").append(info.cedula);
	        		$("#resultados").append("	</td>");
	        		$("#resultados").append("</tr>");
	        	});
	        	
	        	
	    }});
	});
	</script>
</body>
</html>