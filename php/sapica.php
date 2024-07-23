<?php
$cardBalance = 2000; //カード残高
$fares = [300, 500, 300, 100, 100]; //運賃

function test($fares, $cardBalance) {
    $balance = $cardBalance;
    $points = 0;

    echo "最初のカード残高: {$balance}円<br>";

    foreach ($fares as $index => $fare) {
        if ($points >= $fare) {
            $points -= $fare;
            echo ($index + 1) . "回目降車時、運賃{$fare}円。カード残高: {$balance}円 ポイント: {$points}円<br>";
        } else {
            $balance -= $fare;
            $points += $fare * 0.1;
            echo ($index + 1) . "回目降車時、運賃{$fare}円。カード残高: {$balance}円 ポイント: {$points}円<br>";
        }
    }
}

test($fares, $cardBalance);
?>
