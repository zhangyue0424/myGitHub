package com.zy.service;

import com.zy.common.Encryption;
import com.zy.dao.HappinessDao;
import com.zy.entity.Happiness;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class HappinessService {
    @Autowired
    private HappinessDao happinessDao;

    public Happiness selectService(String city){
        return happinessDao.findHappinessByCity(city);
    }

    @Transactional
    public void insertService(){
        String passWord = "123456";
        Encryption encryption = new Encryption();
        passWord = encryption.encryptionMethon(passWord);
        happinessDao.insertHappiness(passWord, 12345);
    }
}
