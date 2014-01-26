package gswp

import processing.core.PApplet

class E3_16 extends PApplet {
    static void main(args) {
        PApplet.main(["E3_16"] as String[])
    }

    void setup() {
        size(480, 120)
        smooth()
    }

    void draw() {
        noStroke()
        background(0, 26, 51)
        fill(255, 0, 0)
        ellipse(132, 82, 200, 200)
        fill(0, 255, 0)
        ellipse(228, -16, 200, 200)
        fill(0, 0, 255)
        ellipse(268, 118, 200, 200)
    }
}
