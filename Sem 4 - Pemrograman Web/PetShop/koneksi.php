<?php
/**
 * Menggunakan mysqli_connect untuk menghubungkan php dengan mysql
 */
/**
$dbHost = 'localhost';
$dbName = 'petshop';
$dbUsername = 'root@localhost';
$dbPassword = '';
 */
$conn = mysqli_connect("localhost", "root", "", "petshop"); 

// mengecek koneksi
if (!$conn) {
    die("Gagal terhubung dengan MySQL:");
}
?>