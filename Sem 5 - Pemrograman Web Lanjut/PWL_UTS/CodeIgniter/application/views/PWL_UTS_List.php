
<html>
<head>
	<title></title>
	<link rel="stylesheet" type="text/css" href="<?php echo base_url('bootstrap/css/bootstrap.css')?>"/>
</head>
<body>
	<?php

	 	$template = array(
            'table_open'            => '<table border="0" cellpadding="4" cellspacing="0" class="table table-striped">',
    
            'thead_open'            => '<thead>',
            'thead_close'           => '</thead>',
    
            'heading_row_start'     => '<tr>',
            'heading_row_end'       => '</tr>',
            'heading_cell_start'    => '<th>',
            'heading_cell_end'      => '</th>',
    
            'tbody_open'            => '<tbody>',
            'tbody_close'           => '</tbody>',
    
            'row_start'             => '<tr>',
            'row_end'               => '</tr>',
            'cell_start'            => '<td>',
            'cell_end'              => '</td>',
    
            'row_alt_start'         => '<tr>',
            'row_alt_end'           => '</tr>',
            'cell_alt_start'        => '<td>',
            'cell_alt_end'          => '</td>',
    
            'table_close'           => '</table>'
    
    );
	 $this->table->set_template($template);
	 $this->table->set_heading(array("user","password","email", "tgl"));

	 	foreach ($sedata as $key) {
	 		$this->table->add_row(array($key->user, $key->password, $key->email, $key->tgl));
	 	}
	 	echo $this->table->generate();
	 

?>
</body>
</html>