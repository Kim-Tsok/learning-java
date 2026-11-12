public class Calculator{
     
    public static float findHypotenuse(float height, float width) {
        float hypotenuse = (height*height) + (width*width);
        System.out.println("The Width: " + width + ", The height: " + height + ". And your hypotenuse is: " + hypotenuse);
        return hypotenuse;
    }

    public static void main(String[] args){
       findHypotenuse(10, 5);
       findHypotenuse(8, 5);
    }
}