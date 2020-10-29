public class Address {
    String addressType;
    String street;
    String NearBy;

    public String getAddressType() {
        return addressType;
    }

    public void setAddressType(String addressType) {
        this.addressType = addressType;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNearBy() {
        return NearBy;
    }

    public void setNearBy(String nearBy) {
        NearBy = nearBy;
    }

    @Override
    public String toString() {
        return "Address{" +
                "addressType='" + addressType + '\'' +
                ", street='" + street + '\'' +
                ", NearBy='" + NearBy + '\'' +
                '}';
    }
}
