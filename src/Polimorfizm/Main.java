package Polimorfizm;

public class Main {
    public static void main(String[] args) {
        Shape[] arr = new Shape[]{new Circule(), new Square(), new Triangle()};
         for (int i=0; i<arr.length;i++){
             arr[i].shape();
             arr[i].draw();
         }
    }
}
