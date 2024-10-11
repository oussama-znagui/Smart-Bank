
<%@ page import="java.util.List" %>
<%@ page import="ma.znagui.app.entities.Request" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="ma.znagui.app.entities.RequestStatus" %>
<%@ page import="java.util.Set" %>
%--
<%@ page contentType="text/html;charset=UTF-8" language="java" %>



<html>
<head>
    <title>Admin - Smart Bank</title>
    <style><%@include file="/css/admin.css"%></style>

</head>
<body>
<main>
    <div class="filter_cont">
        <h1 class="m-t">List des Demandes de credit</h1>
        <form class="filter_form">
            <input type="date" name="">

            <select>
                <option>All</option>
                <option value="1">Annulé</option>
                <option value="2">Approuvé</option>
                <option value="3">En cours de traitement</option>

            </select>
            <input type="submit" value="Filter" name="filter">
        </form></div>

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
            <% List<Request> requestlist = (List<Request>) request.getAttribute("requests");%>
            <% for (Request r : requestlist) { %>
                <tr>
                    <td>
                        <%=r.getFistName() + " " + r.getLastName()%>
                    </td>
                    <td>
                        <%=r.getAmount()%> DHS
                    </td>
                    <td>
                        <%=r.getDuration()%> Mois
                    </td>
                    <td>
                        <%=r.getEmail()%>
                    </td>
                    <td>
                        <%=r.getPhone()%>
                    </td>

                    <td>
                        <button id="b-<%=r.getId()%>">plus</button>
                    </td>
                    <td>
                        <div class="creditDataModal" id="m-<%=r.getId()%>">
                            <button id="f-<%=r.getId()%>">fermer</button>
                            <div class="modal_body">
                                <div >

                                    <form >
                                        <div>
                                            <h1 class="modal_title">Information du credit N° <%=r.getId()%></h1>

                                            <div class="form__group">
                                                <label>Mon projet</label>
                                                <select id="project" name="project" class="form__field" >
                                                    <option>J'ai besoin d'argent</option>
                                                    <option>J'ai besoin d'argent</option>
                                                    <option>J'ai besoin d'argent</option>
                                                    <option>J'ai besoin d'argent</option>
                                                </select>
                                            </div>

                                            <div class="form__group" >
                                                <label>Je suis</label>
                                                <select id="pro" name="pro" class="form__field">
                                                    <option>Artisan</option>
                                                    <option>Artisan</option>
                                                    <option>JArtisan</option>
                                                    <option>JArtisan</option>
                                                </select>
                                            </div>

                                            <div class="rang-div form__group">
                                                <label>Montant (en DH)</label>
                                                <input type="number" id="amount" class="form__field" name="amount" max="600000" min="5000" value="<%=r.getAmount()%>"  >
                                            </div>

                                            <div class="rang-div form__group">
                                                <label>Durée (en mois)</label>
                                                <input type="number" id="duration" class="form__field" name="duration"  min="12" max="120" value="<%=r.getDuration()%>">
                                            </div>

                                            <div class="rang-div form__group">
                                                <label>Mensualités (en DH)</label>
                                                <input type="number" id="monthly" class="form__field" name="monthly" value="<%=r.getMountly()%>">

                                            </div>






                                            <div class="form__group field">
                                                <label class="form__label">Email</label>
                                                <input type="email" name="email" class="form__field" placeholder="email"  value="<%=r.getEmail()%>">

                                            </div>
                                            <div class="form__group field">
                                                <label  class="form__label"> Téléphone mobile*</label>
                                                <input type="tel" name="tel" class="form__field" placeholder="tel" value="<%=r.getPhone()%>" >

                                            </div>
                                        </div>



                                        <div>

                                            <div class="form__group field">
                                                <label class="form__label"></label>
                                                <input type="radio" name="civility" value="Madame" checked>
                                                <label>
                                                    Madame
                                                </label>
                                                <input type="radio" name="civility" value="Mademoiselle">
                                                <label>Mademoiselle
                                                </label>
                                                <input type="radio" name="civility" value="Monsieur">
                                                <label>Monsieur
                                                </label>

                                            </div>
                                            <div class="form__group field">
                                                <label class="form__label">Nom</label>
                                                <input type="text" class="form__field" placeholder="Nom" name="lastName" value="<%=r.getLastName()%>">

                                            </div>
                                            <div class="form__group field">
                                                <label class="form__label">Prenom</label>
                                                <input type="text" class="form__field" placeholder="Prenom" name="firstName" value="<%=r.getFistName()%>">

                                            </div>
                                            <div class="form__group field">
                                                <label class="form__label">CIN</label>
                                                <input type="text" class="form__field" placeholder="CIN" name="cin" value="<%=r.getCin()%>" >

                                            </div>
                                            <div class="form__group field">
                                                <label class="form__label">Date de naissance</label>
                                                <input type="date" class="form__field" placeholder="Date de naissance" name="b-date" value="<%=r.getBirthDay()%>" >

                                            </div>
                                            <di class="form__group field">
                                                <label class="form__label">Revenu</label>
                                                <input type="number" class="form__field" placeholder="Revenu" name="revenu" value="<%=r.getIncomes()%>" >

                                            </di>
                                            <div class="form__group field">

                                                <label class="form__label">Avez vous des crédits en cours ?</label>
                                                <input name="credit" type="radio" class=""  value="true">
                                                <label>oui</label>
                                                <input name="credit" type="radio" class=""  value="false">
                                                <label>non</label>
                                            </div>



                                            <button type="submit" name="submit" >allo</button>
                                        </div>

                                    </form>


                                </div>
                                <div>
                                    <h1>Historique de Status</h1>
                                    <ul class="status_list">

                                        <% List<RequestStatus> rss = r.getRequestStatus(); %>
                                        <%for (RequestStatus rs : rss){%>


                                        <li>
                                            <%= rs.getStatus().getStatus() + "|" + rs.getDate()%>

                                        </li>
                                        <%
                                         }
                                     %>
                                    </ul>
                                    <form method="post" action="/admin">
                                        <div class="form__group" >
                                            <label>Status</label>
                                                <select  name="status" class="form__field">
                                                <option value="1">Annulé</option>
                                                <option value="2">Approuvé</option>
                                                <option value="3">En cours de traitement</option>

                                            </select>
                                            <input type="text" value="<%=r.getId()%>" name="requestId" style="display: none">

                                            <input type="submit" value="modifier" name="addStatus" class="add_status">
                                        </div>


                                    </form>

                                </div>
                            </div>
                        </div>
                    </td>
                </tr>

            <%} %>
            </tbody>
        </table>
    </div>


</main>

<script><%@include file="../js/admin.js" %></script>

</body>
</html>
