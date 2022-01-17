package game.gui;

import com.googlecode.lanterna.TerminalPosition;
import com.googlecode.lanterna.TerminalSize;
import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.graphics.TextGraphics;
import com.googlecode.lanterna.screen.TerminalScreen;
import game.Game;
import game.Level;
import game.Position;
import game.menus.Command;

import java.io.IOException;
import java.util.List;

public class LanternaGUI implements GUI {

    private TerminalScreen screen;
    private int width;
    private int height;

    public LanternaGUI(int width, int height) {
    }

    public LanternaGUI(TerminalScreen screen) {
        this.screen = screen;
        this.width = 10;
        this.height = 10;
    } //used for testing purposes

    @Override
    public void drawRectangle(TextGraphics textGraphics, String color, int width, int height, Position pos) {
        textGraphics.setBackgroundColor(TextColor.Factory.fromString(color));
        textGraphics.fillRectangle(new TerminalPosition(pos.getX(), pos.getY()), new TerminalSize(width, height), ' ');
    }
}