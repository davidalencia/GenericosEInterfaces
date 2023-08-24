
public class Tacos implements Restaurante, Comparable<Tacos>{
  private double estrellas;
  private int variedadesTacos;
  private String nombre;

  public Tacos (double estrellas, int variedadesTacos, String nombre){
    this.estrellas = estrellas;
    this.variedadesTacos = variedadesTacos;
    this.nombre = nombre;
  }
  public double getEstrellas() {
    return estrellas;
  }

  public void cocina(String platillo) {
    System.out.println("Tacos: cocinando " + platillo + "con salsa o sin salsa?");
  }

  public void cobra(double cantidad) {
    System.out.println("Tacos: cobrando: $" + cantidad + "cuanto desea de propina");
  }

  public int compareTo(Tacos tac){
    /*aqui va el código*/
  }

  public String toString(){
    return this.nombre;
  }
}
