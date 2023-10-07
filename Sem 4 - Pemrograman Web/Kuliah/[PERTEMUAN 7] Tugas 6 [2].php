<?php

$gaji_pokok = 1600000;
$bonus_10 = 0.10;
$bonus_15 = 0.15;
$menikah = true;
$anak = 3;
$hasil_anak1 = $gaji_pokok*$bonus_10;
$hasil_anak3 = $gaji_pokok*$bonus_15;


if($menikah+$anak<3) {
	echo "Anda mendapat tunjangan sebesar Rp.".$hasil_anak1."<br>";
} elseif($anak>3) {
	echo "Anda mendapat tunjangan sebesar Rp.".$hasil_anak3."<br>";
} else {
	echo "Anda tidak mendapat tunjangan.<br>";
}

?>