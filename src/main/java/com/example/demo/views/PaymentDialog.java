package com.example.demo.views;


import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;

public class PaymentDialog extends Div {
    public PaymentDialog() {
        Dialog dialog = new Dialog();
        VerticalLayout dialogLayout = createDialogLayout(dialog);
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
