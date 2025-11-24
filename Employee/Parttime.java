package Employee;

class Parttime extends Salary {

    double working_hour;
    double per_hour_pay;

    Parttime(double working_hour, double per_hour_pay) {

        this.working_hour = working_hour;
        this.per_hour_pay = per_hour_pay;
    }

    double Part() {

        return (working_hour * per_hour_pay) * 12;

    }

    @Override
    double Full() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'Full'");
    }

}
