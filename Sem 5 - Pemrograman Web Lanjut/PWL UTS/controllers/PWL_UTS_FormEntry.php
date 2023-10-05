<?php

class PWL_UTS_FormEntry extends CI_Controller {

        public function index()
        {
                $this->load->helper(array('form', 'url', 'date'));

                $this->load->library(array('form_validation', 'table', 'session'));


                echo "<p align=center>Form Input User </p> ";

                $this->form_validation->set_rules('username', 'Username', 'required');
                $this->form_validation->set_rules('password', 'Password', 'required',
                        array('required' => 'You must provide a %s.')
                );
               
                $this->form_validation->set_rules('email', 'Email','trim|required|valid_email');

                if ($this->form_validation->run() == FALSE)
                {
                        $this->load->view('PWL_UTS_MyForm');
                }
                else
                {
                        $this->load->database();
                        $this->load->model('PWL_UTS_InputUser');
                        $this->load->helper('date');
                        $date = date('Y-m-d');
                        

                        
                        $username = $this->input->post('username');
                        $password = $this->input->post('password');
                        $email = $this->input->post('email');
                        $tanggal = $this->input->post('$date');


                        $this->PWL_UTS_InputUser->insert($username, $password, $email, $date);        

                        $this->load->view('PWL_UTS_FormSuccess');

                }
                
        }
                public function list(){
                
                $this->load->helper(array('form', 'url', 'date'));
                $this->load->library(array('form_validation', 'table', 'session'));
                
                $this->load->database();
                $this->load->model('PWL_UTS_InputUser');
                $dat=$this->PWL_UTS_InputUser->show();
                
                
                $tdata = array (
                        'sedata'=> $dat
                );

               
               $this->load->view('PWL_UTS_List', $tdata);
                
                
                }

                }
