package com.mygdx.donttouchtheblockspro;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator;
import com.badlogic.gdx.graphics.g2d.freetype.FreetypeFontLoader;
import com.badlogic.gdx.scenes.scene2d.ui.Label;

/**
 * Created by nirbl on 14/01/2017.
 */

public class MyFont
{
        private SpriteBatch spriteBatch;
        private BitmapFont font24;
        private String text;
        private FreeTypeFontGenerator freeTypeFontGenerator;
        private FreetypeFontLoader freetypeFontLoader;

public MyFont()
{
    spriteBatch = new SpriteBatch();
    font24 = new BitmapFont();
    makeFont();
}



    public void drawText()
    {
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


    public void makeFont()
    {
        FreeTypeFontGenerator generator = new FreeTypeFontGenerator(Gdx.files.internal("truetypefont/Amble-Light.ttf"));
        FreeTypeFontGenerator.FreeTypeFontParameter parameter = new FreeTypeFontGenerator.FreeTypeFontParameter();
        parameter.size = 30;
        parameter.borderWidth = 1;
        parameter.color = Color.YELLOW;
        parameter.shadowOffsetX = 3;
        parameter.shadowOffsetY = 3;
        parameter.shadowColor = new Color(0, 0.5f, 0, 0.75f);
        BitmapFont font24 = generator.generateFont(parameter); // font size 24 pixels
        generator.dispose();

        Label.LabelStyle labelStyle = new Label.LabelStyle();
        labelStyle.font = font24;
    }


}
