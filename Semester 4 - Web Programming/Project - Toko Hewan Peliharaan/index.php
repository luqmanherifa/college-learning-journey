<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="description" content="">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <!-- The above 4 meta tags *must* come first in the head; any other head content must come *after* these tags -->

    <!-- Title  -->
    <title>LUQFE - PET SHOP | HOME</title>

    <!-- Favicon  -->
    <link rel="icon" href="img/core-img/icon.PNG">

    <!-- Core Style CSS -->
    <link rel="stylesheet" href="css/core-style.css">
    <link rel="stylesheet" href="style.css">

</head>

<body>
    <?php
    session_start();
        if(!isset($_SESSION['Email'])) {
           header('location:Login.php'); 
        } else { 
           $username = $_SESSION['Email']; 
        }

    // Memanggil file koneksi.php
    include 'koneksi.php';
    ?>
    <!-- Search Wrapper Area Start -->
    <div class="search-wrapper section-padding-100">
        <div class="search-close">
            <i class="fa fa-close" aria-hidden="true"></i>
        </div>
        <div class="container">
            <div class="row">
                <div class="col-12">
                    <div class="search-content">
                        <form action="#" method="get">
                            <input type="search" name="search" id="search" placeholder="Type your keyword...">
                            <button type="submit"><img src="img/core-img/search.png" alt=""></button>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- Search Wrapper Area End -->

    <!-- ##### Main Content Wrapper Start ##### -->
    <div class="main-content-wrapper d-flex clearfix">

        <!-- Mobile Nav (max width 767px)-->
        <div class="mobile-nav">
            <!-- Navbar Brand -->
            <div class="amado-navbar-brand">
                <a href="index.php"><img src="img/core-img/logo3.PNG" alt=""></a>
            </div>
            <!-- Navbar Toggler -->
            <div class="amado-navbar-toggler">
                <span></span><span></span><span></span>
            </div>
        </div>

        <!-- Header Area Start -->
        <header class="header-area clearfix">
            <!-- Close Icon -->
            <div class="nav-close">
                <i class="fa fa-close" aria-hidden="true"></i>
            </div>
            <!-- Logo -->
            <div class="logo">
                <a href="index.php"><img src="img/core-img/logo3.PNG" alt=""></a>
            </div>

            <!-- Amado Nav -->
            <nav class="amado-nav">
                <ul>
                    <li class="active"><a href="index.php">Home</a></li>
                    <li><a href="shop-aksesoris.php">Shop</a></li>
                    <li><a href="cart.php">Cart</a></li>
                </ul>
            </nav>
            <br>
            <div class="copywrite">
               Selamat Datang, <?php echo $username;?> 
               <a href="Logout.php"><b>Logout</b></a>
            </div>

            <!-- Button Group -->
            <div class="amado-btn-group mt-30 mb-100">
                <a href="Login.php" class="btn amado-btn mb-15">Login</a>
                <a href="Daftar.php" class="btn amado-btn active">Create Account</a>
            </div>
            
            <!-- Social Button -->
            <div class="social-info d-flex justify-content-between">
                <a href="#"><i class="fa fa-pinterest" aria-hidden="true"></i></a>
                <a href="#"><i class="fa fa-instagram" aria-hidden="true"></i></a>
                <a href="#"><i class="fa fa-facebook" aria-hidden="true"></i></a>
                <a href="#"><i class="fa fa-twitter" aria-hidden="true"></i></a>
            </div>
        </header>
        <!-- Header Area End -->

        <!-- Product Catagories Area Start -->
        <div class="products-catagories-area clearfix">
            <div class="amado-pro-catagory clearfix">

                <!-- Single Catagory -->
                <div class="single-products-catagory clearfix">
                    <a href="shop-aksesoris.php">
                        <img src="img/data-img/AKSESORIS/baju hewan (anjing) - 20.000.png" alt="">
                        <!-- Hover Content -->
                        <div class="hover-content">
                            <div class="line"></div>
                            <?php 
                                // Mengambil semua data dari "petshop"
                                $sql = 'SELECT * FROM data_toko WHERE ID_Barang=1';
                                $query = mysqli_query($conn, $sql);
                                    while ($row = mysqli_fetch_object($query)){
                                        echo '<p> Rp. '.$row->Harga.',-</p>';
                                        echo '<h4>'.$row->Nama_Barang.' ('.$row->Kategori.')</h4>';
                                }
                            ?>
                        </div>
                    </a>
                </div>

                <!-- Single Catagory -->
                <div class="single-products-catagory clearfix">
                    <a href="shop-aksesoris.php">
                        <img src="img/data-img/AKSESORIS/kalung (kucing n anjing) - 5.000.png" alt="">
                        <!-- Hover Content -->
                        <div class="hover-content">
                            <div class="line"></div>
                            <?php 
                                // Mengambil semua data dari "petshop"
                                $sql = 'SELECT * FROM data_toko WHERE ID_Barang=2';
                                $query = mysqli_query($conn, $sql);
                                    while ($row = mysqli_fetch_object($query)){
                                        echo '<p> Rp. '.$row->Harga.',-</p>';
                                        echo '<h4>'.$row->Nama_Barang.' ('.$row->Kategori.')</h4>';
                                }
                            ?>
                        </div>
                    </a>
                </div>

                <!-- Single Catagory -->
                <div class="single-products-catagory clearfix">
                    <a href="shop-aksesoris.php">
                        <img src="img/data-img/AKSESORIS/kandang (kucing) - 50.000.png" alt="">
                        <!-- Hover Content -->
                        <div class="hover-content">
                            <div class="line"></div>
                            <?php 
                                // Mengambil semua data dari "petshop"
                                $sql = 'SELECT * FROM data_toko WHERE ID_Barang=3';
                                $query = mysqli_query($conn, $sql);
                                    while ($row = mysqli_fetch_object($query)){
                                        echo '<p> Rp. '.$row->Harga.',-</p>';
                                        echo '<h4>'.$row->Nama_Barang.' ('.$row->Kategori.')</h4>';
                                }
                            ?>
                        </div>
                    </a>
                </div>

                <!-- Single Catagory -->
                <div class="single-products-catagory clearfix">
                    <a href="shop-makanan.php">
                        <img src="img/data-img/MAKANAN/canibite 20kg (anjing) - 290.000.png" alt="">
                        <!-- Hover Content -->
                        <div class="hover-content">
                            <div class="line"></div>
                            <?php 
                                // Mengambil semua data dari "petshop"
                                $sql = 'SELECT * FROM data_toko WHERE ID_Barang=101';
                                $query = mysqli_query($conn, $sql);
                                    while ($row = mysqli_fetch_object($query)){
                                        echo '<p> Rp. '.$row->Harga.',-</p>';
                                        echo '<h4>'.$row->Nama_Barang.' ('.$row->Kategori.')</h4>';
                                }
                            ?>
                        </div>
                    </a>
                </div>

                <!-- Single Catagory -->
                <div class="single-products-catagory clearfix">
                    <a href="shop-makanan.php">
                        <img src="img/data-img/MAKANAN/pedigree 1.5kg (kucing) - 60.000.png" alt="">
                        <!-- Hover Content -->
                        <div class="hover-content">
                            <div class="line"></div>
                            <?php 
                                // Mengambil semua data dari "petshop"
                                $sql = 'SELECT * FROM data_toko WHERE ID_Barang=102';
                                $query = mysqli_query($conn, $sql);
                                    while ($row = mysqli_fetch_object($query)){
                                        echo '<p> Rp. '.$row->Harga.',-</p>';
                                        echo '<h4>'.$row->Nama_Barang.' ('.$row->Kategori.')</h4>';
                                }
                            ?>
                        </div>
                    </a>
                </div>

                <!-- Single Catagory -->
                <div class="single-products-catagory clearfix">
                    <a href="shop-makanan.php">
                        <img src="img/data-img/MAKANAN/felibite 20kg (kucing) - 415.000.png" alt="">
                        <!-- Hover Content -->
                        <div class="hover-content">
                            <div class="line"></div>
                            <?php 
                                // Mengambil semua data dari "petshop"
                                $sql = 'SELECT * FROM data_toko WHERE ID_Barang=103';
                                $query = mysqli_query($conn, $sql);
                                    while ($row = mysqli_fetch_object($query)){
                                        echo '<p> Rp. '.$row->Harga.',-</p>';
                                        echo '<h4>'.$row->Nama_Barang.' ('.$row->Kategori.')</h4>';
                                }
                            ?>
                        </div>
                    </a>
                </div>

                <!-- Single Catagory -->
                <div class="single-products-catagory clearfix">
                    <a href="shop-obat.php">
                        <img src="img/data-img/OBAT/obat antibiotik kucing - 30.000.png" alt="">
                        <!-- Hover Content -->
                        <div class="hover-content">
                            <div class="line"></div>
                            <?php 
                                // Mengambil semua data dari "petshop"
                                $sql = 'SELECT * FROM data_toko WHERE ID_Barang=201';
                                $query = mysqli_query($conn, $sql);
                                    while ($row = mysqli_fetch_object($query)){
                                        echo '<p> Rp. '.$row->Harga.',-</p>';
                                        echo '<h4>'.$row->Nama_Barang.' ('.$row->Kategori.')</h4>';
                                }
                            ?>
                        </div>
                    </a>
                </div>

                <!-- Single Catagory -->
                <div class="single-products-catagory clearfix">
                    <a href="shop-obat.php">
                        <img src="img/data-img/OBAT/obat flu kucing - 30.000.png" alt="">
                        <!-- Hover Content -->
                        <div class="hover-content">
                            <div class="line"></div>
                            <?php 
                                // Mengambil semua data dari "petshop"
                                $sql = 'SELECT * FROM data_toko WHERE ID_Barang=202';
                                $query = mysqli_query($conn, $sql);
                                    while ($row = mysqli_fetch_object($query)){
                                        echo '<p> Rp. '.$row->Harga.',-</p>';
                                        echo '<h4>'.$row->Nama_Barang.' ('.$row->Kategori.')</h4>';
                                }
                            ?>
                        </div>
                    </a>
                </div>

                <!-- Single Catagory -->
                <div class="single-products-catagory clearfix">
                    <a href="shop-obat.php">
                        <img src="img/data-img/OBAT/obat mata kucing - 30.000.png" alt="">
                        <!-- Hover Content -->
                        <div class="hover-content">
                            <div class="line"></div>
                            <?php 
                                // Mengambil semua data dari "petshop"
                                $sql = 'SELECT * FROM data_toko WHERE ID_Barang=203';
                                $query = mysqli_query($conn, $sql);
                                    while ($row = mysqli_fetch_object($query)){
                                        echo '<p> Rp. '.$row->Harga.',-</p>';
                                        echo '<h4>'.$row->Nama_Barang.' ('.$row->Kategori.')</h4>';
                                }
                            ?>
                        </div>
                    </a>
                </div>
            </div>
        </div>
        <!-- Product Catagories Area End -->
    </div>
    <!-- ##### Main Content Wrapper End ##### -->

    <!-- ##### Footer Area Start ##### -->
    <footer class="footer_area clearfix">
        <div class="container">
            <div class="row align-items-center">
                <!-- Single Widget Area -->
                <div class="col-12 col-lg-4">
                    <div class="single_widget_area">
                        <!-- Logo -->
                        <div class="footer-logo mr-50">
                            <a href="index.php"><img src="img/core-img/logo4.PNG" alt=""></a>
                        </div>
                        <!-- Copywrite Text -->
                        <p class="copywrite"><!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
Copyright &copy;<script>document.write(new Date().getFullYear());</script> All rights reserved | This template is made with <i class="fa fa-heart-o" aria-hidden="true"></i> by <a href="https://colorlib.com" target="_blank">Colorlib</a>
<!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. --></p>
                    </div>
                </div>
                <!-- Single Widget Area -->
                <div class="col-12 col-lg-8">
                    <div class="single_widget_area">
                        <!-- Footer Menu -->
                        <div class="footer_menu">
                            <nav class="navbar navbar-expand-lg justify-content-end">
                                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#footerNavContent" aria-controls="footerNavContent" aria-expanded="false" aria-label="Toggle navigation"><i class="fa fa-bars"></i></button>
                                <div class="collapse navbar-collapse" id="footerNavContent">
                                    <ul class="navbar-nav ml-auto">
                                        <li class="nav-item active">
                                            <a class="nav-link" href="index.php">Home</a>
                                        </li>
                                        <li class="nav-item">
                                            <a class="nav-link" href="shop-aksesoris.php">Shop</a>
                                        </li>
                                        <li class="nav-item">
                                            <a class="nav-link" href="cart.php">Cart</a>
                                        </li>
                                    </ul>
                                </div>
                            </nav>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </footer>
    <!-- ##### Footer Area End ##### -->

    <!-- ##### jQuery (Necessary for All JavaScript Plugins) ##### -->
    <script src="js/jquery/jquery-2.2.4.min.js"></script>
    <!-- Popper js -->
    <script src="js/popper.min.js"></script>
    <!-- Bootstrap js -->
    <script src="js/bootstrap.min.js"></script>
    <!-- Plugins js -->
    <script src="js/plugins.js"></script>
    <!-- Active js -->
    <script src="js/active.js"></script>

</body>

</html>