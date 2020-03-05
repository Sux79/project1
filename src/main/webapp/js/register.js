var register ={
    in:function () {
        // init();
    }
};
(function () {
    register.load();
}(window));


function registerBtn(){
    var parm = {"id":'1',"sex":'nan'};
        aj.async("/loginAndRegister/login",parm,function (reply) {
            if (reply){
                alert(reply.code);
            }
    });
}

function reloadVerificationCode() {
    var d = Math.random() * (9999 - 1000) + 1000;
    document.getElementById("safecode").src = "/VerificationCode?verifyCorrectCode=" + d;00
}
