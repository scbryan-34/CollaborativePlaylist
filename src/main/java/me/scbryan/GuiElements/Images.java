package me.scbryan.GuiElements;

import javax.swing.*;
import me.scbryan.resources.GetResources;

public class Images {

    GetResources resources = new GetResources();

    public ImageIcon loadImage(String imageFilename) {
        return new ImageIcon(resources.getFileResourceURL(imageFilename));
    }

}
