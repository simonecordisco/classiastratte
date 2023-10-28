public class triangolo extends forma {
    double lunghezza;
    double altezza;

    triangolo(double lunghezza, double altezza) {
        this.lunghezza = lunghezza;
        this.altezza = altezza;

    }
        @Override
        void CalcoloArea () {
        double area = (altezza*lunghezza)/2;
            System.out.println("l'area del triangolo è " + area );
    }
}
