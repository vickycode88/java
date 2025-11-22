class Rectangle extends Shape{
    
    
private double l;
private double b;

public Rectangle(double l,double b){

    this.l=l;
    this.b=b;
}

double area(){
    return l*b;
}

double parameter(){
    return 2+(l*b);
    
}

}