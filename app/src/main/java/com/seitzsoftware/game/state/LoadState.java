package com.seitzsoftware.game.state;

import android.view.MotionEvent;
import com.seitzsoftware.android.simpleandroidgdf.Assets;
import com.seitzsoftware.framework.util.Painter;

/**
 * Created by Kevin on 12/13/2015.
 */

public class LoadState extends State {
    @Override
    public void init() {
        Assets.load();
    }

    @Override
    public void update(float delta) {
        setCurrentState(new MenuState());
    }

    @Override
    public void render(Painter g) {
    }

    @Override
    public boolean onTouch(MotionEvent e, int scaledX, int scaledY) {
        return false;
    }
}