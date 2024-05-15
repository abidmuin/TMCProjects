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

    @Override
    public String toString() {
        if (this.elements.isEmpty()) {
            return "The collection " + this.name + " is empty.";
        }

        int alphabetCount = this.elements.size();

        StringBuilder result = new StringBuilder("The collection " + this.name + " has " + alphabetCount);

        if (alphabetCount == 1) {
            result.append(" ").append("element:");
        } else {
            result.append(" ").append("elements:");
        }

        for (int i = 0; i < alphabetCount; i++) {
            result.append("\n").append(this.elements.get(i));
        }

        return result.toString();
    }
}
