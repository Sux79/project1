(function () {
    // register.init()
}(window));

var register={
    init:function () {
        aj.async("/login/login",parms,function (reply) {

        })
    }
};

function reloadVerificationCode() {
    var d = Math.random() * (9999 - 1000) + 1000;
    document.getElementById("safecode").src = "/VerificationCode?verifyCorrectCode=" + d;
}