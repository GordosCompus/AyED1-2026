-- ****ESTA ES LA PRACTICA 3 MAN ******
--EJE 9
myEscalar :: Num a => (a,a) -> (a,a) -> a
myEscalar (x1,x2) (y1,y2) = (fst (x1,x2) * fst (y1,y2)) + (snd (x1,x2) * snd (y1,y2))

--EJE 10
myAbs :: Int -> Int
myAbs x
    | x<0      = x * (-1)
    | otherwise = x

--EJE 11
mySumaLista :: Num a => [a] -> a
mySumaLista []    = 0
mySumaLista (x:xs) = x + mySumaLista xs

--EJE 12
myPotenciaCurrificada :: (Num a, Integral b) => a -> b -> a
myPotenciaCurrificada x 0 = 1
myPotenciaCurrificada x y = x * myPotenciaCurrificada x (y-1)

--EJE 13
myPotenciaCurrificada2 :: (Num a, Integral b) => b -> a
myPotenciaCurrificada2 x = myPotenciaCurrificada 2 x

--EJE 14
mySumaTres :: Num a => a -> a -> a -> a
mySumaTres x y z = x + y + z

--EJE 15
mySumaTres4 :: Num a => a -> a -> a
mySumaTres4 y z = mySumaTres 4 y z

--Aca me puse a wachinear para ver como funciona la recursion de la multiplicacion en una lista 
myProductoLista :: Num a => [a] -> a
myProductoLista []    = 1
myProductoLista (x:xs) = x * myProductoLista xs 

--EJE 20
myFibonacci :: (Integral a) => a -> a
myFibonacci x
        | x < 0     = error "Numero debe ser Natural"
        | x == 0    = 0
        | x == 1    = 1
        | otherwise = myFibonacci (x-1) + myFibonacci (x-2)

-- *****PRACTICA 4 PERROOO******

--EJE 1
--a)
hd :: [a] -> a
hd [] = error "La lista no tiene cabeza"
hd (x:_) = x

--b)
tl :: [a] -> [a]
tl [] = error "La lista es vacia"
tl (_:xs) = xs

--c)
last' :: [a] -> a
last' [] = error "La lista es vacia"
last' [x] = x
last' (_:xs) = last' xs

--d)
init' :: [a] -> [a]
init' [] = undefined 
init' [_] = []
init' (x:xs) = x : init' xs

--EJE 2
reversa :: [a] -> [a]
reversa [] = []
reversa (x:xs) = reversa xs ++ [x]

--EJE 3
eqListas :: (Eq a) => [a] -> [a] -> Bool
eqListas [] [] = True
eqListas [] (x:xs) = False
eqListas (x:xs) [] = False
eqListas (x:xs) (y:ys) = (x == y) && eqListas xs ys

--EJE 4
palindromo :: (Eq a) => [a] -> Bool
palindromo [] = True
palindromo (x:xs) = eqListas (x:xs) (reversa (x:xs))

--EJE 5
natPrimo :: (Integral a) => a -> Bool
natPrimo x = length [y | y <- [1..x] , x `mod` y == 0] == 2

--EJE 6
primos :: (Integral a) => a -> [a]
primos x = [y | y <- [1..x-1] , natPrimo y] 

--EJE 7
primosLista :: (Integral a) => [a] -> [a]
primosLista lista = [x | x <- lista , natPrimo x == True]

--EJE 8
--Aca hice otra forma pero no es lo que piden los wachines de los profes
cortar' :: Int -> Int -> [Char] -> [Char]
cortar' i j w = [w !! x | x <- [i-1..j-1]]

--Esta es la que va man
cortar :: Int -> Int -> [Char] -> [Char]
cortar i j w = drop (i - 1) (take j w)

--EJE 9 
--Esta me re wachineo mal, habia que usar aritmetica modular
numLista :: (Integral a) => a -> [a]
numLista x 
        | x < 0   = numLista (x * (-1))
        | x < 10 = [x]
        | otherwise = numLista (x `div` 10) ++ [x `mod` 10]

--EJE 10
 --Lista infinita de unos
unos :: [Int]
unos = 1 : unos
--Otra forma
unos' :: [Int]
unos' = [1,1..]

--EJE 11
--Lista infinita de naturales desde n, n+1 ..
nats :: (Integral a) => a -> [a]
nats x
    |x < 0 = undefined
    | otherwise = x : nats (x+1)
--Otra forma
nats' :: (Integral a) => a -> [a]
nats' x
    |x < 0 = undefined
    | otherwise = [x,(x+1)..]

--EJE 12
--Lista con los primeros n naturales
primerosNat :: Int -> [Int]
primerosNat x 
           |x < 0   = undefined
           |otherwise  = take x ([1,(1+1)..])

-- Otra forma
primerosNat' :: Int -> [Int]
primerosNat' x 
           |x < 0   = undefined
           |otherwise  = take x (nats 1)

-- Otra forma mejor y mas cheta maaan 
primerosNat'' :: Int -> [Int]
primerosNat'' x 
           |x < 0   = undefined
           |otherwise  = [1,(1+1)..x]

--EJE 13
--primeros 5 elementos de una lista infinita de enteros positivos
primeros5 :: [Int]
primeros5 =  take 5 ([1,(1+1)..]) 














