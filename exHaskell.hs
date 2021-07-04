--               Exemplos de codigo em Haskell para o T2


-- Exemplo de codigo 1:
greetings :: String -> String
greetings name = "Hello " ++ name


-- Exemplo de codigo 2:
factorial :: Int -> Int
factorial x 
    | x == 0 = 1
    | otherwise = x * factorial(x-1)



-- Exemplo List Comprehension 1:
sumOdds :: [Int] -> Int
sumOdds list = sum [x | x <- list, odd x]


-- Exemplo List Comprehension 2:
combNumber :: [(Int,Int)]
combNumber = [ (n1,n2) | n1 <- [0..9], n2 <- [0..9], (even n2) || (n1 == 0)]

