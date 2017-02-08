clear
invisible
setAnimationDelay(0)
def circle(z:Int)= repeat(12){
    forward(z)
    right(30)
}
 def sqr(x:Int)=   repeat(4){
    forward(x)
    right()
    }
def tri(y:Int)={
    repeat(3){
    forward(y)
    right(45)
}
} 
def a(x:Int,y:Color,f:(Int)=>Unit)={
    setFillColor(y)
    f(x)
}
//a (100, Color(random(255),random(255),random(255)))
def drawAlot(x:Int){
    if (x>1){
         
      a (x-1, Color(random(255),random(255),random(255)),tri)
      a (x-1, Color(random(255),random(255),random(255)),sqr)
      a (x-1, Color(random(255),random(255),random(255)),circle)
      right(30)
      
      return drawAlot(x-1)  
    }
    
}
repeat(5){
drawAlot(200)
hop(400)
right(45)
}
