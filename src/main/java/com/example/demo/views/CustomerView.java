package com.example.demo.views;

import com.example.demo.data.Customer;
import com.example.demo.services.CRMService;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.spring.annotation.SpringComponent;
import jakarta.annotation.security.PermitAll;
import org.springframework.context.annotation.Scope;

@SpringComponent
@Scope("prototype")
@PermitAll
@Route(value = "/customers", layout = MainLayout.class)
public class CustomerView extends VerticalLayout {
    private CRMService customerRepository;

    public CustomerView(CRMService customerRepository) {
        this.customerRepository = customerRepository;

        var customer_list = new VerticalLayout();
        customer_list.setPadding(false);
        customerRepository.getAllCustomers().forEach(
                (customer) -> {
                    String full_name = customer.getfName() + " " + customer.getlName();
                    String contact = String.format("%s %s", customer.getEmail(), customer.getPhone_number());
                    customer_list.add(new CardComponent(full_name, contact, ""));

        });

        add(customer_list);
    }

}
