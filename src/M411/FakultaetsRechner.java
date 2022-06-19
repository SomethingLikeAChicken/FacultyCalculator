package M411;

public class FakultaetsRechner {
    public long BerechneRekursion(long zahl){
        if(zahl <= 1){
            return 1;
        }else{
            return zahl * BerechneRekursion(zahl -1);
        }
    }
    public long BerechneSchleife(long zahl){
        long result = 1;
        for(int i = 1; i <= zahl; i ++){
            result = result * i;
        }
        return result;
    }
}
