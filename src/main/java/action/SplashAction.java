package action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by Zcoder on 2017/6/11.
 */
public class SplashAction extends ActionSupport {
    @Override
    public String execute() throws Exception {
        return "splash";
    }
}
