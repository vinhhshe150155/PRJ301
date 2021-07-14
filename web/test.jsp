<%-- 
    Document   : test
    Created on : Jun 21, 2021, 9:06:00 AM
    Author     : Admin
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        UOA<input id="vjp" type="text">
        <div id="result"></div>
        <script src="assets/js/jquery-3.3.1.min.js"></script>
        <script type="text/javascript">
                $(document).ready(function(){          

                $('#vjp').on('input', function(){

                        var name = $('#vjp').val();
//                        alert("No")
                        $.ajax({

                                type: "GET",

                                url : "SearchAjax",

                                data: {name: name},

                                success: function(responseText){

                                        document.getElementById("result").innerHTML = responseText;

                                }

                        });

                });

        });
    </script>
    </body>
    
</html>
