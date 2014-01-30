package gswp

import processing.core.PApplet

class E7_9 extends PApplet {
    static void main(args) {
        PApplet.main(['E7_9'] as String[])
    }

    void setup() {
        size(480, 120)
        smooth()
        _x = width/2
        _y = height/2
        stroke(color(0, 0, 255))
    }
    float _x
    float _y
    float diameter = 20
    float speed = 2.5

    void draw() {
        _x += random(-speed, speed)
        _x = constrain(_x, 0, width)
        _y += random(-speed, speed)
        _y = constrain(_y, 0, height)
        ellipse(_x, _y, diameter, diameter)
    }
}
