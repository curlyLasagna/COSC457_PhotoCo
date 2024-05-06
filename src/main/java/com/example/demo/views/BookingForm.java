package com.example.demo.views;

import com.example.demo.data.Bookings;
import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.select.Select;
import com.vaadin.flow.data.binder.BeanValidationBinder;
import com.vaadin.flow.data.binder.Binder;

public class BookingForm extends FormLayout {
    Select<Bookings.Priority> prioritySelect = new Select<>();
    Select<Bookings.Status> statusSelect = new Select<>();
    Binder<Bookings> binder = new BeanValidationBinder<>(Bookings.class);

    public BookingForm() {
        binder.bind(prioritySelect, Bookings::getPriority, Bookings::setPriority);
        binder.bind(statusSelect, Bookings::getStatus, Bookings::setStatus);

        prioritySelect.setLabel("Priority");
        statusSelect.setLabel("Status");

        Button save = new Button("Save");
        Button delete = new Button("Delete");
        Button close = new Button("Close");
    }

    private void save() {
//        fireEvent( new SaveEvent(this, binder.getBean()));
    }

    public void setBooking(Bookings bookings) {
        binder.setBean(bookings);
    }

    public static abstract class BookingFormEvent extends ComponentEvent<BookingForm> {
        private Bookings bookings;

        protected BookingFormEvent(BookingForm source, Bookings bookings) {
            super(source, false);
            this.bookings = bookings;
        }
    }
}
