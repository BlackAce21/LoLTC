package com.blackace.Listeners;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * Created by Black Ace on 8/14/2015.
 */
public class MouseEventListener implements MouseListener {


    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        Component c = e.getComponent();
        if(c instanceof JButton){

        }
    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
