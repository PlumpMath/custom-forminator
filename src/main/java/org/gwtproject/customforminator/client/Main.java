package org.gwtproject.customforminator.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.vaadin.polymer.elemental.Event;
import com.vaadin.polymer.elemental.EventListener;
import com.vaadin.polymer.iron.element.IronCollapseElement;
import com.vaadin.polymer.paper.element.PaperItemElement;

public class Main extends Composite {
  interface MainUiBinder extends UiBinder<HTMLPanel, Main> {}

  private static MainUiBinder ourUiBinder = GWT.create(MainUiBinder.class);
  
  @UiField PaperItemElement menu1;
  @UiField IronCollapseElement collapse1;
  

  public Main() {
    initWidget(ourUiBinder.createAndBindUi(this));
    
    menu1.addEventListener("click", new EventListener() {
      @Override
      public void handleEvent(Event event) {
        GWT.log("clicked menu1", null);
        collapse1.toggle();
      }
    });
    
  } // end Main()
} // end class Main
