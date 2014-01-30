package gswp

import processing.core.PApplet

class E7_5 extends PApplet {
    static void main(args) {
        PApplet.main(['E7_5'] as String[])
    }

    void setup() {
        size(480, 120)
        smooth()
        frameRate(60)
    }
    float _x = 440
    float r = 30
    float speed = 0.5
    boolean open = true
    int direction = 1
    void draw() {
        background(0)
        float mouth_up
        float mouth_down

        if(direction> 0){
            mouth_up = 5.76
            mouth_down = 0.52
        } else{
            mouth_up = 9.42-0.52
            mouth_down = 3.14+0.52
        }
        arc(_x, 60, r, r, mouth_down, mouth_up)
        _x += direction * speed
        if(_x + r > width || _x-r < 0){
            direction = -direction
        }
    }
}
