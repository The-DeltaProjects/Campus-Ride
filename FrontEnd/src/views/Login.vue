<template>
    <div class="main-frame">

        <div class="signup-form">

        </div>

        <div class="login-form">

            <div class="content">

                <img src="/login-display.png" alt="" class="form-image">

                <div class="icons">
                    <img src="/user-white.png" alt="" class="user-icon">
                    <img src="/lock-white.png" alt="" class="lock-icon">
                </div>

                <button class="Log-in">Log In</button>
            </div>


        </div>

        <div class="display-images">
            <img src="/display-image.jpg" alt="" class="display-image">
            <img src="/display-image2.jpg" alt="" class="display-image2">
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

.display-images {
    display: flex;
    position: absolute;
    background-color: rgba(255, 255, 255, 0.393);
    top: 0%;
    left: 55%;
    border-radius: 40px;
    width: 45%;
    height: 99%;
}

.display-image {
    display: flex;
    flex-direction: row;
    position: absolute;
    width: 57%;
    height: 30.4vw;
    top: 5%;
    left: 38%;
    border-radius: 40px;
}

.display-image2 {
    display: flex;
    flex-direction: row;
    position: absolute;
    width: 40%;
    height: 26.4vw;
    top: 35%;
    left: 10%;
    border-radius: 40px;
}

.login-form {
    display: flex;
    flex-direction: column;
    position: absolute;
    width: 60%;
    height: 47.3vw;
    background-color: transparent;
    left: 0;
    top: 0;
}

.content {
    display: flex;
    flex-direction: column;
    position: absolute;
    border: solid white 1.7px;
    border-radius: 40px;
    justify-content: center;
    width: 70%;
    height: 70%;
    left: 10%;
    top: 20%
}

.form-image {
    display: flex;
    flex-direction: column;
    position: absolute;
    top: 10%;
    left: 45%;
    width: 100px;
    height: 100px;
}

.user-icon {
    display: flex;
    position: absolute;
    top: 40%;
    left: 10%;
    gap: 20px;
    width: 40px;
    height: 40px;
}

.lock-icon {
    display: flex;
    position: absolute;
    top: 60%;
    left: 10%;
    gap: 20px;
    width: 40px;
    height: 40px;
}

.Log-in {
    font-family: sans-serif;
    position: absolute;
    top: 80%;
    left: 40%;
    width: 150px;
    height: 50px;
    border-radius: 50px;
    border: none;
    text-align: center;
    background-color: #3398C0;
    color: white;
}
</style>