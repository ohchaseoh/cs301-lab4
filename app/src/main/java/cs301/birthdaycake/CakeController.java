package cs301.birthdaycake;

import android.graphics.Canvas;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CompoundButton;
import android.widget.SeekBar;

public class CakeController implements OnClickListener,
        CompoundButton.OnCheckedChangeListener,
        SeekBar.OnSeekBarChangeListener,
        View.OnTouchListener
{
    private final CakeView cakeView;
    private final CakeModel cakeModel;

    public CakeController(CakeView initCakeView)
    {
        this.cakeView = initCakeView;
        this.cakeModel = cakeView.getCakeModel();
    }


    public CakeView getCakeView()
    {
        return this.cakeView;
    }

    @Override
    public void onClick(View v)
    {
        Log.d("tag","nice");
        // if candle lit, set unlit and vice versa
        cakeModel.setLit(!cakeModel.isLit());
        cakeView.invalidate();
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
    {
        cakeModel.setCandles(isChecked);
        cakeView.invalidate();
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        cakeModel.setNumCandles(progress);
        cakeView.invalidate();
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {
        // do nothing
    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {
        // do nothing
    }

    @Override
    public boolean onTouch(View view, MotionEvent event)
    {
        cakeModel.x = (int) event.getX();
        cakeModel.y = (int) event.getY();
        cakeView.invalidate();
        return false;
    }
}
