package gswp

import processing.core.PApplet

class E11_1 extends PApplet {
    static void main(args) {
        PApplet.main(['E11_1'] as String[])
    }

    void setup() {
        size(440, 220, OPENGL)
        smooth()
        noStroke()
        fill(255, 190)
    }

    void draw() {
        background(0)
        translate(width / 2, height / 2, 0)
        rotateX(mouseX / 200.0)
        rotateY(mouseY / 100.0)
        int dim = 18
        (-height / 2).step(height / 2, dim * 1.2) {
            int x = it
            (-height / 2).step(height / 2, dim * 1.2) {
                beginShape()
                vertex(x, it, 0)
                vertex(x + dim, it, 0)
                vertex(x + dim, it + dim, -dim)
                vertex(x, it + dim, -dim)
                endShape()
            }
        }
    }
}
