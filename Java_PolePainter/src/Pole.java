import processing.core.PApplet;
import processing.core.PVector;

abstract class Pole {
   private PApplet p;
   PVector pos;
   float radius;

    public Pole(){}

    public Pole(PApplet p, PVector pos, float radius){
        this.p = p;
        this.pos = pos;
        this.radius = radius;
    }

    public abstract void move();
    public abstract void draw();
}
