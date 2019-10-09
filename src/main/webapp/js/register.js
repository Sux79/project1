var register ={
    in:function () {
        init();
    }
};
$(function () {
    register.in();
});
function init(){
    var parm = {"id":'1',"sex":'nan'};
        aj.async("/loginAndRegister/login",parm,function (reply) {
        alert(reply)
    })
}

function reloadVerificationCode() {
    var d = Math.random() * (9999 - 1000) + 1000;
    document.getElementById("safecode").src = "/VerificationCode?verifyCorrectCode=" + d;
}