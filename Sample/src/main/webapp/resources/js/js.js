
$('#frm input[type="text"]').keydown(function() {
        if (event.keyCode === 13) {
            event.preventDefault();
        }
    });

//$('#age').focusout(function () {
//    var age = $("#age").val();
//    var regexp = RegExp("[a-zA-Z0-9]{8,16}");
//    if(regexp.test(pwd1)===false)
//        $("#pass").html("영문자 혹은 0-9 8자리~16자리");
//    else
//        $("#pass").html("유효한 비밀번호입니다.");
//});
var regexp = RegExp("[0-9]")
var v = $('#age').val(); 
$('#sub').click(function(){
	this.preventDefault()
	if(!regexp.test(v)==false){
		alert('숫자만 입력 가능합니다')
	}else{
		$('#aaa').submit()
	}
})