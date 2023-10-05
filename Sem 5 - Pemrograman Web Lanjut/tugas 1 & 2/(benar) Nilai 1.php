<?php
defined('BASEPATH') OR exit('No direct script access allowed');

class Welcome extends CI_Controller {

	public function index()
		{
			echo "Hello I'm Luqman!";
		}

	public function nilaikuliah($tugas, $uts, $uas)
		{
			$nilai = ($tugas*30/100 + $uts*30/100 + $uas*40/100);

			if($nilai <= 100) {$grade = "A";}
			if($nilai < 80)   {$grade = "B";}
			if($nilai < 68)   {$grade = "C";}
			if($nilai < 56)   {$grade = "D";}
			if($nilai < 45)   {$grade = "E";}

			$kelulusan = "SELAMAT ANDA LULUS!";
			if($grade == "D" || $grade == "E") {$kelulusan = "MAAF ANDA TIDAK LULUS";}

			echo "Tugas: $tugas<br>";
			echo "UTS: $uts<br>";
			echo "UAS: $uas<br><br>";
		
			echo "Nilai Akhir: $nilai ($grade)<br>";
			echo "Status: <b>$kelulusan</b>";
		}
}