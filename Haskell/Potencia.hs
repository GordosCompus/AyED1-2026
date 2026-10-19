myExp :: (Num a, Integral b) => a->b->a
myExp x 0 = 1
myExp x y = x* myExp x (y-1)

potenciaDeDos :: (Integral b) => b -> Integer
potenciaDeDos = myExp 2