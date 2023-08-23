public class Uber {
  Restaurante[] restos = { new Tacos(), new Sopes() };

  public void preparaPlatillos() {
    System.out.println("preparando platillos");
    for (Restaurante res : restos)
      res.cocina("quesadilla");
  }
}
