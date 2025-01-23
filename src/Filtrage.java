import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

// Classe générique pour le service de filtrage
public class Filtrage {
    public static <T> List<T> filter(List<T> items, Predicate<T> condition) {
        List<T> result = new ArrayList<>();
        for (T item : items) {
            if (condition.test(item)) {
                result.add(item);
            }
        }
        return result;
    }
}

// Classe Exemple : Objet ayant une couleur et un type
class Item {
    private final String color;
    private final String type;

    public Item(String color, String type) {
        this.color = color;
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Item{color='" + color + "', type='" + type + "'}";
    }

    public static void main(String[] args) {
        // Création de la liste d'objets
        List<Item> items = new ArrayList<>();
        items.add(new Item("Rouge", "Voiture"));
        items.add(new Item("Bleu", "Vélo"));
        items.add(new Item("Rouge", "Moto"));
        items.add(new Item("Vert", "Avion"));

        // Filtrer les objets ayant la couleur "Rouge"
        List<Item> redItems = Filtrage.filter(items, item -> "Rouge".equals(item.getColor()));

        // Afficher les objets filtrés
        System.out.println("Objets filtrés (Rouge) :");
        for (Item item : redItems) {
            System.out.println(item);
        }
    }
}


