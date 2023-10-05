<!DOCTYPE html>
<html>
	<head>
		<title>Pertemuan 8</title>
	</head>

<body>
	<br>
	<table border="1" align="center">
		<tr>
			<th style="background-color:Black;color:White;">Jumlah</th>
			<th style="background-color:Black;color:White;">Harga Permen</th>
		</tr>

<?php
	$harga=500;
		for ($jumlah=1; $jumlah<=25; $jumlah=$jumlah+3) {
		$permen = $harga*$jumlah;
		echo "<tr><td>$jumlah</td><td>$permen</td></tr>";
	}
?>

	</table>
</body>
</html>