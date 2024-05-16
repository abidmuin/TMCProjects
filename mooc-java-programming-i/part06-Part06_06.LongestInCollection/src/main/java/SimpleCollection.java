import java.util.ArrayList;

public class SimpleCollection {

    private final String name;
    private final ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String longest() {
        if (this.elements.isEmpty()) {
            return null;
        }

        int maxSize = Integer.MIN_VALUE;
        String maxElement = null;

        for (String element : this.elements) {
            if (element.length() > maxSize) {
                maxSize = element.length();
                maxElement = element;
            }
        }

        return maxElement;
    }
}
