myAbs :: (Ord a, Num a) => a -> a
myAbs a= if a>=0
          then a
          else a*(-1)