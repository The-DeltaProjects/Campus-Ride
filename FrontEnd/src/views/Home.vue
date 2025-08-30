<template>

    <link href="https://fonts.googleapis.com/css?family=Caprasimo&display=swap" rel="stylesheet">
    <meta charSet="utf-8" />
    <meta httpEquiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />

    <div class="home-page">

        <header class="head">
            <div class="menu">
                <button class="menu-cover"></button>
                <img src="/menu-logo.png" alt="" class="menu-button" />

            </div>

            <div class="left-links">

                <router-link to="/about" class="link">About</router-link>
                <router-link to="/schedules" class="link">Schedules</router-link>

            </div>

            <img src="/campus-logo.png" alt="" class="main-logo" />

            <div class="right-links">
                <router-link to="/dashboard" class="link">Dashboard</router-link>
                <router-link class="link">Help/Faq</router-link>
            </div>

            <div class="profile">
                <button class="profile-cover"></button>
                <router-link to="/profile" class="link"><img src="/profile-logo.png" alt=""
                        class="profile-button" /></router-link>
            </div>
        </header>

        <main class="body-structure">



            <div class="image-gradient">
                <h1 class="home-slogan">A way to get to any<br>campus, fast!</h1>
                <img src="/home-background.jpeg" alt="" class="background-image"></img>
            </div>

            <div class="book-cover">
                <router-link to="/book" class="link">
                    <h2 class="book-button">Book Now !</h2>
                </router-link>
            </div>

        </main>

        <footer class="foot">

            <div class="logos">
                <img src="/cput.png" alt="" class="cputLogo" />
                <img src="/HTGS.png" alt="" class="companyLogo" />
            </div>

        </footer>

    </div>

</template>



<script>
export default {
    data() {
        return {
            currentPage: 'Home'
        }
    }
}

</script>

<style scoped>
html,
body {
    height: 100%;
    margin: 0;
}


.home-page {
    position: fixed;
    top: 0;
    left: 0;
    width: 100vw;
    height: 100vh;
    background-color: #319AC4;
    z-index: 0;
}


.head {
    display: flex;
    padding: 15px 30px;
    align-items: center;
    justify-content: space-between;
    position: relative;
    top: 0;
    left: 0;
    width: 100%;
    height: 130px;
    background: linear-gradient(to bottom, black, transparent);
    z-index: 1000;
    box-sizing: border-box;
    gap: 50px;
    color: white;
}

body {
    display: flex;
    flex-direction: column;
}

.body-structure {
    justify-content: center;
    align-content: normal;
    flex: 1;
}

main {
    flex: 1;
}

.book-cover {
    position: relative;
    display: flex;
    flex-direction: column;
    width: 220px;
    height: 65px;
    text-align: center;
    justify-content: center;
    border-radius: 50px;
    margin-left: 75%;
    margin-top: -7%;
    background-color: white;
    color: rgb(43, 43, 43);
    z-index: 1000;
    flex: 1;
}

.book-button {
    font-family: 'Caprasimo', sans-serif;
    font-size: 25px;
    font-weight: bold;
    background: linear-gradient(45deg, #319AC4, #000000);
    -webkit-background-clip: text;
    -webkit-text-fill-color: transparent;
    background-clip: text;
}

.book-cover:hover {
    background-color: rgb(194, 194, 194);
    transform: translateY(-5px);
    transition: ease-in-out 0.4s;
    cursor: pointer;
    color: white 4s ease;
}

.background-image {
    display: flex;
    flex-direction: column;
    width: 100%;
    height: 500px;
    justify-content: center;
    margin-left: 0%;
    background: linear-gradient(to right, black, transparent);
}

.home-slogan {
    position: absolute;
    top: 50%;
    left: 20%;
    transform: translate(-50%, -50%);
    font-family: 'Caprasimo', sans-serif;
    font-size: 40px;
    color: white;
    text-shadow: 2px 2px 5px rgba(0, 0, 0, 0.7);
    z-index: 2;
}

.image-gradient::after {
    content: "";
    position: absolute;
    inset: 0;
    background: linear-gradient(90deg, rgba(0, 0, 0, 0.536), transparent);
    pointer-events: none;
}

.right-links {
    display: flex;
    gap: 80px;
    z-index: 100;
}

.link {
    text-decoration: none;
    color: white;
}

.link:hover {
    cursor: pointer;
    transform: scale(1.26);
    transform-origin: center;
    text-decoration: none;
    background-color: transparent;
}

.help {
    text-decoration: none;
    color: white;
}

.left-links {
    display: flex;
    gap: 80px;
}


.menu {
    position: relative;
    display: inline-block;
}

.profile {
    position: relative;
    display: inline-block;
}

.menu-cover {
    width: 50px;
    height: 50px;
    border-radius: 50px;
    margin-left: 50px;
}

.profile-cover {
    width: 50px;
    height: 50px;
    border-radius: 50px;
    margin-right: 110px;
}

.main-logo {
    width: 400px;
    height: 90px;
}

.menu-button {
    position: absolute;
    width: 35px;
    height: 35px;
    margin-left: -42px;
    margin-top: 7px;
}

.profile-button {
    position: absolute;
    width: 35px;
    height: 35px;
    margin-top: 7px;
    margin-left: -155px;
}

.menu-cover:hover {
    width: 100px;
    transition: ease-in-out 0.4s;
    cursor: pointer;
}

.profile-cover:hover {
    cursor: pointer;
}



/*--------Footer Css------*/

.foot {
    position: absolute;
    bottom: 0;
    left: 0;
    width: 100%;
    height: 100px;
    background: linear-gradient(to top, white, transparent);
    text-align: center;
    padding: 20px;
}



.cputLogo {
    width: 160px;
    height: 80px;
}

.companyLogo {
    width: 140px;
    height: 60px;
}

.logos {
    display: flex;
    gap: 77%;
}

.schedules:hover {
    cursor: pointer;
    background-color: none;
}

.about:hover {
    cursor: pointer;
}
</style>