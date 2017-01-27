
<?php

if(isset($_POST["text1"]) and isset($_POST["text2"])) {


    $pdo = new PDO('mysql:host=www.server.de;dbname=database', 'user', 'password');

    $text1 = $_POST["text1"];
    $text2 = $_POST["text2"];
    $stmt = $pdo->prepare('INSERT INTO tablename (text1, text2) VALUES (:text1, :text2)');

    $stmt->execute(array('text1' => $text1, 'text2' => $text2));

    if ($stmt == true) {
        echo "ok";
    } else {
        echo "error";
    }


} else {

?>
<form action="index.php" method="post">

Type text you want to save (each max 16 characters):
</br>
<input type="text" name="text1" maxlength="16"></br>
<input type="text" name="text2" maxlength="16"></br>
</br>
<input type="submit" name="formSubmit" value="Submit">

</form>

<?php
}
?>