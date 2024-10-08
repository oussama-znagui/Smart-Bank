
<%@ page import="java.util.List" %>
<%@ page import="ma.znagui.app.entities.Request" %>
<%@ page import="java.util.ArrayList" %>%--
<%@ page contentType="text/html;charset=UTF-8" language="java" %>



<html>
<head>
    <title>Admin - Smart Bank</title>
    <style><%@include file="/css/admin.css"%></style>

</head>
<body>
<main>
    <div><h1 class="m-t">List des Demandes de credit</h1></div>
    <div class="table-cont">
        <table class="admin-table">
            <thead>
                <tr>
                    <th>
                        Nom Complet
                    </th>
                    <th>
                        Montant Demandé
                    </th>
                    <th>
                        Duree
                    </th>
                    <th>
                        Email
                    </th>
                    <th>
                        Phone
                    </th>
                    <th>
                        Action
                    </th>
                </tr>
            </thead>
            <tbody>
            <% List<Request> requestlist = (List<Request>) request.getAttribute("requests"); %>
            <% for (int i=0;i==requestlist.size()-1;i++) { %>
                <tr>
                    <td>
                        Oussama znagui
                    </td>
                    <td>
                        <%=requestlist.get(i).getAmount()%>
                    </td>
                    <td>
                        12
                    </td>
                    <td>
                        znagui.info@gmail.com
                    </td>
                    <td>
                        0669666205
                    </td>
                    <td>
                        plus
                    </td>
                </tr>
            <%} %>
            </tbody>
        </table>
    </div>
</main>


</body>
</html>
