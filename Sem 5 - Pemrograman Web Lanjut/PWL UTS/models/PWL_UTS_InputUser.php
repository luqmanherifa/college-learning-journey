<?php
class PWL_UTS_InputUser extends CI_Model {

	public $id;
        public $username;
        public $password;
        public $email;

       
        public function insert($username, $password, $email, $tanggal){
        	       
                $sql ="INSERT INTO pengguna(user, password, email, tgl) VALUES
                (".$this->db->escape($username).",".$this->db->escape($password).",".$this->db->escape($email).",
                ".$this->db->escape($tanggal).")";

                $this->db->query($sql);  

		echo $this->db->affected_rows();
        }
        public function show(){
                $query = $this->db->get('pengguna');
                return $query->result();
        }

}