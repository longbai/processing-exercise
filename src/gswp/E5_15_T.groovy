package gswp

import processing.core.PApplet

class E5_15_T extends PApplet {
    static void main(args) {
        PApplet.main(['E5_15_T'] as String[])
    }

    void setup() {
        size(480, 120)
        smooth()
        strokeWeight(5)
    }

    float pz = 240

    void draw() {
        background(100)
        if (pz < mouseX) {
            pz += 0.5
        } else if (pz > mouseX) {
            pz -= 0.5
        }
        line(pz, 0, pz, 120)
    }
}
