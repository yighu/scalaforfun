clear
invisible
setAnimationDelay(0)
def a={
List(123, 456, 789) 
}
def b={
   List(246, 810, 120)
}
repeat(12){
repeat(200){
    setPenColor(red)
a zip b map(I=>{
    forward(I._1)
    right(I._1)
}
 )  
 right(10)
}
setPenColor(white)
forward(2000)
right(10)
}