package com.example.flyweight.TileGen;

class CityMap extends Map {
    public CityMap(int width, int height) {
        super(width, height);
    }

    protected Tile createTile() {
        int randomTile = (int) (Math.random() * 3);
        switch (randomTile) {
            case 0:
                return new RoadTile();
            case 1:
                return new ForestTile();
            default:
                return new BuildingTile();
        }
    }
}