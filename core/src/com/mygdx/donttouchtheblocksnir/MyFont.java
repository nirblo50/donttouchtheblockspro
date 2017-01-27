package com.mygdx.donttouchtheblocksnir;

import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator;

/**
 * Created by nirbl on 14/01/2017.
 */

public class MyFont{
        private SpriteBatch spriteBatch;
        private BitmapFont font24;
        private String text;
        private FreeTypeFontGenerator freeTypeFontGenerator;

public MyFont()
{
    spriteBatch = new SpriteBatch();
    font24 = new BitmapFont();
}



    public void drawText(){
        spriteBatch.begin();
        font24.draw(spriteBatch, "xxx", 350, 350);
        spriteBatch.end();
    }

    public SpriteBatch getSpriteBatch() {
        return spriteBatch;
    }

    public FreeTypeFontGenerator getFreeTypeFontGenerator() {
        return freeTypeFontGenerator;
    }

    public String getText() {
        return text;
    }

    public BitmapFont getFont24() {
        return font24;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setFont24(BitmapFont font24) {
        this.font24 = font24;
    }

    public void setSpriteBatch(SpriteBatch spriteBatch) {
        this.spriteBatch = spriteBatch;
    }

    public void setFreeTypeFontGenerator(FreeTypeFontGenerator freeTypeFontGenerator) {
        this.freeTypeFontGenerator = freeTypeFontGenerator;
    }
}
