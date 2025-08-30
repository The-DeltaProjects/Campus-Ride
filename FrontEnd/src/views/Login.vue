<template>

    <meta charSet="utf-8" />
    <meta httpEquiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />

    <div class="main-frame">

        <router-link to="/signup"><button class="sign-up">Sign Up</button></router-link>

        <div class="signup-form">

        </div>

        <h2 class="login-heading">Log In</h2>

        <div class="login-form">

            <div class="content">

                <img src="/login-display.png" alt="" class="form-image">

                <div class="text-inputs">
                    <input type="text" placeholder="Email" class="inputs" v-model="email">
                    <input type="password" placeholder="Password" class="inputs" v-model="password">
                </div>
                <div class="icons">
                    <img src="/user-white.png" alt="" class="user-icon">
                    <img src="/lock-white.png" alt="" class="lock-icon">
                </div>

                <button class="Log-in" @click="login">Log In</button>

                <h3 class="forgot-password">Forgot your password ? <p>reset</p>
                </h3>
            </div>


        </div>


    </div>

</template>

<script>
export default {
    name: 'signup-Login',
    data() {
        return {
            email: '',
            password: '',
            errorMessage: "",
            role: 'student' // default role; you can add a dropdown for role selection
        };
    },
    methods: {
        async login() {
            if (!this.email || !this.password) {
                alert("Please fill in both email and password");
                return;
            }

            try {
                const response = await fetch('http://localhost:8080/auth/login', {
                    method: 'POST',
                    headers: {
                        'Content-Type': 'application/json',
                        'Accept': 'application/json'
                    },
                    body: JSON.stringify({
                        email: this.email,
                        password: this.password,
                        role: this.role
                    })
                });

                const data = await response.json();

                if (response.ok) {
                    localStorage.setItem('user', JSON.stringify({
                        role: data.role,
                        email: this.email,
                        isAuthenticated: true
                    }));

                    alert('Login successful');
                    this.$router.push({ name: 'Home' });
                } else {
                    alert("Login failed: " + data.message);
                }
            } catch (err) {
                alert("An error occurred: " + err.message);
            }
        }
    }
};
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

.sign-up:hover {
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
    height: 70%;
    left: 45%;
    top: 20%;
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
    top: 75%;
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

.Log-in:hover {
    cursor: pointer;
    transition: ease .3s;
    transform: translateY(-5px);
}

.login-heading {
    display: flex;
    flex-direction: row;
    position: absolute;
    top: 5%;
    left: 45%;
    color: white;
    font-family: 'Franklin Gothic Medium', 'Arial Narrow', Arial, sans-serif;
    font-size: 40px;
}


.text-inputs {
    display: flex;
    flex-direction: column;
    position: absolute;
    gap: 65px;
    left: 25%;
    top: 40%;
}

.inputs {
    text-align: left;
    padding-top: 0px;
    padding-left: 18px;
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
</style>