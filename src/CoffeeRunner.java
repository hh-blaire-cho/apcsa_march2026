public class CoffeeRunner {

  public static void main(String[] args) {
    System.out.println("Welcome to the Coffee Shop!");
    Coffee americano = new Coffee();
    System.out.println(americano);
    System.out.println(americano.size);
    System.out.println(americano.name);
    System.out.println(americano.price);
    System.out.println(americano.hasMilk);
    System.out.println(americano.hasIce);

    Coffee latte = new Coffee("latte", "grande", 4000);
    System.out.println(latte.size); // "grande"
    System.out.println(latte.name); // "latte"
    System.out.println(latte.price); // 4000
    System.out.println(latte.hasIce); // false

    // latte.addIce(); // method you need to implement

    System.out.println(latte.size); // "grande"
    System.out.println(latte.name); // "iced latte"
    System.out.println(latte.price); // 4500
    System.out.println(latte.hasIce); // true

  }

}
