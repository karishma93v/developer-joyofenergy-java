package uk.tw.energy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class AccountService {

    @Autowired
    private Map<String,String> smartMeterToPricePlanAccounts;

    public AccountService(Map<String,String> smartMeterToPricePlanAccounts) {
        this.smartMeterToPricePlanAccounts = smartMeterToPricePlanAccounts;
    }

    public String getPricePlanIdForSmartMeterId(String smartMeterId) {
        return smartMeterToPricePlanAccounts.get(smartMeterId);
    }
}
