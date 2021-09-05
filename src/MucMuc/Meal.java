package MucMuc;

import java.util.List;
import java.util.UUID;

public class Meal implements Energy {
    private UUID id;
    private List<Nutriment> nutriments;
    private String name;


    public Meal(List<Nutriment> nutriments, String name) {
        id = UUID.randomUUID();
        this.nutriments = nutriments;
        this.name = name;
    }

    public UUID getId() {
        return id;
    }

    public List<Nutriment> getNutriments() {
        return nutriments;
    }

    public String getName() {
        return name;
    }
    public void add(Nutriment n){
        boolean isFound = false;
        for (Nutriment el : nutriments){
            if (el.equals(n)){
                el.setWeight(el.getWeight() + n.getWeight());
                isFound = true;
                break;
            }
        }
        if (!isFound){
            nutriments.add(n);
        }

    }
    public void remove(Nutriment n){
        nutriments.remove(n);
    }
    public void remove(Nutriment n, double weight){
        for (Nutriment el : nutriments){
            if (el.equals(n)){
                el.setWeight(el.getWeight() - weight);
            }
        }
    }
    @Override
    public Double getKcal() {
        double sum = 0;
        for (Nutriment el : nutriments){
            sum += el.getTotalKcal();
        }
        return sum;
    }

    public double getProteins(){
        double sum = 0;
        for (Nutriment el: nutriments){
            sum += el.getTotalProteins();
        }
        return sum;
    }

    public double getCarbohydrates(){
        double sum = 0;
        for (Nutriment el : nutriments){
            sum += el.getTotalCarbohydrates();
        }
        return sum;
    }

    public double getFats(){
        double sum = 0;
        for (Nutriment el : nutriments){
            sum += el.getTotalFats();
        }
        return sum;
    }

    public double getFiber(){
        double sum = 0;
        for (Nutriment el : nutriments){
            sum += el.getTotalFiber();
        }
        return sum;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Meal meal = (Meal) obj;
        if (this.id.equals(meal.id))
            return true;
        return false;
    }

}
