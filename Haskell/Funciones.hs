hd :: [a] -> a
hd [x] = x
hd (x:xs) = x

tl :: [a] -> [a]
tl [x] = [x]
tl (x:xs) = xs

myLast :: [a] -> a
myLast [x] = x
myLast (x:xs) =  myLast xs

myInit :: [a] -> [a]
myInit [x] = []
myInit (x:xs) = x : myInit xs

rever :: [a]->[a]
rever  [] = undefined
rever [x] = [x]
rever (x:xs) = rever xs ++ [x]

equalsf :: Eq a => [a] -> [a] -> Bool
equalsf [] [] = True
equalsf [] (_:_) = False
equalsf (_:_) [] = False
equalsf (x:xs) (y:ys) = ((x == y) && (equalsf xs ys))

palin :: Eq a => [a] -> Bool
palin [] = True
palin (x:xs) = equalsf (x:xs) (rever(x:xs))

esPrimo :: Integral a => a -> Bool
esPrimo x = length [y | y <- [1..x], mod x y == 0] == 2


digitos :: Integral a => a -> [a]
digitos 0 = [0]
digitos n = (if n<10 then [n] else [div n 10, mod n 10] )
