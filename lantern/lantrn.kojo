clear
setFillColor(red)
setAnimationDelay(5)
invisible
def a={
    List(121, 12, 1) 
}
def b={
    List(565, 56, 5)
}
repeat(30){
a zip b map(I=> {
    forward(I._1)
    right(I._2)
    
}
)
right(55)
}
hop(50)
repeat(3){
right()
}
forward(150)
right()
right()
setPenColor(yellow)
write("新年快樂!")