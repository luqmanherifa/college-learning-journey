<?php

$penghasilan = 9000000; //penghasilan perbulan adalah 9.000.000
$zakat = 0.025; //zakat yang harus dibayar adalah 2,5% dari penghasilan
$hasil = $penghasilan*$zakat; //proses menghitung penghasilan dikurangi zakat

echo "Penghasilan perbulan         : Rp. ".$penghasilan."<br>";
echo "Aturan zakat                 : 2,5% dari gaji.<br>";
echo "Zakat yang harus dikeluarkan : ".$penghasilan." - 2,5% = ".$hasil;

?>