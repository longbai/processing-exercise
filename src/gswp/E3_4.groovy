package gswp

import processing.core.PApplet

class E3_4 extends PApplet {
    static void main(args) {
        PApplet.main(["E3_4"] as String[])
    }

    void setup() {
        size(480, 120)
        smooth()
    }

    void printXY(){
        if (pmouseX != mouseX || pmouseY != mouseY){
            println("(${mouseX}, ${mouseY})")
        }
    }
    void draw() {
        background(0)
        quad(158, 55,199,14,392,66,351,107)
        triangle(347,54,392,9,392,66)
        triangle(158,55,290,91,290,112)
        printXY()
    }
}
