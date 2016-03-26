package com.seitzsoftware.game.state;

import android.view.MotionEvent;

import com.seitzsoftware.android.simpleandroidgdf.Assets;
import com.seitzsoftware.framework.util.Painter;

/**
 * Created by Kevin on 12/13/2015.
 */
public class MenuState extends State {
    @Override
    public void init() {
    }

    @Override
    public void update(float delta) {
    }

    @Override
    public void render(Painter g) {
        g.drawImage(Assets.welcome, 0, 0);
    }

    @Override
    public boolean onTouch(MotionEvent e, int scaledX, int scaledY) {
        return false;
    }
}
