<?php
$scores = [
    [1, 2, 3],
    [4, 5, 6],
    [7, 8, 9],
    [10, 11, 12]
];

//当たった場所
$hits = [
    ['o', 'x', 'o'],
    ['o', 'o', 'x'],
    ['o', 'x', 'o'],
    ['x', 'x', 'x']
];

function struckout ($scores, $hits) {
    $totalScore = 0;
    for($i = 0; $i < count($scores); $i++){
        for($j = 0; $j < count($scores[$i]); $j++){
            if($hits[$i][$j] === "o"){
                $totalScore += $scores[$i][$j];
            }
        }
    }
    echo $totalScore;
};

struckout($scores, $hits);
?>