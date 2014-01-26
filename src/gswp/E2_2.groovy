package gswp

import processing.core.PApplet

class E2_2 extends PApplet{
    static void main(args){
        PApplet.main(["E2_2"] as String[])
    }

    void setup(){
        size(480, 120)
        smooth()
    }

    void draw(){
        if(mousePressed){
            fill(0)
        }else{
            fill(255)
        }

        ellipse(mouseX, mouseY, 80,80)
    }
}
