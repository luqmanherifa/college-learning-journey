<html>
<head>
	<title>Pertemuan 5</title>

	<style type="text/css">

	/* CSS */

		body {
			font-family: Arial, Verdana;
		}

		.container {
			width:600px;
			margin: 0 auto;

			margin-top: 40;
			padding-top: 30px;
		}

		table {
			width: 100%;
			font-size: 15px;
			text-align: center;
			margin-bottom: 50px;	
			box-shadow: 0px 1px 2px #d6d6d6;
			border-spacing: 0px;	
			font-family: Calibri;
		}

		table th {
			background-color: #f3f6f9;
			padding: 15px;
		}

		table tr {
			border: 1px solid #e5e8ed;
		}

		table td {
			padding: 10px;
			text-align: center;
			color: #123;
			border-bottom: 1px solid #e5e8ed;
		}

		table tr:hover {
			background-color: #e5e8ed;
		}

	</style>

</head>
<body>
	<?php 

	$buah = array("Apel","Nanas","Salak","Jambu");
	$harga = 2500;

	?>
	<div class="container">

		<table>
			<tr>
				<th>No</th>
				<th>Nama</th>
				<th>Harga</th>
			</tr>

			<tr>
				<td><?php echo "1" ?></td>
				<td><?php echo $buah[0] ?></td>
				<td><?php echo $harga ?></td>
			</tr>

			<tr>
				<td><?php echo "2" ?></td>
				<td><?php echo $buah[1] ?></td>
				<td><?php echo ($harga*2) ?></td>
			</tr>

			<tr>
				<td><?php echo "3" ?></td>
				<td><?php echo $buah[2] ?></td>
				<td><?php echo ($harga*3) ?></td>
			</tr>

			<tr>
				<td><?php echo "4" ?></td>
				<td><?php echo $buah[3] ?></td>
				<td><?php echo ($harga*4) ?></td>
			</tr>

		</table>

	</div>
</body>
</html>