;$(document).ready(function(){
	$.each($('a[data-controller]'), function(index, el){
		var active = $('#active').val();
		var value = $(el).data('controller');
		
		console.log('active', active);
		console.log('value', value);
		
		if (active === value){
			$(el).parent().addClass('active');
		}
	});
});