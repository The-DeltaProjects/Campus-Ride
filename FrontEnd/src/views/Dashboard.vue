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
                    <img src="/line.png" alt="" class="line">
                </div>

                <div class="icon-elements">
                    <img src="/exit.png" alt="" class="exit-icon">
                    <h1 class="exit-label">Log Out</h1>
                </div>
            </div>
        </div>
    </div>

    <div class="left-elements">
        <img src="/filter.png" alt="" class="filter"></img>
        <h2 class="sort-by">Sort-by</h2>
    </div>

    <div class="search-elements">
        <h2 class="search">Search </h2>
        <input type="text" value="" class="search-bar">
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
    display: flex;
    top: 10%;
    text-align: center;
    justify-content: center;
    width: 270px;
    height: 80px;
    margin-left: 50%;
    z-index: 999;
}

.search-elements {
    display: inline-flex;
    position: absolute;
    left: 80%;
    top: 10%;
    z-index: 2;
    gap: 20px;
    justify-content: center;
    align-items: center;
}

.search {
    font-family: "Katibeh", serif;
    font-size: 25px;
    z-index: 2;
    color: rgb(255, 255, 255);
    align-items: normal;
}

.search-bar {
    height: 30px;
    border-radius: 50px;
    width: 200px;
}

.left-elements {
    display: inline-flex;
    position: absolute;
    top: 13%;
    left: 23%;
    gap: 10%;
    width: 150px;
    justify-content: center;
    align-items: center;
    color: white;
}

.filter {
    display: flex;
    width: 30px;
    height: 30px;
}

.sort-by {
    font-family: serif;
    display: flex;
    font-size: 20px;

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

.line {
    z-index: 1;
    width: 250px;
    height: 8px;
    margin-top: 20px;
}

.exit-icon {
    width: 30px;
    height: 30px;
    z-index: 1;
    margin-top: -20px;
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
    margin-top: -20px;
}

.label:hover {
    cursor: pointer;
    transform: scale(1.26);
    transform-origin: left center;
    text-decoration: none;
    background-color: transparent;
}
</style>
