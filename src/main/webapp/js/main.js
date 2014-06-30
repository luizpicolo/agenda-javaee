$(document).ready(function(){
	var header = $('#header');
	var header_nav = $('#header-nav');

	header_nav.click(function(){
		if(header.hasClass('header-active')){
			header.removeClass('header-active');
			header_nav.removeClass('header-nav-active');
		} else {
			header.addClass('header-active');
			header_nav.addClass('header-nav-active');
		}
	});
});