fibonacci :: Int -> Integer
fibonacci n
  | n < 0     = error "El índice debe ser mayor o igual a 0"
  | otherwise = auxiliar n 0 1
  where
    auxiliar 0 a _ = a
    auxiliar k a b = auxiliar (k - 1) b (a + b)

