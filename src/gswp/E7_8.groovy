package gswp

import processing.core.PApplet

class E7_8 extends PApplet {
    static void main(args) {
        PApplet.main(['E7_8'] as String[])
    }

    void setup() {
        size(480, 120)
        smooth()
    }

    void draw() {
        background(204)
        20.step(width, 20){
            float mx = mouseX/10
            float offsetA = random(-mx, mx)
            float offsetB = random(-mx, mx)
            line((float)(it+offsetA), 20, (float)(it-offsetB), 100)
        }
    }
}
