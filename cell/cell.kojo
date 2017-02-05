clear()
invisible()
setPenColor(Color(2, 255, 195))
setFillColor(Color(2, 255, 50))
def x={
setAnimationDelay(0)
repeat(20){
    forward(100)
    right(100)
}
right
right
right
hop(100)
}
def y={
repeat(250){ x}
right()
hop(65)
repeat(20){
    forward(100)
    right(100)
}
}
repeat(15){
    y
    hop(560)
}