package com.example.demo.views;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.datepicker.DatePicker;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;

public class PaymentDialog extends Dialog {
    public PaymentDialog() {
        setHeaderTitle("Pay Deposit");
        add(getDialogLayout());
    }

    private static VerticalLayout getDialogLayout() {

        // Card Number
        TextField cardNumberField = new TextField("Card Number");

        // Expiration date
        HorizontalLayout expirationLayout = new HorizontalLayout();
        DatePicker expirationDatePicker = new DatePicker("Expiration Date");
        expirationDatePicker.setPlaceholder("MM/YY");
        expirationLayout.add(expirationDatePicker);

        // CVV
        TextField cvvField = new TextField("CVV");
        cvvField.setMaxLength(3);
        expirationLayout.add(cvvField);

        Button book_btn = new Button("Pay!");
        VerticalLayout dialogLayout = new VerticalLayout(cardNumberField, expirationLayout, cvvField, book_btn);
        dialogLayout.getStyle().set("width", "18rem").set("max-width", "100%");
        return dialogLayout;
    }

    private void bookUser() {

    }
}
