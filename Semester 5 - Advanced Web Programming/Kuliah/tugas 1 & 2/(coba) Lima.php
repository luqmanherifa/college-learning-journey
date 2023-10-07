<!DOCTYPE html>
<html>
	<head>
		<title>Program Menghitung Nilai Akhir</title>
	</head>
<body>
<form method="post">

		Tugas: <br>
			<input type="text" name="tugas"><br><br>
		UTS: <br>
			<input type="text" name="uts"><br><br>
		UAS: <br>
			<input type="text" name="uas"><br><br>
		
		<input type="submit" name="tombol" value="PROSES">

</form>

<?php
		
		if(isset($_POST['tombol'])){
		$tugas = $_POST['tugas'];
		$uts = $_POST['uts'];
		$uas = $_POST['uas'];

		$nilai = ($tugas*30/100 + $uts*30/100 + $uas*40/100);

		if($nilai <= 100) {$grade = "A";}
		if($nilai < 80)   {$grade = "B";}
		if($nilai < 50)   {$grade = "C";}

		$kelulusan = "SELAMAT ANDA LULUS!";
		if($grade == "C" || $grade == "D") {$kelulusan = "MAAF ANDA TIDAK LULUS";}

		echo "Tugas\t: $tugas<br>";
		echo "UTS\t: $uts<br>";
		echo "UAS\t: $uas<br>-----<br>";
		
		echo "Nilai Akhir: $nilai<br>";
		echo "Grade: $grade<br>";
		echo "Status: $kelulusan";
		
?>
</body>
</html>