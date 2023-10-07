<?php
defined('BASEPATH') OR exit('No direct script access allowed');

class Welcome extends CI_Controller {

	public function index()
		{
			echo "Hello world, it's Hannah. Hannah Baker. It's me, live and in stereo.";
		}

	public function nilaikuliah($tugas, $uts, $uas)
		{
			$total = ($tugas*30/100 + $uts*30/100 + $uas*40/100);
			$nilai = ($total/100)*4;

			if($nilai == 4.0)    {$grade = "A";}
			if($nilai <= 3.99)   {$grade = "B+";}
			if($nilai < 3.49)    {$grade = "B";}
			if($nilai < 3.0)     {$grade = "C+";}
			if($nilai < 2.49)    {$grade = "C";}
			if($nilai < 2.0)     {$grade = "D+";}
			if($nilai <= 1.0)    {$grade = "D";}
			if($nilai == 0.0)    {$grade = "E";}		

			$kelulusan = "<b>EXCELLENT BRO!</b>";
			if($grade == "C+" || $grade == "C") {$kelulusan = "<b>OK GOOD.</b>";}
			if($grade == "D+" || $grade == "D" || $grade == "E") {$kelulusan = "YOU FAILED. SEE YOU NEXT YEAR.";}

			echo "Tugas: $tugas<br>";
			echo "UTS: $uts<br>";
			echo "UAS: $uas<br><br>";

			echo "Total: $total<br>";
			echo "Nilai: $nilai ($grade)<br>";
			echo "Status: $kelulusan";
		}
}