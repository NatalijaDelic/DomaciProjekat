package MucMuc;

import java.util.ArrayList;
import java.util.List;

public class Meals {
    private List<Meal> meals;

    public Meals() {
        meals = new ArrayList<>();
    }

    public List<Meal> getMeals() {
        return meals;
    }

    public boolean add(Meal m) {
        if (!meals.contains(m))
            meals.add(m);
        return true;
    }

    public void remove(Meal m) {
        meals.remove(m);
    }

    public List<Meal> search(String s) {
        List<Meal> newList = new ArrayList<>();
        for (Meal p : meals) {
            if (p.getName().contains(s))
                newList.add(p);
        }
        return newList;
    }

    public List<Meal> search(double kcal) {
        List<Meal> newList = new ArrayList<>();
        for (Meal p : meals) {
            if (p.getKcal() < kcal) {
                newList.add(p);
            }
        }
        return newList;
    }

    @Override
    public String toString() {
        String rez = "";
        for (Meal el : meals) {
            rez += el.getId() + " | Name: " + el.getName() + "\n";
        }
        return rez;
    }
}



