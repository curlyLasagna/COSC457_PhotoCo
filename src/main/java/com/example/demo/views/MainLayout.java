package com.example.demo.views;

import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.H4;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.router.RouterLink;
import com.vaadin.flow.theme.lumo.LumoUtility;

public class MainLayout extends AppLayout {
    public MainLayout() {
        createHeader();
    }

    private void createHeader() {

        H4 brand = new H4("Photo-Co");
        RouterLink home = new RouterLink();
        Icon icon = new Icon("vaadin", "camera");
        home.add(brand, icon);
        home.setRoute(DashboardView.class);
        home.addClassNames(
                LumoUtility.FontSize.XSMALL,
                LumoUtility.Margin.SMALL,
                LumoUtility.AlignItems.STRETCH,
                LumoUtility.Position.RELATIVE
        );
        HorizontalLayout navbar = getNavigation();
        addToNavbar(home, navbar);
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
