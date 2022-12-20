alert("best view for laptops and desktops ");

function formValidation(){
    var userName =document.getElementById("username");
    if(userName.value==""){
        document.getElementById("user").innerHTML="*Enter the username";
        userName.style.border="3px solid red";
       return false; 
    }else{
        userName.style.border="";
        document.getElementById("user").innerHTML="";
    }

    var passWord=document.getElementById("password");
    if(passWord.value==""){
        document.getElementById("pas").innerHTML="*Enter the Password";
       passWord.style.border="3px solid red";
        return false; 
    }else if(passWord.value.length<8){
        document.getElementById("pas").innerHTML="*password must be 8 characteristics"
        passWord.style.border="3px solid red";
        return false; 
    }else{
        passWord.style.border="";
        document.getElementById("pas").innerHTML="";
    }

}