package gswp

import processing.core.PApplet

class E4_6 extends PApplet {
    static void main(args) {
        PApplet.main(["E4_6"] as String[])
    }

    void setup() {
        size(480, 120)
        smooth()
    }

    void draw() {
        strokeWeight(8)
        strokeCap(SQUARE)
        20.step(400, 60){
            line(it, 40, it+60, 80)
        }
    }
}
