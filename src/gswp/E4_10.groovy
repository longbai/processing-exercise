package gswp

import processing.core.PApplet

class E4_10 extends PApplet {
    static void main(args) {
        PApplet.main(["E4_10"] as String[])
    }

    void setup() {
        size(480, 120)
        smooth()
    }

    void draw() {
        noStroke()
//        fill(255, 140)
        0.step(121, 40){
            int y = it
            0.step(481, 40){
                fill(255, 140)
                ellipse(it, y, 40,40)
            }
        }
    }
}
