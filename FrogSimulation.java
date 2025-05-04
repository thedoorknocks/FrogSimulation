import java.util.Scanner;
public class FrogSimulation{
private int goalDistance;
private int maxHops;


    public FrogSimulation(int dist, int numHops){
    goalDistance = dist;
    maxHops = numHops;
    }

    private int hopDistance(){
        Scanner s = new Scanner(System.in);
        System.out.println("How far?");
        return s.nextInt();
    }
    public boolean simulate(){
        int distance = 0;
        for( int hops = 0; hops< maxHops; hops++){
            distance = distance + hopDistance();
            if(distance<0) return false;
            if(distance >=goalDistance) return true;

        }
        return false;
    }

    public double runSimulations(int num){
        int success = 0;
        for(int i= 0; i<num;i++){
            if(simulate() == true){
                success++;
            }
        }
        return (double) success/num;
    }

}