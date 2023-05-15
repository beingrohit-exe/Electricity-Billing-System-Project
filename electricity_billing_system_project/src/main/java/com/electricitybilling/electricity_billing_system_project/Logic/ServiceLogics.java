package com.electricitybilling.electricity_billing_system_project.Logic;

import com.electricitybilling.electricity_billing_system_project.Constants.ConnectionConstants;

import java.time.LocalDate;
import java.util.Random;

public class ServiceLogics {
    public static String getConsumerNumber(String connectionType) {
        String consumerNumber = "";
        int dayOfMonth = LocalDate.now().getDayOfMonth();
        int monthValue = LocalDate.now().getMonthValue();
        int random = new Random().nextInt(9999);
        if (connectionType.equals("HOME")){
            consumerNumber = ConnectionConstants.HOME_CODE + random + dayOfMonth + monthValue;
        }
        if (connectionType.equals("AGRICULTURAL")){
            consumerNumber = ConnectionConstants.AGRICULTURAL_CODE + random + dayOfMonth + monthValue;
        }
        if (connectionType.equals("INDUSTRIAL")){
            consumerNumber = ConnectionConstants.INDUSTRIAL_CODE + random + dayOfMonth + monthValue;
        }
        return consumerNumber;
    }

}
