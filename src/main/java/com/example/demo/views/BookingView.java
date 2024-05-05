package com.example.demo.views;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.datepicker.DatePicker;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.EmailField;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;

@Route(value = "/book")
public class BookingView extends VerticalLayout {
    PaymentDialog dialog = new PaymentDialog();

    public BookingView() {
        TextField fName = new TextField("First Name");
        TextField lName = new TextField("Last Name");
        TextField phone_num = new TextField("Number");
        DatePicker date = new DatePicker("Date to shoot");
        EmailField email = new EmailField("Email");
        Button submit_btn = new Button("Book!");
        email.setClearButtonVisible(true);
        email.setErrorMessage("Enter a valid email address");

        FormLayout formLayout = new FormLayout();
        formLayout.add(fName, lName, email, phone_num, date, submit_btn);

        setAlignItems(Alignment.STRETCH);
        setMargin(true);
        setPadding(true);
        setWidth("stretch");
        add(formLayout);
    }

//        public sendQoute() {
//
//        }
}

