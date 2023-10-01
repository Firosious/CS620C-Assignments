class BasicCircle {
    private double radius;

    public BasicCircle() {
        this.radius = 1;
    }

    public BasicCircle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getCircumference() {
        double circumference = 2 * Math.PI * radius;
        return Math.round(circumference * 100.0) / 100.0;
    }

    public double getArea() {
        double area = Math.PI * (radius * radius);
        return Math.round(area * 100.0) / 100.0;
    }
}
