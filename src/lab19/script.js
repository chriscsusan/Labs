$(document).ready(function() {

	var cart = [];

	$('.add-button').click(function() {
		
		row = $(this).parent();
		price = row.children(".price").text();
		name = row.children(".name").text();
		cart.push({name, price});
	});

	
	$('.finish-button').click(function() {
		var total=0;
		var tempPrice = 0;
		for (var i = 0; i < cart.length; i++) {
			console.log(cart[i].name + " $" + cart[i].price);
			total += Number(cart[i].price);
		}
		console.log("Total cost: " + parseFloat(Math.round(total * 100) / 100).toFixed(2));
		
		
		var displayTotal = document.createElement('p');
		$(displayTotal).attr('id', 'total');
//		for (var i = 0; i < cart.lenth; i++){
//			$(displayTotal).html("<ul><li>" + cart[i].name + " $" + cart[i].price + "</li></ul>");
//			$("total").append(displayTotal);
//		}
		$(displayTotal).html("Your total is: " + total);
		$("body").append(displayTotal);
		
	});

});