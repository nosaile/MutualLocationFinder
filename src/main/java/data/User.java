package data;

public class User {


    private String name;
    private String age;
    private boolean drinksAlcohol;

    public User(String name, String age, boolean drinksAlcohol) {
        this.name = name;
        this.age = age;
        this.drinksAlcohol = drinksAlcohol;
    }

    public User(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public boolean isDrinksAlcohol() {
        return drinksAlcohol;
    }

    public void setDrinksAlcohol(boolean drinksAlcohol) {
        this.drinksAlcohol = drinksAlcohol;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", drinksAlcohol=" + drinksAlcohol +
                '}';
    }
}

