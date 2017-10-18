package rs.aleph.android.example15.provider;

import java.util.ArrayList;
import java.util.List;

import rs.aleph.android.example15.model.Category;

/**
 * Created by androiddevelopment on 13.10.17..
 */

public class ProviderCategory {
    public static List<Category> getCategories() {

        List<Category> categories = new ArrayList<>();
        categories.add(new Category(0, "Posna jela"));
        categories.add(new Category(1, "Mrsna jela"));
        return categories;
    }

    public static List<String> getCategoryNaziv() {
        List<String> nazivi = new ArrayList<>();
        nazivi.add("Posna jela");
        nazivi.add("Mrsna jela");
        return nazivi;
    }

    public static Category getCategoryById(int id) {
        switch (id) {
            case 0:
                return new Category(0, "Posna jela");
            case 1:
                return new Category(1, "Mrsna jela");
            default:
                return null;
        }
    }
}
