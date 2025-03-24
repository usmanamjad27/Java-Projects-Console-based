public class S3_Employee {
    private S3_Address address;
    private String employeeId;
    private String name;

    public S3_Employee(S3_Address address, String employeeId, String name) {
        this.address = address;
        this.employeeId = employeeId;
        this.name = name;
    }
    public void displayInfo() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Address: " + address.getdisplay());
    }
}

