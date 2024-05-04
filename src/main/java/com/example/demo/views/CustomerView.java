package com.example.demo.views;

import com.example.demo.data.Customer;
import com.example.demo.data.CustomerRepository;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.spring.annotation.SpringComponent;
import jakarta.annotation.security.PermitAll;
import org.springframework.context.annotation.Scope;

@SpringComponent
@Scope("prototype")
@PermitAll
@Route(value = "/customers", layout = MainView.class)
public class CustomerView extends VerticalLayout {
    private CustomerRepository customerRepository;

    public CustomerView (CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
        Grid<Customer> customer_grid = new Grid<>(Customer.class);


        var customer_list = new VerticalLayout();
        customer_list.setPadding(false);
        customerRepository.findAll().forEach(customer -> customer_list.add(new H3(customer.getEmail())));
        customer_list.add(new H3("What the fuck"));
        add(customer_list);
    }

}
