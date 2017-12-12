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
    private MyFont font1;
    private MyFont font2;


    public LostMenu()
    {
        texture = new Texture(Gdx.files.internal("lostMenu2.png"));
        batch = new SpriteBatch();
        font1 = new MyFont("start");
        font2 = new MyFont("start");
    }

    public void drawMenu()
    {
        int x = 0;
        int y = (int)(Gdx.graphics.getHeight()*0.285);

        int a = Gdx.graphics.getWidth()/2 - font1.getFont().getRegion().getRegionWidth()/2;
        int b = (int)(Gdx.graphics.getHeight() * 0.25);
        int c = Gdx.graphics.getWidth()/2 - font2.getFont().getRegion().getRegionWidth()/2;
        int d = b - (int)font1.getFont().getLineHeight();


        batch.begin();
        batch.draw(texture,x, y, Gdx.graphics.getWidth(), Gdx.graphics.getHeight()/2);
        batch.end();

        font1.drawText(a,b ,"Retry may take a");
        font2.drawText(c,d ,"second or two");


    }

    public Texture getTexture()
    {
        return texture;
    }

    public Batch getBatch() {
        return batch;
    }


    public MyFont getFont1() {
        return font1;
    }

    public MyFont getFont2() {
        return font2;
    }
}