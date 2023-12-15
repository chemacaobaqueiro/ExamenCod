import java.util.Random;
public class Metodos {

    int rondas=0;
    int fallos=0;
    int aciertos=0;
    int num;

    /**
     * getters y setters de las variables anteriores
     * @return rondas,fallos,aciertos,num
     */
    public int getRondas() {
        return rondas;
    }

    public void setRondas(int rondas) {
        this.rondas = rondas;
    }

    public int getFallos() {
        return fallos;
    }

    public void setFallos(int fallos) {
        this.fallos = fallos;
    }

    public int getAciertos() {
        return aciertos;
    }

    public void setAciertos(int aciertos) {
        this.aciertos = aciertos;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    /**
     * bucle en el que se realiza el juego durante 10 rondas
     */
    public void bucle(){
        while (rondas<=10){
            Random r = new Random();
            int numAl = r.nextInt(10);
            int intentos=0;
            if (num==numAl){

            }else if (num>numAl){
                System.out.println("el numero es mayor");
            }else if (num<numAl){
                System.out.println("el numero es menor");
            }else if (intentos<2){
                intentos++;
            }else if(intentos>2){
                System.out.println("te has quedado sin intentos");
            }
            rondas++;
        }
        Record obj=new Record();
        obj.RecordAlias();
        obj.RecordAciertos();
        System.out.println("Record actual : ");
    }

}
