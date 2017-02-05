clear
invisible
setFillColor(Color(255, 0, 0))
setAnimationDelay(5)
("fgfgfg")
def a={
List(100, 12)
}
def b={
List(100, 61, 70)
}
repeat(5){
a zip b map (I=>
    repeat(80){
    forward(I._1)
    right(I._2)
    }
    )
    setFillColor(red)
    forward(190)
    right(10)
    }