package pl.janek.pizzaapp.remote.rest.dto.request;

import java.util.List;

public class AddOrderDto {
    private List<PizzaOrderDto> pizzas;
    private PersonOrderDto person;

    public AddOrderDto() {
    }

    public AddOrderDto(List<PizzaOrderDto> pizzas, PersonOrderDto person) {
        this.pizzas = pizzas;
        this.person = person;
    }
}
