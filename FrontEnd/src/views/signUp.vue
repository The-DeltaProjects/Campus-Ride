<template>
    <div class="main-frame">


        <h2 class="signup-heading">Sign Up</h2>

        <div class="signup-form">

            <div class="content">

                <img src="/signup-display2.png" alt="" class="signup-display">

                <div class="text-inputs">
                    <input type="text" placeholder="First name" class="inputs">
                    <input type="password" placeholder="Second name" class="inputs">
                    <input type="email" placeholder="Enter Email" class="inputs">
                    <input type="password" placeholder="Enter Password" class="inputs">
                </div>

                <div class="icons">
                    <img src="/user-white.png" alt="" class="user-icon">
                    <img src="/lock-white.png" alt="" class="lock-icon">
                    <img src="/email-white.png" alt="" class="email-icon">
                    <img src="/key-white.png" alt="" class="key-icon">
                </div>

                <button class="sign-in">Sign Up</button>


            </div>

            <div class="right-info">



                <div class="text">
                    <h3 class="first-text">Already have an account ? <router-link to='/login' class="signin-link">
                            <p> Sign in</p>
                        </router-link>
                    </h3>
                    <h3 class="second-text">Welcome to Campus Ride,</h3>
                    <h3 class="third-text">Create an account today and enjoy the ride.</h3>
                </div>

                <img src="/signup-image.png" alt="" class="signup-image">

            </div>


        </div>


    </div>

</template>

<script>
export default {
    name: 'signup-Login'
}
</script>

<style scoped>
template,
body {
    width: 100vw;
    height: 100%;
    margin: 0;
}

.main-frame {
    position: absolute;
    top: 0;
    left: 0;
    width: 100vw;
    height: 100vh;
    background: linear-gradient(to top, #8A8B8B, #6CAFCA);
    z-index: 0;

}


.signup-form {
    display: flex;
    flex-direction: column;
    position: absolute;
    width: 60%;
    height: 47.3vw;
    background-color: transparent;
    left: 0;
    top: 0;
}

.sign-up {
    display: flex;
    flex-direction: row;
    position: absolute;
    border: none;
    border-radius: 40px;
    background-color: #3398C0;
    justify-content: center;
    align-items: center;
    width: 140px;
    height: 45px;
    top: 3%;
    right: 5%;
    color: white;
    text-align: center;
    font-size: 15px;
    box-shadow: rgba(47, 47, 47, 0.392) -2px 3px;
}

.signup-display {
    display: flex;
    flex-direction: column;
    position: absolute;
    top: 7%;
    left: 33%;
    width: 260px;
    height: 100px;
}

.sign-ip:hover {
    cursor: pointer;
    transform: translateY(-5px);
    transition: ease .3s;
}

.content {
    display: flex;
    flex-direction: column;
    position: absolute;
    background-color: #a3c7c783;
    border: solid white 1.7px;
    border-radius: 40px;
    justify-content: center;
    width: 70%;
    height: 80%;
    left: 12%;
    top: 18%;
    box-shadow: -6px 7px rgba(47, 47, 47, 0.392);
}

.form-image {
    display: flex;
    flex-direction: column;
    position: absolute;
    top: 3%;
    left: 38%;
    width: 190px;
    height: 170px;
}

.user-icon {
    display: flex;
    position: absolute;
    top: 35%;
    left: 10%;
    gap: 20px;
    width: 40px;
    height: 40px;
}

.lock-icon {
    display: flex;
    position: absolute;
    top: 47%;
    left: 10%;
    gap: 20px;
    width: 40px;
    height: 40px;
}

.email-icon {
    display: flex;
    position: absolute;
    top: 61%;
    left: 10%;
    gap: 20px;
    width: 40px;
    height: 40px;
}


.key-icon {
    display: flex;
    position: absolute;
    top: 74%;
    left: 10%;
    gap: 20px;
    width: 40px;
    height: 40px;
}

.sign-in {
    font-family: sans-serif;
    position: absolute;
    top: 88%;
    left: 40%;
    width: 150px;
    height: 50px;
    border-radius: 50px;
    border: none;
    text-align: center;
    background-color: #3398C0;
    color: white;
    box-shadow: rgba(47, 47, 47, 0.392) -2px 4px;
}

.sign-in:hover {
    cursor: pointer;
    transition: ease .3s;
    transform: translateY(-5px);
}

.signup-heading {
    display: flex;
    flex-direction: row;
    position: absolute;
    top: 2%;
    left: 45%;
    color: white;
    font-family: 'Franklin Gothic Medium', 'Arial Narrow', Arial, sans-serif;
    font-size: 50px;
    font-weight: bold;
}


.text-inputs {
    display: flex;
    flex-direction: column;
    position: absolute;
    gap: 35px;
    left: 25%;
    top: 35%;
}

.inputs {
    width: 400px;
    height: 40px;
    border: none;
    border-radius: 30px;
    box-shadow: rgba(47, 47, 47, 0.392) -2px 4px;
}

::placeholder {
    color: rgb(196, 195, 195);
    position: absolute;
    align-items: center;
    left: 5%;
    font-size: 15px;

}

.forgot-password {
    display: flex;
    flex-direction: row;
    position: absolute;
    font-family: sans-serif;
    font-size: 17px;
    top: 90%;
    left: 35%;
    color: white;

}

.forgot-password p {
    display: flex;
    position: absolute;
    color: rgb(127, 54, 195);
    left: 105%;

}

.right-info {
    display: flex;
    flex-direction: column;
    position: absolute;
    width: 75%;
    height: 90%;
    border-radius: 30px;
    top: 4%;
    right: -55%;
}

.signup-image {
    display: flex;
    position: absolute;
    top: 50%;
    left: 27%;
    justify-content: center;
    align-items: center;
    width: 350px;
    height: 360px;
    border-radius: 20px;
}

.text {
    display: flex;
    flex-direction: column;
    position: absolute;
    top: 14%;
    left: 20%;
    color: white;
    gap: 10px;
}

.first-text {
    display: flex;
    flex-direction: row;
    font-family: sans-serif;
    font-size: 23px;
    margin-left: 13%;

}

.signin-link {
    margin-left: 10px;
    color: #000000;

}

.signin-link:hover {
    cursor: pointer;
    transform: translateY(-2px);
    transition: ease .3s;
    color: #03476b;
    background-color: transparent;
}



.second-text {
    display: flex;
    flex-direction: row;
    font-family: sans-serif;
    font-size: 40px;
    font-weight: bold;
}

.third-text {
    display: flex;
    flex-direction: row;
    font-family: sans-serif;
    font-size: 27px;
    margin-left: -1%;
}
</style>