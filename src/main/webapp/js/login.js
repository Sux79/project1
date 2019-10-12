$(function () {
});

function reloadVerificationCode() {
    var d = Math.random() * (9999 - 1000) + 1000;
    document.getElementById("safecode").src = "/VerificationCode?verifyCorrectCode=" + d;
}