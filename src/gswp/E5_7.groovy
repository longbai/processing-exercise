package gswp

import processing.core.PApplet

class E5_7 extends PApplet {
    static void main(args) {
        PApplet.main(['E5_7'] as String[])
    }

    void setup() {
        size(480, 120)
        smooth()
        stroke(0, 102)
    }

    void draw() {
        float weight = dist(mouseX, mouseY, pmouseX, pmouseY)
        strokeWeight(weight)
        line(mouseX, mouseY, pmouseX, pmouseY)
    }
}
