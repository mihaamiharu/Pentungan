<?php

	$username = $_POST['username'];
	$password = $_POST['password'];

	
	if (isset($_POST['username']) != NULL) {
		$sql = "INSERT INTO anggota_rt
				(username,password)
				VALUES (?,?)";
				
		require_once('_koneksi.php');
		
		$stmt = mysqli_stmt_init($conn);
		mysqli_stmt_prepare($stmt, $sql);
		mysqli_stmt_bind_param($stmt, "ss", $username,$password);
		
		if($judul != NULL && $isi != NULL) {
			if(!mysqli_stmt_execute($stmt)){
				$result["status"] = 400;
				$result["message"] = "Insert Failed" . mysqli_error($conn);			
			} else {
				$result["status"] = 200;
				$result["message"] = "Insert Success";
			}
		}
	} else {
		$result["status"] = 200;
		$result["message"] = "Parameter not found";
	}
	
	header('Content-Type: application/json', true, $result["status"]);
	echo json_encode($result);
	
	mysqli_stmt_close($stmt);
	mysqli_close($conn);

?>