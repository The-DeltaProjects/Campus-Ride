<template>

    <div class="dashboard-page">

        <link href="https://fonts.googleapis.com/css2?family=Kavoon&display=swap" rel="stylesheet">

        <img src="/campus-logo.png" alt="" class="logo">

        <div class="leftPanel">
            <h2 class="dash">Dashboard</h2>

            <div class="navigation">
                <div class="icon-elements">
                    <img src="/new-moon.png" alt="" class="cover">
                    <img src="/home.png" alt="" class="icon">
                    <router-link to="/" class="label">Home</router-link>
                </div>

                <div class="icon-elements">
                    <img src="/new-moon.png" alt="" class="cover">
                    <img src="/profile-logo.png" alt="" class="icon">
                    <router-link to="/profile" class="label">Profile</router-link>
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
                    <img src="/exit.png" alt="" class="exit-icon">
                    <h1 class="exit-label">Log Out</h1>
                </div>
            </div>
        </div>
    </div>

</template>

<script>
export default {
    name: 'Dashboard'
}
</script>

<style scoped>
.dashboard-page {
    position: fixed;
    top: 0;
    left: 0;
    width: 100vw;
    height: 100vh;
    background-color: #BABABA;
    z-index: 0;
}


.logo {
    text-align: center;
    justify-content: center;
    width: 300px;
    height: 120px;
    margin-left: 100%;
    z-index: 999;
    background-color: black;
}

.leftPanel {
    position: fixed;
    top: 0;
    left: 0;
    width: 350px;
    height: 100vh;
    background: linear-gradient(to right, black, #319AC4);
    padding-top: 80px;
    text-align: center;
}

.dash {
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
    margin-top: 70px;
}

.label {
    color: white;
    font-size: 20px;
    margin-left: 15px;
    z-index: 999;
    display: inline-block;
    transition: transform .2s ease, color .2s ease;
}

.exit-label {
    color: white;
    font-size: 20px;
    margin-left: 15px;
    z-index: 2;
    margin-top: 70px;
}

.label:hover {
    cursor: pointer;
    transform: scale(1.06);
    transform-origin: left center;
    text-decoration: none;
    background-color: none;
}
</style>
