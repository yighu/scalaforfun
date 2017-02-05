clear
invisible
setFillColor(Color(0, 251, 252, 153))
setPenColor(Color(16, 162, 121, 178))
setAnimationDelay(5)
def a=List(15, 30, 45, 60)
def b=List(10, 20, 30, 40)
repeat(50){
repeat(25){
a zip b map(I=>{
    forward(I._1)
    right(I._2)
}
)
}
right(145)
}