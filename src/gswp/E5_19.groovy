package gswp

import processing.core.PApplet

class E5_19 extends PApplet {
    static void main(args) {
        PApplet.main(['E5_19'] as String[])
    }

    void setup() {
        size(480, 120)
        smooth()
        textSize(64)
        textAlign(CENTER)
    }

    void draw() {
        background(0)
        text(key, 220, 50)
    }
}
