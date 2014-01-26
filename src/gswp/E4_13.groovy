package gswp

import processing.core.PApplet

class E4_13 extends PApplet {
    static void main(args) {
        PApplet.main(['E4_13'] as String[])
    }

    void setup() {
        size(480, 120)
        smooth()
    }

    void draw() {
        background(0)
        32.step(120+1, 8){
            int y = it
            12.step(480+1, 15){
                float r = 16 - y/10.0
                ellipse(it+y, y, r, r)
            }
        }
    }
}
