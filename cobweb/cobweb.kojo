clear
invisible
setAnimationDelay(0)
def a(x:Int)={
    forward(x)
    right(30)
    forward(x)
    right(180)
    hop(x)
    right(90)
    forward(x)
}

def b(x:Int)=repeat(20){
a(x)
right(20)
}
for(x<-1 to 100){
b(x*10)
right(30)
}