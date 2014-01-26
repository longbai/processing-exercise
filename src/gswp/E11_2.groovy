package gswp

import processing.core.PApplet

class E11_2 extends PApplet {
    static void main(args) {
        PApplet.main(['E11_2'] as String[])
    }

    void setup() {
        size(440, 220, OPENGL)
        smooth()
        noStroke()
        fill(255)
    }

    void draw() {
        lights()
        rotateY((float)(PI/24.0))
        background(0)
        translate(width / 2, height / 2, -20)
        int dim = 18
        (-height / 2).step(height / 2, dim * 1.4) {
            int x = it
            (-height / 2).step(height / 2, dim * 1.4) {
                pushMatrix()
                translate(x, it, -it)
                box(dim, dim, dim)
                popMatrix()
            }
        }
    }
}
