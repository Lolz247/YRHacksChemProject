public class ElementTile {
    private String symbol;
    private String name;
    private int atomicNum;
    private String mass;
    private int[] shells;

    ElementTile(Element element){ // Square element tile to be implemented into periodic table
        this.symbol = element.getSymbol();
        this.name = element.toString();
        this.atomicNum = element.getAtomicNum();
        this.mass = element.getMass();
    }
}
