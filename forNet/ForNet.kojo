clear
invisible
setAnimationDelay(0)

def sqr(x:Int)=repeat(4){
    forward(x)
    right()
}

repeat(10){
repeat(4){
for (x <- -10 to 10)
sqr(x*100)
right()
}
right(30)
}
