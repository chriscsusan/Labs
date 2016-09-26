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
			total += parseFloat(cart[i].price);
		}
		console.log("Total cost: " + parseFloat(Math.round(total * 100) / 100).toFixed(2));
	});

});