package gswp

import processing.core.PApplet

class E3_7 extends PApplet {
    static void main(args) {
        PApplet.main(["E3_7"] as String[])
    }

    void setup() {
        size(480, 120, OPENGL)
        smooth()
    }

    void draw() {
        arc(90, 60, 80, 80, 0, HALF_PI)
        noSmooth()
        arc(190, 60, 80, 80, 0, (float)(PI + HALF_PI))
        strokeWeight(8)
        arc(290, 60, 80, 80, PI, (float)(TWO_PI + HALF_PI))
        strokeWeight(20)
        arc(390, 60, 80, 80, QUARTER_PI, (float)(PI + QUARTER_PI))
    }
}
