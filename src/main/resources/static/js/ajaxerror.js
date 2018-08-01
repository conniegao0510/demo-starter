$.ajax({
	url: "/err/getAjaxerror",
	type: "POST",
	async: false,
	success: function(data) {
		debugger;
		if(data.status == 200 && data.msg == "OK") {
			alert("success");
		} else {
			alert("exception occured: " + data.msg);
		}
	},
	error: function (response, ajaxOptions, thrownError) {
		debugger;
		alert("system is busy!");
	}
});