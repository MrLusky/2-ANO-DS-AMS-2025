<?php

for ($i = 1; $i <= 10; $i++) {
    //mesma coisa de colocar "for($i = 1; $i <= 10; $i = $i + 1)"

    echo "<h2>Tabuada do $i</h2>";

    for ($j = 0; $j <= 10; $j++) {
        echo "$i x $j = " . ($i * $j) . "<br>";
    }

}

// primeiro ele realiza o laço de repetição interno ($j), depois ele aumenta o valor do $i e depois repete o laço de repetição interno do $j de novo. E vira um loop até o $i chegar a 10

?>