package org.gwtproject.customforminator.client;

import java.util.Arrays;

// GWT:
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;
// Vaadin polymer elements:
import com.vaadin.polymer.Polymer;
import com.vaadin.polymer.elemental.Function;
import com.vaadin.polymer.iron.element.IronCollapseElement;
import com.vaadin.polymer.iron.element.IronIconElement;
import com.vaadin.polymer.iron.element.IronInputElement;
import com.vaadin.polymer.paper.element.PaperButtonElement;
import com.vaadin.polymer.paper.element.PaperDrawerPanelElement;
import com.vaadin.polymer.paper.element.PaperHeaderPanelElement;
import com.vaadin.polymer.paper.element.PaperIconItemElement;
import com.vaadin.polymer.paper.element.PaperItemElement;
import com.vaadin.polymer.paper.element.PaperMaterialElement;
import com.vaadin.polymer.paper.element.PaperRippleElement;

public class CustomForminator implements EntryPoint {

  @Override
  public void onModuleLoad() {
    // We have to load icon sets before run application
    Polymer
        .importHref(Arrays
            .asList("iron-icons/iron-icons.html", PaperIconItemElement.SRC, IronIconElement.SRC, IronCollapseElement.SRC, IronInputElement.SRC, PaperDrawerPanelElement.SRC, PaperHeaderPanelElement.SRC, PaperItemElement.SRC, PaperRippleElement.SRC, PaperButtonElement.SRC, PaperMaterialElement.SRC), new Function() {
          @Override
          public Object call(Object arg) {
            // The app is executed when all imports succeed.
            startApplication();
            return null;
          }
        });
  }

  private void startApplication() {
    RootPanel.get().add(new Main());
  }
}
