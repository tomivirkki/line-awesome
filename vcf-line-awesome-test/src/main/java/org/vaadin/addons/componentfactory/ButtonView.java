package org.vaadin.addons.componentfactory;

import org.vaadin.componentfactory.lineawesome.LineAwesomeIcon;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("button")
public class ButtonView extends VerticalLayout {

    public ButtonView() {
        Button ok = new Button("OK");
        ok.setIcon(LineAwesomeIcon.CHECK_SQUARE.create());
        add(ok);
        Button ok2 = new Button("OK");
        ok2.setIcon(VaadinIcon.CHECK_SQUARE.create());
        add(ok2);
    }
}
