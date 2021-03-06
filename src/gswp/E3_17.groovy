package gswp

import processing.core.PApplet

class E3_17 extends PApplet {
    static void main(args) {
        PApplet.main(["E3_17"] as String[])
    }

    void setup() {
        size(480, 120)
        smooth()
    }

    void draw() {
        noStroke()
        int c = color(204, 226, 225)
        background(c)
        fill(255, 0, 0, 160)
        ellipse(132, 82, 200, 200)
        fill(0, 255, 0, 160)
        ellipse(228, -16, 200, 200)
        fill(0, 0, 255, 160)
        ellipse(268, 118, 200, 200)
    }
}
