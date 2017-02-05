clear
invisible
setAnimationDelay(0)
def a=  List(2017, 28, 17)

def b= List(5, 12, 17)


def c=  List(214, 287, 107)

def d=   List(4, 82, 97)

def drawPic(c:List[Int], d:List[Int])=c zip d map(I=>{
    forward(I._1)
    right(I._2)
}
)
repeat(14){
repeat(140){
drawPic(a,b)
drawPic(c,d)
}
right(90)
}