package be.simongenin.textures;

import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;

public class TextureAtlases {

    private static String TEXTURES_PATH = "textures/";

    public static TextureAtlas tileAtlas = new TextureAtlas(new FileHandle(TEXTURES_PATH + "tiles.pack"));

}
