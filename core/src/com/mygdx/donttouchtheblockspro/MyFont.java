package com.mygdx.donttouchtheblockspro;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator;

/**
 * Created by nirbl on 14/01/2017.
 */

public class MyFont
{
    private SpriteBatch batch;
    private BitmapFont font;
    private FreeTypeFontGenerator.FreeTypeFontParameter param;


    public MyFont(String type)
    {
        int size = 60;

        if (type.equals("start"))
            size = 100;

        if (type.equals("score"))
            size = 60;

        if (type.equals("time"))
            size = 85;


        batch = new SpriteBatch();
        FileHandle fontFile = Gdx.files.internal("Amble-Light.ttf");
        FreeTypeFontGenerator generator = new FreeTypeFontGenerator(fontFile);
        param = new FreeTypeFontGenerator.FreeTypeFontParameter();
        param.size = size;
        param.color = Color.BLACK;
        param.borderColor = Color.BLACK;
        param.borderWidth = 5;
        //param.characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

        font = generator.generateFont(param);
        generator.dispose();
    }


    public void drawText(int x, int y, String text)
    {
        batch.begin();
        font.draw(batch, text,x,y);
        batch.end();
    }


    public void drawTime(float time)
    {
        int x = (int)font.getLineHeight()/2;
        int y = Gdx.graphics.getHeight() - x ;

        batch.begin();
        font.draw(batch, floatToScore(time)+"(s)",x,y);
        batch.end();
    }



    public void drawLostScore(float time, float highScore)
    {
        int x = Gdx.graphics.getWidth()/2 - font.getRegion().getRegionWidth()/3;
        int y = (int)(Gdx.graphics.getHeight()*0.55);

        String st1 = "Your score is: ";
        String st2 = "High score: ";

        batch.begin();
        font.draw(batch, st1 + floatToScore(time)+"(s)",x,y);
        font.draw(batch, st2 + floatToScore(highScore)+"(s)",x,y - (int)(font.getLineHeight()*1.1));
        batch.end();
    }

    public void drawStart()
    {
        Texture texture2 = new Texture(Gdx.files.internal("circleAura.png"));;
        Batch batch2= new SpriteBatch();

        int x = Gdx.graphics.getWidth()/2 - font.getRegion().getRegionWidth()/2;
        int y = (int)(Gdx.graphics.getHeight()*0.8) - (int)font.getLineHeight();
        String st1 = "Tap screen and don't";
        String st2 = "release your finger";

        batch.begin();
        font.draw(batch, st1, x, y);
        font.draw(batch, st2, x, y  - (int)(font.getLineHeight()*1.5));
        batch.end();
    }

    public SpriteBatch getBatch() {
        return batch;
    }

    public BitmapFont getFont() {
        return font;
    }

    public void setBatch(SpriteBatch batch) {
        this.batch = batch;
    }

    public void setFont(BitmapFont font) {
        this.font = font;
    }

    // taking the time and making it a score with only 2 characters after the dot
    private String floatToScore(float time)
    {
        String score = String.valueOf(time);;
        int index = 0;
        for (int i =0; i<score.length(); i++)
        {
            if( (score.charAt(i) == '.'))
                index = i;
        }

        if (score.length() > index + 3)
            return score.substring(0, index + 3);

        return score;
    }
}
