package models;

public class Driver extends Person{



    private DrivingLicenses drivingLicense;


    //default constructor
    public Driver() {
    }

    public Driver(int id, String firstName,String lastName,int age,String sex) {
        super(id,firstName,lastName,age,sex);

    }



    public DrivingLicenses getDrivingLicense() {
        return drivingLicense;
    }

    public void setDrivingLicense(DrivingLicenses drivingLicense) {
        this.drivingLicense = drivingLicense;
    }



    @Override
    public String toString() {
        return "Driver{" +
                "id:" + id +
                ", firstName:'" + firstName + '\'' +
                ", lastName:'" + lastName + '\'' +
                ", age:" + age + '\'' +
                ", sex:" + sex + '\'' +
                ",drivingLicense:" + drivingLicense +
                '}';
    }
}
