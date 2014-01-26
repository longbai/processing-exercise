package gswp

import processing.core.PApplet

class E3_20 extends PApplet {
    static void main(args) {
        PApplet.main(["E3_20"] as String[])
    }

    void setup() {
        size(480, 120)
        smooth()
    }
    void foxLeft(){
        fill(255)
        beginShape()
        vertex(50,120)
        vertex(100, 90)
        vertex(110,60)
        vertex(80,20)
        vertex(210,60)
        vertex(160,80)
        vertex(200,90)
        vertex(140,100)
        vertex(130,120)
        endShape()
        fill(0)
        ellipse(155,60,8,8)
    }
    void draw() {
        foxLeft()
    }
}
