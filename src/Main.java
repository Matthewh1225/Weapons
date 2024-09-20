
import java.util.Random;
    
    
public class Main{
    public static void main(String[]args){
        
        Smg smg1 = new Smg("FN smg1","5.7x28");
        Smg smg2 = new Smg("Mp5","9x19");
        Sniper Sniper1 = new  Sniper("Barret", ".50");
    

        if (smg2 instanceof Smg){
            smg1.currentMag = 30;
            smg1.capacity = 45;
            smg2.name();
            smg2.caliber();
            System.out.println(" ");
            smg1.name();
            smg1.caliber();
            smg1.reload();
            smg1.checkMag();
            smg1.magDump();
            smg1.checkMag();
        }
        if (Sniper1 instanceof Gun){
            Sniper1.capacity = 5;
            Sniper1.name();
            Sniper1.caliber();
            Sniper1.checkMag();
            Sniper1.reload();
            Sniper1.checkMag();
            Sniper1.shoot(2);
            Sniper1.checkMag();
        }
        
    }
       
    }

    interface Gun{
        void name();
        void caliber();
        void shoot(int x);
    }
    class Sniper implements Gun{
        String caliber = null;
        int currentMag = 0;
        int capacity = 0;
        String name;
        public Sniper(String name, String caliber){
            this.name=name;
            this.caliber=caliber;
        }
        public void name(){
            System.out.println(this.name);
        }
        public void caliber(){
            System.out.println(caliber);            
        }
        public void shoot(int x){
            currentMag = currentMag-x;
            for(int i = 0 ; i<x; i++){
            if (currentMag>=0){  System.out.println("Boom");
                 
                }
            }
        }
        
        void checkMag(){
            System.out.println(currentMag);
        }

        void reload(){
            currentMag = capacity;
            System.out.println("reloading");
        }

    }

     class Smg implements Gun{
        Random r = new Random();
        int x = r.nextInt(0,10);
        String caliber = null;
        int currentMag = 0;
        int capacity = 0;
        String name;

        public Smg(String name, String caliber){
            this.name = name;
            this.caliber = caliber;

        }
        public void name(){
            System.out.println(this.name);
            System.out.println(name);
        }
        public void caliber(){
            System.out.println(caliber);            
        }
        public void shoot(int x){

            currentMag = currentMag-x;
            for(int i = 0 ; i<x; i++){
                if (capacity > 0 && x == 5){
                    System.out.println("missfire");
                }

                }
            }
            
        
        void checkMag(){
            System.out.println(currentMag);
        }

        void magDump(){
                shoot(currentMag);
        }

        void reload(){
            currentMag = capacity;
            System.out.println("reloading");
        }

} 
    



