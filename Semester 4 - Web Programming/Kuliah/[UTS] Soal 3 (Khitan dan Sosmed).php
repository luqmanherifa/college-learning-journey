<?php

$laki_laki = true;
$perempuan = false;
$umur = 15;


if($laki_laki==true) {
	echo "Kamu anak laki-laki dan harus dikhitan.<br>";

	if($umur>13) {
		echo "Kamu boleh memiliki akun sosial media.<br><br>";
	}
}

if($perempuan==true) {
	echo "Kamu anak perempuan dan tidak harus dikhitan.<br>";

	if($umur>13) {
		echo "Kamu boleh memiliki akun sosial media.<br>";
	}
}

?>