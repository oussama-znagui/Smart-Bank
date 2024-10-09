<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
    <style><%@include file="/css/main.css"%></style>
    <style><%@include file="/css/style.css"%></style>

</head>
<body>

<header>
    <div class="high-bar">

        <ul>
            <li><a href="#">Besoin d’argent</a></li>
            <li><a href="#">édit consommation</a></li>
            <li><a href="#">édit auto occasion</a></li>
            <li><a href="#">édit auto neuve</a></li>
            <li><a href="#">édit Equipement</a></li>
            <li><a href="#">édit Renouvelable</a></li>
            <li><a href="#">Rachat Crédit</a></li>
            <li><a href="#">Assurance</a></li>
        </ul>

    </div>
    <div class="lang">
        <a href="#">Français</a>
        <div class="line"></div>
        <a href="#">عربية</a>

    </div>
    <div class="nav-bar">
        <img src="images/logo.jpg" alt="">
        <nav>
            <a href="#">Mes besoins</a>
            <a href="#">Mes promotions</a>
            <a href="#">Guides pratiques</a>
            <a href="#">Découvrir Wafasalaf</a>
            <a href="#">Régler mes impayés</a>

        </nav>
        <div class="auth">
            <a href="#">
                <svg  aria-hidden="true" xmlns="http://www.w3.org/2000/svg" width="24"
                      height="24" fill="none" viewBox="0 0 24 24">
                    <path stroke="currentColor" stroke-linecap="round" stroke-linejoin="round" stroke-width="2"
                          d="M12 14v3m-3-6V7a3 3 0 1 1 6 0v4m-8 0h10a1 1 0 0 1 1 1v7a1 1 0 0 1-1 1H7a1 1 0 0 1-1-1v-7a1 1 0 0 1 1-1Z" />
                </svg>

                Mon compte
            </a>
        </div>

    </div>
</header>
<div class="lang">
    <a href="#">Accueil
    </a>
    <div class="line"></div>
    <a href="#">Demander mon crédit en ligne</a>

</div>
<main>
    <h1 class="main-title">Demander mon crédit en ligne</h1>
    <div class="main-container">














        <div class="container">
            <div class="progress">
                <div id="step1" class="">
                    <h1>1</h1>
                    <h3>Simuler mon credit</h3>
                </div>
                <div id="step2" class="">
                    <h1>2</h1>
                    <h3>Mes coordonnées</h3>
                </div>
                <div id="step3">
                    <h1>3</h1>
                    <h3>Mes infos personnelles</h3>
                </div>
            </div>
            <form action="${pageContext.request.contextPath}/demande" method="post">


                <div class="p1" id="p1">

                    <div>
                        <label>Mon projet</label>
                        <select id="project" name="project">
                            <option>J'ai besoin d'argent</option>
                            <option>J'ai besoin d'argent</option>
                            <option>J'ai besoin d'argent</option>
                            <option>J'ai besoin d'argent</option>
                        </select>
                    </div>

                    <div >
                        <label>Je suis</label>
                        <select id="pro" name="pro">
                            <option>Artisan</option>
                            <option>Artisan</option>
                            <option>JArtisan</option>
                            <option>JArtisan</option>
                        </select>
                    </div>
                    <div class="rang-div">
                        <label>Montant (en DH)</label>
                        <input type="number" id="amount" name="amount" max="600000" min="5000"  >
                        <input type="range" step="1000" id="amount-rang" max="600000" min="5000" >
                    </div>
                    <div class="rang-div">
                        <label>Durée (en mois)</label>
                        <input type="number" id="duration" name="duration">
                        <input type="range" min="12" max="120" step="6" value="" id="duration-rang">
                    </div>
                    <div class="rang-div">
                        <label>Mensualités (en DH)</label>
                        <input type="number" id="monthly" name="monthly">
                        <input type="range"  id="monthly-rang" step="any">
                    </div>
                    <div class="bt">
                        <button id="toStep2" type="button">
                            Continuer <br>
                            <span>sans engagement</span>
                        </button>
                    </div>


               </div>
                <div class="p2" id="p2">
                    <div class="form__group field">
                        <input type="email" name="email" class="form__field" placeholder="email" >
                        <label class="form__label">Name</label>
                    </div>
                    <div class="form__group field">
                        <input type="tel" name="tel" class="form__field" placeholder="tel" >
                        <label  class="form__label"> Téléphone mobile*</label>
                    </div>
                    <div class="bt">
                        <button id="toStep3" type="button">
                            Continuer <br>
                            <span>sans engagement</span>
                        </button>
                    </div>
                </div>

                <div class="p3" id="p3">
                    <div>
                        <div class="form__group field">
                            <label class="form__label">Civilité</label>
                            <input type="radio" name="civility" value="Madame">
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
                            <input type="text" class="form__field" placeholder="Nom" name="lastName">
                            <label class="form__label">Nom</label>
                        </div>
                        <div class="form__group field">
                            <input type="text" class="form__field" placeholder="Prenom" name="firstName">
                            <label class="form__label">Prenom</label>
                        </div>
                        <div class="form__group field">
                            <input type="text" class="form__field" placeholder="CIN" name="cin" >
                            <label class="form__label">CIN</label>
                        </div>
                        <div class="form__group field">
                            <input type="date" class="form__field" placeholder="Date de naissance" name="b-date" >
                            <label class="form__label">Date de naissance</label>
                        </div>
                        <div class="form__group field">
                            <input type="number" class="form__field" placeholder="Revenu" name="revenu" >
                            <label class="form__label">Revenu</label>
                        </div>
                        <div class="form__group field">

                            <label class="form__label">Avez vous des crédits en cours ?</label>
                            <input name="credit" type="radio" class="form__field"  value="true">
                            <label>oui</label>
                            <input name="credit" type="radio" class="form__field"  value="false">
                            <label>non</label>
                        </div>
                        <div >


                        </div>

                    </div>
                    <button type="submit" name="submit" >allo</button>

                </div>

            </form>

            <div class="leg">
            <p>
                Simulation à titre indicatif et non contractuelle. La mensualité minimale est de 180 dirhams. Un client Wafasalaf peut bénéficier d'une tarification plus avantageuse en fonction de ses conditions préférentielles.
                <br> <br>

                Conformément à la loi 09-08, vous disposez d’un droit d’accès, de rectification et d’opposition au traitement de vos données personnelles. Ce traitement est autorisé par la CNDP sous le numéro A-GC-206/2014.
            </p></div>


        </div>

        <div class="recap">
            <h1> Mon récapitulatif</h1>
            <table id="racaptable">
                <thead>
                <td>
                    Mon projet
                </td>
                </thead>

                <tbody>

                    <td>
                        Prêt Personnel
                    </td>

                </tbody>

            </table>

        </div>
    </div>



    <div class="modal" id="modal">
       <div>
           <h1>
               Attention !!
           </h1>
           <button id="closeModal">Fermer</button>
       </div>

            <ul class="errors">


            </ul>


    </div>











</main>




<script><%@include file="WEB-INF/js/main.js" %></script>
<script><%@include file="WEB-INF/js/navigation.js" %></script>
<script><%@include file="WEB-INF/js/recap.js" %></script>
<script><%@include file="WEB-INF/js/regex.js" %></script>
</body>

</body>
</html>