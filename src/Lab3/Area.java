package Lab3;

public class Area {
    CandyBag bag;
    int number;
    String street;

    public Area(){}

    public Area(CandyBag bag, int number, String street) {
        this.bag = bag;
        this.number = number;
        this.street = street;
    }

    public void getBirthdayCard(){
        System.out.println("Adresa: " + street);
        System.out.println("La multi ani!");
        System.out.println(bag.candyBoxes);
    }

    public void getCandyBoxesDim(){
        for (int index = 0; index < bag.candyBoxes.size(); index++){
            CandyBox currentBox = bag.candyBoxes.get(index);
            if(currentBox instanceof Baravelli){
                ((Baravelli) currentBox).printBaravelliDim();
            } else if(currentBox instanceof  ChocAmor){
                ((ChocAmor) currentBox).printChocAmorDim();
            } else {
                ((Lindt) currentBox).printLindtDim();
            }
        }
    }
}
