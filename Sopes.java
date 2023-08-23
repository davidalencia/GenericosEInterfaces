public class Sopes implements Restaurante {
  private double estrellas = 3.2;

  public double getEstrellas() {
    return estrellas;
  }

  public void cocina(String platillo) {
    System.out.println("Sopes: cocinando " + platillo);
  }

  public void cobra(double cantidad) {
    System.out.println("Sopes: cobrando: $" + cantidad);
  }
}
