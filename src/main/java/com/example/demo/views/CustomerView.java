package com.example.demo.views;

import com.example.demo.data.Customer;
import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.router.Route;

@Route(value = "/customers", layout = MainView.class)
public class CustomerView extends AppLayout {
    Grid<Customer> customer_grid = new Grid<>(Customer.class);

    private HorizontalLayout getCustomers() {

    }

    private void updateList() {
        customer_grid.setItems()
    }
}
