class Circle {
    private double radius;

    public Circle(double radius){
        this.radius=radius;
        System.out.println("Circle object is created");
    }

    public double area(){
        return 3.14*radius*radius;
    }

    public double circumference(){
        return 2*3.14*radius;
    }
}
