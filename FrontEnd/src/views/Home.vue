<template>
    <div class="page">

        <header class="head">
            <div class="menu">
                <button class="menu-cover"></button>
                <img src="/menu-logo.png" alt="" class="menu-button" />
            </div>

            <div class="left-links">
                <a href="" class="about">About</a>
                <a href="" class="schedules">Schedules</a>
            </div>

            <img src="/campus-logo.png" alt="" class="main-logo" />

            <div class="right-links">
                <router-link to="/dashboard" class="dashboard">Dashboard</router-link>
                <a href="" class="help">Help/Faq</a>
            </div>

            <div class="profile">
                <button class="profile-cover"></button>
                <img src="/profile-logo.png" alt="" class="profile-button" />
            </div>
        </header>

        <main class="body-structure">
            <div class="imagePlacement">
                <img src="/CPUT_0.jpg" alt="" class="busImage" />
            </div>
            <h1 class="firstWords"></h1>
            <button class="bookingPage">Book Now !</button>
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

<style>
html,
body {
    height: 100%;
    background-color: #319AC4;
    margin: 0;
}

.head {
    display: flex;
    padding: 15px 30px;
    align-items: center;
    justify-content: space-between;
    position: absolute;
    top: 0;
    left: 0;
    width: 100%;
    height: 140px;
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
}

main {
    flex: 1;
}

.bookingPage {
    width: 100px;
    height: 50px;
    text-align: center;
}

.imagePlacement {
    display: flex;
    margin-top: 150px;
    width: 100%;
    height: 300px;
    background-color: white;

}

.busImage {
    width: 100%;
    height: auto;
}

.right-links {
    display: flex;
    gap: 80px;
}

.dashboard {
    text-decoration: none;
    color: white;
}

.help {
    text-decoration: none;
    color: white;
}

.left-links {
    display: flex;
    gap: 80px;
}

.about {
    text-decoration: none;
    color: white;
}

.schedules {
    text-decoration: none;
    color: white;
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
    margin-left: -152px;
}

.menu-cover:hover {
    width: 100px;
    transition: ease-in-out 0.4s;
    cursor: pointer;
}

.profile-cover:hover {
    width: 100px;
    transition: ease-in-out 0.3s;
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
    color: white;
    text-align: center;
    padding: 20px;
    z-index: 1000;
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