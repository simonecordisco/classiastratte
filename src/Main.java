//Scrivere un programma che contenga una classe astratta chiamata Forma
// ed un metodo astratto chiamato calcolaArea().
//Crea poi due sottoclassi Rettangolo e Triangolo che estendono Forma ed
// implementano il metodo per il calcolo dell'area in maniera specifica.

public class Main {
    public static void main(String[] args) {
      rettangolo rettangolo1 = new rettangolo(4,5);
      triangolo triangolo1= new triangolo(4,5);
      rettangolo1.CalcoloArea();
      triangolo1.CalcoloArea();
    }
}