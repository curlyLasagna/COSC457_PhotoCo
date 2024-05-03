package com.example.demo;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.Key;
import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.applayout.DrawerToggle;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.Router;
import com.vaadin.flow.router.RouterLink;
import com.vaadin.flow.theme.lumo.LumoUtility;

/**
 * The main view contains a button and a click listener.
 */
@Route("")
public class MainView extends AppLayout {

    public MainView() {
        createHeader();
    }

    private void createHeader() {
        H1 brand = new H1("Photo-Co");
        brand.addClassNames(
                LumoUtility.FontSize.XLARGE,
                LumoUtility.Margin.SMALL
        );

        HorizontalLayout header = new HorizontalLayout(new DrawerToggle(), brand);
        header.setDefaultVerticalComponentAlignment(FlexComponent.Alignment.CENTER);
        header.expand(brand);
        header.setWidthFull();
        header.setSpacing(false);
        addToNavbar(header);
    }

    private void createDrawer() {
        addToDrawer(new VerticalLayout(
//                new RouterLink("About", )
        ));
    }
}

