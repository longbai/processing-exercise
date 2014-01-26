package gswp

import processing.core.PApplet

class E11_3 extends PApplet {
    static void main(args) {
        PApplet.main(['E11_3'] as String[])
    }

    void setup() {
        size(440, 220, OPENGL)
        smooth()
        noStroke()
    }

    void draw() {
        lights()
        background(0)
        float camZ = (height / 2.0) / tan((float)(PI * 60.0 / 360.0))
        camera(mouseX, mouseY, camZ,
                width / 2.0, height / 2.0, 0,
                0, 1, 0)

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
