package Employee;

class Fulltime extends Salary {

    double base_salary ;
    double bonus ;
    double deduction ;



  Fulltime(double base_salary,double bonus,double deduction) {

    this.base_salary = base_salary;
    this.bonus= bonus;
    this.deduction=deduction; 
   

   
}

    double Full() {
        return (base_salary * 12) + bonus - deduction;

    }

    @Override
    double Part() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Part'");
    }

  



    




    }

  


