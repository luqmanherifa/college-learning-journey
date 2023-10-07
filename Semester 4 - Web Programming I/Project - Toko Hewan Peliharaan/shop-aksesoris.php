<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="description" content="">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <!-- The above 4 meta tags *must* come first in the head; any other head content must come *after* these tags -->

    <!-- Title  -->
    <title>LUQFE - PET SHOP | SHOP</title>

    <!-- Favicon  -->
    <link rel="icon" href="img/core-img/icon.PNG">

    <!-- Core Style CSS -->
    <link rel="stylesheet" href="css/core-style.css">
    <link rel="stylesheet" href="style.css">

</head>

<body>
    <?php
    error_reporting();
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
                    <li><a href="index.php">Home</a></li>
                    <li class="active"><a href="shop-aksesoris.php">Shop</a></li>
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
            <!-- Cart Menu -->
            <div class="cart-fav-search mb-100">
                <a href="#" class="search-nav"><img src="img/core-img/search.png" alt=""> Search</a>
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

        <div class="shop_sidebar_area">

            <!-- ##### Single Widget ##### -->
            <div class="widget catagory mb-50">
                <!-- Widget Title -->
                <h6 class="widget-title mb-30">Catagories</h6>

                <!--  Catagories  -->
                <div class="catagories-menu">
                    <ul>
                        <li><a href="shop-aksesoris.php">Accesories</a></li>
                        <li><a href="shop-makanan.php">Makanan</a></li>
                        <li><a href="shop-obat.php">Obat</a></li>
                    </ul>
                </div>
            </div>

            <!-- ##### Single Widget ##### -->
            <div class="widget brands mb-50">
                <!-- Widget Title -->
                <h6 class="widget-title mb-30">Pets</h6>

                <div class="widget-desc">
                    <!-- Single Form Check -->
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" value="" id="anjing">
                        <label class="form-check-label" for="anjing">Anjing</label>
                    </div>
                    <!-- Single Form Check -->
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" value="" id="kucing">
                        <label class="form-check-label" for="kucing">Kucing</label>
                    </div>
                    <!-- Single Form Check -->
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" value="" id="ikan">
                        <label class="form-check-label" for="ikan">Ikan</label>
                    </div>
                </div>
            </div>

            <!-- ##### Single Widget ##### -->
            <div class="widget price mb-50">
                <!-- Widget Title -->
                <h6 class="widget-title mb-30">Price</h6>

                <div class="widget-desc">
                    <div class="slider-range">
                        <div data-min="10000" data-max="500000" data-unit="Rp." class="slider-range-price ui-slider ui-slider-horizontal ui-widget ui-widget-content ui-corner-all" data-value-min="10000" data-value-max="500000" data-label-result="">
                            <div class="ui-slider-range ui-widget-header ui-corner-all"></div>
                            <span class="ui-slider-handle ui-state-default ui-corner-all" tabindex="0"></span>
                            <span class="ui-slider-handle ui-state-default ui-corner-all" tabindex="0"></span>
                        </div>
                        <div class="range-price">Rp.10.000 - Rp.500.000</div>
                    </div>
                </div>
            </div>
        </div>

        <div class="amado_product_area section-padding-100">
            <div class="container-fluid">

                <div class="row">
                    <div class="col-12">
                        <div class="product-topbar d-xl-flex align-items-end justify-content-between">

                            <!-- Total Products -->
                            <div class="total-products">
                                <p>Showing 1-8 0f 25</p>
                                <div class="view d-flex">
                                    <a href="#"><i class="fa fa-th-large" aria-hidden="true"></i></a>
                                    <a href="#"><i class="fa fa-bars" aria-hidden="true"></i></a>
                                </div>
                            </div>

                            <!-- Sorting -->
                            <div class="product-sorting d-flex">
                                <div class="sort-by-date d-flex align-items-center mr-15">
                                    <p>Sort by</p>
                                    <form action="#" method="get">
                                        <select name="select" id="sortBydate">
                                            <option value="value">Date</option>
                                            <option value="value">Newest</option>
                                            <option value="value">Popular</option>
                                        </select>
                                    </form>
                                </div>
                                <div class="view-product d-flex align-items-center">
                                    <p>View</p>
                                    <form action="#" method="get">
                                        <select name="select" id="viewProduct">
                                            <option value="value">12</option>
                                            <option value="value">24</option>
                                            <option value="value">48</option>
                                            <option value="value">96</option>
                                        </select>
                                    </form>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>

                <div class="row">

                    <!-- Single Product Area -->
                    <div class="col-12 col-sm-6 col-md-12 col-xl-6">
                        <div class="single-product-wrapper">
                            <!-- Product Image -->
                            <div class="product-img">
                                <img src="img/data-img/AKSESORIS/baju hewan (anjing) - 20.000.png" alt="">
                                <!-- Hover Thumb -->
                                <!--<img class="hover-img" src="img/product-img/product2.jpg" alt="">-->
                            </div>

                            <!-- Product Description -->
                            <div class="product-description d-flex align-items-center justify-content-between">
                                <!-- Product Meta Data -->
                                <div class="product-meta-data">
                                    <div class="line"></div>
                                    <?php 
                                    // Mengambil semua data dari "petshop"
                                    $sql = 'SELECT * FROM data_toko WHERE ID_Barang=1';
                                    $query = mysqli_query($conn, $sql);
                                        while ($row = mysqli_fetch_object($query)){
                                            echo '<p class="product-price"> Rp. '.$row->Harga.',-</p>';
                                            echo '<a href="cart.php?id=1; ?> &action=add">';
                                            echo '<h6>'.$row->Nama_Barang.' ('.$row->Kategori.')</h6>';
                                            echo '</a>';
                                        }
                                    ?>

                                </div>
                                    <div class="cart">
                                        <a href="cart.php?id=1 &action=add" data-toggle="tooltip" data-placement="left" title="Add to Cart"><img src="img/core-img/cart.png" alt=""></a>
                                    </div>
                            </div>
                        </div>
                    </div>

                    <!-- Single Product Area -->
                    <div class="col-12 col-sm-6 col-md-12 col-xl-6">
                        <div class="single-product-wrapper">
                            <!-- Product Image -->
                            <div class="product-img">
                                <img src="img/data-img/AKSESORIS/kalung (kucing n anjing) - 5.000.png" alt="">
                                <!-- Hover Thumb -->
                                <!--<img class="hover-img" src="img/product-img/product3.jpg" alt="">-->
                            </div>

                            <!-- Product Description -->
                            <div class="product-description d-flex align-items-center justify-content-between">
                                <!-- Product Meta Data -->
                                <div class="product-meta-data">
                                    <div class="line" id="i1"></div>
                                    <?php 
                                    // Mengambil semua data dari "tbsiswa"
                                    $sql = 'SELECT * FROM data_toko WHERE ID_Barang=2';
                                    $query = mysqli_query($conn, $sql);
                                        while ($row = mysqli_fetch_array($query)){
                                            echo '<p class="product-price"> Rp. '.$row['Harga'].',-</p>';
                                            echo '<a href="cart.php?id=2; ?> &action=add">';
                                            echo '<h6>'.$row['Nama_Barang'].' ('.$row['Kategori'].')</h6>';
                                            echo '</a>';
                                        }
                                        
                                    ?>
                                </div>
                                <!-- Ratings & Cart -->
                                <div class="ratings-cart text-right">
                                    <div class="cart">
                                        <a href="cart.php?id=2 &action=add" data-toggle="tooltip" data-placement="left" title="Add to Cart"><img src="img/core-img/cart.png" alt=""></a>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>

                    <!-- Single Product Area -->
                    <div class="col-12 col-sm-6 col-md-12 col-xl-6">
                        <div class="single-product-wrapper">
                            <!-- Product Image -->
                            <div class="product-img">
                                <img src="img/data-img/AKSESORIS/kandang (kucing) - 50.000.png" alt="">
                                <!-- Hover Thumb -->
                                <!--<img class="hover-img" src="img/product-img/product4.jpg" alt="">-->
                            </div>

                            <!-- Product Description -->
                            <div class="product-description d-flex align-items-center justify-content-between">
                                <!-- Product Meta Data -->
                                <div class="product-meta-data">
                                    <div class="line" id="i1"></div>
                                    <?php 
                                    // Mengambil semua data dari "tbsiswa"
                                    $sql = 'SELECT * FROM data_toko WHERE ID_Barang=3';
                                    $query = mysqli_query($conn, $sql);
                                        while ($row = mysqli_fetch_array($query)){
                                            echo '<p class="product-price"> Rp. '.$row['Harga'].',-</p>';
                                            echo '<a href="cart.php?id=3; ?> &action=add">';
                                            echo '<h6>'.$row['Nama_Barang'].' ('.$row['Kategori'].')</h6>';
                                            echo '</a>';
                                        }
                                    ?>
                                </div>
                                <!-- Ratings & Cart -->
                                <div class="ratings-cart text-right">
                                    <div class="cart">
                                        <a href="cart.php?id=3 &action=add" data-toggle="tooltip" data-placement="left" title="Add to Cart"><img src="img/core-img/cart.png" alt=""></a>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>

                    <!-- Single Product Area -->
                    <div class="col-12 col-sm-6 col-md-12 col-xl-6">
                        <div class="single-product-wrapper">
                            <!-- Product Image -->
                            <div class="product-img">
                                <img src="img/data-img/AKSESORIS/tempat makan (kucing n anjing) - 56.000.png" alt="">
                                <!-- Hover Thumb -->
                                <!--<img class="hover-img" src="img/product-img/product5.jpg" alt="">-->
                            </div>

                            <!-- Product Description -->
                            <div class="product-description d-flex align-items-center justify-content-between">
                                <!-- Product Meta Data -->
                                <div class="product-meta-data">
                                    <div class="line" id="i1"></div>
                                    <?php 
                                    // Mengambil semua data dari "tbsiswa"
                                    $sql = 'SELECT * FROM data_toko WHERE ID_Barang=4';
                                    $query = mysqli_query($conn, $sql);
                                        while ($row = mysqli_fetch_array($query)){
                                            echo '<p class="product-price"> Rp. '.$row['Harga'].',-</p>';
                                            echo '<a href="cart.php?id=4; ?> &action=add">';
                                            echo '<h6>'.$row['Nama_Barang'].' ('.$row['Kategori'].')</h6>';
                                            echo '</a>';
                                        }
                                    ?>
                                </div>
                                <!-- Ratings & Cart -->
                                <div class="ratings-cart text-right">
                                    <div class="cart">
                                        <a href="cart.php?id=4 &action=add" data-toggle="tooltip" data-placement="left" title="Add to Cart"><img src="img/core-img/cart.png" alt=""></a>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>

                    <!-- Single Product Area -->
                    <div class="col-12 col-sm-6 col-md-12 col-xl-6">
                        <div class="single-product-wrapper">
                            <!-- Product Image -->
                            <div class="product-img">
                                <img src="img/data-img/AKSESORIS/tempat tidur (kucing n anjing) - 60.000.png" alt="">
                                <!-- Hover Thumb -->
                                <!--<img class="hover-img" src="img/product-img/product6.jpg" alt="">-->
                            </div>

                            <!-- Product Description -->
                            <div class="product-description d-flex align-items-center justify-content-between">
                                <!-- Product Meta Data -->
                                <div class="product-meta-data">
                                    <div class="line" id="i1"></div>
                                    <?php 
                                    // Mengambil semua data dari "tbsiswa"
                                    $sql = 'SELECT * FROM data_toko WHERE ID_Barang=5';
                                    $query = mysqli_query($conn, $sql);
                                        while ($row = mysqli_fetch_array($query)){
                                            echo '<p class="product-price"> Rp. '.$row['Harga'].',-</p>';
                                            echo '<a href="cart.php?id=5; ?> &action=add">';
                                            echo '<h6>'.$row['Nama_Barang'].' ('.$row['Kategori'].')</h6>';
                                            echo '</a>';
                                        }
                                    ?>
                                </div>
                                <!-- Ratings & Cart -->
                                <div class="ratings-cart text-right">
                                    <div class="cart">
                                        <a href="cart.php?id=5 &action=add" data-toggle="tooltip" data-placement="left" title="Add to Cart"><img src="img/core-img/cart.png" alt=""></a>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>

                    <!-- Single Product Area -->
                    <div class="col-12 col-sm-6 col-md-12 col-xl-6">
                        <div class="single-product-wrapper">
                            <!-- Product Image -->
                            <div class="product-img">
                                <img src="img/data-img/AKSESORIS/peralatan kebersihan (kucing) - 45.000.png" alt="">
                                <!-- Hover Thumb -->
                                <!--<img class="hover-img" src="img/product-img/product1.jpg" alt="">-->
                            </div>

                            <!-- Product Description -->
                            <div class="product-description d-flex align-items-center justify-content-between">
                                <!-- Product Meta Data -->
                                <div class="product-meta-data">
                                    <div class="line" id="i1"></div>
                                    <?php 
                                    // Mengambil semua data dari "tbsiswa"
                                    $sql = 'SELECT * FROM data_toko WHERE ID_Barang=6';
                                    $query = mysqli_query($conn, $sql);
                                        while ($row = mysqli_fetch_array($query)){
                                            echo '<p class="product-price"> Rp. '.$row['Harga'].',-</p>';
                                            echo '<a href=a href="cart.php?id=6; ?> &action=add">';
                                            echo '<h6>'.$row['Nama_Barang'].' ('.$row['Kategori'].')</h6>';
                                            echo '</a>';
                                        }
                                    ?>
                                </div>
                                <!-- Ratings & Cart -->
                                <div class="ratings-cart text-right">
                                    <div class="cart">
                                        <a href="cart.php?id=6; &action=add" data-toggle="tooltip" data-placement="left" title="Add to Cart"><img src="img/core-img/cart.png" alt=""></a>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>

                <div class="row">
                    <div class="col-12">
                        <!-- Pagination -->
                        <nav aria-label="navigation">
                            <ul class="pagination justify-content-end mt-50">
                                <li class="page-item active"><a class="page-link" href="#">1</a></li>
                                <li class="page-item"><a class="page-link" href="#">2</a></li>
                                <li class="page-item"><a class="page-link" href="#">3</a></li>
                                <li class="page-item"><a class="page-link" href="#">4</a></li>
                            </ul>
                        </nav>
                    </div>
                </div>
            </div>
        </div>
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
<!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
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