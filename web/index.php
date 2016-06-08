<?php

echo 'Executing Java...<hr />';

$output = array();
$returnVar = 0;

$result = exec('./java.sh', $output, $returnVar);
echo 'Result: <hr />';
var_dump($result);
echo 'Output: <hr />';
var_dump($output);
echo 'Return Var: <hr />';
var_dump($returnVar);

echo '<hr />Done!';
