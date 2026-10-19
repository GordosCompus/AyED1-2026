mySuma :: (Num a) => a -> (a -> (a -> a))
mySuma a b c = a+b+c


addFour :: Num a => a -> a -> a
addFour = mySuma 4