<?php

$x = 10;
$y = 20;
$z = 1;

if($z == 1){

//Adição
$total = $x + $y;
echo $total . "<br>";

} 
elseif ($z == 2){

//Subtração
$total = $x - $y;
echo $total . "<br>";

}
elseif ($z == 3){

//Multiplicação
$total = $x * $y;
echo $total . "<br>";

}
else {

//Divisão 
$total = $x / $y;
echo $total . "<br>";

}



$a = 1;

while($a <= 10){

    echo $a;
    $a = $a + 1;
}

echo "<br>";

for($s = 1; $s <=10; $s = $s+1){

    echo $s;

}

echo "<br>";

$y = 0;

do{
    echo $y;
    $y = $y + 1;

} while($y <= 10);




?>