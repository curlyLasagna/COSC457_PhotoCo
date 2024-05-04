package com.example.demo.views;

import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.router.Route;
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
                LumoUtility.FontSize.MEDIUM,
                LumoUtility.Margin.SMALL,
                LumoUtility.Position.ABSOLUTE
        );

        HorizontalLayout navbar = getNavigation();
        addToNavbar(brand, navbar);
    }

    private HorizontalLayout getNavigation() {
        HorizontalLayout navigation = new HorizontalLayout();
        navigation.addClassNames(LumoUtility.JustifyContent.CENTER,
                LumoUtility.Gap.SMALL, LumoUtility.Height.MEDIUM,
                LumoUtility.Width.FULL);
        navigation.add(
                createLink("Book", BookingView.class),
                createLink("About", AboutView.class),
                createLink("Customers", CustomerView.class)
        );
        return navigation;
    }

    private RouterLink createLink(String viewName, Class viewClass) {
        RouterLink link = new RouterLink();
        link.add(viewName);
        link.setRoute(viewClass);

        link.addClassNames(LumoUtility.Display.FLEX,
                LumoUtility.AlignItems.CENTER,
                LumoUtility.Padding.Horizontal.MEDIUM,
                LumoUtility.TextColor.SECONDARY, LumoUtility.FontWeight.MEDIUM);
        link.getStyle().set("text-decoration", "none");

        return link;
    }
}
