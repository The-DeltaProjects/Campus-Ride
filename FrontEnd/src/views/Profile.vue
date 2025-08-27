<template>
    <div class="profile-page">

        <link href="https://fonts.googleapis.com/css2?family=Kavoon&display=swap" rel="stylesheet">
        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        <link href="https://fonts.googleapis.com/css2?family=Katibeh&display=swap" rel="stylesheet">



        <div class="left-pane">

            <div class="nav-icons">
                <div class="nav">
                    <router-link to="/" class="icon"><img src="/home.png" alt=""></router-link>
                </div>
                <div class="nav">
                    <router-link to="/dashboard" class="icon"><img src="/dashboard.png" alt=""></router-link>
                </div>
                <div class="nav">
                    <router-link to="/schedule" class="icon"><img src="/schedule.png" alt=""></img></router-link>
                </div>
                <div class="nav">
                    <router-link to="/info" class="icon"><img src="/info.png" alt=""></router-link>
                </div>
                <div class="nav">
                    <router-link to="/help" class="icon"><img src="/help.png" alt=""></router-link>
                </div>
                .
            </div>




            <div class="log-out">
                <img src="/exit.png" alt="" class="logout">
            </div>

            <div class="covers">
                <img src="/new-moon.png" alt="" class="cover">
                <img src="/new-moon.png" alt="" class="cover">
                <img src="/new-moon.png" alt="" class="cover">
                <img src="/new-moon.png" alt="" class="cover">
                <img src="/new-moon.png" alt="" class="cover">
            </div>
        </div>
    </div>
    <h2 class="profile-label">Profile</h2>



    <div class="search-elements">
        <input type="text" value="" class="search-bar">
    </div>

    <div class="right-elements">
        <img src="/bell.png" alt="" class="notification"></img>
    </div>



    <div class="line-breaker"></div>

    <div class="boxes">
        <div class="left-box">
            <h2 class="profile-name">Gift Fernando</h2>
            <img src="/profile-image.jpg" alt="" class="profile-image"></img>
        </div>
        <div class="right-box">
            <h2 class="bio-label">Bio & other details</h2>
        </div>

    </div>

    <div class="line-breaker2"></div>


    <div class="footer-logos">
        <img src="/cput.png" alt="" class="cput-logo"></img>
        <img src="/HTGS.png" alt="" class="company-logo"></img>
    </div>

</template>

<script>
export default {
    name: 'profile'
}
</script>

<style scoped>
template,
body {
    margin: 0;
    height: 100vh;
    width: 100%;
}

.main-logo {
    display: flex;
    flex-direction: row;
    position: absolute;
    width: 300px;
    height: 60px;
    left: 40%;
    top: 5%;
}

.search-elements {
    display: inline-flex;
    position: absolute;
    left: 40%;
    top: 5%;
    z-index: 2;
    gap: 20px;
    justify-content: center;
    align-items: center;
}

.search {
    font-family: "Katibeh", serif;
    font-size: 30px;
    z-index: 2;
    color: rgb(0, 0, 0);
    align-items: normal;
}

.search-bar {
    border: none;
    display: flex;
    position: absolute;
    top: 2%;
    left: 50%;
    height: 35px;
    border-radius: 50px;
    width: 400px;
}


.right-elements {
    display: inline;
    position: absolute;
    right: 5%;
    top: 5%;
}

.notification {
    width: 30px;
    height: 30px;
}

.profile-label {
    display: flex;
    flex-direction: row;
    position: absolute;
    top: 5%;
    left: 2%;
    font-size: 35px;
    font-family: "Kavoon", system-ui, -apple-system, "Segoe UI", Roboto, Arial, sans-serif;
    color: white;
}

.nav-icons {
    display: flex;
    flex-direction: column;
    justify-content: center;
    gap: 30px;

}

.line-breaker {
    display: inline-flex;
    position: absolute;
    justify-content: center;
    width: 70%;
    height: 1.5px;
    background-color: white;
    left: 26%;
    top: 18%;

}

.boxes {
    display: inline-flex;
    position: fixed;
    justify-content: center;
    align-items: center;
    background-color: transparent;
    width: 1186px;
    height: 300px;
    left: 22.8%;
    top: 20%;
    gap: 5%;
    z-index: 999;
}

.left-box {
    display: flex;
    flex-direction: column;
    align-items: center;
    background-color: rgba(0, 0, 0, 0.137);
    border: white solid 2px;
    border-radius: 20px;
    width: 45%;
    height: 90%;
    gap: 10%;
    color: white;
}

.right-box {
    display: flex;
    flex-direction: row;
    background-color: rgba(0, 0, 0, 0.137);
    border: white solid 2px;
    border-radius: 20px;
    width: 45%;
    height: 90%;
    color: white;
}

.profile-image {
    border-radius: 50%;
    width: 200px;
    height: 300px;
}

.line-breaker2 {
    display: inline-flex;
    position: absolute;
    justify-content: center;
    width: 70%;
    height: 1.5px;
    background-color: white;
    left: 26%;
    top: 87%;

}

.profile-page {
    position: absolute;
    top: 0;
    left: 0;
    width: 100vw;
    height: 100vh;
    background: linear-gradient(to top, #626262, #319AC4);
    z-index: 0;
}

.logo {
    text-align: center;
    justify-content: center;
    width: 300px;
    height: 120px;
    margin-left: 50%;
    z-index: 999;
}

.left-pane {
    display: block;
    align-content: center;
    left: 2%;
    top: 20%;
    background-color: #b0b0b089;
    position: absolute;
    width: 70px;
    height: 50%;
    align-items: center;
    border-radius: 50px;
}

.profile-label {
    display: flex;
    flex-direction: row;
    position: absolute;
    top: 5%;
    left: 2%;
    font-size: 35px;
    font-family: "Kavoon", system-ui, -apple-system, "Segoe UI", Roboto, Arial, sans-serif;
    color: white;
}

.nav {
    display: flex;
    margin-top: 25px;
    align-items: center;
    justify-content: center;
    align-items: center;
}

.icon {
    display: flex;
    width: 30px;
    height: 30px;
    z-index: 2;

}

.log-out {
    display: flex;
    position: absolute;
    align-items: center;
    top: 110%;
    left: 2%;
    justify-content: center;
    background-color: #b0b0b089;
    width: 70px;
    height: 70px;
    border-radius: 50px;
}

.logout {
    width: 30px;
    height: 30px;
}

.covers {
    position: absolute;
    display: flex;
    top: 2.3%;
    left: 6%;
    flex-direction: column;
    gap: 25px;
}

.cover {
    top: 15%;
    width: 60px;
    height: 60px;
}

.exit-icon {
    width: 30px;
    height: 30px;
    z-index: 1;
    margin-top: -20px;
}

.line {
    z-index: 1;
    width: 200px;
    height: 8px;
    margin-top: 20px;
}

.label {
    color: white;
    font-size: 20px;
    margin-left: 15px;
    z-index: 999;
    display: inline-block;
    transition: transform .2s ease, color .2s ease;
}

.label:hover::after {
    background-color: transparent;
    transition: ease-out .4s;
}

.exit-label {
    color: white;
    font-size: 20px;
    margin-left: 15px;
    z-index: 2;
    margin-top: -20px;
}

.label:hover {
    cursor: pointer;
    transform: scale(1.26);
    transform-origin: left center;
    text-decoration: none;
    background-color: transparent;
}



.footer-logos {
    display: flex;
    position: fixed;
    bottom: 0%;
    left: 22.8%;
    width: 77.1%;
    height: 100px;
    text-align: center;
    padding: 20px;
    z-index: 0;
    gap: 70%;
}

.cput-logo {

    width: 144px;
    height: 60px;
    left: 10%;
}

.company-logo {
    display: flex;
    position: fixed;
    width: 129px;
    height: 50px;
    left: 85%;
    top: 90%;
}
</style>