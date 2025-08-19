<template>
    <link href="https://fonts.googleapis.com/css2?family=Kavoon&display=swap" rel="stylesheet">

    <img src="/campus-logo.png" alt="" class="logo"></img>

    <div class="leftPanel">
        <h2 class="dash">Dashboard</h2>
        <div class="navigation">
            <div class="icon-covers">
                <img src="/new-moon.png" alt="" class="cover1"></img>
                <img src="/new-moon.png" alt="" class="cover1"></img>
                <img src="/new-moon.png" alt="" class="cover1"></img>
                <img src="/new-moon.png" alt="" class="cover1"></img>
                <img src="/new-moon.png" alt="" class="cover1"></img>
            </div>
            <div class="dash-icons">
                <img src="/home.png" alt="" class="homeIcon"></img>
                <img src="/profile-logo.png" alt="" class="profileIcon"></img>
                <img src="/schedule.png" alt="" class="scheduleIcon"></img>
                <img src="/info.png" alt="" class="aboutIcon"></img>
                <img src="/help.png" alt="" class="helpIcon"></img>
            </div>
        </div>
    </div>


</template>

<script>
export default {
    name: 'Dashboard'
}
</script>

<style>
html,
body {
    text-align: center;
    height: 100%;
    background-color: #BABABA;
}

.logo {
    position: absolute;
    top: 20px;
    left: 56%;
    transform: translateX(-50%);
    width: 400px;
    height: 90px;
}

.leftPanel {
    position: fixed;
    top: 0px;
    left: 0;
    width: 350px;
    height: 950px;
    display: flex;
    justify-content: center;
    text-align: center;
    background: linear-gradient(to right, black, #319AC4);
}

.dash {
    font-family: "Kavoon", system-ui, -apple-system, "Segoe UI", Roboto, Arial, sans-serif;
    font-size: 40px;
    margin-top: 130px;
}

.dash-icons {
    display: grid;
    gap: 102px;
    margin-top: -625px;
    margin-left: -220px;
    z-index: 1000;
}

.icon-covers {
    display: grid;
    gap: 60px;
    margin-top: 250px;
    margin-left: -240px;
}

.cover1 {
    width: 80px;
    height: 80px;
}

.homeIcon {
    width: 40px;
    height: 40px;
    margin-top: 2px;
}

.profileIcon {
    width: 40px;
    height: 40px;

}

.scheduleIcon {
    width: 40px;
    height: 40px;
}

.aboutIcon {
    width: 40px;
    height: 40px;
    margin-top: -3px;
}

.helpIcon {
    width: 40px;
    height: 40px;
    margin-top: -3px;
}
</style>