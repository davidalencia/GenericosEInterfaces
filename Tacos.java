
public class Tacos implements Restaurante {
  private double estrellas = 4.5;

  public double getEstrellas() {
    return estrellas;
  }

  public void cocina(String platillo) {
    System.out.println("Tacos: cocinando " + platillo);
  }

  public void cobra(double cantidad) {
    System.out.println("Tacos: cobrando: $" + cantidad);
  }
}
