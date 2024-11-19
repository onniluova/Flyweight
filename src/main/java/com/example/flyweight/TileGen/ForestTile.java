package com.example.flyweight.TileGen;

import javafx.scene.paint.Color;

class ForestTile extends Tile {
    public ForestTile() {
        this.character = 'F';
        this.type = "forest";
        this.color = Color.GREEN;
    }

    @Override
    public char getCharacter() {
        return character;
    }

    @Override
    public String getType() {
        return type;
    }
}