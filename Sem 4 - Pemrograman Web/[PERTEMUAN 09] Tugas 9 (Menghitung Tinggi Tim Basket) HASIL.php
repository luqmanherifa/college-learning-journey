<?php
		if ($_POST['tinggi']>=170&&$_POST['jenisKelamin']=="pria") {
			echo "Anda berpotensi mengikuti club basket<br>dan Anda akan masuk Team Pria.";
		} else if ($_POST['tinggi']>=170&&$_POST['jenisKelamin']=="perempuan") {
			echo "Anda berpotensi mengikuti club basket<br>dan Anda akan masuk Team Perempuan.";
		} else {
			echo "Anda tidak berpotensi mengikuti club basket.";
		}
?>