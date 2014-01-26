package gswp

import processing.core.PApplet

class E4_12 extends PApplet {
    static void main(args) {
        PApplet.main(['E4_12'] as String[])
    }

    void setup() {
        size(480, 120)
        smooth()
    }

    void draw() {
        background(0)
        fill(255)
        stroke(102)
        10.step(111, 10){
            int y = it
            10.step(471, 10){
                line(it, y, 240, 60)
                ellipse(it, y, 4, 4)

            }
        }
    }
}
