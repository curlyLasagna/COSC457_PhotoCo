package com.example.demo.views;

import com.example.demo.data.Bookings;
import com.example.demo.data.Customer;
import com.example.demo.services.CRMService;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.datepicker.DatePicker;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.EmailField;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.data.binder.BeanValidationBinder;
import com.vaadin.flow.data.binder.Binder;
import com.vaadin.flow.router.Route;


@Route(value = "/book")
public class BookingView extends VerticalLayout {
    Binder<Customer> binder = new BeanValidationBinder<>(Customer.class);
    CRMService service;

    public BookingView(CRMService service) {
        this.service = service;

        VerticalLayout contentLayout = new VerticalLayout();
        HorizontalLayout centeringLayout = new HorizontalLayout();
        TextField fName = new TextField("First Name");
        TextField lName = new TextField("Last Name");
        TextField phone_num = new TextField("Phone number");
        phone_num.setRequiredIndicatorVisible(true);
        phone_num.setPattern("^[+]?[(]?[0-9]{3}[)]?[-s.]?[0-9]{3}[-s.]?[0-9]{4,6}$");
        phone_num.setAllowedCharPattern("[0-9()+-]");
        phone_num.setHelperText("Format: +(123)456-7890");

        DatePicker date = new DatePicker("Date to shoot");
        EmailField email = new EmailField("Email");

        email.setClearButtonVisible(true);
        email.setErrorMessage("Enter a valid email address");

        Button submit_btn = new Button("Book!", e -> new PaymentDialog().open());

        FormLayout formLayout = new FormLayout();
        contentLayout.add(fName, lName, email, phone_num, date, submit_btn);
        centeringLayout.add(contentLayout);

        contentLayout.getStyle().set("width", "100%")
                .set("margin", "10px 10px 10px 10px");

        centeringLayout.getStyle().set("justify-content", "center")
                .set("width", "50%").set("border", "2px").set("margin", "0 auto");


        setAlignItems(Alignment.STRETCH);
        setMargin(true);
        setPadding(true);
        add(centeringLayout);
    }

    private void saveCustomer() {
        Customer customer = new Customer();
        service.saveCustomer(customer);
    }
}

