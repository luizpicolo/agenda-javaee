;$(document).ready(function() {
	var $layout = $('#layout'), 
		$menu = $('#menu'), 
		$menuLink = $('#menuLink');	

	$menuLink.click(function(evt){
		var active = 'active';
		
		evt.preventDefault();		
		
		$layout.toggleClass(active);
        $menu.toggleClass(active);
        $menuLink.toggleClass(active);
        
        console.log('asd');
	});
});