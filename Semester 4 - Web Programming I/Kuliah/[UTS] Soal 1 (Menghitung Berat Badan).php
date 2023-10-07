<?php

$berat_badan = 50;

echo "Berat badan saya 50kg.<br>";

if($berat_badan>100){
	echo "Anda kelebihan berat badan!";
} elseif($berat_badan<30){
	echo "Anda mengalami gizi buruk!";
} else {
	echo "Berat badan Anda cukup.";
}

?>