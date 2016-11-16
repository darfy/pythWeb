<%--
  Created by IntelliJ IDEA.
  User: mikaelnaas
  Date: 09/11/16
  Time: 12:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

<link rel="stylesheet" type="text/css" href="index.css" />
<title>drf floorInformation client</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>

<script>
    $(document).ready(function() {

        //TODO: Use Mustach with templates instead of this.
        $.get("http://localhost:8080/pyth/api/floorsInfo", function (data, status) {
            var $totalArea = 0;
            $("table.table").append("" +
                    "<tr><th>Name"+ "" +
                    "</th><th>Building Name" + "" +
                    "</th><th>Area" + "</th></tr>")

            $.each(data, function(i, data){
                $totalArea = $totalArea+parseFloat(data.area);
                $("table.table").append("" +
                        "<tr><td>"+data.floorName +
                        "</td><td>" + data.buildingName +"" +
                        "</td><td>" + data.area + ""
                        +"</td></tr>");
            });
            $("table.table").append("" +
                    "<tr><td>"+ "" +
                    "</td><td>" + "" +
                    "</td><th>" + $totalArea + "</th></tr>")
        });
    });
</script>
</head>
<body>

<table class="table"></table>

</body>
</html>
