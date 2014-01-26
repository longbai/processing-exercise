package gswp

import processing.core.PApplet

class E5_8 extends PApplet {
    static void main(args) {
        PApplet.main(['E5_8'] as String[])
    }

    void setup() {
        size(220, 120)
        smooth()
    }
    float px = 0
    float easing = 0.5
    float diameter = 12

    void draw() {
        float targetX = mouseX
        px += (targetX - px) * easing
        ellipse(px, 40, diameter, diameter)
    }
}
