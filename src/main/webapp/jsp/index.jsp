<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>select state and city</title>
<script type="text/javascript" src="\assets\js\jquery.min.js"></script>
<script type="text/javascript">
	function dynamicState() {
		/* alert("onload"); */

		$.get("states", function(data, status) {
			var txt;
			for (i in data) {

				txt += "<option value="+data[i].sid+">" + data[i].sName
						+ "</option>";
			}

			$("#state").append(txt);

		});
	}

	function dynamicCity() {

		var value = $("#state option:selected").val();
		var url = "citys/" + value + "";
		/* alert(url); */
		$.get(url, function(data, status) {

			var txt1 = "";
			txt1 += "<option>select city</option>"
			for (i in data) {

				txt1 += "<option value="+data[i]+">" + data[i] + "</option>";
			}

			$("#city").html(txt1);

		});

	}
</script>




</head>
<body onload="dynamicState()">
	<select id="state" onchange="dynamicCity()">
		<option value="null">select state</option>

	</select> &nbsp &nbsp

	<select id="city">
		<option>select city</option>

	</select>

	<div id="demo"></div>
</body>
</html>