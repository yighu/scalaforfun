clear
invisible
setPenColor(Color(110, 191, 71))
setFillColor(Color(0, 238, 19))
setAnimationDelay(0)
def dist=List(20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 140, 150) 
def ang=List(23, 2, 67, 312, 3, 35, 42, 82, 1, 43, 382, 3, 232, 1)
repeat(10){
repeat(5){


dist zip ang map(I=>{
    forward(I._1)
    right(I._2)
}
)
}
forward(400)
right(45)
}