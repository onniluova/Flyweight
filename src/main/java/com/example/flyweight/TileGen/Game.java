package com.example.flyweight.TileGen;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Game extends Application {
    private static final int TILE_SIZE = 32;
    private TileGraphicFactory tileFactory = new TileGraphicFactory();

    @Override
    public void start(Stage primaryStage) {
        Canvas canvas = new Canvas(800, 600);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        renderMap(gc);

        Pane root = new Pane();
        root.getChildren().add(canvas);
        Scene scene = new Scene(root);

        primaryStage.setTitle("RPG Flyweight.Map");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void renderMap(GraphicsContext gc) {
        // Example map layout
        String[][] mapLayout = {
                {"swamp", "building", "swamp", "forest", "water"},
                {"building", "swamp", "building", "forest", "water"},
                {"swamp", "building", "swamp", "forest", "water"},
                {"forest", "forest", "forest", "forest", "forest"},
                {"water", "water", "water", "water", "water"}
        };

        int mapWidth = mapLayout[0].length;
        int mapHeight = mapLayout.length;
        int offsetX = (800 - mapWidth * TILE_SIZE) / 2;
        int offsetY = (600 - mapHeight * TILE_SIZE) / 2;

        for (int y = 0; y < mapLayout.length; y++) {
            for (int x = 0; x < mapLayout[y].length; x++) {
                Tile tile = tileFactory.getTile(mapLayout[y][x]);
                tile.render(gc, x + offsetX / TILE_SIZE, y + offsetY / TILE_SIZE, TILE_SIZE);
            }
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}