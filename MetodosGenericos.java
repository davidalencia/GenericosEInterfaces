public class MetodosGenericos {

    public static <T extends Comparable<T>> T getMayor(T[] arreglo) {
        T aux = arreglo[0];
        for (T e : arreglo) {
            if (aux.compareTo(e) < 0) { // Cambiamos el operador '>' por '<' para encontrar el mayor
                aux = e;
            }
        }
        return aux;
    }

    
}
