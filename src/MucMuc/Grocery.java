package MucMuc;

public abstract class Grocery implements Energy {
    public String company;
    public String name;

    public Grocery(String company, String name) {
        this.company = company;
        this.name = name;
    }

    public Grocery(String name){
        this.name=name;
    }

    public String getCompany() {
        return company;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        Grocery g = (Grocery) obj;
        if (this.company.equals(g.company) && this.name.equals(g.name))
            return true;
        else
            return false;
    }
}

