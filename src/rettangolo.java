public class rettangolo extends forma{

    double lunghezza;
    double altezza;
    rettangolo(double lunghezza, double altezza){
        this.lunghezza=lunghezza;
        this.altezza=altezza;

}

    @Override
    void CalcoloArea() {
        double area = lunghezza*altezza;
        System.out.println("l'area del rettangolo è " + area);
    }
}
