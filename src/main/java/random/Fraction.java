package random;

class Fraction {
    int numerator, denominator;

    // Define constructor here
    Fraction(int numerator, int denominator){
        this.numerator=numerator;
        this.denominator=denominator;
    }

    Fraction add(Fraction a){
       return new Fraction(numerator+a.numerator, this.denominator+a.denominator);
    }

    Fraction subtract(Fraction a){
        return new Fraction(this.numerator-a.numerator, this.denominator-a.denominator);

    }

    Fraction multiply(Fraction a){
        return new Fraction(this.numerator*a.numerator, this.denominator*a.denominator);
    }

    public static void main(String[] args) {
        Fraction x = new Fraction(2, 3); // 2/3
        Fraction y = new Fraction(4, 5); // 4/5
        Fraction z = x.add(y);// 22/15

        Fraction zr = x.subtract(y); // -2/15
        System.out.println(zr.numerator);
        System.out.println(zr.denominator);

        Fraction zzz = x.multiply(y); // 8/15
    }
}

/*

*/