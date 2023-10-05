<?php
	if(isset($_POST['tombol'])){
		$tugas = $_POST['tugas'];
		$uts = $_POST['uts'];
		$uas = $_POST['uas'];

		$nilai = ($tugas*30/100 + $uts*30/100 + $uas*40/100);

		if($nilai <= 100) {$grade = "A";}
		if($nilai < 80)   {$grade = "B";}
		if($nilai < 50)   {$grade = "C";}

		$kelulusan = "<b>SELAMAT ANDA LULUS!</b>";
		if($grade == "C" || $grade == "D") {$kelulusan = "<b>MAAF ANDA TIDAK LULUS.</b>";}

		echo "Tugas: $tugas<br>";
		echo "UTS: $uts<br>";
		echo "UAS: $uas<br>";

		echo "Nilai Akhir: $nilai (<b>$grade</b>)<br>";
		echo "Status: $kelulusan<br>";
	}
?>