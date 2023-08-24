public class Sopes implements Restaurante, Comparable<Sopes> {
  private int estrellas;
  private String nombre;

  public Sopes(String nombre, int estrellas){
    this.nombre = nombre;
    this.estrellas = estrellas;
  }

  public double getEstrellas() {
    return estrellas;
  }

  public void cocina(String platillo) {
    System.out.println("Sopes: cocinando " + platillo);
  }

  public void cobra(double cantidad) {
    System.out.println("Sopes: cobrando: $" + cantidad);
  }

  public int compareTo(Sopes sop){
    /*Aqui va el codigo*/
  }

  public String toString(){
    return this.nombre;
  }
}
