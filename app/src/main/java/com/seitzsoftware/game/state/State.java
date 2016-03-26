package com.seitzsoftware.game.state;

import android.view.MotionEvent;

import com.seitzsoftware.framework.util.Painter;
import com.seitzsoftware.android.simpleandroidgdf.GameMainActivity;

/**
 * Created by Kevin on 12/13/2015.
 */
public abstract class State {
    public void setCurrentState(State newState) {
        GameMainActivity.sGame.setCurrentState(newState);
    }

    public abstract void init();

    public abstract void update(float delta);

    public abstract void render(Painter g);

    public abstract boolean onTouch(MotionEvent e, int scaledX, int scaledY);
}