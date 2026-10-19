belongs :: Eq a => a -> [a] -> Bool
belongs e [] = False
belongs e ( a : as ) = belongs e as || ( a == e )