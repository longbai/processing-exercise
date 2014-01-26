package gswp

import processing.core.PApplet

class E5_13 extends PApplet {
    static void main(args) {
        PApplet.main(['E5_13'] as String[])
    }

    void setup() {
        size(240, 120)
        smooth()
        strokeWeight(30)
    }

    void draw() {
        stroke(102)
        line(40, 0, 70, height)
        if (mousePressed){
            stroke(0)
        }else{
            stroke(255)
        }
        line(0, 70, width, 50)
    }
}
