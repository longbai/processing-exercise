package gswp

import processing.core.PApplet

class E5_21 extends PApplet {
    static void main(args) {
        PApplet.main(['E5_21'] as String[])
    }

    void setup() {
        size(480, 120)
        smooth()
    }
    int px = 215
    void draw() {
        background(255)
        if(keyPressed && (key == CODED)){
            if (keyCode == LEFT){
                px--
            } else if(keyCode == RIGHT){
                px++
            }
        }
        rect(px, 45, 50, 50)

    }
}
