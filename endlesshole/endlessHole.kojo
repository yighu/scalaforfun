clear
invisible
setAnimationDelay(5)
def a(x:Int,y:Color)={
    setFillColor(y)
    repeat(4){
    forward(x)
    right()
    }
}
//a (100, Color(random(255),random(255),random(255)))
def drawAlot(x:Int){
    if (x>1){
         
      a (x-1, Color(random(255),random(255),random(255)))
      right(10)
      return drawAlot(x-1)  
    }
    
}
repeat(5){
drawAlot(200)
hop(400)
right(45)
}
