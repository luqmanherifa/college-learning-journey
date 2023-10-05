<?php

$gaji_pokok = 900000;
$bonus_6 = 0.06;
$potong_3 = 0.03;

$terlambat = true;
$jumlah_terlambat = 9;

$dapat_bonus = 0;
$potong_gaji = 0;

if($terlambat==false) {
	$dapat_bonus = $gaji_pokok*$bonus_6;
}

if($terlambat==true&&$jumlah_terlambat>7) {
	$potong_gaji = $gaji_pokok*$potong_3;
}

echo "Saya memiliki gaji pokok sebesar 900.000<br>";
echo "Saya pernah terlambat sebanyak ".$jumlah_terlambat."x.<br><br>";

echo "Anda memiliki gaji pokok sebesar ".$gaji_pokok."<br>";
echo "Anda akan mendapat bonus jika Anda tidak pernah terlambat sebesar ".$dapat_bonus."<br>";
echo "Gaji Anda akan di potong jika pernah terlambat lebih dari 7x sebesar ".$potong_gaji."<br>";
echo "Total gaji yang akan Anda dapatkan sebesar ".($gaji_pokok+$dapat_bonus-$potong_gaji);

?>