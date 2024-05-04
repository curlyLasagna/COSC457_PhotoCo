package com.example.demo.views;


import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.html.H4;

public class CardComponent extends VerticalLayout {

    public CardComponent(String titleText, String descriptionText, String imageUrl) {
        // Set card properties
        addClassName("card");
        setWidth("300px");
        setAlignItems(Alignment.CENTER);
        setPadding(true);
        setSpacing(true);

        // Title
        var title = new H4();
        title.setText(titleText);

        // Description
        var description = new Paragraph();
        description.setText(descriptionText);
        description.addClassNames("text-s", "m-s");

        // Image
        var image = new Image();
        if (imageUrl != null && !imageUrl.isEmpty()) {
            image.setSrc(imageUrl);
            image.setAlt("Image for " + titleText);
            add(image);
        }

        // Add components to layout
        add(title, description);
    }
}