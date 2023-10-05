<html>
<head>
<title>Input Form</title>
</head>
<body>

<?php echo validation_errors(); ?>

<?php echo form_open('PWL_UTS_FormEntry'); ?>

		Username:<br>
		<input type="text" name="username" value="" size="20"/> <br>
		Password:<br>
		<input type="password" name="password" value="" size="20"/> <br>
		Email:<br>
		<input type="text" name="email" value="" size="20"/> <br><br>
		<input type="submit" name="insertUser" value="ENTER!" /> <br>

</body>
</html>