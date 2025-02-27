<?php

for ($i = 1; $i <= 10; $i++) {
    // Para cada número de 1 a 10, faça uma tabuada
    echo "<h2>Tabuada do $i</h2>";
    
    // Laço interno para calcular e mostrar os resultados da tabuada
    for ($j = 1; $j <= 10; $j++) {
        echo "$i x $j = " . ($i * $j) . "<br>";
    }

    // Adiciona uma quebra de linha após cada tabuada
    echo "<br>";
}

