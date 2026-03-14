public class Coffee {

  // (1) constructor
  public Coffee() {
    name = "Americano";
    size = "tall";
    price = 3000;
  }

  public Coffee(String name, String size, int price) {
    this.price = price;
    this.name = name;
    this.size = size;
  }

  // (2) variable (aka field, properties, attributes)
  String name;
  String size;
  int price;
  boolean hasMilk;
  boolean hasIce;

}
