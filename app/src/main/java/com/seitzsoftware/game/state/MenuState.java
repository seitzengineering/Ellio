package com.seitzsoftware.game.state;

import android.view.MotionEvent;

import com.seitzsoftware.android.simpleandroidgdf.Assets;
import com.seitzsoftware.framework.util.Painter;
import com.seitzsoftware.framework.util.UIButton;

/**
 * Created by Kevin on 4/28/2016.
 */
public class MenuState extends State {
    private UIButton playButton, scoreButton;

    @Override
    public void init() {
        playButton = new UIButton(316, 227, 484, 286, Assets.start,
                Assets.startDown);
        scoreButton = new UIButton(316, 300, 484, 359, Assets.score,
                Assets.scoreDown);
    }

    @Override
    public void update(float delta) {
    }

    @Override
    public void render(Painter g) {
        g.drawImage(Assets.welcome, 0, 0);
        playButton.render(g);
        scoreButton.render(g);
    }

    @Override
    public boolean onTouch(MotionEvent e, int scaledX, int scaledY) {
        if (e.getAction() == MotionEvent.ACTION_DOWN) {
            playButton.onTouchDown(scaledX, scaledY);
            scoreButton.onTouchDown(scaledX, scaledY);
        }
        if (e.getAction() == MotionEvent.ACTION_UP) {
            if (playButton.isPressed(scaledX, scaledY)) {
                playButton.cancel();
                setCurrentState(new PlayState());
            } else if (scoreButton.isPressed(scaledX, scaledY)) {
                scoreButton.cancel();
                setCurrentState(new ScoreState());
            } else {
                playButton.cancel();
                scoreButton.cancel();
            }
        }
        return true;
    }
}