package gswp

import processing.core.PApplet

class E5_9 extends PApplet {
    static void main(args) {
        PApplet.main(['E5_9'] as String[])
    }

    void setup() {
        size(480, 120)
        smooth()
        stroke(0,102)
    }

    float px
    float py
    float ex
    float ey
    float easing = 0.05

    void draw() {
        float targetX = mouseX
        float targetY = mouseY
        ex += (mouseX - ex) * easing
        ey += (mouseY - ey) * easing
        float weight = dist(ex, ey, px, py)
        strokeWeight(weight)
        line(px, py, ex, ey)
        px = ex
        py = ey
        println(ex, ey)
    }
}
