package com.tms;
import java.util.ArrayList;
import java.util.List;

public class CommonService {
    private List<String> list = new ArrayList<>();
    private static CommonService commonService;
    private CommonService() {
    }

    public static CommonService getInstance() {

        if(commonService == null){
            synchronized (CommonService.class){
                if (commonService == null){
                    commonService = new CommonService();
                }
            }
        }
        return commonService;
    }

}