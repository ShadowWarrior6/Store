import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ToyStore {
    private List<Toy> toys;
    private List<Toy> prizeToys;

    public ToyStore(){
        toys=new ArrayList<>();
        prizeToys=new ArrayList<>();

    }



public void addToy(int ID,String ToyName,int Quantity,double Weight){
    Toy toy=new Toy(ID, ToyName, Quantity, Weight);
    toys.add(toy);

}
public void setToyWeight(int ID,double Weight){
    for (Toy toy: toys){
        if (toy.getID()==ID){
            toy.setWeight(Weight);
            break;
        }
    }
}
public void play(){
    double totalWeight=0;
    for(Toy toy:toys){
        totalWeight+=toy.getWeight();
    }

Random rand=new Random();
    double randomNumber=rand.nextDouble() * totalWeight;
    Toy prizeToy=null;
    for (Toy toy : toys){
        if (randomNumber<toy.getWeight()) {
            prizeToy=toy;
            break;
        }
        randomNumber -=toy.getWeight();
    }
    if (prizeToy!=null&&prizeToy.getQuantity()>0){
        prizeToys.add(prizeToy);

        prizeToy.setQuantity(prizeToy.getQuantity()-1);
    }
}

public Toy getPrizeToy()throws IOException{
    if (prizeToys.size()>0) {
        Toy prizeToy=prizeToys.remove(0);
        FileWriter writer = new FileWriter("prize_toys.txt", true);
        writer.write(prizeToy.getID()+","+prizeToy.getToyName()+"\n");
        writer.close();
        return prizeToy;
    }
    return null;
}   
}



