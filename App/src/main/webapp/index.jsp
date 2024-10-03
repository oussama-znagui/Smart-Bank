<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
    <style><%@include file="/css/main.css"%></style>
    <script><%@include file="WEB-INF/js/main.js" %></script>

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
                <div>
                    <h1>1</h1>
                    <h3>Simuler mon credit</h3>
                </div>
                <div>
                    <h1>1</h1>
                    <h3>Simuler mon credit</h3>
                </div>
                <div>
                    <h1>1</h1>
                    <h3>Simuler mon credit</h3>
                </div>
            </div>
            <form>

                <div class="p1" id="p1">

                    <div>
                        <label>Mon projet</label>
                        <select>
                            <option>J'ai besoin d'argent</option>
                            <option>J'ai besoin d'argent</option>
                            <option>J'ai besoin d'argent</option>
                            <option>J'ai besoin d'argent</option>
                        </select>
                    </div>

                    <div>
                        <label>Je suis</label>
                        <select>
                            <option>Artisan</option>
                            <option>Artisan</option>
                            <option>JArtisan</option>
                            <option>JArtisan</option>
                        </select>
                    </div>
                    <div class="rang-div">
                        <label>Montant (en DH)</label>
                        <input type="number" id="amount" max="600000" min="5000" value="">
                        <input type="range" step="1000" id="amount-rang" max="600000" min="5000" value="">
                    </div>
                    <div class="rang-div">
                        <label>Durée (en mois)</label>
                        <input type="number" id="duration">
                        <input type="range" min="12" max="120" step="6" value="" id="duration-rang">
                    </div>
                    <div class="rang-div">
                        <label>Mensualités (en DH)</label>
                        <input type="number" id="monthly" value="">
                        <input type="range" value="" id="monthly-rang" step="any">
                    </div>
                    <div class="bt">
                        <button id="toStep2">
                            Continuer <br>
                            <span>sans engagement</span>
                        </button>
                    </div>


               </div>
                <div class="p2" id="p2">
                    <div class="form__group field">
                        <input type="email" class="form__field" placeholder="email" required="">
                        <label class="form__label">Name</label>
                    </div>
                    <div class="form__group field">
                        <input type="tel" class="form__field" placeholder="Name" required="">
                        <label  class="form__label"> Téléphone mobile*</label>
                    </div>
                    <div class="bt">
                        <button id="toStep3">
                            Continuer <br>
                            <span>sans engagement</span>
                        </button>
                    </div>
                </div>

                <div class="p3" id="p3">
                    <div>
                        <div class="form__group field">
                            <input type="email" class="form__field" placeholder="email" required="">
                            <label class="form__label">Name</label>
                        </div>
                        <div class="form__group field">
                            <input type="email" class="form__field" placeholder="email" required="">
                            <label class="form__label">Name</label>
                        </div>
                        <div class="form__group field">
                            <input type="email" class="form__field" placeholder="email" required="">
                            <label class="form__label">Name</label>
                        </div>

                    </div>

                </div>
            </form>


        </div>

        <div class="recap">
            <h1> Mon récapitulatif</h1>
        </div>
    </div>











</main>

</body>

</body>
</html>