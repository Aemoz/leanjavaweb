package demo.sjtu.practice02;

public class Rect {
    public float width;
    public float height;

   public Rect() {
       this.width = 10;
       this.height = 10;
   }


    public Rect(float width, float height) {
        this.width = width;
        this.height = height;
    }

    public float area() {
       return width * height;
    }

    public float perimeter () {
       return (width + height) * 2;
    }

}
