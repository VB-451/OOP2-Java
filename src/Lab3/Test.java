package Lab3;

public class Test {
    public static void main(String[] args){
        CandyBox newCandy = new CandyBox("sour", "Morocco");
        System.out.println(newCandy);

        Lindt lindt1 = new Lindt("sweet", "Albania", 3.0f, 3.0f, 3.0f);
        Lindt lindt2 = new Lindt("sweet", "Albania", 3.0f, 3.0f, 3.0f);
        System.out.println(lindt1.equals(lindt2));
        System.out.println("-------------------");
        lindt1.printLindtDim();
        CandyBag candyBag = new CandyBag();
        Baravelli baravelli = new Baravelli("Caramel", "Italy", 2.5f, 4.0f);
        ChocAmor chocAmor = new ChocAmor("Strawberry", "France", 3.0f);

        candyBag.addCandyBox(lindt1);
        candyBag.addCandyBox(lindt2);
        candyBag.addCandyBox(baravelli);
        candyBag.addCandyBox(chocAmor);
        System.out.println(candyBag.candyBoxes.get(0));

    }
}
