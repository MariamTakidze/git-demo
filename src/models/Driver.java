package models;

public class Driver {

    private int id;

    private  Person person;

    private DrivingLicenses drivingLicense;

    public Driver() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public DrivingLicenses getDrivingLicense() {
        return drivingLicense;
    }

    public void setDrivingLicense(DrivingLicenses drivingLicense) {
        this.drivingLicense = drivingLicense;
    }
}
