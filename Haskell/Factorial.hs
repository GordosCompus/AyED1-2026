myFact :: (Num t, Ord t) => t -> t
myFact x|x==1   =1 
        |x==0   =1
        |x<0    =error"No se permite negativos"
        |otherwise = x*myFact(x-1)