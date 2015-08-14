package com.blackace.Listeners;

import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

/**
 * Created by Black Ace on 8/14/2015.
 */
public class FocusEventListener implements FocusListener {
    @Override
    public void focusGained(FocusEvent e) {
        Component c = e.getComponent();
        if(c instanceof JButton){

        }
    }

    @Override
    public void focusLost(FocusEvent e) {

    }
}
