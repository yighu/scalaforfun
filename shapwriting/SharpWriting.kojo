clear
invisible
setPenColor(Color(0, 190, 89, 101))
setFillColor(Color(0, 190, 89, 101))
setAnimationDelay(10)
def rect(l:Int, w:Int){
    repeat(2){
        write("Hi")
        forward(l)
        right(90)
        forward(w)
        right(90)
    }
    
}
def rectangle(l: Int, b: Int) {
    rect(l,b)
}
repeat(10){
rectangle(100,50)
right(35)
}