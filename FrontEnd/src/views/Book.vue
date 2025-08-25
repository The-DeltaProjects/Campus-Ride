<template>

    <link href="https://fonts.googleapis.com/css2?family=Kavoon&display=swap" rel="stylesheet">
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Katibeh&display=swap" rel="stylesheet">

    <div class="booking-page">

        <div class="navigation-pane">

            <div class="nav-icons">
                <div class="nav">
                    <img src="/home.png" alt="" class="icon">
                </div>
                <div class="nav">
                    <img src="/dashboard.png" alt="" class="icon">
                </div>
                <div class="nav">
                    <img src="/schedule.png" alt="" class="icon">
                </div>
                <div class="nav">
                    <img src="/info.png" alt="" class="icon">
                </div>
                <div class="nav">
                    <img src="/help.png" alt="" class="icon">
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
                <label for="name">Name</label>
                <input type="text" id="name" class="inputs"></input>
                <label for="surname" class="labels">Surname</label>
                <input type="text" id="surname" class="inputs"></input>
                <label for="student-number" class="labels">Student number</label>
                <input type="text" id="student-number" class="inputs"></input>
                <label for="departure" class="labels">Departure</label>
                <input type="text" id="departure" class="inputs"></input>
                <label for="destination" class="labels">Destination</label>
                <input type="text" id="destination" class="inputs">
                <label for="time" class="labels">Time</label>
                <input type="time" id="time" class="time-input">

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
    height: 70%;
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
    text-align: left;
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
    display: inline-flex;
    flex-direction: column;
    position: absolute;
    width: 65%;
    height: 75%;
    border: 1.55px solid white;
    border-radius: 20px;
    top: 20%;
    left: 30%;

    color: white;

}

.inputs {
    display: flex;
    position: static;
    justify-content: center;
    flex-direction: column;
    width: 300px;
    height: 30px;
    left: 30%;
    gap: 50px;
    border-radius: 40px;
    border: none;

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
</style>
