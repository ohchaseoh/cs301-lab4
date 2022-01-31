package cs301.birthdaycake;

public class CakeController
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
}
