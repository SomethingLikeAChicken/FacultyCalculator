package M411;

public class FakultaetsRechner {
    public long BerechneRekursion(long zahl){
        if(zahl <= 1){
            return 1;
        }else{
            return zahl * BerechneRekursion(zahl -1);
        }
    }
/*


             /'._     _,
             \   ;__.'  }
         (`-._;-" _.--.}'
         /_'    /`    _}
           `.   \_._.; 
             '-.__ /   
              _/  `\    
             ^`   ^`

   Coded by SomethingLikeAChicken


*/
