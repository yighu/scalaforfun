clear
invisible
setAnimationDelay(5)

def sqr(x:Int)=repeat(4){
    forward(x)
    right()
}
def tree(x:Int)={
    forward(x)
    right(-30)
    forward(x)
    right(180)
    forward(x)
    right(-90)
    forward(x)
}
for(x <- -10 to 10)
repeat(6){
tree(10*x)
}