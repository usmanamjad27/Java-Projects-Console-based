public class S3_Address {
    private String street, city ;
    private int zipcode;

    public S3_Address(String street, String city, int zipcode) {
        this.street = street;
        this.city = city;
        this.zipcode = zipcode;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public int getZipcode() {
        return zipcode;
    }
    public String getdisplay(){
        return
                street+city+"\nZipcode : "+zipcode;
    }
}
