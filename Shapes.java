public class Shapes {

  public static void main(String[] args) {
    diamond();
    System.out.println();
    rectangle();
  }

  public static void diamond(){
    upTriangle();
    downTriangle();
  }

  public static void downTriangle() {
    for (int line = 1; line<= 5; line++){

      for (int spaces = 1; spaces <= (line - 1); spaces++){
        System.out.print(" ");
      }

      for (int stars = 1; stars <= (11 - 2 * line); stars++){
        System.out.print("*");
      }

      System.out.println();

    }
  }

  public static void upTriangle() {
    for (int line = 1; line <=5; line++){

      for (int spaces = 5; spaces >= (line + 1); spaces--){
        System.out.print(" ");
      }

      for (int stars = 5; stars >= (7 - 2 * line); stars--){
        System.out.print("*");
      }

      System.out.println();

    }
  }

  public static void rectangle() {
    for (int line = 1; line <=5; line++){

      for (int star = 1; star <= 10; star++){
        System.out.print("*");

      }

      System.out.println();
    }
  }
}
