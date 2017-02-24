package com.mygdx.donttouchtheblockspro;


import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * Created by nirbl on 26/11/2016.
 */

public class MyText
{
    private SpriteBatch spriteBatch;
    private BitmapFont font;
    private String text;

    private Texture texture;
    private Batch batch;


    public MyText()
    {
        spriteBatch = new SpriteBatch();
        font = new BitmapFont();

        texture = new Texture(Gdx.files.internal("circleAura.png"));
        batch = new SpriteBatch();
    }

    public void drawText (float time )
    {
        spriteBatch.begin();
        font.setColor(Color.WHITE);
        font.getData().setScale(6);
        font.draw(spriteBatch, subText(time), font.getScaleX() , Gdx.graphics.getHeight()-font.getScaleY());
        spriteBatch.end();
    }

    public void drawScoreText (float score)
    {
        int x1 = (int)((double)Gdx.graphics.getWidth()*0.28);
        int y1 =(int)((double)Gdx.graphics.getHeight()*0.49);
        int y2 =(int)((double)Gdx.graphics.getHeight()*0.535);
        spriteBatch.begin();
        font.setColor(Color.BLACK);
        font.getData().setScale(5);
        font.draw(spriteBatch, "score: " + subText(score)+ "(s)", x1 ,y2);
        spriteBatch.end();
    }


    public void drawHighScore(float score)
    {
        int x1 = (int)((double)Gdx.graphics.getWidth()*0.28);
        int y1 =(int)((double)Gdx.graphics.getHeight()*0.49);
        int y2 =(int)((double)Gdx.graphics.getHeight()*0.535);
        spriteBatch.begin();
        font.setColor(Color.BLACK);
        font.getData().setScale(5);
        font.draw(spriteBatch, "high score: " + subText(score)+"(s)", x1, y1);
        spriteBatch.end();
    }



    public void drawStart()
    {
        font.setColor(Color.BLACK);
        font.getData().setScale(9);
        String st1 = "Tap screen and don't";
        String st2 = "release your finger";
        int space = (st1.length() - st2.length()) *50;

        int x = (int) font.getScaleX()*50/4;
        int y =(int)((double)Gdx.graphics.getHeight()/1.5);

        spriteBatch.begin();
        font.draw(spriteBatch, st1, x , y + font.getScaleY()/3*60 );
        font.draw(spriteBatch, st2, x + space , y);
        spriteBatch.end();


        int radius = (int)((double)Gdx.graphics.getWidth()/2.5);
        int x2 = (int)((double)Gdx.graphics.getWidth()/2 - radius/2);
        int y2 = (int)((double) y - radius * 1.5);

        batch.begin();
        batch.draw(texture, x2, y2, radius, radius);
        batch.end();
    }



    // returns the time with only two digits after the dot
    private String subText(float time)
    {
        text = String.valueOf(time);
        int mone = 0;
        for (int i =0; i< text.length(); i++)
        {
            if((text.charAt(i) == '.'))
                mone++;
        }

        text = text.substring(0, mone+3);
        return text;
    }

    public SpriteBatch getSpriteBatch() {
        return spriteBatch;
    }

    public BitmapFont getFont() {
        return font;
    }

    public String getText() {
        return text;
    }

    public Texture getTexture() {
        return texture;
    }

    public Batch getBatch() {
        return batch;
    }


    public int getRadius()
    {
        return (int)((double)Gdx.graphics.getWidth()/2 - ((int)((double)Gdx.graphics.getWidth()/2.5))/2);
    }

    public int getCircleX()
    {
        return (int)((double)Gdx.graphics.getWidth()/2 - getRadius()/2);
    }

    public int getCircleY()
    {
        return ((int)((double) Gdx.graphics.getHeight()/1.5) - ((int)((double) Gdx.graphics.getWidth()/2.5* 1.5)));
    }
}
