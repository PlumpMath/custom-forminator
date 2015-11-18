package org.gwtproject.customforminator.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.vaadin.polymer.elemental.Event;
import com.vaadin.polymer.elemental.EventListener;
import com.vaadin.polymer.elemental.HTMLElement;
import com.vaadin.polymer.iron.element.IronCollapseElement;
import com.vaadin.polymer.iron.element.IronInputElement;
import com.vaadin.polymer.paper.element.PaperButtonElement;
import com.vaadin.polymer.paper.element.PaperItemElement;

public class Main extends Composite {
  interface MainUiBinder extends UiBinder<HTMLPanel, Main> {}

  private static MainUiBinder ourUiBinder = GWT.create(MainUiBinder.class);
  
  @UiField
  PaperItemElement menu1, menu2, menu3, menu4;
  @UiField
  IronCollapseElement collapse1, collapse2, collapse3, collapse4;
  @UiField
  PaperButtonElement text, icon, image;
  @UiField
  IronInputElement onlineInput, offlineInput;
  @UiField
  HTMLElement buttonText, mobileButtonText;

  public Main() {
    initWidget(ourUiBinder.createAndBindUi(this));

    // Open all menus
    toggleMenus();

    menu1.addEventListener("click", new EventListener() {
      @Override
      public void handleEvent(Event event) {
        collapse1.toggle();
      }
    });
    
    menu2.addEventListener("click", new EventListener() {
      @Override
      public void handleEvent(Event event) {
        collapse2.toggle();
      }
    });

    menu3.addEventListener("click", new EventListener() {
      @Override
      public void handleEvent(Event event) {
        collapse3.toggle();
      }
    });

    menu4.addEventListener("click", new EventListener() {
      @Override
      public void handleEvent(Event event) {
        collapse4.toggle();
      }
    });
    
    // BUTTON TEXT
    onlineInput.addEventListener("keyup", new EventListener() {
      @Override
      public void handleEvent(Event event) {
        buttonText.setInnerHTML(onlineInput.getBindValue());
        mobileButtonText.setInnerHTML(onlineInput.getBindValue());
      }
    });

    // // Offline button text - for now we have no setting to show this
    // offlineInput.addEventListener("keyup", new EventListener() {
    // @Override
    // public void handleEvent(Event event) {
    // buttonText.setInnerHTML(offlineInput.getBindValue());
    // mobileButtonText.setInnerHTML(offlineInput.getBindValue());
    // }
    // });

    // text.addEventListener("click", new EventListener() {
    // @Override
    // public void handleEvent(Event event) {
    //
    // text.setActive(true);
    // }
    // });

  } // end Main()

  public void toggleMenus() {
    collapse1.toggle();
    collapse2.toggle();
    collapse3.toggle();
    collapse4.toggle();
  }
  
} // end class Main
