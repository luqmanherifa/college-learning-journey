<?php
class PWL_Per2_Tug1_Nama extends CI_Controller {

        public function index()
        {
                $this->load->view('PWL_Per2_Tug2');
        }

        public function summon($nama,$nrp)
        {
 		$data = array(
 		        'title'=>'Your Name',
 			'header'=>'Show Data Mahasiswa',
 			'p_nama'=>$nama,
 			'p_nrp'=>$nrp,

 		);

                $this->load->view('PWL_Per2_Tug1_TampilNama', $data);
        }


        public function row()
        {

        }

}