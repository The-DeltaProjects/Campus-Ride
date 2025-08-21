<template>
    <div class="profile-page">

        <img src="/campus-logo.png" alt="" class="logo">


        <h1 class="profile">Welcome to my profile</h1>

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
    min-height: 100vh;
    width: 100%;
}

.profile-page {
    position: fixed;
    top: 0;
    left: 0;
    width: 100vw;
    height: 100vh;
    background-color: #BABABA;
    z-index: 0;
}

.logo {
    height: 80px;
    width: 200px;
    justify-content: center;
    align-content: center;
}
</style>