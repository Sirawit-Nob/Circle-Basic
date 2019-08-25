public  class Circle{
    private double radius ;
    public Circle(double  radius){
        this.radius = radius ;
    }
    public double  getRadius(double  radius){
        return radius ;
    }
    public double Area(){
        return  Math.PI * radius * radius ;
    }
    public double circumference(){
        return Math.PI * 2 * radius ;
    }
}
