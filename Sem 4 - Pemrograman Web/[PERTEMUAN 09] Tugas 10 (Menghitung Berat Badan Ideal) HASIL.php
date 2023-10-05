<?php
	if(isset($_POST['tombol'])){
		$tinggi = $_POST['tinggi'];
		$berat_normal = $tinggi-100;
		$berat_ideal = $berat_normal-(0.1*$berat_normal);

		echo "Tinggi Badan Anda adalah $tinggi<br>";
		echo "dan Berat Badan Ideal Anda adalah $berat_ideal.";
	}
?>