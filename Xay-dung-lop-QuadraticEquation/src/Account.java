public class Account {
    private double a,b,c;

    public Account(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant() {
        return Math.pow(this.b,2) - (4 * this.a * this.c);
    }


    public double getRoot1(){
        if(this.getDiscriminant() < 0){
            return 0;
        } else {
            return ((- this.b + Math.sqrt(this.getDiscriminant())) / ( 2 * this.a));
        }
    }

    public double getRoot2(){
        if(this.getDiscriminant() < 0){
            return 0;
        } else {
            return ((- this.b - Math.sqrt(this.getDiscriminant())) / ( 2 * this.a));
        }
    }

    public void printResult() {
        if(this.getDiscriminant() > 0){
            System.out.println("The equation has two roots " + getRoot1() + " and " + getRoot2());
        } else if(this.getDiscriminant() == 0){
            System.out.println("The equation has one root " + getRoot1());
        } else {
            System.out.println("The equation has no real roots");
        }
    }
}
