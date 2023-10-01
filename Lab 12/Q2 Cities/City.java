public class City {

    private String name;
    private double area;
    private int pop;

    public City() {
        name = "City Name";
        area = 100.00;
        pop = 1;
    }

    public City(String name, double area, int pop) {
        this.name = name;
        this.area = area;
        this.pop = pop;
    }

    public void setCityName(String name) {
        this.name = name;
    }

    public String getCityName() {
        return this.name;
    }

    public void setCityArea(double area) {
        this.area = area;
    }

    public double getCityArea() {
        return this.area;
    }

    public void setPop(int pop) {
        this.pop = pop;
    }

    public int getPop() {
        return this.pop;
    }

    public String toString() {
        return "City Name: " + name + " | City area: " + area + " | City pop: " + pop;
    }
}
