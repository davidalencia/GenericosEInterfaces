public class Uber {
  Restaurante[] restos = { new Tacos(4.5, 5, "Taqueria Champion"), new Sopes("Doña Chona", 3) };

  public void preparaPlatillos() {
    System.out.println("preparando platillos");
    for (Restaurante res : restos){
      res.cocina("quesadilla");
    }
  }
}
