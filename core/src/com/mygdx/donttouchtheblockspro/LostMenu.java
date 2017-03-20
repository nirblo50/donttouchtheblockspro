package com.mygdx.donttouchtheblockspro;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * Created by nirbl on 23/11/2016.
 */

public class LostMenu
{
    private Texture texture;
    private Batch batch;

    public LostMenu()
    {
        texture = new Texture(Gdx.files.internal("lostMenu2.png"));
        batch = new SpriteBatch();
    }

    public void drawMenu()
    {
        int x = 0;
        int y = (int)(Gdx.graphics.getHeight()*0.3);

        batch.begin();
        batch.draw(texture,x, y, Gdx.graphics.getWidth(), Gdx.graphics.getHeight()/2-50 );
        batch.end();

    }

    public Texture getTexture()
    {
        return texture;
    }

    public Batch getBatch() {
        return batch;
    }


}