package cs301.birthdaycake;

import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;

public class CakeController implements OnClickListener
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
}
