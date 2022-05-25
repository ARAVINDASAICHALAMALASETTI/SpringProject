let email = document.getElementById('email');
let errorMsg = document.getElementById('error-msg');
let icon = document.getElementById('icon');
let mailRegex = /^[a-zA-Z0-9][\-_\.\+\!\#\$\%\&\'\*\/\=\?\^\`\{\|]{0,1}([a-zA-Z0-9][\-_\.\+\!\#\$\%\&\'\*\/\=\?\^\`\{\|]{0,1})*[a-zA-Z0-9]@[a-zA-Z0-9][-\.]{0,1}([a-zA-Z][-\.]{0,1})*[a-zA-Z0-9]\.[a-zA-Z0-9]{1,}([\.\-]{0,1}[a-zA-Z]){0,}[a-zA-Z0-9]{0,}$/;

function Login(){
    var email = document.getElementById('email').value;
    var Mpin = document.getElementById('pin').value;

    if (email == ""){
        alert('email cannot be empty');
        return ;
    }

    if (Mpin == ""){
        alert('password cannot be empty');
        return false;
    }
}

function checker(){
    icon.style.display="inline-block";
    if(email.value.match(mailRegex)){
        icon.innerHTML = '<i class="fas fa-check-circle"></i>';
        icon.style.color = '#2ecc71';
        errorMsg.style.display = 'none';
        email.style.border = '2px solid #2ecc71';
    }else if(email.value == ""){
        icon.style.display = 'none';
        errorMsg.style.display = 'none';
        email.style.border = '2px solid #d1d3d4';
    }else{
        icon.innerHTML = '<i class="fas fa-check-circle"></i>';
        icon.style.color = '#ff2851';
        errorMsg.style.display = 'block';
        email.style.border = '2px solid #ff2851';
    }
}

let pass = document.getElementById('pin');
let passMsg = document.getElementById('pass-msg');
let icoon = document.getElementById('icoon');
let mailRegexo = /(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{5,}/;

function check(){
    icoon.style.display="inline-block";
    if(pass.value.match(mailRegexo)){
        icoon.innerHTML = '<i class="fas fa-check-circle"></i>';
        icoon.style.color = '#2ecc71';
        passMsg.style.display = 'none';
        pass.style.border = '2px solid #2ecc71';
    }else if(pass.value == ""){
        icoon.style.display = 'none';
        passMsg.style.display = 'none';
        pass.style.border = '2px solid #d1d3d4';
    }else{
        icoon.innerHTML = '<i class="fas fa-check-circle"></i>';
        icoon.style.color = '#ff2851';
        passMsg.style.display = 'block';
        pass.style.border = '2px solid #ff2851';
    }
}
