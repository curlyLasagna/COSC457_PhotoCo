package com.example.demo.views;

import com.vaadin.flow.component.datepicker.DatePicker;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.textfield.TextField;

public class PaymentDialog extends Dialog {
    public PaymentDialog() {
        new H2("Pay with debit or credit card");
        setSizeFull();
        new H3("Payment Information");
        TextField cardNumberField = new TextField("Card Number");
        add(cardNumberField);

        HorizontalLayout expirationLayout = new HorizontalLayout();
        DatePicker expirationDatePicker = new DatePicker("Expiration Date");
        expirationDatePicker.setPlaceholder("MM/YY");
        expirationLayout.add(expirationDatePicker);

        TextField cvvField = new TextField("CVV");
        cvvField.setMaxLength(3);
        expirationLayout.add(cvvField);
        add(expirationLayout);
    }

//    private VerticalLayout createDialogLayout(Dialog dialog) {
//        TextField nameField = new TextField("Name", user.getFullName(),
//                "Full name");
//        nameField.setReadOnly(true);
//        nameField.getStyle().set("padding-top", "0");
//
//        EmailField emailField = new EmailField("Email", user.getEmail());
//        emailField.setPlaceholder("email@company.com");
//        emailField.setReadOnly(true);
//
//        String addressValue = String.format("%s, %s, %s",
//                user.getAddress().getStreet(), user.getAddress().getCity(),
//                user.getAddress().getCountry());
//        TextField addressField = new TextField("Address", addressValue,
//                "Street XX, City, Country");
//        addressField.setReadOnly(true);
//
//        VerticalLayout fieldLayout = new VerticalLayout(nameField, emailField,
//                addressField);
//        fieldLayout.setSpacing(false);
//        fieldLayout.setPadding(false);
//        fieldLayout.setAlignItems(FlexComponent.Alignment.STRETCH);
//        fieldLayout.getStyle().set("width", "300px").set("max-width", "100%");
//
//        return fieldLayout;
//    }
}
