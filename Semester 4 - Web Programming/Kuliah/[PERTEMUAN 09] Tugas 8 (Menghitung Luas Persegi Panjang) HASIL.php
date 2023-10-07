<?php
	if(isset($_POST['tombol'])){
		$panjang = $_POST['panjang'];
		$lebar = $_POST['lebar'];

		$luas = $panjang*$lebar;

		echo "Jika sebuah persegi panjang memiliki panjang $panjang dan lebar $lebar,<br>Maka persegi panjang tersebut memiliki luas $luas";
	}
?>