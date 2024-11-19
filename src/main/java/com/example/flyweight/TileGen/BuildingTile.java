package com.example.flyweight.TileGen;

import javafx.scene.paint.Color;

class BuildingTile extends Tile {
    public BuildingTile() {
        this.character = 'B';
        this.type = "building";
        this.color = Color.BROWN;
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