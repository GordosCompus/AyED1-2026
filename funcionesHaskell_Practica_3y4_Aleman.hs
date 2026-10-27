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

--EJE 14 
--Esto seria la funcion de manera manual
--Nos encargamos de hacer el caso base cuando hay mas elementos dentro de la lista y que corte
--desarmamos la lista entre cabeza y cola para que haga recursividad con toda la cola y siga hasta llegar al caso base aplicando siempre el cuadrado para agregar a una nueva lista 
listaCuadrado' :: [Int] -> [Int]
listaCuadrado' [] = []
listaCuadrado' (x:xs) = (x * x) : listaCuadrado' xs

--Con funcion de alto orden se hace asi, en vez de usar x:xs y hacer recursion de x hasta xs solo le pasamos la lista completa y que map se encargye de todo
-- ARQUITECTURA 2: Función de Alto Orden (Abstracción del motor recursivo)
-- Abandonamos el control manual. No desarmamos la lista, la pasamos entera ('xs').
-- 1. No hay caso base visible porque 'map' lo tiene programado en su propio código fuente.
-- 2. Inyectamos la lógica matemática directo a la ALU con la Sección de Operador (^2).
-- 3. 'map' se encarga internamente de desarmar, aplicar y volver a ensamblar los punteros.
listaCuadrado :: [Int] -> [Int]
listaCuadrado xs = map (^2) xs

--si no tuvieramos un metodo para el cuadrado tendriamos qu eusar lambda
listaCuadrado'' :: [Int] -> [Int]
listaCuadrado'' xs = map (\x -> x*x) xs


--EJE 15 
divLista :: Int -> [Int]
divLista x = filter (\y -> mod x y == 0) [1,(1+1)..x] --esto seria una forma si no tenemos una funcion definida para ver si es divisor
                                                    --Por lo tanto teneos que indicarle una funcion lambda \y que tome como parametro la lista de la derecha y la vaya evaluando

--si tenemos una funcion que cumple con lo que necesitamos la podmeos iyecctar directo a la funcion de alto orden 
numDiv :: Int -> Int -> Bool
numDiv x y = (x `mod` y) == 0

--inyecion directa 
divLista' :: Int -> [Int]
divLista' x = filter (numDiv x) [1,(1+1)..x]  --De esta forma la misma funcion de alto orden se encarga de que al parametro y lo busque en la lista en vez de andar  llamando a una funcion lambda

--EJE 16
listaPrimos :: (Integral a) => [a] -> [a]
listaPrimos xs = filter (natPrimo) xs --Tenemos definido natPrimo en el eje 5

--si no tuvieramos definido el natPrimo seria con lambda 
listaPrimos' :: (Integral a) => [a] -> [a]
listaPrimos' xs = filter (\x -> length [y | y <- [1..x] , x `mod` y == 0] == 2) xs

--Eje 17
sumaCuadrados :: (Integral a) => [a] -> a
sumaCuadrados xs = foldl' (+) 0 (map (^2) xs) --Usando foldl' colapsa en una suma al cuadrado de la lista 

sumaCuadrados' :: (Integral a) => [a] -> a
sumaCuadrados' xs = sum (map (^2) xs) -- Solo usando map para convertir en cuadrado la lista y sumandola toda 

--EJE 18
succLista :: (Integral a) => [a] -> [a]
succLista xs = map (succ) xs

succLista' :: (Integral a) => [a] -> [a]
succLista' xs = map (\x -> x+1) xs

--EJE 19
sumLista :: [Int] -> Int
sumLista xs = foldl' (+) 0 xs

sumLista'' :: [Int] -> Int
sumLista'' xs = foldl' (\acc x -> acc + x) 0 xs --LAMBDA DE FOLDL'

sumLista' :: [Int] -> Int
sumLista' xs = sum xs 

--EJE 20
factorial :: Int -> Int
factorial x
         |x < 0 = undefined
         |otherwise = foldl' (*) 1 [1,1+1..x] --  foldl' (\acc x -> acc * x) 1 [1,1+1..x]

--EJE 21 
and' :: [Bool] -> Bool
and' xs = foldl' (&&) True xs 

and'' :: [Bool] -> Bool
and'' xs = foldl' (\acc x -> acc && x) True xs 

--EJE 22
tam :: [a] -> Int
tam xs = foldl' (\acc x -> acc + 1) 0 xs

tam' :: [a] -> Int
tam' xs = foldr (\x acc-> acc + 1) 0 xs 

--diferencias de foldl' y foldr
-- Mismos parámetros: operador (-), acumulador base 0 y lista [1, 2, 3]

-- 1. Evaluación con foldl (Asociatividad por la Izquierda)
ejemploFoldl :: Int
ejemploFoldl = foldl (-) 0 [1, 2, 3]
-- ((0 - 1) - 2) - 3  ==>  (-1 - 2) - 3  ==>  -3 - 3  ==>  -6

-- 2. Evaluación con foldr (Asociatividad por la Derecha)
ejemploFoldr :: Int
ejemploFoldr = foldr (-) 0 [1, 2, 3]
-- 1 - (2 - (3 - 0))  ==>  1 - (2 - 3)  ==>  1 - (-1)  ==>  2

--LISTAS COMPRENSION
--EJE 23
succComprension :: [Int] -> [Int]
succComprension lista = [y+1| y <- lista ] 

--EJE 24
cuaListComprension :: (Integral a) => [a] -> [a]
cuaListComprension lista = [y*y | y <- lista ]

--EJE 25
paresMay10 :: [Int] -> [Int]
paresMay10 lista = [y | y <- lista , (y `mod` 2 == 0) && y > 10]


--EJE 26
divComprension :: Int -> [Int]
divComprension x = [y | y <- [1, 1+1..x] , x `mod` y == 0]

--EJE 27
todosOcurrenEn :: Eq a => [a] -> [a] -> Bool
todosOcurrenEn xs ys = and [x `elem` ys | x <- xs ] --elem es pertenece y and inyecta && a cada elemento de la lista y devuelve Bool

--EJE 28
primos2n :: (Integral a) => a -> [a]
primos2n x = [y | y <- [2, 2+1..x] , length [j |j <- [1..y] , (y `mod` j == 0)] ==2] --Podriamos haber usado la funcion natPrimo pero me hice el cra

--EJE 29
paresInfinitos :: [Int]
paresInfinitos = [y | y <- [0..] , y `mod` 2 == 0]

--EJE 30
productoCartesiano :: (Integral a) => [a] -> [a] -> [(a,a)]
productoCartesiano xs ys = [(x,y) | x <- xs , y <- ys]

--EJE 31
--Para probar lo que queremos hacer
es :: Int -> Bool
es y = and [y `mod` j == j-1 | j <- [1, 1+1..10]]

nat15000 :: [Int]
nat15000 = [y | y <- [1, 1+1..5000] , and [y `mod` j == j-1 | j <- [1, 1+1..10]] == True ]

--Optimizado 
nat15000' :: [Int]
nat15000' = [y | y <- [1..5000] , and [y `mod` j == j-1 | j <- [1..10]]]

--EJE 32 
ocurrencias :: (Eq a) => a -> [a] -> Int
ocurrencias x ys = length [ j | j <- ys , x == j]

--EJE 33
split2 :: [a] -> [([a],[a])]
split2 xs = [(take i xs  , drop i xs) | i <- [0..length xs]]

a :: [Int] -> [Int]
a xs = [ xs !! y + xs !! y+1 | y <- [1..(length xs)-1]]

-- EJE 34
sumaSeg :: [Int] -> Int
sumaSeg xs = sum [sum (take i xs) | i <- [0 .. length xs]]











