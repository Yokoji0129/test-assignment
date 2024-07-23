<?php
$money = 300; //所持金

//アイテムの金額
$items = [
    'yakusou' => 10,
    'seisui' => 100,
    'kinobou' => 50
];

//入力例1
$orders = [
    ['item' => 'yakusou', 'quantity' => 5],
    ['item' => 'seisui', 'quantity' => 3],
    ['item' => 'kinobou', 'quantity' => 1],
    ['item' => 'seisui', 'quantity' => 1],
    ['item' => 'yakusou', 'quantity' => 3]
];

function RPG ($money, $items, $orders) {
    foreach ($orders as $index => $order){
        $cost = $items[$order['item']] * $order['quantity'];
        if($money >= $cost){
            $money -= $cost;
        }
    }
    echo "最終的な残金は{$money}G";
};

RPG($money, $items, $orders);
?>