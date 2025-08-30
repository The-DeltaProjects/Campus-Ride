<template>

    <link href="https://fonts.googleapis.com/css2?family=Kavoon&display=swap" rel="stylesheet">
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Katibeh&display=swap" rel="stylesheet">
    <meta charSet="utf-8" />
    <meta httpEquiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />

    <div class="booking-page">

        <div class="navigation-pane">

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



        </div>

        <img src="/campus-logo.png" alt="" class="main-logo">



        <h2 class="booking-label">
            Booking
        </h2>

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

        <div class="main-container">

            <img src="/filter(2).png" alt="" class="filter-white">
            <h2 class="sort-by">sort-by</h2>

            <input type="text" placeholder="Search" id="" class="search">

            <img src="/profile-logo.png" alt="" class="profile-logo"></img>
            <img src="/new-moon.png" alt="" class="profile-cover"></img>

            <div class="top-container">

            </div>

            <div class="bottom-container">
            </div>

            <div class="right-container">
                <h2 class="booking-form">Booking form</h2>
                <div class="labels">
                    <h2>Name</h2>
                    <h2>Surname</h2>
                    <h2>Student Number</h2>
                    <h2>Departure</h2>
                    <h2>Destination</h2>
                    <h2>Time</h2>
                </div>

                <div class="text-inputs">
                    <input type="text" class="input">
                    <input type="text" class="input">
                    <input type="text" class="input">
                    <input type="text" class="input">
                    <input type="text" class="input">
                    <input type="time" class="time-input">

                </div>

                <button class="confirm-button">Confirm</button>
            </div>
        </div>



    </div>


</template>

<script>

export default {
    name: 'book'
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

.booking-label {
    display: flex;
    flex-direction: row;
    position: absolute;
    top: 5%;
    left: 2%;
    font-size: 35px;
    font-family: "Kavoon", system-ui, -apple-system, "Segoe UI", Roboto, Arial, sans-serif;
    color: white;
}

.booking-page {
    position: absolute;
    top: 0;
    left: 0;
    width: 100vw;
    height: 100vh;
    background: linear-gradient(to top, #626262, #319AC4);
    z-index: 0;
}

.nav-icons {
    display: flex;
    flex-direction: column;
    justify-content: center;
    gap: 30px;

}

.navigation-pane {
    display: block;
    align-content: center;
    left: 2%;
    top: 20%;
    background-color: #b0b0b089;
    position: absolute;
    width: 70px;
    height: 60%;
    align-items: center;
    border-radius: 50px;
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

.icon:hover {
    background-color: transparent;
    cursor: pointer;
    transform: translateY(-5px);
    transform-origin: center;
}

.covers {
    position: absolute;
    display: flex;
    top: 21.4%;
    left: 2.3%;
    flex-direction: column;
    gap: 25px;
}

.cover {
    top: 15%;
    width: 60px;
    height: 60px;
}

.log-out {
    display: flex;
    position: absolute;
    align-items: center;
    top: 85%;
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

/*----main container elements----*/

.main-container {
    display: flex;
    position: absolute;
    top: 20%;
    left: 10%;
    width: 88%;
    height: 75%;
    border: solid white 1.5px;
    border-radius: 50px;
    background-color: #b0b0b089;
    z-index: 3;
}

.profile-logo {
    display: flex;
    position: absolute;
    width: 35px;
    height: 35px;
    top: 5%;
    left: 94.3%;
    z-index: 5;

}

.profile-cover {
    display: flex;
    position: absolute;
    top: 2%;
    left: 93%;
    width: 70px;
    height: 70px;
}

.filter-white {
    display: flex;
    position: absolute;
    width: 35px;
    height: 35px;
    top: 5%;
    left: 2%;
}

.sort-by {
    display: flex;
    position: absolute;
    font-size: 20px bold;
    font-family: sans-serif;
    color: white;
    top: 5%;
    left: 5%;
}

.search {
    display: flex;
    flex-direction: row;
    position: absolute;
    width: 30%;
    height: 35px;
    top: 6%;
    left: 32%;
    border-radius: 40px;
    text-align: center;
    font-size: 15px;
    color: rgba(184, 184, 184, 0.836);
    border: none;
}

.search ::placeholder {
    color: black;
}

.top-container {
    display: flex;
    flex-direction: column;
    position: absolute;
    width: 25%;
    height: 30%;
    border: 1.55px solid white;
    border-radius: 20px;
    top: 20%;
    left: 2%;

}

.bottom-container {
    display: flex;
    flex-direction: column;
    position: absolute;
    width: 25%;
    height: 40%;
    border: 1.55px solid white;
    border-radius: 20px;
    top: 55%;
    left: 2%;

}

.right-container {
    display: flex;
    flex-direction: column;
    position: absolute;
    width: 65%;
    height: 78%;
    border: 1.55px solid white;
    border-radius: 20px;
    top: 20%;
    left: 30%;
    color: white;

}

.input {
    display: flex;
    flex-direction: column;
    border-radius: 40px;
    border: none;
    width: 300px;
    height: 30px;


}

.text-inputs {
    display: flex;
    flex-direction: column;
    position: absolute;
    gap: 15px;
    top: 18%;
    left: 45%;
}

.time-input {
    display: inline;
    flex-direction: row;
    width: 80px;
    height: 30px;
    border-radius: 20px;
    border: none;
}

.booking-form {
    font-family: sans-serif;
    font-size: 30px;
    text-align: center;
    color: white;
    text-decoration: underline solid 2.5px rgb(255, 255, 255);


}

.confirm-button {
    position: absolute;
    justify-content: center;
    align-items: center;
    border-radius: 50px;
    background-color: #319AC4;
    border: none;
    top: 85%;
    left: 45%;
    width: 110px;
    height: 40px;
    text-align: center;
    color: white;
}

.labels {
    display: flex;
    flex-direction: column;
    margin-left: 80px;
    margin-top: 20px;
    gap: 10px;
    font-size: 16px;


}
</style>
