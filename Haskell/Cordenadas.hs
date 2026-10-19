
productoEscalar :: Num a => (a, a) -> (a, a) -> a
productoEscalar (x,y) (j,k) = fst(x,y)*fst(j,k) + snd(x,y)*snd(j,k)