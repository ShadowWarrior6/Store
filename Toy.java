/**
 * Необходимо написать программу – розыгрыша игрушек в магазине детских товаров.
Стараемся применять ООП и работу с файлами.
Если какой-то пункт не изучали и не знаете, как сделать, то можете сделать своим способом. Например, 
у кого в курсе не было ООП, то применяем списки\массивы\словари

 */




class Toy{
    private int ID;
    private String ToyName;
    private int Quantity;
    private double Weight;

    public Toy(int Id,String ToyName,int Quantity,double Weight){
        this.ID=Id;
        this.ToyName=ToyName;
        this.Quantity=Quantity;
        this.Weight=Weight;
    }

    public int getID() {
        return ID;
    }

    public void setID(int iD) {
        ID = iD;
    }

    public String getToyName() {
        return ToyName;
    }

    public void setToyName(String toyName) {
        ToyName = toyName;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int quantity) {
        Quantity = quantity;
    }

    public double getWeight() {
        return Weight;
    }

    public void setWeight(double weight) {
        Weight = weight;
    }
    


}



