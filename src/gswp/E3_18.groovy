package gswp

import processing.core.PApplet

class E3_18 extends PApplet {
    static void main(args) {
        PApplet.main(["E3_18"] as String[])
    }

    void setup() {
        size(480, 120)
        smooth()
    }

    void draw() {
        strokeJoin(ROUND)
        strokeWeight(8)
        beginShape()
        vertex(180,82)
        vertex(207,36)
        vertex(214,63)
        vertex(407,11)
        vertex(412,30)
        strokeJoin(BEVEL)
        vertex(219,82)
        vertex(226,109)
        endShape(CLOSE)
    }
}
