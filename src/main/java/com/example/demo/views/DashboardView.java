package com.example.demo.views;

import com.example.demo.data.Bookings;
import com.example.demo.data.Customer;
import com.example.demo.services.CRMService;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.html.H4;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.data.binder.BeanValidationBinder;
import com.vaadin.flow.data.binder.Binder;
import com.vaadin.flow.function.ValueProvider;
import com.vaadin.flow.router.Route;
import jakarta.annotation.PostConstruct;


@Route(value = "", layout = MainLayout.class)
public class DashboardView extends VerticalLayout {
    private final CRMService service;
    private Grid<Bookings> grid;
    BookingForm form;


    public DashboardView(CRMService service) {
        this.service = service;
        Binder<Bookings> binder = new BeanValidationBinder<>(Bookings.class);
    }

    @PostConstruct
    private void init() {
        grid = new Grid<>(Bookings.class);
        gridPreferences();
        add(getContent());
        updateGrid();
    }

    private void gridPreferences() {
        ValueProvider<Bookings, String> customerNameProvider = booking -> {
            Customer customer = booking.getCustomer();
            if (customer != null) {
                return customer.getfName() + " " + customer.getlName();
            } else {
                return "";
            }
        };

        grid.setColumns("priority", "status", "last_active", "shoot_date");
        grid.addColumn(customerNameProvider).setHeader("Customer");
        grid.getColumns().forEach(col -> col.setAutoWidth(true));

//        grid.getEditor().addSaveListener(event -> {
//            Bookings editedBooking = event.getItem();
//            CRMService.save(editedBooking);
//        });
        grid.getEditor().setBuffered(true);
        grid.setAllRowsVisible(true);
    }

    private HorizontalLayout getContent() {
        HorizontalLayout content = new HorizontalLayout(grid);
        content.setFlexGrow(2, grid);
        content.setSizeFull();
        return content;
    }

    public void editBooking(Bookings bookings) {
        if (bookings == null) {
        }
        form.setVisible(true);
    }

    private void updateGrid() {
        grid.setItems(service.getAllBookings());
    }
}

