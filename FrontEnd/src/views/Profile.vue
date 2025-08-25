<template>
    <div class="profile-page">

        <link href="https://fonts.googleapis.com/css2?family=Kavoon&display=swap" rel="stylesheet">
        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        <link href="https://fonts.googleapis.com/css2?family=Katibeh&display=swap" rel="stylesheet">



        <div class="leftPanel">
            <h2 class="profile-heading">Profile</h2>

            <div class="navigation">
                <div class="icon-elements">
                    <img src="/new-moon.png" alt="" class="cover">
                    <img src="/home.png" alt="" class="icon">
                    <router-link to="/" class="label">Home</router-link>
                </div>

                <div class="icon-elements">
                    <img src="/new-moon.png" alt="" class="cover">
                    <img src="/dashboard.png" alt="" class="icon">
                    <router-link to="/dashboard" class="label">Dashboard</router-link>
                </div>

                <div class="icon-elements">
                    <img src="/new-moon.png" alt="" class="cover">
                    <img src="/schedule.png" alt="" class="icon">
                    <router-link to="/schedule" class="label">Schedule</router-link>
                </div>

                <div class="icon-elements">
                    <img src="/new-moon.png" alt="" class="cover">
                    <img src="/info.png" alt="" class="icon">
                    <router-link to="/info" class="label">Info</router-link>
                </div>

                <div class="icon-elements">
                    <img src="/new-moon.png" alt="" class="cover">
                    <img src="/help.png" alt="" class="icon">
                    <router-link to="/help" class="label">Help</router-link>
                </div>

                <div class="icon-elements">
                    <img src="/line.png" alt="" class="line">
                </div>

                <div class="icon-elements">
                    <img src="/exit.png" alt="" class="exit-icon">
                    <h1 class="exit-label">Log Out</h1>
                </div>
            </div>
        </div>


        <div class="search-elements">
            <h2 class="search">Search </h2>
            <input type="text" value="" class="search-bar">
        </div>

        <div class="right-elements">
            <img src="/bell.png" alt="" class="notification"></img>
        </div>

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
    height: 100vh;
    width: 100%;
}

.search-elements {
    display: inline-flex;
    position: absolute;
    left: 25%;
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
    height: 30px;
    border-radius: 50px;
    width: 300px;
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
    position: fixed;
    top: 0;
    left: 0;
    width: 100vw;
    height: 100vh;
    background-color: #C8C8C8;
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

.leftPanel {
    position: fixed;
    top: 0;
    left: 0;
    width: 270px;
    height: 100vh;
    background: linear-gradient(to right, black, #319AC4);
    padding-top: 80px;
    text-align: center;
    z-index: 1;
    border-top-right-radius: 25px;
    border-bottom-right-radius: 25px;
    box-shadow: inset;
}

.profile-heading {
    font-family: "Kavoon", system-ui, -apple-system, "Segoe UI", Roboto, Arial, sans-serif;
    font-size: 40px;
    color: white;
    margin-bottom: 40px;

}

.navigation {
    display: flex;
    flex-direction: column;
    gap: 50px;
    align-items: flex-start;
    padding-left: 40px;
}

.icon-elements {
    display: flex;
    align-items: center;
    gap: 30px;
    position: relative;
}

.cover {
    width: 70px;
    height: 70px;
    position: absolute;
    left: -10px;
    z-index: 0;
}

.icon {
    width: 30px;
    height: 30px;
    z-index: 1;
    margin-left: 10px;
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