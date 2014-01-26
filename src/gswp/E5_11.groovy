package gswp

import processing.core.PApplet

class E5_11 extends PApplet {
    static void main(args) {
        PApplet.main(['E5_11'] as String[])
    }

    void setup() {
        size(240, 120)
        smooth()
        strokeWeight(12)
    }

    void draw() {
        background(204)
        stroke(255)
        line(120, 60, mouseX, mouseY)
        stroke(0)
        float mx = map(mouseX, 0, width, 60, 180)
        line(120, 60, mx, mouseY)
    }
}
