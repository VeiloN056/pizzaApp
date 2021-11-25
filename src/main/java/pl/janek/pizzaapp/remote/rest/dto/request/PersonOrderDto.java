package pl.janek.pizzaapp.remote.rest.dto.request;

public class PersonOrderDto {
    private String name;
    private String phone;
    private String address;
    private Integer floor;

    public PersonOrderDto() {
    }

    public PersonOrderDto(String name, String phone, String address, Integer floor) {
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.floor = floor;
    }
}
