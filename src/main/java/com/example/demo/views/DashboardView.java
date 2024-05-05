package com.example.demo.views;

import com.example.demo.data.Bookings;
import com.example.demo.services.CRMService;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.html.H4;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

import java.util.List;

/**
 * The main view contains a button and a click listener.
 */
@Route(value = "", layout = MainLayout.class)
public class DashboardView extends VerticalLayout {
    Grid<Bookings> grid = new Grid<>(Bookings.class);
    CRMService service;

    public DashboardView(CRMService service) {
        this.service = service;
        gridPreferences();
        add(grid);
        updateGrid();
        add(new H3(String.valueOf(service.getAllBookings().get(0).getStatus())));
//        add(service.getAllCustomers().forEach(x -> new H4(x.getfName())));
    }

    private void gridPreferences() {
        grid.setSizeFull();
    }

    private HorizontalLayout getContent() {
        HorizontalLayout content = new HorizontalLayout(grid);
        content.setFlexGrow(2, grid);
        content.setSizeFull();
        return content;
    }

    private void updateGrid() {
        List<Bookings> bookings = service.getAllBookings();
        grid.setItems(bookings);
    }
}

