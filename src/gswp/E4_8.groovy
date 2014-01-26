package gswp

import processing.core.PApplet

class E4_8 extends PApplet {
    static void main(args) {
        PApplet.main(["E4_8"] as String[])
    }

    void setup() {
        size(480, 120)
        smooth()
    }

    void draw() {
        strokeWeight(2)
        strokeCap(SQUARE)
        20.step(400, 20){
            line(it, 0, it+it/2, 80)
        }
    }
}
