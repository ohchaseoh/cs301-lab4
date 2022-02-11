package cs301.birthdaycake;

import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CompoundButton;
import android.widget.SeekBar;

public class CakeController implements OnClickListener, View.OnTouchListener,
        CompoundButton.OnCheckedChangeListener,
        SeekBar.OnSeekBarChangeListener
{
    private CakeView cakeView;
    private CakeModel cakeModel;

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
        if(cakeModel.isLit())
        {
            cakeModel.setLit(false);
        }
        else
        {
            cakeModel.setLit(true);
        }
        cakeView.invalidate();
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
    {
        if(isChecked)
        {
            cakeModel.setCandles(true);
        }
        else
        {
            cakeModel.setCandles(false);
        }
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
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == motionEvent.ACTION_DOWN) {
            cakeModel.CoordX = (int) motionEvent.getX();
            cakeModel.CoordY = (int) motionEvent.getY();
            cakeView.invalidate();
            cakeModel.setHasTouched(true);
            cakeView.drawBalloon(motionEvent.getX(), motionEvent.getY());
            return true;
        }
        return false;
    }
}
