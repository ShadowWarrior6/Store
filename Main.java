import java.io.IOException;

public class Main {
    
    public static void main(String[] args)throws IOException {
        ToyStore store=new ToyStore();

        store.addToy(1, "Toy 1", 10, 20);
        store.addToy(2, "Toy 2", 5, 10);
        store.addToy(3, "Toy 3", 20, 70);

        // Устанавливаем вес одной из игрушек
        store.setToyWeight(2, 30);

        // Играем
        store.play();

        //Получаем призовую игрушку
        Toy prizeToy= store.getPrizeToy();
        
        if (prizeToy != null) {
            System.out.println("Вы выиграли " + prizeToy.getToyName() + "!");
        } else {
            System.out.println("Вы ничего не выиграли. Попробуйте еще раз.");
        }
    }
}

